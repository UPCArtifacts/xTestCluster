import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        double double3 = openIntToDoubleHashMap1.get((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey(0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 0.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        double double7 = openIntToDoubleHashMap1.get((int) ' ');
        boolean boolean9 = openIntToDoubleHashMap1.containsKey(0);
        double double12 = openIntToDoubleHashMap1.put((int) (short) 1, (double) '4');
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap2.get(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) 10);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (-1.0f));
        double double4 = openIntToDoubleHashMap2.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 100);
        double double4 = openIntToDoubleHashMap1.put((int) (byte) 10, 10.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        iterator11.advance();
        int int13 = iterator11.key();
        int int14 = iterator11.key();
        double double15 = iterator11.value();
        double double16 = iterator11.value();
        int int17 = iterator11.key();
        boolean boolean18 = iterator11.hasNext();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
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
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        boolean boolean17 = iterator13.hasNext();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
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
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', 10.0d);
        double double4 = openIntToDoubleHashMap2.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(35, 0.0d);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) 100);
        double double3 = openIntToDoubleHashMap1.remove((-1));
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
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
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, (double) (-1));
        double double5 = openIntToDoubleHashMap2.put((int) 'a', (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.remove((-1));
        int int5 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) 'a');
        int int4 = openIntToDoubleHashMap1.size();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) 32);
        double double4 = openIntToDoubleHashMap2.get(32);
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', (double) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) (-1.0f));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
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
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100L);
        double double3 = openIntToDoubleHashMap1.remove((int) ' ');
        double double5 = openIntToDoubleHashMap1.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 0L);
        int int3 = openIntToDoubleHashMap2.size();
        java.lang.Class<?> wildcardClass4 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) 100.0f);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
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
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, 52.0d);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 1);
        double double4 = openIntToDoubleHashMap2.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
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
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
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
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
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
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap3.put(0, (double) (-1));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, 0.0d);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
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
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0, 10.0d);
        double double4 = openIntToDoubleHashMap2.remove(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) (byte) 10);
        double double4 = openIntToDoubleHashMap2.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        double double8 = openIntToDoubleHashMap2.put((int) ' ', (double) 0);
        int int9 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double12 = openIntToDoubleHashMap1.get(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 1, (-1.0d));
        double double7 = openIntToDoubleHashMap1.remove((-1));
        double double9 = openIntToDoubleHashMap1.remove(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put(10, (double) 1.0f);
        double double10 = openIntToDoubleHashMap1.get(100);
        double double13 = openIntToDoubleHashMap1.put((int) 'a', (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        double double17 = openIntToDoubleHashMap1.put((int) (short) 1, (double) 100.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator18 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        int int22 = iterator14.key();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove((int) 'a');
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 10);
        double double16 = openIntToDoubleHashMap1.remove((int) (short) 0);
        double double19 = openIntToDoubleHashMap1.put(3, 0.0d);
        double double21 = openIntToDoubleHashMap1.remove(100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, 1.0d);
        double double4 = openIntToDoubleHashMap2.get(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        double double7 = openIntToDoubleHashMap1.remove(1);
        double double9 = openIntToDoubleHashMap1.get((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        double double14 = openIntToDoubleHashMap1.get(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        iterator16.advance();
        int int18 = iterator16.key();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        int int4 = openIntToDoubleHashMap2.size();
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) '4');
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        double double9 = openIntToDoubleHashMap1.get(35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator1 = openIntToDoubleHashMap0.iterator();
        int int2 = openIntToDoubleHashMap0.size();
        boolean boolean4 = openIntToDoubleHashMap0.containsKey(10);
        double double6 = openIntToDoubleHashMap0.remove(100);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey(32);
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        double double3 = openIntToDoubleHashMap1.get((int) (byte) -1);
        int int4 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap3.size();
        double double7 = openIntToDoubleHashMap3.put(1, (double) 10);
        boolean boolean9 = openIntToDoubleHashMap3.containsKey(2);
        double double11 = openIntToDoubleHashMap3.remove(35);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        double double8 = openIntToDoubleHashMap1.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 10.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator18 = openIntToDoubleHashMap9.iterator();
        boolean boolean19 = iterator18.hasNext();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int3 = openIntToDoubleHashMap2.size();
        double double6 = openIntToDoubleHashMap2.put((int) (byte) 1, (double) 97);
        boolean boolean8 = openIntToDoubleHashMap2.containsKey((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap2.iterator();
        int int10 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) 10L);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap1.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        iterator10.advance();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int4 = openIntToDoubleHashMap1.size();
        boolean boolean6 = openIntToDoubleHashMap1.containsKey(97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean11 = openIntToDoubleHashMap9.containsKey((int) (short) 10);
        double double13 = openIntToDoubleHashMap9.get(2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        double double16 = openIntToDoubleHashMap9.get((int) '#');
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
            int int14 = iterator12.key();
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
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap17 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap15);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator18 = openIntToDoubleHashMap17.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        boolean boolean8 = iterator7.hasNext();
        boolean boolean9 = iterator7.hasNext();
        iterator7.advance();
        int int11 = iterator7.key();
        int int12 = iterator7.key();
        boolean boolean13 = iterator7.hasNext();
        boolean boolean14 = iterator7.hasNext();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(2);
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
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
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean5 = openIntToDoubleHashMap2.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        int int7 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        double double3 = openIntToDoubleHashMap1.get(10);
        double double5 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (short) 100);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = iterator6.hasNext();
        boolean boolean8 = iterator6.hasNext();
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0, (double) 10.0f);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap1.get(2);
        double double7 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap9.iterator();
        boolean boolean12 = openIntToDoubleHashMap9.containsKey(2);
        double double15 = openIntToDoubleHashMap9.put(10, (double) 3);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        int int9 = openIntToDoubleHashMap1.size();
        double double11 = openIntToDoubleHashMap1.remove((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        boolean boolean14 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        boolean boolean4 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        double double6 = openIntToDoubleHashMap1.get(97);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.get((int) 'a');
        double double10 = openIntToDoubleHashMap1.put((int) '#', (double) 'a');
        int int11 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
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
        boolean boolean16 = iterator13.hasNext();
        double double17 = iterator13.value();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
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
        boolean boolean18 = iterator17.hasNext();
        iterator17.advance();
        boolean boolean20 = iterator17.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        iterator10.advance();
        boolean boolean12 = iterator10.hasNext();
        boolean boolean13 = iterator10.hasNext();
        boolean boolean14 = iterator10.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double13 = openIntToDoubleHashMap1.put(0, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap14);
        double double17 = openIntToDoubleHashMap14.get(97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        double double6 = openIntToDoubleHashMap1.put(0, 52.0d);
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (-1.0d));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = openIntToDoubleHashMap3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -235868385");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, 32.0d);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
        int int2 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        boolean boolean4 = iterator3.hasNext();
        boolean boolean5 = iterator3.hasNext();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, 52.0d);
        double double4 = openIntToDoubleHashMap2.get((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        int int7 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double9 = openIntToDoubleHashMap1.put(1, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (byte) 1);
        double double14 = openIntToDoubleHashMap1.get((int) (short) -1);
        double double16 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double19 = openIntToDoubleHashMap1.put(1, (double) '#');
        double double21 = openIntToDoubleHashMap1.remove(1);
        double double23 = openIntToDoubleHashMap1.remove(10);
        boolean boolean25 = openIntToDoubleHashMap1.containsKey(3);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int13 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double16 = openIntToDoubleHashMap14.get((int) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap17 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap14);
        int int18 = openIntToDoubleHashMap17.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator19 = openIntToDoubleHashMap17.iterator();
        iterator19.advance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.remove(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        boolean boolean15 = iterator14.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap18 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
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
        int int17 = iterator5.key();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (short) 10);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(100);
        double double6 = openIntToDoubleHashMap2.get((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap2.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int5 = openIntToDoubleHashMap4.size();
        boolean boolean7 = openIntToDoubleHashMap4.containsKey((int) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap4.iterator();
        int int9 = openIntToDoubleHashMap4.size();
        double double11 = openIntToDoubleHashMap4.get(32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        int int4 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
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
        boolean boolean22 = iterator16.hasNext();
        double double23 = iterator16.value();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (short) 10);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) '4');
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) (short) 1);
        int int7 = openIntToDoubleHashMap2.size();
        double double10 = openIntToDoubleHashMap2.put(10, 97.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) (byte) 10);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (byte) 100);
        double double7 = openIntToDoubleHashMap2.put((int) '4', (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1);
        double double3 = openIntToDoubleHashMap1.get((int) (short) -1);
        int int4 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) '#');
        double double10 = openIntToDoubleHashMap1.put((int) (byte) 100, Double.NaN);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean13 = openIntToDoubleHashMap11.containsKey(97);
        double double15 = openIntToDoubleHashMap11.remove(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, 2.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap3.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
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
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap22 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double25 = openIntToDoubleHashMap1.put(10, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((-1), (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        iterator10.advance();
        int int12 = iterator10.key();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1L);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double6 = openIntToDoubleHashMap4.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        double double7 = openIntToDoubleHashMap1.remove(0);
        boolean boolean9 = openIntToDoubleHashMap1.containsKey(35);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean12 = openIntToDoubleHashMap10.containsKey(3);
        boolean boolean14 = openIntToDoubleHashMap10.containsKey((int) (byte) 1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        boolean boolean9 = openIntToDoubleHashMap1.containsKey((int) (byte) 0);
        double double12 = openIntToDoubleHashMap1.put(0, (double) 10);
        boolean boolean14 = openIntToDoubleHashMap1.containsKey(100);
        double double17 = openIntToDoubleHashMap1.put(32, (double) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator18 = openIntToDoubleHashMap1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = iterator18.value();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int10 = openIntToDoubleHashMap9.size();
        int int11 = openIntToDoubleHashMap9.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap9.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
        double double24 = openIntToDoubleHashMap1.remove((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double9 = openIntToDoubleHashMap1.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (double) 'a');
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double10 = openIntToDoubleHashMap8.get((int) (short) 0);
        int int11 = openIntToDoubleHashMap8.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap8.iterator();
        double double15 = openIntToDoubleHashMap8.put((int) (short) 10, (double) (byte) -1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double15 = openIntToDoubleHashMap1.remove(35);
        boolean boolean17 = openIntToDoubleHashMap1.containsKey(100);
        int int18 = openIntToDoubleHashMap1.size();
        double double21 = openIntToDoubleHashMap1.put((int) '4', (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double9 = openIntToDoubleHashMap1.put(1, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int11 = openIntToDoubleHashMap10.size();
        boolean boolean13 = openIntToDoubleHashMap10.containsKey((int) (byte) 100);
        double double16 = openIntToDoubleHashMap10.put(97, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 10);
        double double4 = openIntToDoubleHashMap2.get((int) ' ');
        double double7 = openIntToDoubleHashMap2.put(35, (double) 1.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) (-1.0f));
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        double double9 = openIntToDoubleHashMap2.remove(0);
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 0);
        boolean boolean13 = openIntToDoubleHashMap2.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap2.iterator();
        boolean boolean15 = iterator14.hasNext();
        boolean boolean16 = iterator14.hasNext();
        boolean boolean17 = iterator14.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double9 = openIntToDoubleHashMap1.put(1, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int11 = openIntToDoubleHashMap10.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap10.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) '#');
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (double) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = openIntToDoubleHashMap3.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap4.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        int int9 = openIntToDoubleHashMap4.size();
        boolean boolean11 = openIntToDoubleHashMap4.containsKey(0);
        boolean boolean13 = openIntToDoubleHashMap4.containsKey((int) ' ');
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap1.remove(32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (byte) 0);
        double double4 = openIntToDoubleHashMap2.get((int) (byte) -1);
        double double6 = openIntToDoubleHashMap2.get((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double13 = openIntToDoubleHashMap1.put((int) (byte) 10, 97.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        double double8 = openIntToDoubleHashMap2.put((int) (byte) 0, (double) 1.0f);
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double13 = openIntToDoubleHashMap11.get((int) (short) 100);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1);
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        double double5 = openIntToDoubleHashMap1.remove(0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = openIntToDoubleHashMap2.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put((int) '#', (double) 100L);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        boolean boolean14 = iterator13.hasNext();
        boolean boolean15 = iterator13.hasNext();
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        double double9 = openIntToDoubleHashMap1.get(2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean5 = iterator4.hasNext();
        boolean boolean6 = iterator4.hasNext();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap1.put(2, (double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1);
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
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = openIntToDoubleHashMap2.put((int) '#', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.remove(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap14);
        int int16 = openIntToDoubleHashMap15.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap17 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap15);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
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
        boolean boolean14 = openIntToDoubleHashMap1.containsKey(0);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, 52.0d);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double6 = openIntToDoubleHashMap2.get((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap3.iterator();
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
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap4.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap7);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap8);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap9.iterator();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        int int2 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int4 = openIntToDoubleHashMap3.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
        int int2 = openIntToDoubleHashMap1.size();
        double double4 = openIntToDoubleHashMap1.remove(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        double double7 = openIntToDoubleHashMap1.get((int) (byte) -1);
        double double10 = openIntToDoubleHashMap1.put((int) (byte) 0, (-1.0d));
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap4.remove(0);
        double double8 = openIntToDoubleHashMap4.get((int) (byte) 100);
        double double10 = openIntToDoubleHashMap4.get(100);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double15 = openIntToDoubleHashMap1.put((int) (byte) 0, 0.0d);
        double double17 = openIntToDoubleHashMap1.get((int) (short) 10);
        double double20 = openIntToDoubleHashMap1.put(100, (double) (byte) 1);
        boolean boolean22 = openIntToDoubleHashMap1.containsKey((int) (byte) 10);
        boolean boolean24 = openIntToDoubleHashMap1.containsKey((int) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator25 = openIntToDoubleHashMap1.iterator();
        double double27 = openIntToDoubleHashMap1.remove((int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator1 = openIntToDoubleHashMap0.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        double double4 = openIntToDoubleHashMap0.remove((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        java.lang.Class<?> wildcardClass6 = openIntToDoubleHashMap0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap11.iterator();
        boolean boolean13 = iterator12.hasNext();
        boolean boolean14 = iterator12.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = iterator12.key();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean5 = iterator4.hasNext();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (short) 0);
        double double5 = openIntToDoubleHashMap2.put((int) (short) 100, 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 1, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap7);
        int int9 = openIntToDoubleHashMap8.size();
        double double11 = openIntToDoubleHashMap8.remove(32);
        double double14 = openIntToDoubleHashMap8.put((int) (short) 100, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 100);
        double double3 = openIntToDoubleHashMap1.get((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double8 = openIntToDoubleHashMap1.get(2);
        double double10 = openIntToDoubleHashMap1.get((-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        double double4 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) 1.0f);
        double double6 = openIntToDoubleHashMap1.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap8);
        double double11 = openIntToDoubleHashMap8.get((int) (short) 10);
        double double13 = openIntToDoubleHashMap8.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap8);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap8.iterator();
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
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) 10L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap3.remove(100);
        boolean boolean7 = openIntToDoubleHashMap3.containsKey((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1);
        double double3 = openIntToDoubleHashMap1.get((int) (short) -1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        double double12 = openIntToDoubleHashMap1.remove((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        iterator13.advance();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.get(35);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        iterator12.advance();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        double double9 = openIntToDoubleHashMap2.get((-1));
        double double11 = openIntToDoubleHashMap2.get((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double15 = openIntToDoubleHashMap12.put(1, 2.0d);
        double double17 = openIntToDoubleHashMap12.get(97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator1 = openIntToDoubleHashMap0.iterator();
        int int2 = openIntToDoubleHashMap0.size();
        boolean boolean4 = openIntToDoubleHashMap0.containsKey(10);
        double double7 = openIntToDoubleHashMap0.put((int) '#', (double) 10L);
        boolean boolean9 = openIntToDoubleHashMap0.containsKey((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap10.iterator();
        double double14 = openIntToDoubleHashMap10.put((int) (byte) -1, (double) (-1L));
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 1, 0.0d);
        int int7 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        iterator9.advance();
        int int12 = iterator9.key();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 32.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
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
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        double double8 = openIntToDoubleHashMap1.remove(0);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.remove((int) 'a');
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        int int8 = iterator5.key();
        boolean boolean9 = iterator5.hasNext();
        boolean boolean10 = iterator5.hasNext();
        int int11 = iterator5.key();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 10);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 0, 0.0d);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double7 = openIntToDoubleHashMap2.put((int) (short) -1, (double) (byte) -1);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey((-1));
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap7.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double12 = openIntToDoubleHashMap1.put(10, (double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double5 = openIntToDoubleHashMap2.put((int) (byte) 10, (double) 100);
        int int6 = openIntToDoubleHashMap2.size();
        boolean boolean8 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        double double12 = openIntToDoubleHashMap1.remove((int) (byte) 10);
        double double14 = openIntToDoubleHashMap1.get((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap16 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        double double4 = openIntToDoubleHashMap2.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        boolean boolean8 = openIntToDoubleHashMap6.containsKey((int) (short) 0);
        int int9 = openIntToDoubleHashMap6.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean11 = openIntToDoubleHashMap9.containsKey((int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (byte) 1);
        double double7 = openIntToDoubleHashMap2.put((int) '4', 0.0d);
        double double10 = openIntToDoubleHashMap2.put((int) (byte) 10, (double) 0);
        int int11 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double14 = openIntToDoubleHashMap2.get((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, 52.0d);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double6 = openIntToDoubleHashMap2.get((int) (short) 10);
        double double8 = openIntToDoubleHashMap2.remove(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        iterator8.advance();
        boolean boolean10 = iterator8.hasNext();
        iterator8.advance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
        java.lang.Class<?> wildcardClass18 = iterator11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, Double.NaN);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean5 = openIntToDoubleHashMap2.containsKey((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        iterator10.advance();
        double double12 = iterator10.value();
        int int13 = iterator10.key();
        double double14 = iterator10.value();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100L);
        int int2 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap4.put(100, (double) '#');
        double double10 = openIntToDoubleHashMap4.put(1, (double) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap3.iterator();
        int int5 = openIntToDoubleHashMap3.size();
        java.lang.Class<?> wildcardClass6 = openIntToDoubleHashMap3.getClass();
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.put(10, (double) (byte) -1);
        double double10 = openIntToDoubleHashMap1.put((int) (byte) 10, (-1.0d));
        double double12 = openIntToDoubleHashMap1.get(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double9 = openIntToDoubleHashMap1.get((-1));
        double double12 = openIntToDoubleHashMap1.put((int) 'a', (double) (byte) 10);
        java.lang.Class<?> wildcardClass13 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (double) (short) 10);
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
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap3.get((int) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        double double8 = openIntToDoubleHashMap3.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap5.iterator();
        double double8 = openIntToDoubleHashMap5.remove(0);
        int int9 = openIntToDoubleHashMap5.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put(10, (double) (-1));
        double double8 = openIntToDoubleHashMap1.remove((int) (short) -1);
        double double11 = openIntToDoubleHashMap1.put((int) '4', (double) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        int int6 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        iterator8.advance();
        boolean boolean10 = iterator8.hasNext();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean4 = iterator3.hasNext();
        boolean boolean5 = iterator3.hasNext();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap2.put((int) (byte) 100, (double) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        int int5 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        int int7 = openIntToDoubleHashMap1.size();
        int int8 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass9 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        double double14 = openIntToDoubleHashMap1.get((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap3.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap3.iterator();
        double double7 = openIntToDoubleHashMap3.remove((int) ' ');
        double double10 = openIntToDoubleHashMap3.put((int) '4', (double) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean5 = openIntToDoubleHashMap3.containsKey((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap3.iterator();
        boolean boolean7 = iterator6.hasNext();
        boolean boolean8 = iterator6.hasNext();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
        boolean boolean18 = iterator16.hasNext();
        double double19 = iterator16.value();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap1.get((-1));
        int int10 = openIntToDoubleHashMap1.size();
        double double12 = openIntToDoubleHashMap1.get((int) ' ');
        double double14 = openIntToDoubleHashMap1.get(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
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
        double double15 = iterator5.value();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        int int6 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap7.get(2);
        java.lang.Class<?> wildcardClass10 = openIntToDoubleHashMap7.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 3);
        double double5 = openIntToDoubleHashMap2.put(97, (double) 10);
        double double7 = openIntToDoubleHashMap2.get(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0d + "'", double5 == 3.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.0d + "'", double7 == 3.0d);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = openIntToDoubleHashMap2.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (byte) 0);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(100);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        double double8 = openIntToDoubleHashMap2.put((int) (short) 0, (double) 0L);
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) 1);
        double double13 = openIntToDoubleHashMap2.put((int) (byte) 0, (double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int16 = openIntToDoubleHashMap2.size();
        java.lang.Class<?> wildcardClass17 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        double double6 = openIntToDoubleHashMap1.put(0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int9 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap2.put(0, Double.NaN);
        double double7 = openIntToDoubleHashMap2.remove((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean5 = openIntToDoubleHashMap3.containsKey((int) (short) -1);
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
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put((int) '#', (double) 100L);
        int int9 = openIntToDoubleHashMap1.size();
        int int10 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((-1), (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap9.iterator();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        double double5 = openIntToDoubleHashMap2.put((int) ' ', 52.0d);
        double double7 = openIntToDoubleHashMap2.get((int) (short) -1);
        int int8 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 100);
        double double3 = openIntToDoubleHashMap1.get((-1));
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
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.get((-1));
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap1.get((-1));
        double double12 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) 2);
        java.lang.Class<?> wildcardClass13 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        double double8 = openIntToDoubleHashMap2.put((int) (byte) 0, (double) 1.0f);
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean13 = openIntToDoubleHashMap2.containsKey(0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        iterator13.advance();
        int int15 = iterator13.key();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        iterator11.advance();
        boolean boolean13 = iterator11.hasNext();
        boolean boolean14 = iterator11.hasNext();
        boolean boolean15 = iterator11.hasNext();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap2.size();
        double double7 = openIntToDoubleHashMap2.put((int) (short) -1, Double.NaN);
        int int8 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
        int int2 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.get((int) 'a');
        java.lang.Class<?> wildcardClass8 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        double double3 = openIntToDoubleHashMap0.put((int) (short) 100, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap4.iterator();
        boolean boolean6 = iterator5.hasNext();
        iterator5.advance();
        int int8 = iterator5.key();
        double double9 = iterator5.value();
        double double10 = iterator5.value();
        int int11 = iterator5.key();
        boolean boolean12 = iterator5.hasNext();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) ' ');
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = openIntToDoubleHashMap1.containsKey(2);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap2.put(1, (double) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap2.iterator();
        double double10 = openIntToDoubleHashMap2.put((int) (byte) 1, (double) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', (double) 2);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        int int8 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int10 = openIntToDoubleHashMap2.size();
        boolean boolean12 = openIntToDoubleHashMap2.containsKey((int) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 10);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (byte) 10);
        double double6 = openIntToDoubleHashMap2.get((int) '#');
        double double8 = openIntToDoubleHashMap2.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        double double8 = openIntToDoubleHashMap2.put((int) (byte) -1, 2.0d);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap3.remove((int) (byte) 1);
        double double8 = openIntToDoubleHashMap3.put((int) (short) 100, (double) 10L);
        boolean boolean10 = openIntToDoubleHashMap3.containsKey(100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put((-1), (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        iterator10.advance();
        double double12 = iterator10.value();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double14 = openIntToDoubleHashMap1.get(100);
        int int15 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, (double) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap3.iterator();
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
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.remove(97);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey(35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) 32);
        double double4 = openIntToDoubleHashMap2.get(32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        int int6 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', 35.0d);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int5 = openIntToDoubleHashMap1.size();
        double double8 = openIntToDoubleHashMap1.put(100, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, 52.0d);
        int int3 = openIntToDoubleHashMap2.size();
        double double5 = openIntToDoubleHashMap2.get(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey(100);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        double double14 = openIntToDoubleHashMap1.remove(3);
        boolean boolean16 = openIntToDoubleHashMap1.containsKey((-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
        int int2 = openIntToDoubleHashMap1.size();
        int int3 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        double double9 = openIntToDoubleHashMap1.remove((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.remove(1);
        boolean boolean6 = openIntToDoubleHashMap2.containsKey(32);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 1);
        int int3 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove(1);
        double double14 = openIntToDoubleHashMap1.get((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap16 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double19 = openIntToDoubleHashMap1.put((int) (byte) 100, (double) 0);
        double double21 = openIntToDoubleHashMap1.get((int) (short) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, 1.0d);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(97, (double) 100);
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
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
        boolean boolean5 = iterator4.hasNext();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) (byte) -1);
        int int8 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        double double11 = openIntToDoubleHashMap1.get(32);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        double double4 = openIntToDoubleHashMap1.put((int) (byte) 1, (double) 1.0f);
        double double6 = openIntToDoubleHashMap1.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double10 = openIntToDoubleHashMap8.get(0);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        double double12 = openIntToDoubleHashMap1.remove((int) (byte) 10);
        double double14 = openIntToDoubleHashMap1.get((int) (byte) -1);
        double double17 = openIntToDoubleHashMap1.put(0, (double) 1L);
        int int18 = openIntToDoubleHashMap1.size();
        double double21 = openIntToDoubleHashMap1.put((-1), (double) '4');
        boolean boolean23 = openIntToDoubleHashMap1.containsKey((int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap13.iterator();
        double double16 = openIntToDoubleHashMap13.remove((int) (short) -1);
        int int17 = openIntToDoubleHashMap13.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap18 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        boolean boolean20 = openIntToDoubleHashMap18.containsKey(32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator21 = openIntToDoubleHashMap18.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) (byte) 1);
        double double4 = openIntToDoubleHashMap2.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double15 = openIntToDoubleHashMap13.remove(0);
        double double17 = openIntToDoubleHashMap13.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator18 = openIntToDoubleHashMap13.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        double double6 = openIntToDoubleHashMap4.remove((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap4.iterator();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double7 = openIntToDoubleHashMap1.get((-1));
        double double10 = openIntToDoubleHashMap1.put((int) (short) -1, Double.NaN);
        double double12 = openIntToDoubleHashMap1.remove(1);
        double double14 = openIntToDoubleHashMap1.get((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, 1.0d);
        double double4 = openIntToDoubleHashMap2.remove((int) (byte) -1);
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
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double6 = openIntToDoubleHashMap1.put((int) (short) 100, 10.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap7.remove((int) (short) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        double double7 = openIntToDoubleHashMap1.get((int) ' ');
        int int8 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', (double) (-1.0f));
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, (double) 0L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean5 = openIntToDoubleHashMap2.containsKey(100);
        double double7 = openIntToDoubleHashMap2.get(2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.get(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double11 = openIntToDoubleHashMap9.remove(1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
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
        java.lang.Class<?> wildcardClass17 = openIntToDoubleHashMap14.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put((int) '#', (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean11 = openIntToDoubleHashMap1.containsKey((int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(2, (double) 0L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap3.get((int) (byte) -1);
        int int6 = openIntToDoubleHashMap3.size();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) '4');
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double4 = openIntToDoubleHashMap1.put(1, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        boolean boolean6 = iterator5.hasNext();
        iterator5.advance();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        double double11 = openIntToDoubleHashMap1.remove((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        iterator12.advance();
        boolean boolean14 = iterator12.hasNext();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, (double) (short) 10);
        double double5 = openIntToDoubleHashMap2.put((int) (short) 10, 97.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean8 = openIntToDoubleHashMap2.containsKey((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap11);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap12);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), 35.0d);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double7 = openIntToDoubleHashMap1.remove((int) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double13 = openIntToDoubleHashMap11.get((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) 10L);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1.0f));
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass12 = iterator11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap4.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        boolean boolean9 = iterator8.hasNext();
        iterator8.advance();
        boolean boolean11 = iterator8.hasNext();
        double double12 = iterator8.value();
        iterator8.advance();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int10 = openIntToDoubleHashMap9.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, 0.0d);
        int int3 = openIntToDoubleHashMap2.size();
        double double5 = openIntToDoubleHashMap2.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) (-1L));
        double double4 = openIntToDoubleHashMap2.remove(1);
        double double6 = openIntToDoubleHashMap2.get(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', 100.0d);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double12 = openIntToDoubleHashMap9.put((int) (byte) 100, (double) (short) 10);
        boolean boolean14 = openIntToDoubleHashMap9.containsKey(3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean6 = openIntToDoubleHashMap4.containsKey(0);
        boolean boolean8 = openIntToDoubleHashMap4.containsKey((int) (byte) 1);
        double double11 = openIntToDoubleHashMap4.put(0, (double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double7 = openIntToDoubleHashMap2.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        double double9 = openIntToDoubleHashMap2.put((int) ' ', (double) 'a');
        boolean boolean11 = openIntToDoubleHashMap2.containsKey(10);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        int int7 = iterator5.key();
        boolean boolean8 = iterator5.hasNext();
        boolean boolean9 = iterator5.hasNext();
        double double10 = iterator5.value();
        int int11 = iterator5.key();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100);
        double double3 = openIntToDoubleHashMap1.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        boolean boolean5 = iterator4.hasNext();
        boolean boolean6 = iterator4.hasNext();
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
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double14 = openIntToDoubleHashMap1.put((int) (byte) 1, 2.0d);
        double double16 = openIntToDoubleHashMap1.get((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) '#');
        double double5 = openIntToDoubleHashMap2.put((int) '#', (double) 0L);
        double double7 = openIntToDoubleHashMap2.remove((int) (byte) 1);
        int int8 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double9 = openIntToDoubleHashMap6.put(35, 0.0d);
        boolean boolean11 = openIntToDoubleHashMap6.containsKey((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100);
        double double3 = openIntToDoubleHashMap1.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean7 = openIntToDoubleHashMap5.containsKey(2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(97, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap3.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap4.remove((int) (short) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        int int9 = openIntToDoubleHashMap4.size();
        boolean boolean11 = openIntToDoubleHashMap4.containsKey(0);
        double double13 = openIntToDoubleHashMap4.get((int) (byte) 1);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double14 = openIntToDoubleHashMap1.put(100, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, (double) 0L);
        double double4 = openIntToDoubleHashMap2.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
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
        boolean boolean18 = iterator14.hasNext();
        double double19 = iterator14.value();
        boolean boolean20 = iterator14.hasNext();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) 32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap2.get((int) 'a');
        double double7 = openIntToDoubleHashMap2.get(0);
        double double9 = openIntToDoubleHashMap2.remove(2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double14 = openIntToDoubleHashMap1.get(100);
        double double16 = openIntToDoubleHashMap1.get((int) (byte) 0);
        double double19 = openIntToDoubleHashMap1.put((int) ' ', (-1.0d));
        double double21 = openIntToDoubleHashMap1.remove((int) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap22 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.remove(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap1.iterator();
        iterator15.advance();
        int int17 = iterator15.key();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        java.lang.Class<?> wildcardClass5 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 0L);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double7 = openIntToDoubleHashMap2.remove(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap2.iterator();
        boolean boolean10 = openIntToDoubleHashMap2.containsKey((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        boolean boolean9 = openIntToDoubleHashMap2.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap2.iterator();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
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
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) '#');
        int int5 = openIntToDoubleHashMap1.size();
        double double8 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        iterator9.advance();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        int int6 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap4.put((int) (short) 10, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (short) 10);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(100);
        double double6 = openIntToDoubleHashMap2.get((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double9 = openIntToDoubleHashMap7.remove((int) (byte) 1);
        boolean boolean11 = openIntToDoubleHashMap7.containsKey((int) (short) -1);
        boolean boolean13 = openIntToDoubleHashMap7.containsKey((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(3.0d);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', (double) (byte) 10);
        double double5 = openIntToDoubleHashMap2.put((int) (short) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double7 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double10 = openIntToDoubleHashMap1.get(10);
        int int11 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, 1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap4.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        double double8 = openIntToDoubleHashMap4.remove((int) (byte) 100);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        int int6 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) -1, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = openIntToDoubleHashMap2.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 103");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        iterator5.advance();
        double double7 = iterator5.value();
        boolean boolean8 = iterator5.hasNext();
        int int9 = iterator5.key();
        int int10 = iterator5.key();
        boolean boolean11 = iterator5.hasNext();
        boolean boolean12 = iterator5.hasNext();
        double double13 = iterator5.value();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        iterator12.advance();
        int int14 = iterator12.key();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean11 = openIntToDoubleHashMap1.containsKey((int) (byte) 10);
        double double13 = openIntToDoubleHashMap1.remove(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.put(10, (double) (byte) -1);
        double double9 = openIntToDoubleHashMap1.remove((int) '4');
        double double11 = openIntToDoubleHashMap1.remove(32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        int int14 = openIntToDoubleHashMap1.size();
        int int15 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) (short) 10);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(100);
        double double6 = openIntToDoubleHashMap2.get((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int8 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int10 = openIntToDoubleHashMap9.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap9.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean11 = openIntToDoubleHashMap9.containsKey((int) (short) 10);
        double double14 = openIntToDoubleHashMap9.put((int) (byte) 1, (double) 10);
        boolean boolean16 = openIntToDoubleHashMap9.containsKey((int) (short) 0);
        int int17 = openIntToDoubleHashMap9.size();
        boolean boolean19 = openIntToDoubleHashMap9.containsKey((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap20 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        java.lang.Class<?> wildcardClass21 = openIntToDoubleHashMap9.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(97, (double) 'a');
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.put((int) (short) 100, 35.0d);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, 52.0d);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        iterator8.advance();
        double double10 = iterator8.value();
        double double11 = iterator8.value();
        boolean boolean12 = iterator8.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 100);
        double double4 = openIntToDoubleHashMap1.put(2, (double) (byte) -1);
        int int5 = openIntToDoubleHashMap1.size();
        java.lang.Class<?> wildcardClass6 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((int) '4');
        double double6 = openIntToDoubleHashMap2.get(2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(2, (double) (short) 10);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) 1);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator1 = openIntToDoubleHashMap0.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        double double4 = openIntToDoubleHashMap0.remove((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) '#');
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
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        double double10 = openIntToDoubleHashMap1.get((int) (byte) 10);
        double double12 = openIntToDoubleHashMap1.remove((int) (byte) 10);
        double double14 = openIntToDoubleHashMap1.get((int) (byte) -1);
        int int15 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
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
        double double13 = iterator5.value();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.put(10, (double) (byte) -1);
        double double9 = openIntToDoubleHashMap1.remove((int) '4');
        double double11 = openIntToDoubleHashMap1.remove(32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) 1L);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) 10);
        double double4 = openIntToDoubleHashMap2.remove(0);
        double double7 = openIntToDoubleHashMap2.put((int) '4', 10.0d);
        double double9 = openIntToDoubleHashMap2.remove((int) (short) 1);
        double double12 = openIntToDoubleHashMap2.put(3, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double6 = openIntToDoubleHashMap1.remove(100);
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
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(100);
        int int6 = openIntToDoubleHashMap1.size();
        double double8 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        double double11 = openIntToDoubleHashMap1.put((int) (byte) 0, (double) 10.0f);
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        boolean boolean15 = openIntToDoubleHashMap1.containsKey(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double8 = openIntToDoubleHashMap1.put(10, (double) 1.0f);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double13 = openIntToDoubleHashMap1.remove((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(10, (double) (byte) 0);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 100.0f);
        double double5 = openIntToDoubleHashMap2.put(100, 1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
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
        int int18 = openIntToDoubleHashMap16.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0, (double) 100.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        boolean boolean5 = openIntToDoubleHashMap3.containsKey((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int5 = openIntToDoubleHashMap2.size();
        double double7 = openIntToDoubleHashMap2.get((int) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap2.iterator();
        double double10 = openIntToDoubleHashMap2.remove((int) (byte) 0);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        iterator9.advance();
        double double12 = iterator9.value();
        double double13 = iterator9.value();
        boolean boolean14 = iterator9.hasNext();
        double double15 = iterator9.value();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put((int) '#', (double) 100L);
        int int9 = openIntToDoubleHashMap1.size();
        double double12 = openIntToDoubleHashMap1.put(10, (double) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((int) 'a');
        double double6 = openIntToDoubleHashMap2.get(1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        double double11 = openIntToDoubleHashMap1.remove((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator13 = openIntToDoubleHashMap1.iterator();
        iterator13.advance();
        int int15 = iterator13.key();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        double double4 = openIntToDoubleHashMap1.put((int) 'a', (double) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean7 = openIntToDoubleHashMap5.containsKey(97);
        double double10 = openIntToDoubleHashMap5.put((int) ' ', (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap5.iterator();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int13 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double16 = openIntToDoubleHashMap14.get((int) (byte) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap17 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap14);
        int int18 = openIntToDoubleHashMap17.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap19 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap17);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', (double) (byte) 0);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100, (double) (byte) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap3.iterator();
        double double7 = openIntToDoubleHashMap3.get((int) (short) 10);
        double double9 = openIntToDoubleHashMap3.remove((int) (byte) 10);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        boolean boolean10 = iterator9.hasNext();
        iterator9.advance();
        double double12 = iterator9.value();
        double double13 = iterator9.value();
        boolean boolean14 = iterator9.hasNext();
        boolean boolean15 = iterator9.hasNext();
        int int16 = iterator9.key();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap6);
        int int8 = openIntToDoubleHashMap7.size();
        boolean boolean10 = openIntToDoubleHashMap7.containsKey(32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap7);
        double double13 = openIntToDoubleHashMap11.get(2);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((int) (short) 0);
        double double6 = openIntToDoubleHashMap2.get((int) (byte) 1);
        double double9 = openIntToDoubleHashMap2.put((int) 'a', (double) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, 2.0d);
        double double4 = openIntToDoubleHashMap2.remove(10);
        double double6 = openIntToDoubleHashMap2.get(1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
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
        int int22 = iterator16.key();
        boolean boolean23 = iterator16.hasNext();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        double double4 = openIntToDoubleHashMap2.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap2.remove(32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (short) 10);
        double double7 = openIntToDoubleHashMap1.put(0, Double.NaN);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.get(35);
        int int11 = openIntToDoubleHashMap1.size();
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        int int6 = openIntToDoubleHashMap1.size();
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(2);
        double double11 = openIntToDoubleHashMap1.put((int) (short) 10, (double) 10L);
        java.lang.Class<?> wildcardClass12 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#');
        boolean boolean3 = openIntToDoubleHashMap1.containsKey((int) (byte) -1);
        double double6 = openIntToDoubleHashMap1.put((int) (byte) 1, 0.0d);
        double double8 = openIntToDoubleHashMap1.remove((int) (short) -1);
        double double11 = openIntToDoubleHashMap1.put((int) ' ', 0.0d);
        boolean boolean13 = openIntToDoubleHashMap1.containsKey(1);
        int int14 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, 1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap4.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap4.iterator();
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(1);
        boolean boolean6 = openIntToDoubleHashMap1.containsKey((int) (short) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap1.get((-1));
        double double11 = openIntToDoubleHashMap1.remove((int) (byte) 0);
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double12 = openIntToDoubleHashMap1.get(10);
        boolean boolean14 = openIntToDoubleHashMap1.containsKey((int) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap1.iterator();
        iterator15.advance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 0, (-1.0d));
        double double5 = openIntToDoubleHashMap2.put((int) (short) 0, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double4 = openIntToDoubleHashMap1.put(1, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        int int6 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) (byte) 100);
        int int3 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, 0.0d);
        double double4 = openIntToDoubleHashMap2.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        boolean boolean8 = openIntToDoubleHashMap6.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap6);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap6.iterator();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (double) (short) 10);
        java.lang.Class<?> wildcardClass3 = openIntToDoubleHashMap2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, 1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap2.iterator();
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
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double9 = openIntToDoubleHashMap1.put(1, (double) 100L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int11 = openIntToDoubleHashMap10.size();
        boolean boolean13 = openIntToDoubleHashMap10.containsKey((int) (byte) 100);
        boolean boolean15 = openIntToDoubleHashMap10.containsKey((int) (short) -1);
        int int16 = openIntToDoubleHashMap10.size();
        double double18 = openIntToDoubleHashMap10.remove(2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', (double) 10L);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap13.iterator();
        double double16 = openIntToDoubleHashMap13.remove((int) (short) -1);
        int int17 = openIntToDoubleHashMap13.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap18 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        double double20 = openIntToDoubleHashMap18.get((int) (short) 1);
        double double22 = openIntToDoubleHashMap18.remove(100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
    }
}

