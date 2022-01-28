import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 1, (-1.0d));
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.remove(100);
        double double7 = openIntToDoubleHashMap2.get((-1));
        boolean boolean9 = openIntToDoubleHashMap2.containsKey((int) '4');
        double double12 = openIntToDoubleHashMap2.put((int) (byte) 100, 52.0d);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new org.apache.commons.math.util.OpenIntToDoubleHashMap();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator1 = openIntToDoubleHashMap0.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
        double double4 = openIntToDoubleHashMap0.remove((int) (short) 0);
        double double7 = openIntToDoubleHashMap0.put((int) (byte) -1, (double) (byte) 0);
        double double10 = openIntToDoubleHashMap0.put((int) '4', (double) '4');
        boolean boolean12 = openIntToDoubleHashMap0.containsKey((int) (short) 1);
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        double double6 = openIntToDoubleHashMap1.put(0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, 97.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get((int) (short) -1);
        double double8 = openIntToDoubleHashMap2.put(3, (double) ' ');
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 100, (double) 32);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) (byte) 100);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) -1);
        double double4 = openIntToDoubleHashMap1.put((int) 'a', (double) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.remove(35);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap9.iterator();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        double double6 = openIntToDoubleHashMap1.put((int) (short) -1, (double) (short) 10);
        boolean boolean8 = openIntToDoubleHashMap1.containsKey(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator11 = openIntToDoubleHashMap1.iterator();
        double double13 = openIntToDoubleHashMap1.remove(0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(2, 32.0d);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
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
        int int15 = iterator9.key();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double4 = openIntToDoubleHashMap2.get((int) '4');
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(35, (double) 100.0f);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double6 = openIntToDoubleHashMap1.put((int) 'a', (double) (short) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int8 = openIntToDoubleHashMap1.size();
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        int int2 = openIntToDoubleHashMap1.size();
        double double4 = openIntToDoubleHashMap1.get((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(97, (double) '4');
        int int3 = openIntToDoubleHashMap2.size();
        int int4 = openIntToDoubleHashMap2.size();
        boolean boolean6 = openIntToDoubleHashMap2.containsKey((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap1.iterator();
        int int6 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        iterator7.advance();
        boolean boolean9 = iterator7.hasNext();
        double double10 = iterator7.value();
        int int11 = iterator7.key();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.get((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator7 = openIntToDoubleHashMap1.iterator();
        boolean boolean8 = iterator7.hasNext();
        boolean boolean9 = iterator7.hasNext();
        boolean boolean10 = iterator7.hasNext();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 100);
        double double3 = openIntToDoubleHashMap1.get((int) 'a');
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, 0.0d);
        int int3 = openIntToDoubleHashMap2.size();
        double double6 = openIntToDoubleHashMap2.put((int) (byte) -1, 10.0d);
        boolean boolean8 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, 35.0d);
        double double4 = openIntToDoubleHashMap2.get(0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap4 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap4);
        int int6 = openIntToDoubleHashMap4.size();
        boolean boolean8 = openIntToDoubleHashMap4.containsKey((int) (byte) 10);
        double double10 = openIntToDoubleHashMap4.remove(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        double double7 = openIntToDoubleHashMap2.remove((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap13.iterator();
        double double16 = openIntToDoubleHashMap13.remove((int) (short) -1);
        double double18 = openIntToDoubleHashMap13.remove(10);
        java.lang.Class<?> wildcardClass19 = openIntToDoubleHashMap13.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a', 10.0d);
        double double4 = openIntToDoubleHashMap2.remove(0);
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, Double.NaN);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        double double5 = openIntToDoubleHashMap2.get(0);
        double double7 = openIntToDoubleHashMap2.remove((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap8 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int9 = openIntToDoubleHashMap2.size();
        double double11 = openIntToDoubleHashMap2.remove(32);
        double double13 = openIntToDoubleHashMap2.get((int) 'a');
        double double15 = openIntToDoubleHashMap2.remove(35);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator17 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
        int int18 = iterator13.key();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double6 = openIntToDoubleHashMap3.put(32, 32.0d);
        boolean boolean8 = openIntToDoubleHashMap3.containsKey((int) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap3.iterator();
        double double11 = openIntToDoubleHashMap3.remove(2);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        double double13 = openIntToDoubleHashMap1.put(0, (double) (byte) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double17 = openIntToDoubleHashMap14.put((-1), 1.0d);
        double double19 = openIntToDoubleHashMap14.get(2);
        double double22 = openIntToDoubleHashMap14.put(35, (double) 10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator23 = openIntToDoubleHashMap14.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator24 = openIntToDoubleHashMap14.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = iterator24.key();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(iterator24);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(2, 2.0d);
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
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap11 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap11);
        double double14 = openIntToDoubleHashMap12.remove((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator15 = openIntToDoubleHashMap12.iterator();
        iterator15.advance();
        boolean boolean17 = iterator15.hasNext();
        double double18 = iterator15.value();
        int int19 = iterator15.key();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, (double) 100L);
        double double4 = openIntToDoubleHashMap2.remove((int) '#');
        double double7 = openIntToDoubleHashMap2.put((-1), (double) 10.0f);
        int int8 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap9);
        int int11 = openIntToDoubleHashMap10.size();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int11 = openIntToDoubleHashMap1.size();
        double double13 = openIntToDoubleHashMap1.get((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator14 = openIntToDoubleHashMap1.iterator();
        iterator14.advance();
        double double16 = iterator14.value();
        int int17 = iterator14.key();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 10.0f);
        int int2 = openIntToDoubleHashMap1.size();
        boolean boolean4 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        boolean boolean3 = openIntToDoubleHashMap1.containsKey(0);
        double double5 = openIntToDoubleHashMap1.get((int) ' ');
        int int6 = openIntToDoubleHashMap1.size();
        double double9 = openIntToDoubleHashMap1.put(100, (double) (short) -1);
        boolean boolean11 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap12 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double14 = openIntToDoubleHashMap1.get((int) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap16 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap15);
        double double18 = openIntToDoubleHashMap15.remove((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((-1), (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = openIntToDoubleHashMap2.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        double double6 = openIntToDoubleHashMap1.put((int) ' ', (double) (byte) 100);
        double double8 = openIntToDoubleHashMap1.remove(100);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey(10);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        int int14 = openIntToDoubleHashMap13.size();
        double double17 = openIntToDoubleHashMap13.put((int) (short) 100, (double) (short) 10);
        double double19 = openIntToDoubleHashMap13.get((-1));
        double double21 = openIntToDoubleHashMap13.get(32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (-1L));
        double double3 = openIntToDoubleHashMap1.remove((int) '4');
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put((int) '#', (double) 100L);
        int int9 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap10 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean12 = openIntToDoubleHashMap1.containsKey((int) (short) 10);
        boolean boolean14 = openIntToDoubleHashMap1.containsKey((int) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean17 = openIntToDoubleHashMap1.containsKey((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap24 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
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
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) 1.0f);
        double double4 = openIntToDoubleHashMap1.put((int) (short) 0, 52.0d);
        double double7 = openIntToDoubleHashMap1.put((int) 'a', (double) 0.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator8 = openIntToDoubleHashMap1.iterator();
        iterator8.advance();
        double double10 = iterator8.value();
        double double11 = iterator8.value();
        boolean boolean12 = iterator8.hasNext();
        boolean boolean13 = iterator8.hasNext();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(97, (double) 10L);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) ' ');
        int int2 = openIntToDoubleHashMap1.size();
        double double5 = openIntToDoubleHashMap1.put(100, (double) 1);
        double double7 = openIntToDoubleHashMap1.get((int) (byte) 100);
        int int8 = openIntToDoubleHashMap1.size();
        double double11 = openIntToDoubleHashMap1.put(32, (double) 10.0f);
        double double14 = openIntToDoubleHashMap1.put((int) (byte) 10, 0.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap3.get((int) '#');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap6 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        java.lang.Class<?> wildcardClass7 = openIntToDoubleHashMap3.getClass();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        java.lang.Class<?> wildcardClass24 = openIntToDoubleHashMap1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        double double13 = iterator5.value();
        int int14 = iterator5.key();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) 'a');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double5 = openIntToDoubleHashMap2.put((int) (byte) 1, (double) 0L);
        boolean boolean7 = openIntToDoubleHashMap2.containsKey(100);
        int int8 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) -1, (double) ' ');
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap3.iterator();
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
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) '#');
        int int5 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        boolean boolean7 = iterator6.hasNext();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 1.0f);
        int int3 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) 0);
        double double4 = openIntToDoubleHashMap2.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(1, (double) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double5 = openIntToDoubleHashMap3.remove(100);
        boolean boolean7 = openIntToDoubleHashMap3.containsKey(1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        int int15 = iterator10.key();
        int int16 = iterator10.key();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(100, 97.0d);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(10, (double) 32);
        double double4 = openIntToDoubleHashMap2.get(32);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        double double7 = openIntToDoubleHashMap2.remove(35);
        double double9 = openIntToDoubleHashMap2.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap5 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double7 = openIntToDoubleHashMap1.get((int) (byte) -1);
        int int8 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator9 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator10 = openIntToDoubleHashMap1.iterator();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10, 10.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap3.put((int) (short) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double5 = openIntToDoubleHashMap1.put((int) (byte) 10, (double) 0.0f);
        double double7 = openIntToDoubleHashMap1.remove(0);
        double double9 = openIntToDoubleHashMap1.get((int) (short) 100);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (-1.0d));
        int int3 = openIntToDoubleHashMap2.size();
        double double5 = openIntToDoubleHashMap2.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (byte) -1);
        double double12 = openIntToDoubleHashMap1.remove((int) (short) 1);
        int int13 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap15 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double18 = openIntToDoubleHashMap1.put((int) (byte) 0, 10.0d);
        int int19 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) '4');
        double double5 = openIntToDoubleHashMap2.put((int) (byte) 1, (double) 2);
        double double7 = openIntToDoubleHashMap2.get(0);
        double double9 = openIntToDoubleHashMap2.get((int) 'a');
        double double11 = openIntToDoubleHashMap2.remove(0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator12 = openIntToDoubleHashMap2.iterator();
        boolean boolean13 = iterator12.hasNext();
        iterator12.advance();
        int int15 = iterator12.key();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(32, (double) 0);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', (double) (byte) 100);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        double double6 = openIntToDoubleHashMap3.put((int) (byte) -1, (double) 2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap3);
        double double10 = openIntToDoubleHashMap7.put((int) (short) 1, (double) (-1.0f));
        boolean boolean12 = openIntToDoubleHashMap7.containsKey((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) ' ', 52.0d);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        boolean boolean5 = openIntToDoubleHashMap2.containsKey((int) (short) 0);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '4', (double) 1);
        int int3 = openIntToDoubleHashMap2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 1, (double) 1.0f);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap3 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap2);
        int int4 = openIntToDoubleHashMap3.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap3.iterator();
        double double7 = openIntToDoubleHashMap3.remove((int) ' ');
        int int8 = openIntToDoubleHashMap3.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 10);
        double double3 = openIntToDoubleHashMap1.get((-1));
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator4 = openIntToDoubleHashMap1.iterator();
        double double6 = openIntToDoubleHashMap1.remove((int) '#');
        double double8 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        boolean boolean10 = openIntToDoubleHashMap1.containsKey(3);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        double double3 = openIntToDoubleHashMap1.get((int) (byte) 1);
        boolean boolean5 = openIntToDoubleHashMap1.containsKey((int) (short) 0);
        double double8 = openIntToDoubleHashMap1.put(0, (double) 0L);
        double double10 = openIntToDoubleHashMap1.remove((int) (short) 10);
        int int11 = openIntToDoubleHashMap1.size();
        int int12 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap13 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap14 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap13);
        double double16 = openIntToDoubleHashMap14.get(1);
        int int17 = openIntToDoubleHashMap14.size();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (short) 0, (double) (short) 1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        double double4 = openIntToDoubleHashMap1.remove((int) (byte) 100);
        int int5 = openIntToDoubleHashMap1.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap1.iterator();
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap7 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        double double9 = openIntToDoubleHashMap1.remove((int) (byte) 1);
        double double11 = openIntToDoubleHashMap1.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap9 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(openIntToDoubleHashMap1);
        boolean boolean11 = openIntToDoubleHashMap9.containsKey((int) (short) 10);
        double double14 = openIntToDoubleHashMap9.put((int) (byte) 1, (double) 10);
        double double16 = openIntToDoubleHashMap9.get((int) (byte) -1);
        int int17 = openIntToDoubleHashMap9.size();
        double double19 = openIntToDoubleHashMap9.remove(0);
        double double21 = openIntToDoubleHashMap9.remove(10);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0, (double) (byte) 0);
        boolean boolean4 = openIntToDoubleHashMap2.containsKey(100);
        int int5 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator6 = openIntToDoubleHashMap2.iterator();
        boolean boolean7 = iterator6.hasNext();
        boolean boolean8 = iterator6.hasNext();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) '#', (double) 100.0f);
        double double5 = openIntToDoubleHashMap2.put((int) (short) 10, (double) (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap2 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((int) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator3 = openIntToDoubleHashMap2.iterator();
        int int4 = openIntToDoubleHashMap2.size();
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = openIntToDoubleHashMap2.iterator();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.apache.commons.math.util.OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new org.apache.commons.math.util.OpenIntToDoubleHashMap((double) '4');
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator2 = openIntToDoubleHashMap1.iterator();
        int int3 = openIntToDoubleHashMap1.size();
        boolean boolean5 = openIntToDoubleHashMap1.containsKey(0);
        double double8 = openIntToDoubleHashMap1.put(100, (double) (-1L));
        double double10 = openIntToDoubleHashMap1.get((int) (short) 0);
        int int11 = openIntToDoubleHashMap1.size();
        int int12 = openIntToDoubleHashMap1.size();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
        double double13 = iterator10.value();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }
}

