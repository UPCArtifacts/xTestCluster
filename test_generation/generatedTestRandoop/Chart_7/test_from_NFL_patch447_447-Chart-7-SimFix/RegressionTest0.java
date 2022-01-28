import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = timePeriodValues1.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue7 = timePeriodValues1.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.Number number4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(100, number4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriod timePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod5, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue4 = null; // flaky: timePeriodValues1.getDataItem((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        org.jfree.data.time.TimePeriodValue timePeriodValue6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        org.jfree.data.time.TimePeriod timePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod2, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValue timePeriodValue5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(100, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) 'a', (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue3 = timePeriodValues1.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        java.lang.Class<?> wildcardClass6 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriod timePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod3, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues3.delete((int) (byte) -1, (int) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        org.jfree.data.time.TimePeriodValue timePeriodValue4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod5 = timePeriodValues3.getTimePeriod((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriod timePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod5, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.Class<?> wildcardClass3 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod8, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod4, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        timePeriodValues1.setDescription("hi!");
        timePeriodValues1.setRangeDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timePeriodValues1.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timePeriodValues3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        boolean boolean6 = timePeriodValues1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.delete((int) (byte) -1, 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriod timePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod5, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) 'a', (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        boolean boolean4 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriod timePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod5, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timePeriodValues3.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timePeriodValues3.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        int int5 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValue timePeriodValue6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        java.lang.Class<?> wildcardClass8 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        boolean boolean4 = timePeriodValues1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue6 = timePeriodValues1.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        boolean boolean4 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriodValue timePeriodValue5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriod timePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod6, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Class<?> wildcardClass5 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod7, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod7 = timePeriodValues1.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValue timePeriodValue7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue13 = timePeriodValues1.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timePeriodValues1.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        java.lang.Class<?> wildcardClass3 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        org.jfree.data.time.TimePeriodValue timePeriodValue8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues(comparable0, "Time", "Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriod timePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod6, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timePeriodValues3.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod7, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean10 = timePeriodValues1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 100, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        org.jfree.data.time.TimePeriodValue timePeriodValue7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod13 = null; // flaky: timePeriodValues8.getTimePeriod((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod8 = timePeriodValues1.getTimePeriod((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 1, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod7, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0L);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue4 = timePeriodValues1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timePeriodValues1.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(10, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        org.jfree.data.time.TimePeriodValue timePeriodValue4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = timePeriodValues1.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        int int5 = timePeriodValues3.getItemCount();
        int int6 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = null; // flaky: timePeriodValues1.getValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0L);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod4 = timePeriodValues1.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timePeriodValues3.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        org.jfree.data.time.TimePeriod timePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod8, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timePeriodValues3.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue14 = timePeriodValues1.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        boolean boolean4 = timePeriodValues1.isEmpty();
        int int5 = timePeriodValues1.getMinEndIndex();
        int int6 = timePeriodValues1.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue8 = timePeriodValues1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        java.lang.String str4 = timePeriodValues3.getRangeDescription();
        org.jfree.data.time.TimePeriodValue timePeriodValue5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener6);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (byte) 0, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue8 = timePeriodValues3.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(0, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy(0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue12 = timePeriodValues1.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) 'a', (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue12 = timePeriodValues1.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        java.lang.String str11 = timePeriodValues1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(0, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        java.lang.String str5 = timePeriodValues3.getDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValue timePeriodValue6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timePeriodValues1.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod12 = timePeriodValues1.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) '4', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = null; // flaky: timePeriodValues3.getValue((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timePeriodValues1.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues(comparable0, "", "Value");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0d, "Time", "Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue5 = timePeriodValues3.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) 'a', (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = timePeriodValues1.equals(obj5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod9 = timePeriodValues1.getTimePeriod((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        boolean boolean4 = timePeriodValues1.isEmpty();
        int int5 = timePeriodValues1.getMinEndIndex();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod7, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMaxStartIndex();
        java.lang.String str7 = timePeriodValues1.getDescription();
        java.lang.Class<?> wildcardClass8 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        java.lang.String str11 = timePeriodValues1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue10 = timePeriodValues3.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0d) + "'", comparable8, (-1.0d));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) -1);
        org.jfree.data.time.TimePeriod timePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod2, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timePeriodValues3.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        java.lang.String str11 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod12, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues(comparable0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod11 = timePeriodValues1.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10.0d, "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) (byte) 100, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod7 = timePeriodValues3.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        java.lang.Class<?> wildcardClass6 = comparable5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue5 = timePeriodValues1.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str6 = timePeriodValues3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) (short) 0, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMinEndIndex();
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod6 = null; // flaky: timePeriodValues1.getTimePeriod((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.lang.Class<?> wildcardClass9 = timePeriodValues3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10.0f);
        org.jfree.data.time.TimePeriodValue timePeriodValue2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timePeriodValues1.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue6 = null; // flaky: timePeriodValues3.getDataItem((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (byte) 1, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMinEndIndex();
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        timePeriodValues1.setRangeDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) 'a', (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue13 = timePeriodValues1.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimePeriod timePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod8, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        boolean boolean6 = timePeriodValues1.isEmpty();
        java.lang.Class<?> wildcardClass7 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "hi!", "Value");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        int int4 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue6 = timePeriodValues1.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        org.jfree.data.time.TimePeriodValue timePeriodValue4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        boolean boolean6 = timePeriodValues1.equals((java.lang.Object) 100L);
        timePeriodValues1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.setDescription("");
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod7, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        int int5 = timePeriodValues3.getItemCount();
        int int6 = timePeriodValues3.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update(1, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        boolean boolean3 = timePeriodValues1.getNotify();
        java.lang.Object obj4 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriod timePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod5, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        java.lang.String str4 = timePeriodValues3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue6 = timePeriodValues3.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.time.TimePeriodValue timePeriodValue10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timePeriodValues1.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) '4', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue6 = timePeriodValues1.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues4);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        org.jfree.data.time.TimePeriodValue timePeriodValue7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues6);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.Comparable comparable3 = timePeriodValues1.getKey();
        java.lang.Class<?> wildcardClass4 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (short) 10 + "'", comparable3, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        java.lang.Class<?> wildcardClass4 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod9 = timePeriodValues3.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(0, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "Time", "");
        org.jfree.data.time.TimePeriodValue timePeriodValue4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 10, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timePeriodValues3.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        boolean boolean3 = timePeriodValues1.getNotify();
        java.lang.Object obj4 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues6.setDescription("hi!");
        java.lang.Object obj9 = timePeriodValues6.clone();
        boolean boolean10 = timePeriodValues1.equals(obj9);
        org.jfree.data.time.TimePeriodValue timePeriodValue11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((-1), 10);
        int int9 = timePeriodValues3.getItemCount();
        int int10 = timePeriodValues3.getMaxEndIndex();
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod11, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMinEndIndex();
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod5, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str4 = timePeriodValues1.getDescription();
        org.jfree.data.time.TimePeriod timePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod5, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj7 = timePeriodValues6.clone();
        java.lang.String str8 = timePeriodValues6.getDescription();
        java.lang.Comparable comparable9 = timePeriodValues6.getKey();
        java.lang.String str10 = timePeriodValues6.getDescription();
        int int11 = timePeriodValues6.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues6.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues6.addPropertyChangeListener(propertyChangeListener14);
        int int16 = timePeriodValues6.getMaxStartIndex();
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) timePeriodValues6);
        org.jfree.data.time.TimePeriod timePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues6.add(timePeriod18, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str4 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod8 = timePeriodValues1.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) ' ', (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "Time");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDescription("hi!");
        int int10 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod11, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        boolean boolean3 = timePeriodValues1.getNotify();
        java.lang.Object obj4 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues6.setDescription("hi!");
        java.lang.Object obj9 = timePeriodValues6.clone();
        boolean boolean10 = timePeriodValues1.equals(obj9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue12 = timePeriodValues1.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) '4', (int) 'a');
        java.lang.String str5 = timePeriodValues4.getDescription();
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue12 = timePeriodValues1.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDescription("hi!");
        int int10 = timePeriodValues1.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = null; // flaky: timePeriodValues1.getValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setNotify(true);
        int int10 = timePeriodValues3.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.delete(1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1, "hi!", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable6 = timePeriodValues5.getKey();
        timePeriodValues5.setDescription("hi!");
        timePeriodValues5.setRangeDescription("Time");
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues5);
        int int12 = timePeriodValues5.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (short) 10 + "'", comparable6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod14 = timePeriodValues1.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimePeriodValue timePeriodValue10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        boolean boolean3 = timePeriodValues1.getNotify();
        java.lang.Object obj4 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues6.setDescription("hi!");
        java.lang.Object obj9 = timePeriodValues6.clone();
        boolean boolean10 = timePeriodValues1.equals(obj9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timePeriodValues1.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues(comparable0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        boolean boolean12 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) 'a', (int) (short) -1);
        int int16 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        int int4 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriod timePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod5, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        java.lang.String str10 = timePeriodValues3.getRangeDescription();
        int int11 = timePeriodValues3.getMaxEndIndex();
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((-1), 10);
        int int9 = timePeriodValues3.getItemCount();
        int int10 = timePeriodValues3.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timePeriodValues3.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(true);
        java.lang.Class<?> wildcardClass11 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues3.setDomainDescription("Time");
        java.lang.Comparable comparable13 = timePeriodValues3.getKey();
        org.jfree.data.time.TimePeriod timePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod14, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (-1.0d) + "'", comparable13, (-1.0d));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        boolean boolean6 = timePeriodValues3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod8 = timePeriodValues3.getTimePeriod(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod11 = timePeriodValues3.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) 'a', (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues3.setDomainDescription("Time");
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod13, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setNotify(true);
        java.lang.Class<?> wildcardClass11 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        java.lang.Object obj13 = timePeriodValues1.clone();
        java.lang.Object obj14 = timePeriodValues1.clone();
        java.lang.Class<?> wildcardClass15 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        int int9 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue5 = timePeriodValues1.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue8 = timePeriodValues3.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues6);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timePeriodValues3.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) '4', (int) 'a');
        org.jfree.data.time.TimePeriod timePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues4.add(timePeriod5, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues4);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue7 = timePeriodValues1.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValue timePeriodValue6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0d, "Time", "Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue5 = timePeriodValues3.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        boolean boolean6 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 10, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod14 = timePeriodValues1.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        int int5 = timePeriodValues3.getItemCount();
        timePeriodValues3.setDescription("Value");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) '4', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timePeriodValues1.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues4);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        boolean boolean6 = timePeriodValues3.isEmpty();
        java.lang.Object obj7 = timePeriodValues3.clone();
        int int8 = timePeriodValues3.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        int int6 = timePeriodValues3.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timePeriodValues3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimePeriod timePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod2, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Class<?> wildcardClass7 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) '#');
        org.jfree.data.time.TimePeriod timePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod2, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue8 = timePeriodValues1.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = null; // flaky: timePeriodValues1.getValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener10);
        int int12 = timePeriodValues3.getItemCount();
        int int13 = timePeriodValues3.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update(0, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        java.lang.Class<?> wildcardClass7 = timePeriodValues3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        int int22 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener23);
        java.lang.String str25 = timePeriodValues1.getDomainDescription();
        int int26 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj27 = timePeriodValues1.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues5.setDescription("hi!");
        int int8 = timePeriodValues5.getMinEndIndex();
        java.lang.Comparable comparable9 = timePeriodValues5.getKey();
        int int10 = timePeriodValues5.getMaxStartIndex();
        java.lang.String str11 = timePeriodValues5.getDescription();
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) str11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        java.lang.String str12 = timePeriodValues3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) '4', (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "", "", "");
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod4, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setRangeDescription("hi!");
        java.lang.Object obj5 = timePeriodValues1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timePeriodValues1.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues8.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue13 = timePeriodValues8.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinEndIndex();
        int int8 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue6 = null; // flaky: timePeriodValues1.getDataItem((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timePeriodValues3.getItemCount();
        org.jfree.data.time.TimePeriodValue timePeriodValue10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = null; // flaky: timePeriodValues1.getValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        timePeriodValues3.setRangeDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod13 = timePeriodValues3.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener4);
        boolean boolean6 = timePeriodValues3.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod9, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 0, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (short) 10 + "'", comparable6, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod7 = timePeriodValues1.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update(10, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) '4', "hi!", "Value");
        int int4 = timePeriodValues3.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timePeriodValues1.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener13);
        int int15 = timePeriodValues3.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) (byte) 0, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setDescription("");
        java.lang.Class<?> wildcardClass14 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        int int10 = timePeriodValues1.getMaxStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod12 = null; // flaky: timePeriodValues1.getTimePeriod((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1) + "'", comparable9, (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        boolean boolean11 = timePeriodValues1.isEmpty();
        int int12 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy(0, (int) (short) 10);
        int int16 = timePeriodValues15.getMaxEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.time.TimePeriod timePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod5, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        timePeriodValues3.setDescription("hi!");
        java.lang.Comparable comparable9 = timePeriodValues3.getKey();
        timePeriodValues3.fireSeriesChanged();
        java.lang.String str11 = timePeriodValues3.getDescription();
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod12, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 0 + "'", comparable9, (short) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        java.lang.String str12 = timePeriodValues11.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj15 = timePeriodValues14.clone();
        java.lang.String str16 = timePeriodValues14.getDescription();
        java.lang.Comparable comparable17 = timePeriodValues14.getKey();
        java.lang.String str18 = timePeriodValues14.getDescription();
        int int19 = timePeriodValues14.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timePeriodValues14.removePropertyChangeListener(propertyChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timePeriodValues14.addPropertyChangeListener(propertyChangeListener22);
        java.lang.Object obj24 = timePeriodValues14.clone();
        java.lang.Comparable comparable25 = timePeriodValues14.getKey();
        boolean boolean26 = timePeriodValues11.equals((java.lang.Object) timePeriodValues14);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues11.delete((int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 10 + "'", comparable17, (short) 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (short) 10 + "'", comparable25, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getItemCount();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriodValue timePeriodValue10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod7, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod11 = null; // flaky: timePeriodValues3.getTimePeriod((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        int int5 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Class<?> wildcardClass8 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        int int22 = timePeriodValues14.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod24 = timePeriodValues14.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.setNotify(true);
        org.jfree.data.time.TimePeriod timePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod6, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        timePeriodValues1.setKey((java.lang.Comparable) 100);
        java.lang.Class<?> wildcardClass9 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues(comparable0, "Value", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriod timePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod3, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (byte) -1 + "'", comparable2, (byte) -1);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriodValue timePeriodValue8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj14 = timePeriodValues13.clone();
        java.lang.String str15 = timePeriodValues13.getDescription();
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        int int17 = timePeriodValues13.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = timePeriodValues13.createCopy((-1), (-1));
        boolean boolean23 = timePeriodValues1.equals((java.lang.Object) timePeriodValues22);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (byte) 100, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        timePeriodValues1.setNotify(true);
        int int15 = timePeriodValues1.getMaxStartIndex();
        int int16 = timePeriodValues1.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete(10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj11 = timePeriodValues10.clone();
        java.lang.String str12 = timePeriodValues10.getRangeDescription();
        int int13 = timePeriodValues10.getMaxEndIndex();
        timePeriodValues10.fireSeriesChanged();
        boolean boolean15 = timePeriodValues3.equals((java.lang.Object) timePeriodValues10);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues10.update((int) '4', (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setRangeDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 1, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        int int5 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setDescription("");
        org.jfree.data.time.TimePeriodValue timePeriodValue10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj14 = timePeriodValues13.clone();
        java.lang.String str15 = timePeriodValues13.getDescription();
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        int int17 = timePeriodValues13.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = timePeriodValues13.createCopy((-1), (-1));
        boolean boolean23 = timePeriodValues1.equals((java.lang.Object) timePeriodValues22);
        int int24 = timePeriodValues1.getMaxStartIndex();
        java.lang.String str25 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        timePeriodValues1.setKey((java.lang.Comparable) 100);
        timePeriodValues1.setDescription("Value");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinMiddleIndex();
        int int12 = timePeriodValues1.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) '#', (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1, "Value", "");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) '4', (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues3.setDomainDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue14 = timePeriodValues3.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj11 = timePeriodValues10.clone();
        java.lang.String str12 = timePeriodValues10.getRangeDescription();
        int int13 = timePeriodValues10.getMaxEndIndex();
        timePeriodValues10.fireSeriesChanged();
        boolean boolean15 = timePeriodValues3.equals((java.lang.Object) timePeriodValues10);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.delete((int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj10 = timePeriodValues9.clone();
        java.lang.String str11 = timePeriodValues9.getDescription();
        int int12 = timePeriodValues9.getItemCount();
        timePeriodValues9.setDescription("");
        java.lang.Comparable comparable15 = timePeriodValues9.getKey();
        java.lang.Object obj16 = timePeriodValues9.clone();
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) timePeriodValues9);
        java.lang.Class<?> wildcardClass18 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 10 + "'", comparable15, (short) 10);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        int int8 = timePeriodValues1.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDescription("hi!");
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.delete((int) (short) -1, (int) (byte) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Value", "");
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod4, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy(0, (int) 'a');
        java.lang.Comparable comparable16 = timePeriodValues3.getKey();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (-1.0d) + "'", comparable16, (-1.0d));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        boolean boolean11 = timePeriodValues1.isEmpty();
        int int12 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy(0, (int) (short) 10);
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj18 = timePeriodValues17.clone();
        java.lang.String str19 = timePeriodValues17.getDescription();
        java.lang.Comparable comparable20 = timePeriodValues17.getKey();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timePeriodValues17.removePropertyChangeListener(propertyChangeListener21);
        int int23 = timePeriodValues17.getMaxStartIndex();
        java.lang.Object obj24 = timePeriodValues17.clone();
        boolean boolean25 = timePeriodValues17.getNotify();
        int int26 = timePeriodValues17.getMaxEndIndex();
        int int27 = timePeriodValues17.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues29 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj30 = timePeriodValues29.clone();
        java.lang.String str31 = timePeriodValues29.getDescription();
        java.lang.Comparable comparable32 = timePeriodValues29.getKey();
        int int33 = timePeriodValues29.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timePeriodValues29.addPropertyChangeListener(propertyChangeListener34);
        org.jfree.data.time.TimePeriodValues timePeriodValues38 = timePeriodValues29.createCopy((-1), (-1));
        boolean boolean39 = timePeriodValues17.equals((java.lang.Object) timePeriodValues38);
        int int40 = timePeriodValues17.getMaxStartIndex();
        java.lang.String str41 = timePeriodValues17.getRangeDescription();
        boolean boolean42 = timePeriodValues1.equals((java.lang.Object) str41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number44 = timePeriodValues1.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 10 + "'", comparable20, (short) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (short) 10 + "'", comparable32, (short) 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value" + "'", str41, "Value");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((-1), (-1));
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues10.add(timePeriod11, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues10);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        boolean boolean6 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        int int8 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        int int8 = timePeriodValues1.getMinMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod10 = null; // flaky: timePeriodValues1.getTimePeriod((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        java.lang.Class<?> wildcardClass3 = comparable2.getClass();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (byte) -1 + "'", comparable2, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean12 = timePeriodValues1.getNotify();
        java.lang.Class<?> wildcardClass13 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMaxMiddleIndex();
        int int9 = timePeriodValues3.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        timePeriodValues1.setKey((java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.update((-1), (java.lang.Number) 100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy(0, (int) 'a');
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod16, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(1, (int) (byte) 0);
        timePeriodValues1.setDomainDescription("Value");
        org.junit.Assert.assertNotNull(timePeriodValues4);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) '4', "hi!", "Value");
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod4, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setNotify(true);
        timePeriodValues3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        int int8 = timePeriodValues1.getMinEndIndex();
        java.lang.Class<?> wildcardClass9 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy((int) (short) 0, (int) (short) 1);
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues15.add(timePeriod16, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) (short) 0, 10);
        int int13 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setRangeDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timePeriodValues1.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        java.lang.Class<?> wildcardClass12 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue3 = null; // flaky: timePeriodValues1.getDataItem((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod7, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        boolean boolean12 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) 'a', (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues3.createCopy((int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = timePeriodValues18.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertNotNull(timePeriodValues18);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        java.lang.Class<?> wildcardClass7 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMaxEndIndex();
        boolean boolean5 = timePeriodValues3.isEmpty();
        timePeriodValues3.setDescription("hi!");
        org.jfree.data.time.TimePeriodValue timePeriodValue8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timePeriodValues3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.add(timePeriod12, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        boolean boolean6 = timePeriodValues1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timePeriodValues1.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        timePeriodValues1.setDescription("hi!");
        timePeriodValues1.setDomainDescription("Time");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1) + "'", comparable9, (-1));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "Value", "");
        int int4 = timePeriodValues3.getMinEndIndex();
        int int5 = timePeriodValues3.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        java.lang.String str11 = timePeriodValues1.getDescription();
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod12, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable7 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (short) 10 + "'", comparable7, (short) 10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        java.lang.Class<?> wildcardClass11 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod5 = timePeriodValues3.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = timePeriodValues8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        timePeriodValues8.setDomainDescription("");
        java.lang.Object obj11 = timePeriodValues8.clone();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.update((int) (short) 1, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) true);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener2);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timePeriodValues1.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.Comparable comparable3 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValue timePeriodValue4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (short) 10 + "'", comparable3, (short) 10);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod7, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        int int6 = timePeriodValues1.getMaxStartIndex();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        timePeriodValues1.setDescription("hi!");
        java.lang.Class<?> wildcardClass6 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        timePeriodValues3.setRangeDescription("Time");
        timePeriodValues3.delete(100, (int) (short) -1);
        int int15 = timePeriodValues3.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        timePeriodValues3.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener5);
        timePeriodValues3.delete((int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("Value");
        boolean boolean11 = timePeriodValues1.getNotify();
        int int12 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        boolean boolean12 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) 'a', (int) (short) -1);
        int int16 = timePeriodValues3.getMinStartIndex();
        java.lang.Class<?> wildcardClass17 = timePeriodValues3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues3.clone();
        java.lang.Class<?> wildcardClass8 = timePeriodValues3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str6 = timePeriodValues3.getRangeDescription();
        java.lang.String str7 = timePeriodValues3.getDescription();
        int int8 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.setNotify(true);
        java.lang.Comparable comparable11 = timePeriodValues3.getKey();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (-1.0d) + "'", comparable11, (-1.0d));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((-1), 10);
        int int9 = timePeriodValues3.getItemCount();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        java.lang.Class<?> wildcardClass2 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) '4', (int) 'a');
        java.lang.Class<?> wildcardClass5 = timePeriodValues4.getClass();
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        boolean boolean6 = timePeriodValues1.equals((java.lang.Object) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timePeriodValues1.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue17 = null; // flaky: timePeriodValues1.getDataItem((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) (short) 0, 10);
        int int13 = timePeriodValues12.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues12.add(timePeriodValue14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Time", "", "Time");
        java.lang.Class<?> wildcardClass4 = timePeriodValues3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.delete((int) (byte) -1, (int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.TimePeriod timePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod8, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod4, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1, "hi!", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable6 = timePeriodValues5.getKey();
        timePeriodValues5.setDescription("hi!");
        timePeriodValues5.setRangeDescription("Time");
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues5);
        int int12 = timePeriodValues3.getMinMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timePeriodValues3.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (short) 10 + "'", comparable6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.delete((int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("hi!");
        boolean boolean13 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        int int22 = timePeriodValues1.getMinMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = timePeriodValues1.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod8 = timePeriodValues1.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.lang.String str5 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriod timePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod6, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy(1, (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimePeriodValue timePeriodValue11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.add(timePeriodValue11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str4 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod11 = null; // flaky: timePeriodValues1.getTimePeriod((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDomainDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) '4', (int) 'a');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues4.addChangeListener(seriesChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod8 = timePeriodValues4.getTimePeriod((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues4);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        int int13 = timePeriodValues1.getMaxEndIndex();
        int int14 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str15 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod16, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1);
        java.lang.Object obj2 = timePeriodValues1.clone();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue5 = timePeriodValues3.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = null; // flaky: timePeriodValues1.getValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        timePeriodValues3.delete((int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "hi!", "Time");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        boolean boolean3 = timePeriodValues1.getNotify();
        java.lang.Class<?> wildcardClass4 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        int int9 = timePeriodValues3.getItemCount();
        java.lang.Class<?> wildcardClass10 = timePeriodValues3.getClass();
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        java.lang.Class<?> wildcardClass10 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDomainDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timePeriodValues1.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue10 = timePeriodValues1.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timePeriodValues3.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0d) + "'", comparable8, (-1.0d));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.String str8 = timePeriodValues3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.delete((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) true);
        java.lang.Class<?> wildcardClass2 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod11, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj7 = timePeriodValues6.clone();
        java.lang.String str8 = timePeriodValues6.getDescription();
        java.lang.Comparable comparable9 = timePeriodValues6.getKey();
        java.lang.String str10 = timePeriodValues6.getDescription();
        int int11 = timePeriodValues6.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues6.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues6.addPropertyChangeListener(propertyChangeListener14);
        int int16 = timePeriodValues6.getMaxStartIndex();
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) timePeriodValues6);
        org.jfree.data.time.TimePeriodValues timePeriodValues20 = timePeriodValues1.createCopy((int) (short) -1, (int) (short) 0);
        timePeriodValues20.setDomainDescription("");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timePeriodValues20);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a');
        int int2 = timePeriodValues1.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = timePeriodValues1.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        int int22 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener23);
        java.lang.String str25 = timePeriodValues1.getDomainDescription();
        int int26 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriod timePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod27, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        int int12 = timePeriodValues3.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener5);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) "Time");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = null; // flaky: timePeriodValues1.getValue((int) (byte) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        int int10 = timePeriodValues3.getMinEndIndex();
        int int11 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setKey((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener10);
        java.lang.Object obj12 = timePeriodValues3.clone();
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod13, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimePeriodValue timePeriodValue8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timePeriodValues3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.delete((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        int int8 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setDescription("Time");
        java.lang.Class<?> wildcardClass11 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        boolean boolean12 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) 'a', (int) (short) -1);
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues15.add(timePeriod16, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj11 = timePeriodValues10.clone();
        java.lang.String str12 = timePeriodValues10.getRangeDescription();
        int int13 = timePeriodValues10.getMaxEndIndex();
        timePeriodValues10.fireSeriesChanged();
        boolean boolean15 = timePeriodValues3.equals((java.lang.Object) timePeriodValues10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener18);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getItemCount();
        boolean boolean8 = timePeriodValues1.isEmpty();
        int int9 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues8.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod13 = null; // flaky: timePeriodValues8.getTimePeriod((-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0d, "", "Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue5 = null; // flaky: timePeriodValues3.getDataItem((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener8);
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.setDescription("Value");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        boolean boolean12 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) 'a', (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues3.createCopy((int) (short) 1, (int) ' ');
        int int19 = timePeriodValues18.getMaxEndIndex();
        int int20 = timePeriodValues18.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues18.add(timePeriod21, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        java.lang.Comparable comparable8 = timePeriodValues5.getKey();
        java.lang.String str9 = timePeriodValues5.getDescription();
        int int10 = timePeriodValues5.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues5.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues5.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Object obj15 = timePeriodValues5.clone();
        java.lang.Comparable comparable16 = timePeriodValues5.getKey();
        boolean boolean18 = timePeriodValues5.equals((java.lang.Object) (byte) 0);
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) boolean18);
        java.lang.Comparable comparable20 = timePeriodValues1.getKey();
        java.lang.String str21 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 10 + "'", comparable20, (short) 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Time" + "'", str21, "Time");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        timePeriodValues3.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener5);
        org.jfree.data.time.TimePeriodValue timePeriodValue7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener10);
        int int12 = timePeriodValues3.getItemCount();
        int int13 = timePeriodValues3.getMaxEndIndex();
        org.jfree.data.time.TimePeriod timePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod14, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod6 = timePeriodValues1.getTimePeriod(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues4);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) '4', (int) (byte) 1);
        int int12 = timePeriodValues11.getMinEndIndex();
        timePeriodValues11.setDomainDescription("");
        timePeriodValues11.setRangeDescription("hi!");
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1, "hi!", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable6 = timePeriodValues5.getKey();
        timePeriodValues5.setDescription("hi!");
        timePeriodValues5.setRangeDescription("Time");
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues5);
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues5.add(timePeriod12, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (short) 10 + "'", comparable6, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        int int6 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod7, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0L);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 0L + "'", comparable4, 0L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        boolean boolean4 = timePeriodValues1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timePeriodValues1.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        java.lang.Object obj5 = timePeriodValues3.clone();
        java.lang.String str6 = timePeriodValues3.getDomainDescription();
        timePeriodValues3.setDescription("hi!");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        boolean boolean9 = timePeriodValues3.isEmpty();
        int int10 = timePeriodValues3.getMaxEndIndex();
        int int11 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues3.delete((int) (short) -1, (int) (short) 0);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues3.setDomainDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener13);
        java.lang.Comparable comparable15 = timePeriodValues3.getKey();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (-1.0d) + "'", comparable15, (-1.0d));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod12, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod7, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues3.setKey((java.lang.Comparable) true);
        java.lang.String str13 = timePeriodValues3.getDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        int int13 = timePeriodValues3.getMinStartIndex();
        java.lang.Class<?> wildcardClass14 = timePeriodValues3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues3.delete((int) (byte) -1, (int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues6);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        timePeriodValues3.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod8 = timePeriodValues3.getTimePeriod((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100, "Value", "");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener4);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setRangeDescription("Time");
        int int10 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod11, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 0);
        int int11 = timePeriodValues1.getMaxStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timePeriodValues1.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0);
        timePeriodValues1.setNotify(false);
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod4, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener5);
        int int7 = timePeriodValues3.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        boolean boolean12 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) 'a', (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues3.createCopy((int) (short) 1, (int) ' ');
        int int19 = timePeriodValues18.getMaxEndIndex();
        int int20 = timePeriodValues18.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        int int13 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod7, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str10 = timePeriodValues3.getDomainDescription();
        int int11 = timePeriodValues3.getMinStartIndex();
        int int12 = timePeriodValues3.getMinMiddleIndex();
        int int13 = timePeriodValues3.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        int int13 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean14 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Value");
        timePeriodValues1.setKey((java.lang.Comparable) 10.0f);
        java.lang.Class<?> wildcardClass4 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj14 = timePeriodValues13.clone();
        java.lang.String str15 = timePeriodValues13.getDescription();
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        int int17 = timePeriodValues13.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = timePeriodValues13.createCopy((-1), (-1));
        boolean boolean23 = timePeriodValues1.equals((java.lang.Object) timePeriodValues22);
        int int24 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 10 + "'", comparable16, (short) 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj4 = timePeriodValues1.clone();
        boolean boolean5 = timePeriodValues1.isEmpty();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        boolean boolean11 = timePeriodValues1.isEmpty();
        timePeriodValues1.setDomainDescription("Time");
        java.lang.Comparable comparable14 = timePeriodValues1.getKey();
        java.lang.String str15 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod16, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 10 + "'", comparable14, (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean17 = timePeriodValues14.isEmpty();
        int int18 = timePeriodValues14.getMinStartIndex();
        timePeriodValues14.setRangeDescription("hi!");
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        org.jfree.data.time.TimePeriodValue timePeriodValue22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues14.add(timePeriodValue22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "Value", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timePeriodValues3.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10);
        java.lang.String str2 = timePeriodValues1.getDomainDescription();
        java.lang.Class<?> wildcardClass3 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy(0, (int) 'a');
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDescription("Value");
        java.lang.String str14 = timePeriodValues1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        timePeriodValues3.fireSeriesChanged();
        int int11 = timePeriodValues3.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues3.setKey((java.lang.Comparable) true);
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj15 = timePeriodValues14.clone();
        java.lang.String str16 = timePeriodValues14.getDescription();
        int int17 = timePeriodValues14.getMinStartIndex();
        int int18 = timePeriodValues14.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timePeriodValues14.addChangeListener(seriesChangeListener19);
        boolean boolean21 = timePeriodValues3.equals((java.lang.Object) timePeriodValues14);
        org.jfree.data.time.TimePeriod timePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod22, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.fireSeriesChanged();
        java.lang.Comparable comparable7 = timePeriodValues1.getKey();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (short) 10 + "'", comparable7, (short) 10);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean10 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValue timePeriodValue11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        int int11 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        java.lang.String str13 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        timePeriodValues1.setDescription("hi!");
        java.lang.Object obj12 = timePeriodValues1.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1) + "'", comparable9, (-1));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        boolean boolean4 = timePeriodValues1.isEmpty();
        int int5 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Class<?> wildcardClass8 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100L, "Time", "Value");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (short) 10 + "'", comparable8, (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.delete((int) (short) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (byte) 10, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod12, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMinEndIndex();
        int int9 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        int int5 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy((int) (short) 0, (-1));
        int int5 = timePeriodValues1.getItemCount();
        java.lang.Class<?> wildcardClass6 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriod timePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod5, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(1, (int) (byte) 0);
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.time.TimePeriodValue timePeriodValue7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues4);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("hi!");
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.String str12 = timePeriodValues1.getDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        int int5 = timePeriodValues1.getItemCount();
        int int6 = timePeriodValues1.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getItemCount();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 'a', "Value", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues3.createCopy(0, (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues10.setRangeDescription("hi!");
        boolean boolean13 = timePeriodValues10.isEmpty();
        int int14 = timePeriodValues10.getMaxStartIndex();
        int int15 = timePeriodValues10.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues10.removePropertyChangeListener(propertyChangeListener16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timePeriodValues10.addChangeListener(seriesChangeListener18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timePeriodValues10.removeChangeListener(seriesChangeListener20);
        int int22 = timePeriodValues10.getMaxMiddleIndex();
        timePeriodValues10.setRangeDescription("Time");
        boolean boolean25 = timePeriodValues3.equals((java.lang.Object) timePeriodValues10);
        boolean boolean26 = timePeriodValues3.isEmpty();
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 10);
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod13, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1, "Value", "");
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj6 = timePeriodValues5.clone();
        java.lang.String str7 = timePeriodValues5.getDescription();
        int int8 = timePeriodValues5.getItemCount();
        boolean boolean9 = timePeriodValues3.equals((java.lang.Object) int8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod11 = timePeriodValues3.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener16);
        java.lang.Comparable comparable18 = timePeriodValues1.getKey();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (short) 10 + "'", comparable18, (short) 10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Comparable comparable13 = timePeriodValues1.getKey();
        boolean boolean14 = timePeriodValues1.getNotify();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (short) 10 + "'", comparable13, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy(0, (int) '4');
        java.lang.Class<?> wildcardClass13 = timePeriodValues12.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        int int8 = timePeriodValues1.getItemCount();
        int int9 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) "hi!");
        org.jfree.data.time.TimePeriodValue timePeriodValue18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        int int6 = timePeriodValues1.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(10, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timePeriodValues3.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timePeriodValues1.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        timePeriodValues1.setNotify(true);
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        java.lang.Object obj13 = timePeriodValues1.clone();
        java.lang.Object obj14 = timePeriodValues1.clone();
        int int15 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 100, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValue timePeriodValue10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getMinStartIndex();
        int int5 = timePeriodValues1.getItemCount();
        int int6 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy((int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue11 = timePeriodValues1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues12.addPropertyChangeListener(propertyChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timePeriodValues12.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setRangeDescription("Time");
        int int10 = timePeriodValues1.getMaxStartIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        boolean boolean12 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        java.lang.String str8 = timePeriodValues1.getDescription();
        java.lang.Number number10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (byte) 0, number10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj10 = timePeriodValues9.clone();
        java.lang.String str11 = timePeriodValues9.getDescription();
        java.lang.Comparable comparable12 = timePeriodValues9.getKey();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues9.removePropertyChangeListener(propertyChangeListener13);
        int int15 = timePeriodValues9.getMinMiddleIndex();
        timePeriodValues9.setRangeDescription("Time");
        boolean boolean18 = timePeriodValues9.getNotify();
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) boolean18);
        java.lang.String str20 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriod timePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod21, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.setDomainDescription("Value");
        java.lang.Object obj12 = timePeriodValues3.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0L);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             timePeriodValues1.update((int) (short) -1, (java.lang.Number) 10L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        boolean boolean8 = timePeriodValues3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue10 = timePeriodValues3.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        int int6 = timePeriodValues1.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(0, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMinEndIndex();
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod5 = null;
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod5, number6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues3.fireSeriesChanged();
        java.lang.Object obj5 = timePeriodValues3.clone();
        int int6 = timePeriodValues3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timePeriodValues3.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        java.lang.Class<?> wildcardClass10 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        int int6 = timePeriodValues3.getMaxEndIndex();
        timePeriodValues3.setNotify(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener3);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        boolean boolean6 = timePeriodValues1.isEmpty();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        timePeriodValues8.setDomainDescription("");
        java.lang.Object obj11 = timePeriodValues8.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod13 = timePeriodValues8.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        java.lang.Class<?> wildcardClass10 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1L, "Time", "");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.update((int) (byte) 10, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        org.jfree.data.time.TimePeriod timePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod6, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        java.lang.Class<?> wildcardClass6 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod10, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj10 = timePeriodValues8.clone();
        boolean boolean11 = timePeriodValues3.equals((java.lang.Object) timePeriodValues8);
        boolean boolean12 = timePeriodValues3.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues3.createCopy((int) 'a', (int) (short) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues3.createCopy((int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues18.delete((int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertNotNull(timePeriodValues18);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDomainDescription("Time");
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0f, "Time", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timePeriodValues3.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj10 = timePeriodValues9.clone();
        java.lang.String str11 = timePeriodValues9.getDescription();
        java.lang.Comparable comparable12 = timePeriodValues9.getKey();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues9.removePropertyChangeListener(propertyChangeListener13);
        int int15 = timePeriodValues9.getMinMiddleIndex();
        timePeriodValues9.setRangeDescription("Time");
        boolean boolean18 = timePeriodValues9.getNotify();
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) boolean18);
        java.lang.String str20 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener24);
        java.lang.Class<?> wildcardClass26 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Time", "Value");
        timePeriodValues3.setRangeDescription("");
        java.lang.Class<?> wildcardClass6 = timePeriodValues3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        java.lang.Object obj13 = timePeriodValues1.clone();
        java.lang.Object obj14 = timePeriodValues1.clone();
        int int15 = timePeriodValues1.getMaxEndIndex();
        boolean boolean16 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod9 = timePeriodValues1.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        java.lang.String str13 = timePeriodValues3.getRangeDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        boolean boolean4 = timePeriodValues1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod6 = timePeriodValues1.getTimePeriod((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        java.lang.String str11 = timePeriodValues1.getDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues1.createCopy((int) ' ', (int) ' ');
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(timePeriodValues14);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues11.addChangeListener(seriesChangeListener12);
        int int14 = timePeriodValues11.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timePeriodValues11.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0f, "Value", "Value");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0d, "", "Value");
        java.lang.Class<?> wildcardClass4 = timePeriodValues3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = timePeriodValues1.createCopy(1, (int) (byte) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues1.createCopy((int) '4', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod9 = timePeriodValues7.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues4);
        org.junit.Assert.assertNotNull(timePeriodValues7);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        java.lang.Object obj2 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriod timePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod3, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener12);
        int int14 = timePeriodValues1.getItemCount();
        java.lang.String str15 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10.0d, "hi!", "");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener8);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        timePeriodValues1.setKey((java.lang.Comparable) 100);
        int int9 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setRangeDescription("");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10, "hi!", "hi!");
        int int4 = timePeriodValues3.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod15 = timePeriodValues1.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) -1);
        timePeriodValues1.setKey((java.lang.Comparable) 10.0f);
        int int10 = timePeriodValues1.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod12 = timePeriodValues1.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean12 = timePeriodValues1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod14 = timePeriodValues1.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int4 = timePeriodValues1.getMinEndIndex();
        boolean boolean5 = timePeriodValues1.isEmpty();
        timePeriodValues1.setDomainDescription("Time");
        timePeriodValues1.setDomainDescription("hi!");
        int int10 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMinStartIndex();
        timePeriodValues3.setRangeDescription("hi!");
        java.lang.String str10 = timePeriodValues3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timePeriodValues3.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMinEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timePeriodValues1.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Object obj8 = timePeriodValues1.clone();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        java.lang.Object obj13 = timePeriodValues1.clone();
        java.lang.Object obj14 = timePeriodValues1.clone();
        int int15 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = null; // flaky: timePeriodValues1.getValue((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) 10 + "'", comparable12, (short) 10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod7 = timePeriodValues1.getTimePeriod((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0f), "Value", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod5 = timePeriodValues3.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) -1);
        timePeriodValues1.setKey((java.lang.Comparable) 10.0f);
        java.lang.Class<?> wildcardClass10 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.String str3 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod7, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy((int) (byte) 1, (int) (short) -1);
        org.jfree.data.time.TimePeriodValue timePeriodValue9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues8);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        int int8 = timePeriodValues3.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener13);
        int int15 = timePeriodValues3.getMaxMiddleIndex();
        java.lang.Comparable comparable16 = timePeriodValues3.getKey();
        org.jfree.data.time.TimePeriod timePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod17, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (-1.0d) + "'", comparable16, (-1.0d));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Comparable comparable2 = timePeriodValues1.getKey();
        int int3 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj4 = timePeriodValues1.clone();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + (short) 10 + "'", comparable2, (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        int int11 = timePeriodValues1.getMinMiddleIndex();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        boolean boolean13 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriod timePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod14, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj7 = timePeriodValues6.clone();
        java.lang.String str8 = timePeriodValues6.getDescription();
        java.lang.Comparable comparable9 = timePeriodValues6.getKey();
        java.lang.String str10 = timePeriodValues6.getDescription();
        int int11 = timePeriodValues6.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues6.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues6.addPropertyChangeListener(propertyChangeListener14);
        int int16 = timePeriodValues6.getMaxStartIndex();
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) timePeriodValues6);
        org.jfree.data.time.TimePeriodValues timePeriodValues20 = timePeriodValues1.createCopy((int) (short) -1, (int) (short) 0);
        org.jfree.data.time.TimePeriod timePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod21, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) 10 + "'", comparable9, (short) 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timePeriodValues20);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy((int) (short) 0, (int) (short) 1);
        int int16 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Class<?> wildcardClass17 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod7 = timePeriodValues1.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        int int7 = timePeriodValues3.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues3.getKey();
        timePeriodValues3.setNotify(true);
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues3.createCopy((int) (byte) 0, 0);
        timePeriodValues13.setRangeDescription("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0d) + "'", comparable8, (-1.0d));
        org.junit.Assert.assertNotNull(timePeriodValues13);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues8.getMaxEndIndex();
        int int12 = timePeriodValues8.getMinMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.update((int) '4', (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        boolean boolean2 = timePeriodValues1.getNotify();
        int int3 = timePeriodValues1.getMaxStartIndex();
        int int4 = timePeriodValues1.getMaxEndIndex();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
        timePeriodValues3.setRangeDescription("hi!");
        boolean boolean6 = timePeriodValues3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        int int9 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues3.createCopy((int) (byte) 10, (int) (byte) 0);
        java.lang.String str13 = timePeriodValues12.getDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj16 = timePeriodValues15.clone();
        java.lang.String str17 = timePeriodValues15.getDescription();
        int int18 = timePeriodValues15.getItemCount();
        timePeriodValues15.fireSeriesChanged();
        timePeriodValues15.setRangeDescription("Value");
        int int22 = timePeriodValues15.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timePeriodValues15.removePropertyChangeListener(propertyChangeListener23);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timePeriodValues15.addChangeListener(seriesChangeListener25);
        org.jfree.data.time.TimePeriodValues timePeriodValues29 = timePeriodValues15.createCopy((int) (short) 0, (int) (short) 1);
        boolean boolean30 = timePeriodValues12.equals((java.lang.Object) timePeriodValues15);
        java.lang.Class<?> wildcardClass31 = timePeriodValues12.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        int int6 = timePeriodValues1.getMaxEndIndex();
        int int7 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener10);
        int int12 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        timePeriodValues1.setDescription("hi!");
        boolean boolean4 = timePeriodValues1.isEmpty();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimePeriod timePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod6, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("Value");
        boolean boolean11 = timePeriodValues1.getNotify();
        timePeriodValues1.setDescription("Value");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0f, "", "Time");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue5 = timePeriodValues1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        int int4 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        int int7 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriod timePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod8, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 10 + "'", comparable5, (short) 10);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (short) 10 + "'", comparable6, (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        int int4 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setNotify(true);
        int int11 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "Value");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues3.createCopy(0, (int) (byte) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimePeriodValue timePeriodValue11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriodValue11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        java.lang.String str6 = timePeriodValues1.getDescription();
        int int7 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setKey((java.lang.Comparable) "hi!");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10);
        java.lang.Object obj2 = timePeriodValues1.clone();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.String str5 = timePeriodValues1.getDescription();
        int int6 = timePeriodValues1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }
}
