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
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range4, 0.0d, 91.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (double) (short) 1, false);
        double double15 = range14.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-4914.0d) + "'", double15 == (-4914.0d));
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        double double9 = range7.constrain((double) 10);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range7, 0.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (double) (-1.0f), 10999.0d);
        double double15 = range14.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 0L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (double) (byte) -1, true);
        boolean boolean13 = range11.contains(61.0d);
        java.lang.String str14 = range11.toString();
        boolean boolean17 = range11.intersects((double) 'a', (-898.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Range[-11.0,51.0]" + "'", str14, "Range[-11.0,51.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 45.0d, (double) '#');
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, (-1.0d), (double) (byte) 100);
        boolean boolean33 = range27.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range27, (-9.0d), (double) 100L);
        double double38 = range36.constrain(1.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range36, (double) (byte) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range36, (double) 'a');
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range24, range42);
        double double44 = range42.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-899.0d) + "'", double38 == (-899.0d));
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 168.0d + "'", double44 == 168.0d);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10, 4488.5d);
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        java.lang.String str13 = range8.toString();
        double double14 = range8.getUpperBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range8, (double) 1L);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range19, (-10.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, (double) 0);
        double double24 = range21.getLength();
        boolean boolean27 = range21.intersects((-899.0d), 90.0d);
        java.lang.String str28 = range21.toString();
        boolean boolean30 = range21.equals((java.lang.Object) 10.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range8, range21);
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range21, 15.5d);
        double double34 = range21.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 90.0d + "'", double24 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Range[0.0,90.0]" + "'", str28, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 90.0d + "'", double34 == 90.0d);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range23, (double) (short) 1, true);
        double double27 = range26.getUpperBound();
        double double28 = range26.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-898.0d) + "'", double27 == (-898.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-828.0d) + "'", double28 == (-828.0d));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        boolean boolean8 = range4.contains((double) (short) 10);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        double double13 = range11.getLowerBound();
        double double14 = range11.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range11, (double) 0L, 91.0d);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range17, (double) (-1));
        boolean boolean21 = range17.contains(90.0d);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range4, range17);
        double double23 = range4.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 90.0d + "'", double23 == 90.0d);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-26442.5d), (double) 10L);
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        double double36 = range35.getUpperBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range35, (-900.0d));
        boolean boolean41 = range38.intersects((-3240.5d), (-2342.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (-1), (-898.0d));
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-71.0d), (-828.0d));
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (double) 100L);
        boolean boolean13 = range8.intersects((double) ' ', 10.0d);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range16, (-109.0d));
        boolean boolean21 = range16.contains(1.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range16, 37189.0d);
        boolean boolean24 = range8.equals((java.lang.Object) range16);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range8, 72.0d, true);
        double double28 = range8.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) (-1.0f));
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, 0.0d, false);
        boolean boolean13 = range11.contains((-170.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        double double36 = range35.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 99.5d + "'", double36 == 99.5d);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        double double7 = range5.getLength();
        double double8 = range5.getCentralValue();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range5, 11044.5d);
        double double12 = range5.constrain((-893.5d));
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range5, (-1820.75d), 6108.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-900.0d) + "'", double7 == (-900.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-449.0d) + "'", double8 == (-449.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-899.0d) + "'", double12 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1L);
        double double19 = range11.constrain(5.5d);
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range11, (double) ' ');
        boolean boolean24 = range11.intersects((-822.5d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.5d + "'", double19 == 5.5d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        java.lang.String str7 = range2.toString();
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, (-1.0d), (double) (byte) 100);
        boolean boolean16 = range10.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range10, (-9.0d), (double) 100L);
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range19, 5.5d);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 5.5d, (double) 10.0f);
        double double25 = range24.getLowerBound();
        boolean boolean26 = range2.equals((java.lang.Object) double25);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range2, 21871.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[10.0,1.0]" + "'", str7, "Range[10.0,1.0]");
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4488.5d + "'", double25 == 4488.5d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        boolean boolean16 = range13.intersects((-1.0d), 0.0d);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double20 = range19.getLength();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range19, (-109.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (-71.0d), (-828.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (double) 100L);
        double double28 = range27.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range13, range27);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range13, (double) 0L, false);
        boolean boolean35 = range32.intersects(20.0d, (double) (byte) 100);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range32, 199.0d, true);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range32, (double) (-1), true);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9.0d) + "'", double20 == (-9.0d));
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range41);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) (byte) -1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (-799.0d));
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range22, 0.0d);
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range27, (-900.0d), true);
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range27, (-4.0d));
        boolean boolean33 = range17.equals((java.lang.Object) range32);
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range17, (-10.0d), false);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range36);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 0L, 91.0d);
        double double10 = range8.constrain(11044.5d);
        double double11 = range8.getLowerBound();
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range8, (-101.0d), 55.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-818.0d) + "'", double10 == (-818.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.data.Range range2 = new org.jfree.data.Range(10999.0d, (double) 100.0f);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10.0f);
        boolean boolean6 = range2.contains((-449.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, 99.0d);
        double double9 = range8.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range4, 0.0d, 91.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, 0.0d);
        boolean boolean16 = range14.contains(21871.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-485.0d), 15.5d);
        boolean boolean5 = range2.intersects((double) 0L, 33.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 0L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, 484.0d, false);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, 5.5d);
        org.jfree.data.Range range28 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double29 = range28.getLength();
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range28, 1.0d, true);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range35, (-10.0d));
        boolean boolean38 = range28.equals((java.lang.Object) range37);
        boolean boolean39 = range23.equals((java.lang.Object) range37);
        org.jfree.data.Range range42 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range45 = org.jfree.data.Range.expand(range42, (-1.0d), (double) (byte) 100);
        boolean boolean48 = range42.intersects((double) (byte) -1, (double) (short) -1);
        double double49 = range42.getCentralValue();
        double double50 = range42.getLength();
        double double51 = range42.getLength();
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range37, range42);
        double double53 = range42.getLowerBound();
        org.jfree.data.Range range54 = org.jfree.data.Range.combine(range11, range42);
        java.lang.Class<?> wildcardClass55 = range11.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-9.0d) + "'", double29 == (-9.0d));
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 5.5d + "'", double49 == 5.5d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-9.0d) + "'", double50 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-9.0d) + "'", double51 == (-9.0d));
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        org.jfree.data.Range range19 = org.jfree.data.Range.combine(range13, range16);
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (-10.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range13, range22);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (-828.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range5, range27);
        double double29 = range27.getLowerBound();
        double double30 = range27.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-828.0d) + "'", double29 == (-828.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 928.0d + "'", double30 == 928.0d);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 0L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (double) (byte) -1, true);
        boolean boolean13 = range11.contains(61.0d);
        double double15 = range11.constrain((double) 'a');
        boolean boolean18 = range11.intersects((-331.75d), (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 51.0d + "'", double15 == 51.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range2, 0.0d, false);
        org.jfree.data.Range range55 = org.jfree.data.Range.expandToInclude(range53, 6553.0d);
        boolean boolean58 = range53.intersects(494.0d, 37289.0d);
        double double59 = range53.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range14.getCentralValue();
        boolean boolean18 = range14.intersects((double) (-1.0f), 5.5d);
        double double19 = range14.getUpperBound();
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (-1.0d), (double) (byte) 100);
        boolean boolean28 = range22.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range22, (-9.0d), (double) 100L);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, 5.5d);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range33, 5.5d, (double) 10.0f);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (double) (byte) 0, (double) 0.0f);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range36, (double) '#', true);
        double double44 = range42.constrain((double) (short) 0);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range14, range42);
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range42, (-10.0d), false);
        double double49 = range42.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 232.75d + "'", double15 == 232.75d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-9138.5d) + "'", double44 == (-9138.5d));
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-13662.0d) + "'", double49 == (-13662.0d));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, 44.5d, (-799.0d));
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.combine(range2, range10);
        double double15 = range2.getUpperBound();
        double double17 = range2.constrain(52.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, (double) (short) 100);
        org.jfree.data.Range range10 = org.jfree.data.Range.combine(range2, range9);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, (-1.0d), (double) (byte) 100);
        boolean boolean19 = range13.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range13, (-9.0d), (double) 100L);
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range22, (double) 1);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range22, (double) (short) -1, false);
        boolean boolean28 = range10.equals((java.lang.Object) range27);
        double double29 = range10.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, 5.5d);
        boolean boolean30 = range26.equals((java.lang.Object) 171.0d);
        boolean boolean33 = range26.intersects((-893.5d), (double) 100L);
        double double35 = range26.constrain(1.0d);
        boolean boolean36 = range20.equals((java.lang.Object) range26);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range39.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range39, (-9.0d), (double) 100L);
        double double50 = range48.constrain(1.0d);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range48, (double) (byte) 100);
        org.jfree.data.Range range54 = org.jfree.data.Range.expandToInclude(range48, (double) 'a');
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range48, (-1.0d), (-9.0d));
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range48, 0.0d, true);
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range48, (double) (short) 1);
        boolean boolean63 = range20.equals((java.lang.Object) range48);
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range20, (-2342.5d), true);
        org.jfree.data.Range range69 = org.jfree.data.Range.shift(range66, 1.0d, false);
        org.jfree.data.Range range71 = org.jfree.data.Range.shift(range66, 46.0d);
        java.lang.String str72 = range66.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-899.0d) + "'", double50 == (-899.0d));
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Range[-2412.5,-3240.5]" + "'", str72, "Range[-2412.5,-3240.5]");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        java.lang.Class<?> wildcardClass8 = range7.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jfree.data.Range range2 = new org.jfree.data.Range(484.0d, 104.5d);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, 72.0d, (double) 10.0f);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range17, (-10.0d));
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range14, range17);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range14, range23);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range26, (-828.0d));
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range2, range28);
        double double31 = range2.constrain((-109.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        java.lang.String str13 = range8.toString();
        double double14 = range8.getUpperBound();
        java.lang.Class<?> wildcardClass15 = range8.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        double double10 = range5.getLowerBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range13, 1.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range5, range13);
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        double double22 = range21.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range21, (-449.0d));
        boolean boolean25 = range5.equals((java.lang.Object) (-449.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        boolean boolean14 = range9.contains((double) '#');
        double double16 = range9.constrain((-4050.0d));
        boolean boolean19 = range9.intersects(51.0d, 0.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, 0.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) -1, 15.5d);
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-0.5d), false);
        java.lang.Class<?> wildcardClass6 = range2.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (-1.0d), (double) (byte) 100);
        boolean boolean38 = range32.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range32, (-9.0d), (double) 100L);
        double double43 = range41.constrain(1.0d);
        boolean boolean44 = range29.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range26, range29);
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range29, 10974.5d, false);
        java.lang.String str49 = range48.toString();
        java.lang.Class<?> wildcardClass50 = range48.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-899.0d) + "'", double43 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Range[10984.5,10984.5]" + "'", str49, "Range[10984.5,10984.5]");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1820.75d), (-405.0d));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-485.0d), (-449.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (double) 10.0f);
        org.jfree.data.Range range12 = null;
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range11, range12);
        double double14 = range11.getCentralValue();
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range11, 99.0d, false);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 27.5d + "'", double14 == 27.5d);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range9, (double) (-1), 13.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) (byte) 100);
        boolean boolean20 = range17.intersects(5548.0d, 0.0d);
        double double21 = range17.getUpperBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1326.0d) + "'", double21 == (-1326.0d));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        boolean boolean17 = range11.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-9.0d), (double) 100L);
        double double22 = range20.constrain(1.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range20, (double) (byte) 100);
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range4, range20);
        double double26 = range25.getUpperBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-899.0d) + "'", double22 == (-899.0d));
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 90.0d + "'", double26 == 90.0d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10, (double) ' ');
        org.jfree.data.Range range5 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, (double) 10L);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range5, 44.5d, (-799.0d));
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double14 = range13.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) (short) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range13);
        double double18 = range5.getUpperBound();
        double double19 = range5.getCentralValue();
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range2, range5);
        boolean boolean23 = range20.intersects(37289.0d, 35.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.5d) + "'", double19 == (-0.5d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        double double12 = range11.getLowerBound();
        boolean boolean15 = range11.intersects(272.5d, 6109.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (-1.539756E7d));
        org.junit.Assert.assertNotNull(range2);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jfree.data.Range range2 = new org.jfree.data.Range(67.0d, 107.25d);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        double double10 = range7.getLowerBound();
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range7, 17.5d, 72.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range7, 32.0d);
        java.lang.Class<?> wildcardClass16 = range15.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 10, (-101.0d));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-71.0d), (-828.0d));
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (double) 100L);
        boolean boolean13 = range10.intersects(0.0d, 0.0d);
        org.jfree.data.Range range16 = new org.jfree.data.Range(10999.0d, (double) 100.0f);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) 10.0f);
        boolean boolean20 = range16.contains((-449.0d));
        double double21 = range16.getCentralValue();
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range10, range16);
        double double23 = range10.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5549.5d + "'", double21 == 5549.5d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        java.lang.String str13 = range8.toString();
        double double14 = range8.getUpperBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range8, (double) 1L);
        double double18 = range8.constrain(100.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 11.0d + "'", double18 == 11.0d);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) (-1.0f));
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, 0.0d, false);
        double double12 = range11.getCentralValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jfree.data.Range range2 = new org.jfree.data.Range(10999.0d, (double) 100.0f);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10.0f);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, (double) 100, 0.0d);
        boolean boolean9 = range7.contains(5.5d);
        java.lang.Class<?> wildcardClass10 = range7.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-799.0d), (double) (short) 1);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range25, 5.5d, true);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 1);
        boolean boolean27 = range25.contains(100.0d);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range30, (-109.0d));
        boolean boolean34 = range25.equals((java.lang.Object) range33);
        double double36 = range33.constrain((double) '4');
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range33, 32.0d, 61.0d);
        double double40 = range39.getLength();
        org.jfree.data.Range range43 = org.jfree.data.Range.expand(range39, (-26442.5d), 11044.5d);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range39, (-822.5d), true);
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range46, (-13662.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, 45.0d, true);
        boolean boolean10 = range8.contains(464.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, (-1.0d), (double) (byte) 100);
        boolean boolean13 = range7.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range7, (-9.0d), (double) 100L);
        double double18 = range16.constrain(1.0d);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range16, (double) (byte) 100);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range16, (double) 'a');
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-1.0d), (-9.0d));
        boolean boolean26 = range2.equals((java.lang.Object) range16);
        java.lang.String str27 = range2.toString();
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, (double) (byte) -1);
        org.jfree.data.Range range38 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range38, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range44 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range44, (-10.0d));
        org.jfree.data.Range range47 = org.jfree.data.Range.combine(range41, range44);
        org.jfree.data.Range range50 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range50, (-10.0d));
        org.jfree.data.Range range53 = org.jfree.data.Range.combine(range41, range50);
        org.jfree.data.Range range55 = org.jfree.data.Range.expandToInclude(range53, (-828.0d));
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range33, range55);
        boolean boolean59 = range56.intersects(90.0d, (double) (byte) 10);
        org.jfree.data.Range range60 = null;
        org.jfree.data.Range range61 = org.jfree.data.Range.combine(range56, range60);
        boolean boolean62 = range2.equals((java.lang.Object) range56);
        java.lang.Class<?> wildcardClass63 = range56.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-899.0d) + "'", double18 == (-899.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Range[0.0,0.0]" + "'", str27, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        boolean boolean7 = range4.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range4, (double) 0.0f);
        double double10 = range9.getUpperBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) 0);
        boolean boolean19 = range15.contains((double) (short) 10);
        org.jfree.data.Range range20 = null;
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (-1.0d), (double) (byte) 100);
        boolean boolean29 = range23.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range23, (-9.0d), (double) 100L);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range32, 5.5d);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, 5.5d, (double) 10.0f);
        boolean boolean39 = range34.contains((double) (byte) -1);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range20, range34);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range15, range34);
        java.lang.String str42 = range34.toString();
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range34, 11.0d);
        boolean boolean45 = range9.equals((java.lang.Object) range44);
        double double46 = range44.getUpperBound();
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range44, 50.5d, false);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Range[-65.5,-893.5]" + "'", str42, "Range[-65.5,-893.5]");
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-882.5d) + "'", double46 == (-882.5d));
        org.junit.Assert.assertNotNull(range49);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-10.0d), false);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, 0.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        double double18 = range16.getLowerBound();
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range16, 10.0d, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range21, (-10.0d), false);
        double double25 = range21.getCentralValue();
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range10, range21);
        double double27 = range26.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 15.5d + "'", double25 == 15.5d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 11.0d + "'", double27 == 11.0d);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-4050.0d), (-30636.0d));
        java.lang.String str3 = range2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Range[-4050.0,-30636.0]" + "'", str3, "Range[-4050.0,-30636.0]");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 99.5d);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range18, 100.0d, (-0.5d));
        boolean boolean41 = range38.intersects((-484.0d), 50.5d);
        double double42 = range38.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 5521.75d + "'", double42 == 5521.75d);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range26, 20.0d);
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range28, 232.75d);
        double double31 = range30.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 332.75d + "'", double31 == 332.75d);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) 0);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double9 = range8.getLength();
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (double) 'a');
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double15 = range14.getLength();
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range14, 1.0d, true);
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, (-10.0d));
        boolean boolean24 = range14.equals((java.lang.Object) range23);
        double double25 = range23.getCentralValue();
        boolean boolean26 = range8.equals((java.lang.Object) double25);
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range2, range8);
        double double28 = range8.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9.0d) + "'", double15 == (-9.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 45.0d + "'", double25 == 45.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9.0d) + "'", double28 == (-9.0d));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) (short) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, 0.0d);
        org.junit.Assert.assertNotNull(range4);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range7, (double) 0.0f);
        boolean boolean11 = range7.contains((-1800.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, (double) '4', (-882.5d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        boolean boolean10 = range4.contains((-109.0d));
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range4, 20.0d, (-799.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, 107.25d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, 51.0d);
        double double18 = range17.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1907.25d + "'", double18 == 1907.25d);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        double double5 = range2.getLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 62.0d + "'", double5 == 62.0d);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double9 = range8.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range8, 1.0d, true);
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (-10.0d));
        boolean boolean18 = range8.equals((java.lang.Object) range17);
        double double19 = range17.getCentralValue();
        boolean boolean20 = range2.equals((java.lang.Object) double19);
        double double21 = range2.getLength();
        double double22 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 45.0d + "'", double19 == 45.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9.0d) + "'", double21 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9.0d) + "'", double22 == (-9.0d));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) (-1.0f));
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range7, 55.0d);
        double double10 = range7.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        boolean boolean10 = range4.contains((-109.0d));
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range4, 20.0d, (-799.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, 107.25d);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range15, (double) 100.0f, 55.0d);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range15, (-449.0d), (-818.0d));
        double double22 = range21.getUpperBound();
        org.jfree.data.Range range25 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (double) (byte) -1);
        double double29 = range27.constrain((double) 0L);
        boolean boolean31 = range27.contains(168.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range27, 0.0d, 91.0d);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range21, range27);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1560023.25d) + "'", double22 == (-1560023.25d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-10.0d) + "'", double29 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range3, (-1.0d), (double) (byte) 100);
        boolean boolean9 = range3.intersects((double) (byte) -1, (double) (short) -1);
        double double10 = range3.getCentralValue();
        double double11 = range3.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.combine(range0, range3);
        double double14 = range3.constrain((double) 100L);
        boolean boolean16 = range3.equals((java.lang.Object) "Range[484.0,-449.0]");
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range3, 107.25d);
        java.lang.Class<?> wildcardClass19 = range18.getClass();
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.5d + "'", double10 == 5.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jfree.data.Range range2 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean5 = range2.intersects((double) 100.0f, 90.0d);
        double double7 = range2.constrain(0.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 50.5d, 10974.5d);
        boolean boolean13 = range2.intersects((-899.0d), (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range2, (-405.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-828.0d) + "'", double7 == (-828.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        double double5 = range2.getLowerBound();
        java.lang.String str6 = range2.toString();
        double double7 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[10.0,1.0]" + "'", str6, "Range[10.0,1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        double double6 = range2.getLowerBound();
        double double8 = range2.constrain((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (-449.0d), true);
        java.lang.Class<?> wildcardClass10 = range9.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, 5.5d);
        boolean boolean30 = range26.equals((java.lang.Object) 171.0d);
        boolean boolean33 = range26.intersects((-893.5d), (double) 100L);
        double double35 = range26.constrain(1.0d);
        boolean boolean36 = range20.equals((java.lang.Object) range26);
        double double37 = range20.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-898.0d) + "'", double37 == (-898.0d));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        double double10 = range7.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 45.5d + "'", double10 == 45.5d);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        boolean boolean10 = range4.contains((-109.0d));
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range4, 20.0d, (-799.0d));
        double double14 = range13.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-36810.0d) + "'", double14 == (-36810.0d));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double3 = range2.getUpperBound();
        double double5 = range2.constrain(0.0d);
        double double6 = range2.getLowerBound();
        double double7 = range2.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range2, (-405.0d));
        java.lang.String str10 = range2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9.0d) + "'", double5 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[100.0,-9.0]" + "'", str10, "Range[100.0,-9.0]");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range18 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean19 = range11.equals((java.lang.Object) (-10.0d));
        double double20 = range11.getCentralValue();
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double24 = range23.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range23, 1.0d, true);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (-10.0d));
        boolean boolean33 = range23.equals((java.lang.Object) range32);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range11, range32);
        org.jfree.data.Range range37 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range40 = org.jfree.data.Range.expand(range37, (-1.0d), (double) (byte) 100);
        boolean boolean43 = range37.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range37, (-9.0d), (double) 100L);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range46, (double) 1);
        org.jfree.data.Range range51 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range51, (double) (byte) -1);
        boolean boolean56 = range53.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range57 = org.jfree.data.Range.combine(range46, range53);
        org.jfree.data.Range range60 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range63 = org.jfree.data.Range.expand(range60, (-1.0d), (double) (byte) 100);
        boolean boolean66 = range63.intersects((double) (byte) 10, 10.0d);
        boolean boolean67 = range53.equals((java.lang.Object) boolean66);
        org.jfree.data.Range range70 = org.jfree.data.Range.shift(range53, (double) (byte) 100, false);
        org.jfree.data.Range range73 = org.jfree.data.Range.expand(range53, 100.0d, (-0.5d));
        double double74 = range53.getLength();
        org.jfree.data.Range range77 = org.jfree.data.Range.shift(range53, 232.75d, false);
        org.jfree.data.Range range78 = org.jfree.data.Range.combine(range11, range77);
        java.lang.Class<?> wildcardClass79 = range77.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-485.0d) + "'", double20 == (-485.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9.0d) + "'", double24 == (-9.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-109.0d) + "'", double74 == (-109.0d));
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range9, (double) (-1), 13.0d);
        double double16 = range9.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-109.0d) + "'", double16 == (-109.0d));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (-1.0d), (double) (byte) 100);
        boolean boolean38 = range32.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range32, (-9.0d), (double) 100L);
        double double43 = range41.constrain(1.0d);
        boolean boolean44 = range29.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range26, range29);
        java.lang.String str46 = range29.toString();
        double double47 = range29.getUpperBound();
        java.lang.Class<?> wildcardClass48 = range29.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-899.0d) + "'", double43 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Range[10.0,10.0]" + "'", str46, "Range[10.0,10.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range6, (-13662.0d));
        double double9 = range6.getLowerBound();
        org.jfree.data.Range range12 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double13 = range12.getCentralValue();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range16, (double) (short) 100);
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range12, range19);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (-1.0d), (double) (byte) 100);
        boolean boolean29 = range23.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range23, (-9.0d), (double) 100L);
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range32, (double) 1);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range32, (double) (short) -1, false);
        boolean boolean38 = range20.equals((java.lang.Object) range37);
        org.jfree.data.Range range40 = org.jfree.data.Range.expandToInclude(range37, 0.0d);
        org.jfree.data.Range range43 = org.jfree.data.Range.expand(range37, 18630.0d, 18595.0d);
        double double45 = range43.constrain((-83.5d));
        boolean boolean46 = range6.equals((java.lang.Object) (-83.5d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.5d) + "'", double13 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.539756E7d) + "'", double45 == (-1.539756E7d));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        boolean boolean13 = range8.contains(91.0d);
        double double14 = range8.getCentralValue();
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double18 = range17.getLength();
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range17, 1.0d, true);
        org.jfree.data.Range range24 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range24, (-10.0d));
        boolean boolean27 = range17.equals((java.lang.Object) range26);
        double double28 = range26.getUpperBound();
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range26, 17.5d);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range8, range26);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 55.0d + "'", double14 == 55.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9.0d) + "'", double18 == (-9.0d));
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 90.0d + "'", double28 == 90.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0, (double) 0);
        boolean boolean5 = range2.intersects((double) (short) 1, 0.0d);
        boolean boolean8 = range2.intersects(20.0d, (-1.5d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        double double21 = range11.getUpperBound();
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, (double) 1L);
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range26, (-1.0d), (double) (byte) 100);
        boolean boolean32 = range26.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range26, (-9.0d), (double) 100L);
        double double37 = range35.constrain(1.0d);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range35, (double) (byte) 100);
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range35, (double) 'a');
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range35, (double) 1.0f, false);
        org.jfree.data.Range range47 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range50 = org.jfree.data.Range.expand(range47, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range50, 5.5d);
        boolean boolean54 = range50.equals((java.lang.Object) 171.0d);
        boolean boolean57 = range50.intersects((-893.5d), (double) 100L);
        double double59 = range50.constrain(1.0d);
        boolean boolean60 = range44.equals((java.lang.Object) range50);
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range44, (-9.0d));
        java.lang.String str63 = range44.toString();
        org.jfree.data.Range range64 = org.jfree.data.Range.combine(range11, range44);
        org.jfree.data.Range range67 = org.jfree.data.Range.shift(range11, 4488.5d, true);
        org.jfree.data.Range range70 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double71 = range70.getLength();
        double double72 = range70.getLowerBound();
        org.jfree.data.Range range74 = org.jfree.data.Range.shift(range70, (-799.0d));
        java.lang.String str75 = range74.toString();
        org.jfree.data.Range range78 = org.jfree.data.Range.shift(range74, 37189.0d, false);
        boolean boolean79 = range11.equals((java.lang.Object) range74);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-899.0d) + "'", double21 == (-899.0d));
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-899.0d) + "'", double37 == (-899.0d));
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Range[-70.0,-898.0]" + "'", str63, "Range[-70.0,-898.0]");
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-9.0d) + "'", double71 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Range[0.0,0.0]" + "'", str75, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        double double16 = range11.getLength();
        double double17 = range11.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 90.0d + "'", double16 == 90.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 90.0d + "'", double17 == 90.0d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range8, 18595.0d);
        double double15 = range13.constrain((-10.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 18605.0d + "'", double15 == 18605.0d);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        double double18 = range11.getLength();
        java.lang.String str19 = range11.toString();
        java.lang.Class<?> wildcardClass20 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[-71.0,-899.0]" + "'", str19, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, 0.0d);
        org.jfree.data.Range range25 = new org.jfree.data.Range(171.0d, (double) (byte) 1);
        boolean boolean26 = range20.equals((java.lang.Object) range25);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range25, 5.5d, false);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        double double6 = range2.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 0.0d, true);
        boolean boolean12 = range2.intersects(232.75d, 18595.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range2, 0.0d, false);
        java.lang.Class<?> wildcardClass16 = range15.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range20, 11044.5d, true);
        double double24 = range23.getLowerBound();
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range23, 45.0d);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range26, (-400.5d), (-44.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10974.5d + "'", double24 == 10974.5d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        double double14 = range2.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range2, 45.0d);
        double double17 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.5d + "'", double17 == 5.5d);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, 44.5d, (-799.0d));
        boolean boolean9 = range2.contains((double) 100);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range2, (-9138.5d), false);
        java.lang.Class<?> wildcardClass13 = range2.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10, 11.0d);
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        double double18 = range17.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range17, 172.0d);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, (double) 1.0f);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 72.0d + "'", double18 == 72.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 10, (-9.0d));
        double double3 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range2.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.5d + "'", double15 == 5.5d);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, 0.0d);
        double double7 = range6.getLowerBound();
        double double8 = range6.getLowerBound();
        boolean boolean9 = range2.equals((java.lang.Object) double8);
        boolean boolean11 = range2.contains(0.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range2, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range16, 1.0d, true);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        boolean boolean26 = range16.equals((java.lang.Object) range25);
        boolean boolean27 = range11.equals((java.lang.Object) range25);
        boolean boolean29 = range25.contains(20.0d);
        double double30 = range25.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 90.0d + "'", double30 == 90.0d);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range2, 37189.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range2, 17.5d, false);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range2, (-898.0d), false);
        double double16 = range15.getCentralValue();
        java.lang.Class<?> wildcardClass17 = range15.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-71.0d), (-828.0d));
        org.jfree.data.Range range11 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, (double) 10L);
        double double14 = range11.getLowerBound();
        double double15 = range11.getCentralValue();
        double double16 = range11.getCentralValue();
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range8, range11);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range8, 0.0d);
        double double20 = range8.getLowerBound();
        boolean boolean23 = range8.intersects((-170.0d), (double) 0.0f);
        double double25 = range8.constrain((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.5d) + "'", double15 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.5d) + "'", double16 == (-0.5d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) (byte) -1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (double) 10);
        java.lang.String str20 = range17.toString();
        double double21 = range17.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Range[-1.0,-800.0]" + "'", str20, "Range[-1.0,-800.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-799.0d) + "'", double21 == (-799.0d));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, (double) (short) -1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (double) (byte) 100, true);
        double double17 = range11.getCentralValue();
        boolean boolean19 = range11.contains((double) 100);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-485.0d) + "'", double17 == (-485.0d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, 5.5d);
        boolean boolean30 = range26.equals((java.lang.Object) 171.0d);
        boolean boolean33 = range26.intersects((-893.5d), (double) 100L);
        double double35 = range26.constrain(1.0d);
        boolean boolean36 = range20.equals((java.lang.Object) range26);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range39.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range39, (-9.0d), (double) 100L);
        double double50 = range48.constrain(1.0d);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range48, (double) (byte) 100);
        org.jfree.data.Range range54 = org.jfree.data.Range.expandToInclude(range48, (double) 'a');
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range48, (-1.0d), (-9.0d));
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range48, 0.0d, true);
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range48, (double) (short) 1);
        boolean boolean63 = range20.equals((java.lang.Object) range48);
        org.jfree.data.Range range66 = org.jfree.data.Range.expand(range20, (-822.5d), (-30636.0d));
        double double67 = range20.getLength();
        double double69 = range20.constrain(332.75d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-899.0d) + "'", double50 == (-899.0d));
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-828.0d) + "'", double67 == (-828.0d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-898.0d) + "'", double69 == (-898.0d));
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) (byte) 100, (-900.0d));
        double double7 = range2.getLowerBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range2, (-1.0d));
        boolean boolean11 = range9.contains(33.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, 0.0d);
        double double7 = range6.getLowerBound();
        double double8 = range6.getLowerBound();
        boolean boolean9 = range2.equals((java.lang.Object) double8);
        boolean boolean12 = range2.intersects(101.0d, (-37118.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range16, 1.0d, true);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        boolean boolean26 = range16.equals((java.lang.Object) range25);
        boolean boolean27 = range11.equals((java.lang.Object) range25);
        double double28 = range25.getUpperBound();
        org.jfree.data.Range range31 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, (double) (byte) -1);
        double double35 = range33.constrain((double) 0L);
        boolean boolean37 = range33.contains(168.0d);
        org.jfree.data.Range range40 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double41 = range40.getLength();
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range40, (-109.0d));
        org.jfree.data.Range range46 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range49 = org.jfree.data.Range.expand(range46, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range54 = org.jfree.data.Range.shift(range52, (-10.0d));
        org.jfree.data.Range range55 = org.jfree.data.Range.combine(range49, range52);
        org.jfree.data.Range range58 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range61 = org.jfree.data.Range.expand(range58, (-1.0d), (double) (byte) 100);
        boolean boolean64 = range58.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range67 = org.jfree.data.Range.expand(range58, (-9.0d), (double) 100L);
        double double69 = range67.constrain(1.0d);
        org.jfree.data.Range range70 = org.jfree.data.Range.combine(range55, range67);
        boolean boolean71 = range43.equals((java.lang.Object) range55);
        boolean boolean73 = range55.contains((-485.0d));
        boolean boolean74 = range33.equals((java.lang.Object) (-485.0d));
        boolean boolean75 = range25.equals((java.lang.Object) (-485.0d));
        double double76 = range25.getUpperBound();
        org.jfree.data.Range range79 = org.jfree.data.Range.expand(range25, 18595.0d, (double) 'a');
        org.jfree.data.Range range82 = org.jfree.data.Range.expand(range79, (-20.5d), 1.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 90.0d + "'", double28 == 90.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-10.0d) + "'", double35 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-9.0d) + "'", double41 == (-9.0d));
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-899.0d) + "'", double69 == (-899.0d));
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 90.0d + "'", double76 == 90.0d);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertNotNull(range82);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range11, 6553.0d);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        java.lang.String str29 = range28.toString();
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double33 = range32.getLength();
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range32, 1.0d, true);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range39, (-10.0d));
        boolean boolean42 = range32.equals((java.lang.Object) range41);
        double double43 = range41.getCentralValue();
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range28, range41);
        double double45 = range44.getLowerBound();
        boolean boolean48 = range44.intersects((-893.5d), 168.0d);
        boolean boolean50 = range44.contains((double) 0);
        java.lang.String str51 = range44.toString();
        double double52 = range44.getLength();
        double double53 = range44.getLength();
        boolean boolean54 = range22.equals((java.lang.Object) range44);
        boolean boolean57 = range22.intersects(11.5d, 928.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Range[1.0,-899.0]" + "'", str29, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-9.0d) + "'", double33 == (-9.0d));
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 45.0d + "'", double43 == 45.0d);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Range[0.0,90.0]" + "'", str51, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 90.0d + "'", double52 == 90.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 90.0d + "'", double53 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        double double22 = range5.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-899.0d) + "'", double22 == (-899.0d));
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range2, 37189.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range2, 17.5d, false);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range2, (-898.0d), false);
        java.lang.String str16 = range2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[10.0,1.0]" + "'", str16, "Range[10.0,1.0]");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        boolean boolean7 = range2.intersects((double) 1, (double) 10L);
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        org.jfree.data.Range range19 = org.jfree.data.Range.combine(range13, range16);
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range2, range13);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, 5548.0d);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) (byte) 10, (-0.5d));
        boolean boolean26 = range20.equals((java.lang.Object) (-0.5d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range20 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean22 = range20.contains((double) 'a');
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range20, (double) (byte) 0);
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range20, (double) 0L);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range20, (-27.75d));
        double double29 = range20.getUpperBound();
        org.jfree.data.Range range30 = org.jfree.data.Range.combine(range11, range20);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 52.0d + "'", double29 == 52.0d);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, (double) (short) 100);
        org.jfree.data.Range range10 = org.jfree.data.Range.combine(range2, range9);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) 10L);
        java.lang.String str13 = range9.toString();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range9, 232.75d);
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double19 = range18.getCentralValue();
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double23 = range22.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range22, (double) (short) 100);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range18, range25);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range29, (-1.0d), (double) (byte) 100);
        boolean boolean35 = range29.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range29, (-9.0d), (double) 100L);
        org.jfree.data.Range range40 = org.jfree.data.Range.expandToInclude(range38, (double) 1);
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range38, (double) (short) -1, false);
        boolean boolean44 = range26.equals((java.lang.Object) range43);
        boolean boolean45 = range9.equals((java.lang.Object) range43);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[10.0,100.0]" + "'", str13, "Range[10.0,100.0]");
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.5d) + "'", double19 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9.0d) + "'", double23 == (-9.0d));
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 100, 11.0d);
        boolean boolean4 = range2.contains((double) '#');
        java.lang.String str5 = range2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Range[100.0,11.0]" + "'", str5, "Range[100.0,11.0]");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 1);
        boolean boolean27 = range25.contains(100.0d);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range30, (-109.0d));
        boolean boolean34 = range25.equals((java.lang.Object) range33);
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range25, (double) 0.0f);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(range36);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (-31328.0d));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        double double8 = range2.getCentralValue();
        boolean boolean10 = range2.contains((-30636.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.5d + "'", double8 == 5.5d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        double double4 = range2.getUpperBound();
        org.jfree.data.Range range7 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double8 = range7.getLength();
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range7, 1.0d, true);
        boolean boolean14 = range11.intersects((double) (byte) 10, 1.0d);
        boolean boolean17 = range11.intersects((double) 'a', (double) (byte) 10);
        java.lang.Class<?> wildcardClass18 = range11.getClass();
        boolean boolean19 = range2.equals((java.lang.Object) wildcardClass18);
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double23 = range22.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range22, (-109.0d));
        boolean boolean27 = range22.contains(1.0d);
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range22, 37189.0d);
        org.jfree.data.Range range30 = org.jfree.data.Range.combine(range2, range29);
        double double31 = range2.getLength();
        java.lang.Class<?> wildcardClass32 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9.0d) + "'", double23 == (-9.0d));
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jfree.data.Range range2 = new org.jfree.data.Range(171.0d, (-170.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-385.0d), true);
        java.lang.Class<?> wildcardClass6 = range5.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 1);
        boolean boolean27 = range25.contains(100.0d);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range30, (-109.0d));
        boolean boolean34 = range25.equals((java.lang.Object) range33);
        double double36 = range33.constrain((double) '4');
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range33, 32.0d, 61.0d);
        boolean boolean42 = range33.intersects(21871.0d, (-170.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, 0.0d);
        double double7 = range6.getLowerBound();
        double double8 = range6.getLowerBound();
        boolean boolean9 = range2.equals((java.lang.Object) double8);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, 107.25d, (-799.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, 11044.5d, (-10.0d));
        double double16 = range15.getUpperBound();
        boolean boolean19 = range15.intersects(743473.0d, 171.0d);
        boolean boolean21 = range15.contains(5548.0d);
        org.jfree.data.Range range24 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range24, (double) (byte) -1);
        org.jfree.data.Range range29 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double30 = range29.getUpperBound();
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range24, range29);
        double double32 = range29.getLowerBound();
        boolean boolean33 = range15.equals((java.lang.Object) range29);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6108.5d + "'", double16 == 6108.5d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-9.0d) + "'", double30 == (-9.0d));
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        double double8 = range6.getLowerBound();
        double double9 = range6.getLowerBound();
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range6, (double) 0L, 91.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (double) (-1));
        boolean boolean16 = range12.contains(90.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range2, range12);
        double double19 = range12.constrain(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-818.0d) + "'", double19 == (-818.0d));
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 5.5d, (double) 10.0f);
        boolean boolean19 = range13.intersects(45.5d, (-799.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean8 = range2.intersects((double) (byte) 0, (-899.0d));
        boolean boolean10 = range2.contains(45.0d);
        java.lang.Class<?> wildcardClass11 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-484.0d), (double) 0);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-414.0d), 4523.5d);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1L);
        double double18 = range17.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, (-31328.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        boolean boolean20 = range11.intersects(1.0d, (double) (-1));
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range11, (-485.0d));
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range11, 52.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range26, 20.0d);
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range28, 232.75d);
        java.lang.Class<?> wildcardClass31 = range28.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range2, 0.0d, false);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, (-900.0d), true);
        double double58 = range53.constrain((-71.0d));
        double double59 = range53.getUpperBound();
        double double60 = range53.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-9.0d) + "'", double60 == (-9.0d));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        double double14 = range2.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range2, 45.0d);
        double double17 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range16, 1.0d, true);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        boolean boolean26 = range16.equals((java.lang.Object) range25);
        boolean boolean27 = range11.equals((java.lang.Object) range25);
        double double28 = range25.getUpperBound();
        org.jfree.data.Range range31 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, (double) (byte) -1);
        double double35 = range33.constrain((double) 0L);
        boolean boolean37 = range33.contains(168.0d);
        org.jfree.data.Range range40 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double41 = range40.getLength();
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range40, (-109.0d));
        org.jfree.data.Range range46 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range49 = org.jfree.data.Range.expand(range46, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range54 = org.jfree.data.Range.shift(range52, (-10.0d));
        org.jfree.data.Range range55 = org.jfree.data.Range.combine(range49, range52);
        org.jfree.data.Range range58 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range61 = org.jfree.data.Range.expand(range58, (-1.0d), (double) (byte) 100);
        boolean boolean64 = range58.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range67 = org.jfree.data.Range.expand(range58, (-9.0d), (double) 100L);
        double double69 = range67.constrain(1.0d);
        org.jfree.data.Range range70 = org.jfree.data.Range.combine(range55, range67);
        boolean boolean71 = range43.equals((java.lang.Object) range55);
        boolean boolean73 = range55.contains((-485.0d));
        boolean boolean74 = range33.equals((java.lang.Object) (-485.0d));
        boolean boolean75 = range25.equals((java.lang.Object) (-485.0d));
        double double76 = range25.getUpperBound();
        java.lang.Class<?> wildcardClass77 = range25.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 90.0d + "'", double28 == 90.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-10.0d) + "'", double35 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-9.0d) + "'", double41 == (-9.0d));
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-899.0d) + "'", double69 == (-899.0d));
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 90.0d + "'", double76 == 90.0d);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-10.0d), false);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, 0.0d, 91.0d);
        double double15 = range10.constrain((-71.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range10, 50.5d);
        double double19 = range10.constrain(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        java.lang.String str12 = range11.toString();
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        java.lang.String str16 = range15.toString();
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double20 = range19.getLength();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range19, (-109.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (-71.0d), (-828.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (double) 100L);
        double double28 = range27.getLength();
        double double30 = range27.constrain(50.5d);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range15, range27);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, (-449.0d));
        boolean boolean34 = range11.equals((java.lang.Object) (-449.0d));
        org.jfree.data.Range range37 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range40 = org.jfree.data.Range.expand(range37, (-1.0d), (double) (byte) 100);
        boolean boolean43 = range37.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range45 = org.jfree.data.Range.shift(range37, (-10.0d));
        boolean boolean46 = range11.equals((java.lang.Object) range37);
        java.lang.Class<?> wildcardClass47 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Range[1.0,100.0]" + "'", str12, "Range[1.0,100.0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[10.0,100.0]" + "'", str16, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9.0d) + "'", double20 == (-9.0d));
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 45.0d, (double) '#');
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, (-1.0d), (double) (byte) 100);
        boolean boolean33 = range27.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range27, (-9.0d), (double) 100L);
        double double38 = range36.constrain(1.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range36, (double) (byte) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range36, (double) 'a');
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range24, range42);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range42, (-71.0d), true);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range42, 91.0d);
        org.jfree.data.Range range51 = org.jfree.data.Range.expand(range42, (double) 10L, (-2342.5d));
        double double53 = range42.constrain(5521.75d);
        java.lang.Class<?> wildcardClass54 = range42.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-899.0d) + "'", double38 == (-899.0d));
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 97.0d + "'", double53 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (byte) 0);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range8, (-485.0d), (double) (short) 1);
        java.lang.String str16 = range15.toString();
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range15, 32.0d, 67.0d);
        java.lang.Class<?> wildcardClass20 = range15.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[-4345.0,2.0]" + "'", str16, "Range[-4345.0,2.0]");
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getUpperBound();
        boolean boolean15 = range11.contains((double) (-1.0f));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range11, 20.0d, false);
        double double19 = range11.getLength();
        boolean boolean22 = range11.intersects((double) 1L, (-71.0d));
        double double23 = range11.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 90.0d + "'", double19 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 90.0d + "'", double23 == 90.0d);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (-799.0d));
        java.lang.String str7 = range6.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range6, 0.0d);
        double double10 = range9.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[0.0,0.0]" + "'", str7, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.data.Range range2 = new org.jfree.data.Range(928.0d, (double) 10.0f);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (-828.0d));
        double double20 = range17.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 99.0d + "'", double20 == 99.0d);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-71.0d), (-828.0d));
        org.jfree.data.Range range11 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, (double) 10L);
        boolean boolean14 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range8, (-1.0931465E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, 45.0d, true);
        boolean boolean11 = range5.intersects(10989.0d, (double) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range5, 4488.5d, true);
        double double15 = range5.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9.0d) + "'", double15 == (-9.0d));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jfree.data.Range range2 = new org.jfree.data.Range(5.90028264E8d, 104.5d);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getUpperBound();
        boolean boolean15 = range11.contains((double) (-1.0f));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range11, 20.0d, false);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range11, (-828.0d), (-933.0d));
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range21, 51.0d, false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        double double9 = range2.getLowerBound();
        boolean boolean12 = range2.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range2, (double) (short) 100, 51.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        double double7 = range2.getLength();
        double double9 = range2.constrain(15.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-485.0d), (-449.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (double) 10.0f);
        org.jfree.data.Range range12 = null;
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range11, range12);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        java.lang.String str20 = range19.toString();
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double24 = range23.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range23, 1.0d, true);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (-10.0d));
        boolean boolean33 = range23.equals((java.lang.Object) range32);
        double double34 = range32.getCentralValue();
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range19, range32);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range12, range32);
        java.lang.String str37 = range32.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Range[1.0,-899.0]" + "'", str20, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9.0d) + "'", double24 == (-9.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 45.0d + "'", double34 == 45.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Range[0.0,90.0]" + "'", str37, "Range[0.0,90.0]");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        double double7 = range2.getLowerBound();
        double double8 = range2.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.5d) + "'", double8 == (-0.5d));
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, 0.0d);
        double double7 = range6.getLowerBound();
        double double8 = range6.getLowerBound();
        boolean boolean9 = range2.equals((java.lang.Object) double8);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, 107.25d, (-799.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, 11044.5d, (-10.0d));
        double double16 = range15.getUpperBound();
        boolean boolean19 = range15.intersects(743473.0d, 171.0d);
        boolean boolean21 = range15.contains(5548.0d);
        boolean boolean23 = range15.contains((-13662.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6108.5d + "'", double16 == 6108.5d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (-1.0d), (double) (byte) 100);
        boolean boolean38 = range32.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range32, (-9.0d), (double) 100L);
        double double43 = range41.constrain(1.0d);
        boolean boolean44 = range29.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range26, range29);
        org.jfree.data.Range range48 = new org.jfree.data.Range((double) 100.0f, 11.0d);
        double double50 = range48.constrain(72.0d);
        boolean boolean51 = range29.equals((java.lang.Object) 72.0d);
        org.jfree.data.Range range54 = org.jfree.data.Range.expand(range29, 14.5d, 18595.0d);
        double double55 = range54.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-899.0d) + "'", double43 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 11.0d + "'", double50 == 11.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range18 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean19 = range11.equals((java.lang.Object) (-10.0d));
        double double20 = range11.getCentralValue();
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double24 = range23.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range23, 1.0d, true);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (-10.0d));
        boolean boolean33 = range23.equals((java.lang.Object) range32);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range11, range32);
        org.jfree.data.Range range37 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range40 = org.jfree.data.Range.expand(range37, (-1.0d), (double) (byte) 100);
        boolean boolean43 = range37.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range37, (-9.0d), (double) 100L);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range46, (double) 1);
        org.jfree.data.Range range51 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range51, (double) (byte) -1);
        boolean boolean56 = range53.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range57 = org.jfree.data.Range.combine(range46, range53);
        org.jfree.data.Range range60 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range63 = org.jfree.data.Range.expand(range60, (-1.0d), (double) (byte) 100);
        boolean boolean66 = range63.intersects((double) (byte) 10, 10.0d);
        boolean boolean67 = range53.equals((java.lang.Object) boolean66);
        org.jfree.data.Range range70 = org.jfree.data.Range.shift(range53, (double) (byte) 100, false);
        org.jfree.data.Range range73 = org.jfree.data.Range.expand(range53, 100.0d, (-0.5d));
        double double74 = range53.getLength();
        org.jfree.data.Range range77 = org.jfree.data.Range.shift(range53, 232.75d, false);
        org.jfree.data.Range range78 = org.jfree.data.Range.combine(range11, range77);
        boolean boolean81 = range77.intersects(5548.0d, 51.0d);
        double double82 = range77.getUpperBound();
        double double83 = range77.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-485.0d) + "'", double20 == (-485.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9.0d) + "'", double24 == (-9.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-109.0d) + "'", double74 == (-109.0d));
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-331.75d) + "'", double83 == (-331.75d));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.data.Range range2 = new org.jfree.data.Range(91.0d, (-331.75d));
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-485.0d), (-449.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (double) 10.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 4488.5d, 91.0d);
        java.lang.Class<?> wildcardClass15 = range14.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        boolean boolean12 = range5.intersects((-893.5d), (double) 100L);
        double double14 = range5.constrain(1.0d);
        java.lang.Class<?> wildcardClass15 = range5.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) '#');
        org.jfree.data.Range range5 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, (double) (byte) -1);
        boolean boolean10 = range7.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range7, (double) 0.0f);
        boolean boolean14 = range12.contains(15.5d);
        org.jfree.data.Range range15 = org.jfree.data.Range.combine(range2, range12);
        double double16 = range2.getCentralValue();
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 17.5d + "'", double16 == 17.5d);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        boolean boolean10 = range4.intersects((-899.0d), 90.0d);
        java.lang.String str11 = range4.toString();
        boolean boolean13 = range4.contains((-828.0d));
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        double double27 = range25.constrain(1.0d);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range25, (double) (byte) 100);
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range25, (double) 'a');
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-1.0d), (-9.0d));
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range34, 0.0d);
        org.jfree.data.Range range39 = new org.jfree.data.Range(171.0d, (double) (byte) 1);
        boolean boolean40 = range34.equals((java.lang.Object) range39);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range4, range39);
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range4, (-933.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[0.0,90.0]" + "'", str11, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-899.0d) + "'", double27 == (-899.0d));
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range43);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, 0.0d);
        double double7 = range6.getLowerBound();
        double double8 = range6.getLowerBound();
        boolean boolean9 = range2.equals((java.lang.Object) double8);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, 107.25d, (-799.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range12, 4488.5d, false);
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, (-1.0d), (double) (byte) 100);
        boolean boolean24 = range18.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range18, (-9.0d), (double) 100L);
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range27, (double) 1);
        boolean boolean32 = range29.intersects((-1.0d), 0.0d);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double36 = range35.getLength();
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range35, (-109.0d));
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range38, (-71.0d), (-828.0d));
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range41, (double) 100L);
        double double44 = range43.getLength();
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range29, range43);
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range29, (double) 0L, false);
        org.jfree.data.Range range50 = org.jfree.data.Range.shift(range29, (-13662.0d));
        double double51 = range50.getUpperBound();
        double double52 = range50.getLowerBound();
        boolean boolean53 = range12.equals((java.lang.Object) double52);
        org.jfree.data.Range range56 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range56, (-1.0d), (double) (byte) 100);
        java.lang.String str60 = range59.toString();
        double double61 = range59.getLength();
        double double62 = range59.getCentralValue();
        org.jfree.data.Range range64 = org.jfree.data.Range.shift(range59, 11044.5d);
        double double66 = range59.constrain((-893.5d));
        org.jfree.data.Range range68 = org.jfree.data.Range.expandToInclude(range59, (-933.0d));
        boolean boolean69 = range12.equals((java.lang.Object) range59);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-9.0d) + "'", double36 == (-9.0d));
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-13733.0d) + "'", double52 == (-13733.0d));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Range[1.0,-899.0]" + "'", str60, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-900.0d) + "'", double61 == (-900.0d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-449.0d) + "'", double62 == (-449.0d));
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-899.0d) + "'", double66 == (-899.0d));
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        double double6 = range2.getLength();
        org.jfree.data.Range range9 = new org.jfree.data.Range(5.5d, (double) 10.0f);
        boolean boolean11 = range9.contains(10.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range9, (double) 1, (double) 1.0f);
        boolean boolean17 = range9.intersects(6553.0d, 55.0d);
        boolean boolean18 = range2.equals((java.lang.Object) range9);
        java.lang.Class<?> wildcardClass19 = range9.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        double double9 = range2.getLowerBound();
        boolean boolean12 = range2.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) (byte) -1, (double) (byte) -1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range15, 32.0d);
        double double18 = range15.getCentralValue();
        org.jfree.data.Range range19 = org.jfree.data.Range.combine(range2, range15);
        double double20 = range15.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, (double) (byte) 1, 1907.25d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, 0.0d, true);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        boolean boolean17 = range11.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-9.0d), (double) 100L);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range20, (double) 1);
        org.jfree.data.Range range25 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (double) (byte) -1);
        boolean boolean30 = range27.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range20, range27);
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, (-1.0d), (double) (byte) 100);
        boolean boolean40 = range34.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range43 = org.jfree.data.Range.expand(range34, (-9.0d), (double) 100L);
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range31, range34);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range8, range44);
        java.lang.Class<?> wildcardClass46 = range44.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range2, 0.0d, false);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, (double) 'a', true);
        double double57 = range53.getUpperBound();
        double double58 = range53.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 5.5d + "'", double58 == 5.5d);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-0.5d), (-71.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) 1, 0.0d);
        double double6 = range5.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range5, (double) 100.0f, (-828.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-141.0d) + "'", double6 == (-141.0d));
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 100);
        double double5 = range4.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range4, (-71.0d));
        double double8 = range4.getUpperBound();
        double double9 = range4.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 110.0d + "'", double5 == 110.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 110.0d + "'", double8 == 110.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 110.0d + "'", double9 == 110.0d);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range20, 11044.5d, true);
        double double24 = range23.getLowerBound();
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range23, 45.0d);
        boolean boolean28 = range26.contains(11.5d);
        double double29 = range26.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10974.5d + "'", double24 == 10974.5d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 11019.5d + "'", double29 == 11019.5d);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) (-1.0f));
        double double9 = range2.constrain((-0.5d));
        double double10 = range2.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.5d) + "'", double9 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.5d) + "'", double10 == (-0.5d));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, 44.5d, (-799.0d));
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range2, 743473.0d);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double20 = range19.getLength();
        double double21 = range19.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range19, 10.0d, false);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range24, (-10.0d), false);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, 0.0d, 91.0d);
        boolean boolean31 = range16.equals((java.lang.Object) range27);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9.0d) + "'", double20 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        boolean boolean10 = range4.intersects((-899.0d), 90.0d);
        java.lang.String str11 = range4.toString();
        boolean boolean13 = range4.equals((java.lang.Object) 10.0d);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        org.jfree.data.Range range21 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double22 = range21.getUpperBound();
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range16, range21);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range23, (double) (-1), false);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double30 = range29.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range29, 1.0d, true);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range23, range33);
        org.jfree.data.Range range37 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range37, (double) 10L);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range34, range37);
        boolean boolean41 = range4.equals((java.lang.Object) range40);
        double double43 = range40.constrain((double) 'a');
        java.lang.String str44 = range40.toString();
        boolean boolean46 = range40.contains(67.0d);
        double double47 = range40.getUpperBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[0.0,90.0]" + "'", str11, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9.0d) + "'", double22 == (-9.0d));
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-9.0d) + "'", double30 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2.0d + "'", double43 == 2.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Range[-1.0,2.0]" + "'", str44, "Range[-1.0,2.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 2.0d + "'", double47 == 2.0d);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getUpperBound();
        java.lang.Class<?> wildcardClass14 = range11.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        boolean boolean10 = range4.intersects((-899.0d), 90.0d);
        java.lang.String str11 = range4.toString();
        boolean boolean13 = range4.contains((-828.0d));
        double double14 = range4.getUpperBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range4, 99.0d, 99.0d);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range4, (-9929.0d));
        java.lang.Class<?> wildcardClass20 = range4.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[0.0,90.0]" + "'", str11, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 90.0d + "'", double14 == 90.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (-828.0d));
        double double20 = range17.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        boolean boolean8 = range4.contains((double) (short) 10);
        org.jfree.data.Range range9 = null;
        org.jfree.data.Range range12 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, (-1.0d), (double) (byte) 100);
        boolean boolean18 = range12.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range12, (-9.0d), (double) 100L);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, 5.5d);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, 5.5d, (double) 10.0f);
        boolean boolean28 = range23.contains((double) (byte) -1);
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range9, range23);
        org.jfree.data.Range range30 = org.jfree.data.Range.combine(range4, range23);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range23, (double) 100L, (-4.0d));
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, 10989.0d);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range35, (-27.75d), false);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean4 = range2.contains(0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (-1.0d), (double) (byte) 100);
        boolean boolean38 = range32.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range32, (-9.0d), (double) 100L);
        double double43 = range41.constrain(1.0d);
        boolean boolean44 = range29.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range26, range29);
        org.jfree.data.Range range48 = new org.jfree.data.Range((double) 100.0f, 11.0d);
        double double50 = range48.constrain(72.0d);
        boolean boolean51 = range29.equals((java.lang.Object) 72.0d);
        org.jfree.data.Range range54 = org.jfree.data.Range.expand(range29, 14.5d, 18595.0d);
        java.lang.Class<?> wildcardClass55 = range54.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-899.0d) + "'", double43 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 11.0d + "'", double50 == 11.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range5.intersects((double) (byte) 10, 10.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        boolean boolean17 = range11.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-9.0d), (double) 100L);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range20, (double) 1);
        org.jfree.data.Range range25 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (double) (byte) -1);
        boolean boolean30 = range27.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range20, range27);
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, (-1.0d), (double) (byte) 100);
        boolean boolean40 = range37.intersects((double) (byte) 10, 10.0d);
        boolean boolean41 = range27.equals((java.lang.Object) boolean40);
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range27, (double) (byte) 100, false);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range27, 100.0d, (-0.5d));
        java.lang.String str48 = range47.toString();
        double double49 = range47.getLowerBound();
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range55 = org.jfree.data.Range.expand(range52, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range58 = org.jfree.data.Range.shift(range52, (double) 10.0f, false);
        boolean boolean60 = range58.contains((double) 1L);
        double double61 = range58.getUpperBound();
        org.jfree.data.Range range62 = org.jfree.data.Range.combine(range47, range58);
        boolean boolean63 = range5.equals((java.lang.Object) range58);
        org.jfree.data.Range range65 = org.jfree.data.Range.expandToInclude(range58, (-109.0d));
        org.jfree.data.Range range68 = org.jfree.data.Range.shift(range58, 464.5d, false);
        org.jfree.data.Range range70 = org.jfree.data.Range.expandToInclude(range68, 484.0d);
        java.lang.String str71 = range68.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Range[10999.0,44.5]" + "'", str48, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10999.0d + "'", double49 == 10999.0d);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 11.0d + "'", double61 == 11.0d);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Range[484.5,475.5]" + "'", str71, "Range[484.5,475.5]");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        double double24 = range11.getUpperBound();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range11, (-1100799.0d), true);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-899.0d) + "'", double24 == (-899.0d));
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jfree.data.Range range2 = new org.jfree.data.Range(52.0d, 5521.75d);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        boolean boolean6 = range2.intersects((-9.0d), (double) ' ');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 21871.0d, false);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (-485.0d), 168.0d);
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range15, (-1.0d), (double) (byte) 100);
        boolean boolean21 = range15.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range15, (-9.0d), (double) 100L);
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range24, (double) 1);
        org.jfree.data.Range range29 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (double) (byte) -1);
        boolean boolean34 = range31.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range24, range31);
        org.jfree.data.Range range38 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range38, (-1.0d), (double) (byte) 100);
        boolean boolean44 = range41.intersects((double) (byte) 10, 10.0d);
        boolean boolean45 = range31.equals((java.lang.Object) boolean44);
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range31, (double) (byte) 100, false);
        org.jfree.data.Range range51 = org.jfree.data.Range.expand(range31, 100.0d, (-0.5d));
        java.lang.String str52 = range51.toString();
        double double53 = range51.getLowerBound();
        org.jfree.data.Range range56 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range56, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range62 = org.jfree.data.Range.shift(range56, (double) 10.0f, false);
        boolean boolean64 = range62.contains((double) 1L);
        double double65 = range62.getUpperBound();
        org.jfree.data.Range range66 = org.jfree.data.Range.combine(range51, range62);
        boolean boolean69 = range66.intersects((-828.0d), 71.0d);
        org.jfree.data.Range range70 = org.jfree.data.Range.combine(range2, range66);
        java.lang.String str71 = range2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Range[10999.0,44.5]" + "'", str52, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10999.0d + "'", double53 == 10999.0d);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 11.0d + "'", double65 == 11.0d);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Range[0.0,0.0]" + "'", str71, "Range[0.0,0.0]");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-345.0d), 50466.0d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        double double16 = range11.getLength();
        boolean boolean18 = range11.contains(0.0d);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range11, (-4.0d), 0.5d);
        boolean boolean23 = range21.contains((-1800.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 90.0d + "'", double16 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0, (double) 0);
        boolean boolean5 = range2.intersects((double) (short) 1, 0.0d);
        double double6 = range2.getLowerBound();
        java.lang.String str7 = range2.toString();
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        org.jfree.data.Range range19 = org.jfree.data.Range.combine(range13, range16);
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (-10.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range13, range22);
        double double26 = range22.getLowerBound();
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range22, (double) (byte) -1);
        double double30 = range22.constrain(90.0d);
        org.jfree.data.Range range33 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range33, (-1.0d), (double) (byte) 100);
        boolean boolean39 = range33.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range33, (-9.0d), (double) 100L);
        double double44 = range42.constrain(1.0d);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range42, (double) (byte) 100);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range42, (double) 'a');
        double double49 = range42.getLength();
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        boolean boolean53 = range42.equals((java.lang.Object) 10.0f);
        double double54 = range42.getUpperBound();
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range42, 0.0d);
        java.lang.String str57 = range42.toString();
        org.jfree.data.Range range58 = org.jfree.data.Range.combine(range22, range42);
        boolean boolean59 = range2.equals((java.lang.Object) range22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[0.0,0.0]" + "'", str7, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 90.0d + "'", double30 == 90.0d);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-899.0d) + "'", double44 == (-899.0d));
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-828.0d) + "'", double49 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-899.0d) + "'", double54 == (-899.0d));
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Range[-71.0,-899.0]" + "'", str57, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        double double7 = range4.getCentralValue();
        double double8 = range4.getLowerBound();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, 1.0d, true);
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range18, (-10.0d));
        boolean boolean21 = range11.equals((java.lang.Object) range20);
        double double22 = range20.getUpperBound();
        boolean boolean24 = range20.contains((double) (-1.0f));
        boolean boolean25 = range4.equals((java.lang.Object) boolean24);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range4, (double) 1);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 44.5d + "'", double7 == 44.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 99.0d + "'", double8 == 99.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 90.0d + "'", double22 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        double double10 = range5.getLowerBound();
        boolean boolean13 = range5.intersects((-1.0d), 21871.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range5, (double) 100L, true);
        double double17 = range5.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 91.0d + "'", double17 == 91.0d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        boolean boolean23 = range11.intersects(14.5d, (-393443.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jfree.data.Range range2 = new org.jfree.data.Range(99.0d, 48.5d);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (byte) 1, (-27.75d));
        org.junit.Assert.assertNotNull(range5);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        double double9 = range2.getCentralValue();
        double double10 = range2.getLength();
        double double11 = range2.getLength();
        boolean boolean13 = range2.contains(90.0d);
        double double14 = range2.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.5d + "'", double9 == 5.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-485.0d), (-449.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (double) 10.0f);
        org.jfree.data.Range range12 = null;
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range11, range12);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        java.lang.String str20 = range19.toString();
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double24 = range23.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range23, 1.0d, true);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (-10.0d));
        boolean boolean33 = range23.equals((java.lang.Object) range32);
        double double34 = range32.getCentralValue();
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range19, range32);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range12, range32);
        double double38 = range36.constrain(10995.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Range[1.0,-899.0]" + "'", str20, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9.0d) + "'", double24 == (-9.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 45.0d + "'", double34 == 45.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 90.0d + "'", double38 == 90.0d);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        double double10 = range5.getLowerBound();
        double double11 = range5.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range5, 0.0d, 20.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.0d + "'", double11 == 90.0d);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        boolean boolean10 = range4.intersects((-899.0d), 90.0d);
        java.lang.String str11 = range4.toString();
        boolean boolean13 = range4.contains((-828.0d));
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        double double27 = range25.constrain(1.0d);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range25, (double) (byte) 100);
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range25, (double) 'a');
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-1.0d), (-9.0d));
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range34, 0.0d);
        org.jfree.data.Range range39 = new org.jfree.data.Range(171.0d, (double) (byte) 1);
        boolean boolean40 = range34.equals((java.lang.Object) range39);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range4, range39);
        double double42 = range4.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[0.0,90.0]" + "'", str11, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-899.0d) + "'", double27 == (-899.0d));
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        double double7 = range5.getLength();
        double double8 = range5.getCentralValue();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range5, 11044.5d);
        boolean boolean12 = range10.contains(5.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-900.0d) + "'", double7 == (-900.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-449.0d) + "'", double8 == (-449.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        double double23 = range22.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range22, (double) 1L);
        double double26 = range22.getUpperBound();
        boolean boolean28 = range22.contains((-9929.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 61.0d + "'", double23 == 61.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-10.0d) + "'", double26 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) '#');
        org.jfree.data.Range range5 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, (double) (byte) -1);
        boolean boolean10 = range7.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range7, (double) 0.0f);
        boolean boolean14 = range12.contains(15.5d);
        org.jfree.data.Range range15 = org.jfree.data.Range.combine(range2, range12);
        double double16 = range2.getUpperBound();
        double double17 = range2.getCentralValue();
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 17.5d + "'", double17 == 17.5d);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, 0.0d);
        double double7 = range6.getLowerBound();
        double double8 = range6.getLowerBound();
        boolean boolean9 = range2.equals((java.lang.Object) double8);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range2, (double) 1.0f);
        java.lang.Class<?> wildcardClass12 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        java.lang.String str3 = range2.toString();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range6, (-109.0d));
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, (-71.0d), (-828.0d));
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (double) 100L);
        double double15 = range14.getLength();
        double double17 = range14.constrain(50.5d);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range2, range14);
        double double19 = range14.getLength();
        double double20 = range14.getUpperBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range14, 5549.5d);
        boolean boolean25 = range14.intersects(199.0d, 72.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Range[10.0,100.0]" + "'", str3, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 'a', 10999.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-4.0d), (-9.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, (-449.0d));
        double double9 = range7.constrain(35.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (byte) 0);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range8, (-485.0d), (double) (short) 1);
        java.lang.String str16 = range15.toString();
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range15, 32.0d, 67.0d);
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double23 = range22.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range22, (-109.0d));
        boolean boolean27 = range22.contains(1.0d);
        boolean boolean28 = range19.equals((java.lang.Object) boolean27);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[-4345.0,2.0]" + "'", str16, "Range[-4345.0,2.0]");
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9.0d) + "'", double23 == (-9.0d));
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (-799.0d));
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, (-1.0d), (double) (byte) 100);
        boolean boolean15 = range9.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range9, (-9.0d), (double) 100L);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range18, (double) 1);
        boolean boolean23 = range18.intersects((double) 100.0f, (double) (byte) 10);
        boolean boolean24 = range2.equals((java.lang.Object) 100.0f);
        java.lang.String str25 = range2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Range[10.0,1.0]" + "'", str25, "Range[10.0,1.0]");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) -1, (double) (byte) -1);
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, 32.0d);
        org.jfree.data.Range range7 = new org.jfree.data.Range((double) (short) 100, 11.0d);
        org.jfree.data.Range range8 = org.jfree.data.Range.combine(range4, range7);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range7, 33.0d, (-10954.5d));
        boolean boolean14 = range7.intersects((-35.0d), 18605.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        double double21 = range20.getLowerBound();
        double double22 = range20.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range20, (-1800.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-71.0d) + "'", double21 == (-71.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-71.0d) + "'", double22 == (-71.0d));
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-10.0d), true);
        boolean boolean13 = range2.intersects(464.5d, 5549.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range18, 100.0d, (-0.5d));
        boolean boolean41 = range38.intersects((-484.0d), 50.5d);
        double double42 = range38.getLength();
        java.lang.Class<?> wildcardClass43 = range38.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-10954.5d) + "'", double42 == (-10954.5d));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        double double16 = range11.getLength();
        double double18 = range11.constrain(100.0d);
        double double19 = range11.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 90.0d + "'", double16 == 90.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 45.0d + "'", double19 == 45.0d);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-71.0d), (-828.0d));
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        boolean boolean17 = range11.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-9.0d), (double) 100L);
        double double22 = range20.constrain(1.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range20, (double) (byte) 100);
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range20, (double) 'a');
        java.lang.String str27 = range20.toString();
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range20, 0.0d);
        double double30 = range20.getUpperBound();
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range20, (double) 1L);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, (-1.0d), (double) (byte) 100);
        boolean boolean41 = range35.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range35, (-9.0d), (double) 100L);
        double double46 = range44.constrain(1.0d);
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range44, (double) (byte) 100);
        org.jfree.data.Range range50 = org.jfree.data.Range.expandToInclude(range44, (double) 'a');
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range44, (double) 1.0f, false);
        org.jfree.data.Range range56 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range56, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range59, 5.5d);
        boolean boolean63 = range59.equals((java.lang.Object) 171.0d);
        boolean boolean66 = range59.intersects((-893.5d), (double) 100L);
        double double68 = range59.constrain(1.0d);
        boolean boolean69 = range53.equals((java.lang.Object) range59);
        org.jfree.data.Range range71 = org.jfree.data.Range.expandToInclude(range53, (-9.0d));
        java.lang.String str72 = range53.toString();
        org.jfree.data.Range range73 = org.jfree.data.Range.combine(range20, range53);
        org.jfree.data.Range range74 = org.jfree.data.Range.combine(range8, range73);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-899.0d) + "'", double22 == (-899.0d));
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Range[-71.0,-899.0]" + "'", str27, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-899.0d) + "'", double30 == (-899.0d));
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-899.0d) + "'", double46 == (-899.0d));
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1.0d + "'", double68 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Range[-70.0,-898.0]" + "'", str72, "Range[-70.0,-898.0]");
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertNotNull(range74);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range14.getUpperBound();
        double double16 = range14.getLength();
        double double17 = range14.getLowerBound();
        org.jfree.data.Range range20 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, (double) (byte) -1);
        org.jfree.data.Range range25 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double26 = range25.getUpperBound();
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range20, range25);
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range27, (double) (-1), false);
        java.lang.Class<?> wildcardClass31 = range30.getClass();
        boolean boolean32 = range14.equals((java.lang.Object) range30);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 6553.0d + "'", double15 == 6553.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-30636.0d) + "'", double16 == (-30636.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 37189.0d + "'", double17 == 37189.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9.0d) + "'", double26 == (-9.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-71.0d), (-828.0d));
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (double) 100L);
        double double11 = range10.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range10, (-109.0d), 10999.0d);
        boolean boolean17 = range14.intersects((-9929.0d), 10.0d);
        boolean boolean19 = range14.contains((-20.5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean4 = range2.equals((java.lang.Object) 100L);
        org.jfree.data.Range range7 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, (-1.0d), (double) (byte) 100);
        boolean boolean13 = range10.intersects((double) (byte) 10, 10.0d);
        java.lang.String str14 = range10.toString();
        org.jfree.data.Range range15 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range10, range16);
        java.lang.String str18 = range17.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Range[1.0,-899.0]" + "'", str14, "Range[1.0,-899.0]");
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[1.0,-899.0]" + "'", str18, "Range[1.0,-899.0]");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 5.5d, (double) 10.0f);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (double) (byte) 0, (double) 0.0f);
        double double20 = range19.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-2342.5d) + "'", double20 == (-2342.5d));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean4 = range2.equals((java.lang.Object) 100L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jfree.data.Range range2 = new org.jfree.data.Range(37289.0d, 272.5d);
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 100, 11.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 17.5d, (-942.0d));
        double double6 = range5.getUpperBound();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, (-1.0d), (double) (byte) 100);
        boolean boolean15 = range9.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range9, (-9.0d), (double) 100L);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, 45.0d, (-9.0d));
        double double22 = range21.getCentralValue();
        double double23 = range21.getLowerBound();
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range21, (double) (byte) 100, true);
        boolean boolean28 = range26.contains((-4.0d));
        double double29 = range26.getLowerBound();
        boolean boolean30 = range5.equals((java.lang.Object) double29);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 83849.0d + "'", double6 == 83849.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 21871.0d + "'", double22 == 21871.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 37189.0d + "'", double23 == 37189.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 37289.0d + "'", double29 == 37289.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (-799.0d));
        java.lang.String str7 = range6.toString();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range6, 37189.0d, false);
        double double11 = range10.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[0.0,0.0]" + "'", str7, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 37189.0d + "'", double11 == 37189.0d);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        double double10 = range7.getLowerBound();
        java.lang.Class<?> wildcardClass11 = range7.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-31328.0d), (-485.0d));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.data.Range range2 = new org.jfree.data.Range(11044.5d, 4523.5d);
        double double3 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4523.5d + "'", double3 == 4523.5d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        double double23 = range22.getLength();
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range22, (double) '4', 20.0d);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range22, 90.0d, 5.5d);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (-13733.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 61.0d + "'", double23 == 61.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range5.intersects((double) (byte) 10, 10.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        boolean boolean17 = range11.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-9.0d), (double) 100L);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range20, (double) 1);
        org.jfree.data.Range range25 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (double) (byte) -1);
        boolean boolean30 = range27.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range20, range27);
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, (-1.0d), (double) (byte) 100);
        boolean boolean40 = range37.intersects((double) (byte) 10, 10.0d);
        boolean boolean41 = range27.equals((java.lang.Object) boolean40);
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range27, (double) (byte) 100, false);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range27, 100.0d, (-0.5d));
        java.lang.String str48 = range47.toString();
        double double49 = range47.getLowerBound();
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range55 = org.jfree.data.Range.expand(range52, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range58 = org.jfree.data.Range.shift(range52, (double) 10.0f, false);
        boolean boolean60 = range58.contains((double) 1L);
        double double61 = range58.getUpperBound();
        org.jfree.data.Range range62 = org.jfree.data.Range.combine(range47, range58);
        boolean boolean63 = range5.equals((java.lang.Object) range58);
        double double64 = range58.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Range[10999.0,44.5]" + "'", str48, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10999.0d + "'", double49 == 10999.0d);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 11.0d + "'", double61 == 11.0d);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 11.0d + "'", double64 == 11.0d);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range11, (double) (short) -1, false);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range11, (double) 100, true);
        double double29 = range28.getLength();
        double double30 = range28.getCentralValue();
        java.lang.Class<?> wildcardClass31 = range28.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-828.0d) + "'", double29 == (-828.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-385.0d) + "'", double30 == (-385.0d));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.data.Range range2 = new org.jfree.data.Range(20.0d, (-828.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) (-1.0f), false);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range8, (double) 10.0f, false);
        double double15 = range8.getLowerBound();
        boolean boolean18 = range8.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) (byte) -1, (double) (byte) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range21, 32.0d);
        double double24 = range21.getCentralValue();
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range8, range21);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range2, range8);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        java.lang.String str23 = range18.toString();
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range18, 5.5d, false);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range18, 743473.0d);
        boolean boolean31 = range28.intersects(199.0d, 91.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Range[99.0,-10.0]" + "'", str23, "Range[99.0,-10.0]");
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jfree.data.Range range2 = new org.jfree.data.Range(45.0d, 101.0d);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, (-9.0d), true);
        double double8 = range4.getCentralValue();
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range4, (-1.0d), (-71.0d));
        double double13 = range4.constrain(100.0d);
        double double14 = range4.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.5d), (double) 100L);
        double double4 = range2.constrain(32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range49, 45.0d, false);
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range49, 55.0d);
        double double56 = range49.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 99.5d + "'", double56 == 99.5d);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        boolean boolean19 = range14.contains(18630.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (-799.0d));
        java.lang.String str7 = range6.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range6, 0.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range6, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[0.0,0.0]" + "'", str7, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (-799.0d));
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, (-1.0d), (double) (byte) 100);
        boolean boolean15 = range9.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range9, (-9.0d), (double) 100L);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range18, (double) 1);
        boolean boolean23 = range18.intersects((double) 100.0f, (double) (byte) 10);
        boolean boolean24 = range2.equals((java.lang.Object) 100.0f);
        org.jfree.data.Range range27 = new org.jfree.data.Range((-35.0d), (-0.5d));
        boolean boolean28 = range2.equals((java.lang.Object) range27);
        org.jfree.data.Range range31 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range31, (-1.0d), (double) (byte) 100);
        java.lang.String str35 = range34.toString();
        double double36 = range34.getLength();
        java.lang.Class<?> wildcardClass37 = range34.getClass();
        boolean boolean38 = range27.equals((java.lang.Object) range34);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Range[1.0,-899.0]" + "'", str35, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-900.0d) + "'", double36 == (-900.0d));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, (-9173.5d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 0L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (double) (byte) -1, true);
        boolean boolean13 = range11.contains(61.0d);
        double double15 = range11.constrain((double) 'a');
        java.lang.String str16 = range11.toString();
        double double18 = range11.constrain((-405.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 51.0d + "'", double15 == 51.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[-11.0,51.0]" + "'", str16, "Range[-11.0,51.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-11.0d) + "'", double18 == (-11.0d));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        double double8 = range5.getLowerBound();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range5, 17.5d);
        boolean boolean12 = range5.contains(72.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range5, 50.5d, 171.0d);
        double double16 = range15.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20025.0d + "'", double16 == 20025.0d);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        double double8 = range6.getLowerBound();
        double double9 = range6.getLowerBound();
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range6, (double) 0L, 91.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (double) (-1));
        boolean boolean16 = range12.contains(90.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range2, range12);
        org.jfree.data.Range range20 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean22 = range20.contains((double) 'a');
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range20, (double) (byte) 0);
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range20, (double) 0L);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range26, (double) (byte) -1, true);
        boolean boolean31 = range29.contains(61.0d);
        boolean boolean32 = range2.equals((java.lang.Object) 61.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-10.0d), false);
        org.jfree.data.Range range13 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean16 = range13.intersects((double) 100.0f, 90.0d);
        double double18 = range13.constrain((double) '#');
        boolean boolean19 = range10.equals((java.lang.Object) range13);
        java.lang.Class<?> wildcardClass20 = range13.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, (-9.0d), true);
        double double8 = range7.getLowerBound();
        boolean boolean11 = range7.intersects((double) (-1.0f), (double) 10.0f);
        double double12 = range7.getLowerBound();
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double16 = range15.getLength();
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range15, (-109.0d));
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, (-71.0d), (-828.0d));
        org.jfree.data.Range range24 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range24, (double) 10L);
        double double27 = range24.getLowerBound();
        double double28 = range24.getCentralValue();
        double double29 = range24.getCentralValue();
        org.jfree.data.Range range30 = org.jfree.data.Range.combine(range21, range24);
        boolean boolean31 = range7.equals((java.lang.Object) range24);
        java.lang.Class<?> wildcardClass32 = range7.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.5d) + "'", double28 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-0.5d) + "'", double29 == (-0.5d));
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range14.getCentralValue();
        boolean boolean18 = range14.intersects((double) (-1.0f), 5.5d);
        double double19 = range14.getUpperBound();
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (-1.0d), (double) (byte) 100);
        boolean boolean28 = range22.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range22, (-9.0d), (double) 100L);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, 5.5d);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range33, 5.5d, (double) 10.0f);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (double) (byte) 0, (double) 0.0f);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range36, (double) '#', true);
        double double44 = range42.constrain((double) (short) 0);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range14, range42);
        double double46 = range45.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 232.75d + "'", double15 == 232.75d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-9138.5d) + "'", double44 == (-9138.5d));
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 232.75d + "'", double46 == 232.75d);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) -1, 15.5d);
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-0.5d), false);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, (-1.0d), (double) (byte) 100);
        boolean boolean14 = range8.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range8, (-9.0d), (double) 100L);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range17, 5.5d);
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double23 = range22.getLength();
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range22, 1.0d, true);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (-10.0d));
        boolean boolean32 = range22.equals((java.lang.Object) range31);
        boolean boolean33 = range17.equals((java.lang.Object) range31);
        double double34 = range17.getCentralValue();
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range2, range17);
        double double36 = range2.getLength();
        java.lang.Class<?> wildcardClass37 = range2.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9.0d) + "'", double23 == (-9.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-485.0d) + "'", double34 == (-485.0d));
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 16.5d + "'", double36 == 16.5d);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-799.0d), (double) (short) 1);
        boolean boolean31 = range25.intersects(26.0d, 100.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-0.5d), (-71.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 100.0f, false);
        org.junit.Assert.assertNotNull(range5);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 45.0d, (double) '#');
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, (-1.0d), (double) (byte) 100);
        boolean boolean33 = range27.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range27, (-9.0d), (double) 100L);
        double double38 = range36.constrain(1.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range36, (double) (byte) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range36, (double) 'a');
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range24, range42);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range42, (-71.0d), true);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range42, 91.0d);
        double double50 = range48.constrain((-10.0d));
        java.lang.String str51 = range48.toString();
        org.jfree.data.Range range54 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range54, (double) 10L);
        double double57 = range54.getLowerBound();
        double double58 = range54.getCentralValue();
        org.jfree.data.Range range61 = org.jfree.data.Range.expand(range54, (-485.0d), (-449.0d));
        org.jfree.data.Range range64 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double65 = range64.getLength();
        org.jfree.data.Range range66 = org.jfree.data.Range.combine(range61, range64);
        java.lang.String str67 = range61.toString();
        org.jfree.data.Range range68 = org.jfree.data.Range.combine(range48, range61);
        java.lang.Class<?> wildcardClass69 = range61.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-899.0d) + "'", double38 == (-899.0d));
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-10.0d) + "'", double50 == (-10.0d));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Range[-71.0,97.0]" + "'", str51, "Range[-71.0,97.0]");
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-0.5d) + "'", double58 == (-0.5d));
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-9.0d) + "'", double65 == (-9.0d));
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Range[484.0,-449.0]" + "'", str67, "Range[484.0,-449.0]");
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, (double) (short) 100);
        org.jfree.data.Range range10 = org.jfree.data.Range.combine(range2, range9);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) 10L);
        java.lang.String str13 = range9.toString();
        double double14 = range9.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[10.0,100.0]" + "'", str13, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 55.0d + "'", double14 == 55.0d);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1L);
        java.lang.Class<?> wildcardClass18 = range17.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (byte) 0);
        double double13 = range8.getLength();
        boolean boolean15 = range8.contains((-2342.5d));
        boolean boolean17 = range8.equals((java.lang.Object) (-345.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.0d) + "'", double13 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        boolean boolean13 = range8.contains(91.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range8, (double) 'a');
        org.jfree.data.Range range18 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, (-1.0d), (double) (byte) 100);
        boolean boolean27 = range21.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range21, (-9.0d), (double) 100L);
        double double32 = range30.constrain(1.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range30, (double) (byte) 100);
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range30, (double) 'a');
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range30, (-1.0d), (-9.0d));
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range30, 0.0d, true);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range18, range42);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range43, 55.0d, 37289.0d);
        org.jfree.data.Range range47 = org.jfree.data.Range.combine(range15, range43);
        org.jfree.data.Range range49 = org.jfree.data.Range.expandToInclude(range43, (-83.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-899.0d) + "'", double32 == (-899.0d));
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range49);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double14 = range11.constrain((double) (-1));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, 5548.0d);
        double double18 = range16.constrain(2827.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5548.0d + "'", double18 == 5548.0d);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-10.0d), false);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, 0.0d, 91.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, 16.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 45.0d, (double) '#');
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, (-1.0d), (double) (byte) 100);
        boolean boolean33 = range27.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range27, (-9.0d), (double) 100L);
        double double38 = range36.constrain(1.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range36, (double) (byte) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range36, (double) 'a');
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range24, range42);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range42, (-71.0d), true);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range42, 91.0d);
        org.jfree.data.Range range50 = org.jfree.data.Range.shift(range42, 107.25d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-899.0d) + "'", double38 == (-899.0d));
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range50);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, 45.0d, true);
        boolean boolean11 = range5.intersects(10989.0d, (double) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range5, (double) (byte) -1, true);
        double double15 = range5.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        boolean boolean9 = range2.contains((double) (byte) 0);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range2, (double) (byte) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, (-4050.0d), 16.5d);
        double double16 = range2.constrain(107.25d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (-449.0d), true);
        org.jfree.data.Range range12 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range18, (-10.0d));
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range15, range18);
        boolean boolean23 = range18.contains(91.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range18, (double) 'a');
        boolean boolean28 = range25.intersects((-899.0d), (double) (byte) -1);
        boolean boolean29 = range9.equals((java.lang.Object) range25);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range14.getCentralValue();
        boolean boolean18 = range14.intersects(100.0d, (double) (byte) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range14, (-799.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-828.0d), 2.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range14, (double) (-1L), true);
        double double27 = range14.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 21871.0d + "'", double15 == 21871.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 6553.0d + "'", double27 == 6553.0d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jfree.data.Range range2 = new org.jfree.data.Range(484.0d, (double) (byte) 100);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, (-414.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-71.0d), (-828.0d));
        org.jfree.data.Range range11 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, (double) 10L);
        boolean boolean14 = range8.equals((java.lang.Object) range11);
        java.lang.Class<?> wildcardClass15 = range8.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 100);
        java.lang.String str5 = range4.toString();
        java.lang.Class<?> wildcardClass6 = range4.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Range[110.0,110.0]" + "'", str5, "Range[110.0,110.0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        java.lang.String str13 = range8.toString();
        double double14 = range8.getUpperBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range8, (double) 1L);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range19, (-10.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, (double) 0);
        double double24 = range21.getLength();
        boolean boolean27 = range21.intersects((-899.0d), 90.0d);
        java.lang.String str28 = range21.toString();
        boolean boolean30 = range21.equals((java.lang.Object) 10.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range8, range21);
        double double33 = range8.constrain((-10.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 90.0d + "'", double24 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Range[0.0,90.0]" + "'", str28, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 20.0d + "'", double33 == 20.0d);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        double double10 = range5.getLowerBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range13, 1.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range5, range13);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range5, (-10.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range5, 50.5d, (double) (short) 100);
        double double24 = range5.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, (-9.0d), true);
        double double8 = range4.getCentralValue();
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range4, (-1.0d), (-71.0d));
        boolean boolean13 = range11.contains(55.0d);
        double double14 = range11.getCentralValue();
        double double16 = range11.constrain(11045.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-345.0d) + "'", double14 == (-345.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-700.0d) + "'", double16 == (-700.0d));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        java.lang.String str15 = range14.toString();
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double19 = range18.getLength();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range18, 1.0d, true);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (-10.0d));
        boolean boolean28 = range18.equals((java.lang.Object) range27);
        double double29 = range27.getCentralValue();
        org.jfree.data.Range range30 = org.jfree.data.Range.combine(range14, range27);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, 45.0d, (double) '#');
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (-1.0d), (double) (byte) 100);
        boolean boolean42 = range36.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range45 = org.jfree.data.Range.expand(range36, (-9.0d), (double) 100L);
        double double47 = range45.constrain(1.0d);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range45, (double) (byte) 100);
        org.jfree.data.Range range51 = org.jfree.data.Range.expandToInclude(range45, (double) 'a');
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range33, range51);
        org.jfree.data.Range range55 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double56 = range55.getCentralValue();
        org.jfree.data.Range range59 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double60 = range59.getLength();
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range59, (double) (short) 100);
        org.jfree.data.Range range63 = org.jfree.data.Range.combine(range55, range62);
        org.jfree.data.Range range65 = org.jfree.data.Range.shift(range62, (double) 10L);
        java.lang.String str66 = range62.toString();
        org.jfree.data.Range range67 = org.jfree.data.Range.combine(range33, range62);
        org.jfree.data.Range range68 = org.jfree.data.Range.combine(range4, range67);
        boolean boolean71 = range67.intersects(110.0d, 50.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Range[1.0,-899.0]" + "'", str15, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9.0d) + "'", double19 == (-9.0d));
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 45.0d + "'", double29 == 45.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-899.0d) + "'", double47 == (-899.0d));
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-0.5d) + "'", double56 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-9.0d) + "'", double60 == (-9.0d));
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Range[10.0,100.0]" + "'", str66, "Range[10.0,100.0]");
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range14.getCentralValue();
        boolean boolean18 = range14.intersects((double) (-1.0f), 5.5d);
        double double19 = range14.getUpperBound();
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (-1.0d), (double) (byte) 100);
        boolean boolean28 = range22.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range22, (-9.0d), (double) 100L);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, 5.5d);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range33, 5.5d, (double) 10.0f);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (double) (byte) 0, (double) 0.0f);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range36, (double) '#', true);
        double double44 = range42.constrain((double) (short) 0);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range14, range42);
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range42, (-10.0d), false);
        boolean boolean50 = range42.contains(86.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 232.75d + "'", double15 == 232.75d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-9138.5d) + "'", double44 == (-9138.5d));
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getUpperBound();
        boolean boolean15 = range11.contains((double) (-1.0f));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range11, 20.0d, false);
        boolean boolean21 = range11.intersects((double) (short) 1, 37189.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jfree.data.Range range2 = new org.jfree.data.Range(35.0d, 18605.0d);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 100, 11.0d);
        boolean boolean4 = range2.contains((double) 100.0f);
        org.jfree.data.Range range7 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double8 = range7.getCentralValue();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, 1.0d, true);
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range7, range15);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range15, 10984.5d);
        boolean boolean19 = range2.equals((java.lang.Object) 10984.5d);
        double double21 = range2.constrain((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.5d) + "'", double8 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0, (double) 0);
        boolean boolean5 = range2.intersects((double) (short) 1, 0.0d);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, 83849.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, 5.5d);
        boolean boolean30 = range26.equals((java.lang.Object) 171.0d);
        boolean boolean33 = range26.intersects((-893.5d), (double) 100L);
        double double35 = range26.constrain(1.0d);
        boolean boolean36 = range20.equals((java.lang.Object) range26);
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range20, (-9.0d));
        java.lang.String str39 = range20.toString();
        double double40 = range20.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Range[-70.0,-898.0]" + "'", str39, "Range[-70.0,-898.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-484.0d) + "'", double40 == (-484.0d));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (-109.0d));
        double double3 = range2.getUpperBound();
        boolean boolean5 = range2.contains(21871.0d);
        org.junit.Assert.assertNotNull(range2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-109.0d) + "'", double3 == (-109.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range2.getLength();
        boolean boolean18 = range2.intersects(6109.5d, 20.0d);
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range2, 0.0d, true);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9.0d) + "'", double15 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-35.5d), 107.25d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        double double8 = range7.getLength();
        double double9 = range7.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        double double23 = range22.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range22, (-1.0d));
        java.lang.Class<?> wildcardClass26 = range25.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 61.0d + "'", double23 == 61.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        double double9 = range4.getUpperBound();
        double double10 = range4.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        boolean boolean6 = range2.intersects((-9.0d), (double) ' ');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 21871.0d, false);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (-485.0d), 168.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range49, 45.0d, false);
        org.jfree.data.Range range56 = new org.jfree.data.Range(37289.0d, 272.5d);
        boolean boolean57 = range49.equals((java.lang.Object) 37289.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getUpperBound();
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range11, 17.5d);
        boolean boolean18 = range11.intersects((-3240.5d), (-83.5d));
        double double20 = range11.constrain((-9929.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, (-900.0d));
        double double5 = range4.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-450.0d) + "'", double5 == (-450.0d));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range2, 37189.0d);
        double double11 = range9.constrain(20025.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20025.0d + "'", double11 == 20025.0d);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-35.5d), (-37118.0d));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, (-1.0d), (double) (byte) 100);
        boolean boolean13 = range7.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range7, (-9.0d), (double) 100L);
        double double18 = range16.constrain(1.0d);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range16, (double) (byte) 100);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range16, (double) 'a');
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-1.0d), (-9.0d));
        boolean boolean26 = range2.equals((java.lang.Object) range16);
        java.lang.String str27 = range2.toString();
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, (double) (byte) -1);
        org.jfree.data.Range range38 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range38, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range44 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range44, (-10.0d));
        org.jfree.data.Range range47 = org.jfree.data.Range.combine(range41, range44);
        org.jfree.data.Range range50 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range50, (-10.0d));
        org.jfree.data.Range range53 = org.jfree.data.Range.combine(range41, range50);
        org.jfree.data.Range range55 = org.jfree.data.Range.expandToInclude(range53, (-828.0d));
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range33, range55);
        boolean boolean59 = range56.intersects(90.0d, (double) (byte) 10);
        org.jfree.data.Range range60 = null;
        org.jfree.data.Range range61 = org.jfree.data.Range.combine(range56, range60);
        boolean boolean62 = range2.equals((java.lang.Object) range56);
        double double63 = range2.getLength();
        boolean boolean66 = range2.intersects(5549.5d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-899.0d) + "'", double18 == (-899.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Range[0.0,0.0]" + "'", str27, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range18 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean19 = range11.equals((java.lang.Object) (-10.0d));
        double double20 = range11.getCentralValue();
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double24 = range23.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range23, 1.0d, true);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (-10.0d));
        boolean boolean33 = range23.equals((java.lang.Object) range32);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range11, range32);
        double double35 = range11.getLowerBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range11, 18630.0d, false);
        java.lang.String str39 = range38.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-485.0d) + "'", double20 == (-485.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9.0d) + "'", double24 == (-9.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-71.0d) + "'", double35 == (-71.0d));
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Range[0.0,0.0]" + "'", str39, "Range[0.0,0.0]");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        boolean boolean16 = range11.contains((double) 0L);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double20 = range19.getLength();
        double double21 = range19.getLowerBound();
        double double22 = range19.getLowerBound();
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range19, (double) 0L, 91.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range19);
        java.lang.String str27 = range26.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9.0d) + "'", double20 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Range[-71.0,1.0]" + "'", str27, "Range[-71.0,1.0]");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        double double9 = range7.constrain((double) 10);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range7, 0.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (double) (-1.0f), 10999.0d);
        org.jfree.data.Range range17 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range17, (double) 10L);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range19, (-9.0d), true);
        double double23 = range19.getCentralValue();
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range19, (-1.0d), (-71.0d));
        boolean boolean27 = range11.equals((java.lang.Object) range19);
        double double28 = range19.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 5.0d + "'", double23 == 5.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 5.0d);
        boolean boolean5 = range2.intersects(15.5d, 10612.5d);
        double double7 = range2.constrain(11.5d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range6, (-13662.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, 10.0d, 32.0d);
        double double12 = range11.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 587466.0d + "'", double12 == 587466.0d);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-799.0d), (-893.5d));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1100799.0d), (-37118.0d));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jfree.data.Range range2 = new org.jfree.data.Range(10999.0d, (double) 100.0f);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10.0f);
        boolean boolean6 = range2.contains((-449.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, 99.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range2, 21871.0d);
        boolean boolean12 = range2.contains((-450.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 5.5d, (double) 10.0f);
        double double17 = range16.getLength();
        double double18 = range16.getCentralValue();
        double double19 = range16.getUpperBound();
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range16, 168.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-13662.0d) + "'", double17 == (-13662.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2342.5d) + "'", double18 == (-2342.5d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9173.5d) + "'", double19 == (-9173.5d));
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) -1, (double) (byte) -1);
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, 32.0d);
        double double5 = range2.getCentralValue();
        java.lang.Class<?> wildcardClass6 = range2.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, (-9.0d), true);
        double double8 = range4.getCentralValue();
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range4, (-1.0d), (-71.0d));
        double double12 = range11.getLowerBound();
        java.lang.Class<?> wildcardClass13 = range11.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        boolean boolean6 = range2.intersects((-9.0d), (double) ' ');
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 1L);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, 5.90028264E8d, (-1560023.25d));
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 71.0d, (-9173.5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        boolean boolean20 = range11.intersects(1.0d, (double) (-1));
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range11, (-485.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range11, (double) 0L, false);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        boolean boolean10 = range4.contains((-109.0d));
        boolean boolean13 = range4.intersects(168.0d, (-828.0d));
        double double14 = range4.getUpperBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 90.0d + "'", double14 == 90.0d);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        double double3 = range2.getUpperBound();
        boolean boolean6 = range2.intersects(37189.0d, 4523.5d);
        double double7 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 55.0d + "'", double7 == 55.0d);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range18, 100.0d, (-0.5d));
        java.lang.String str39 = range38.toString();
        double double40 = range38.getLowerBound();
        org.jfree.data.Range range43 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range43, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range43, (double) 10.0f, false);
        boolean boolean51 = range49.contains((double) 1L);
        double double52 = range49.getUpperBound();
        org.jfree.data.Range range53 = org.jfree.data.Range.combine(range38, range49);
        double double54 = range53.getLowerBound();
        org.jfree.data.Range range57 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range60 = org.jfree.data.Range.expand(range57, (-1.0d), (double) (byte) 100);
        boolean boolean63 = range57.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range66 = org.jfree.data.Range.expand(range57, (-9.0d), (double) 100L);
        org.jfree.data.Range range68 = org.jfree.data.Range.shift(range66, 5.5d);
        org.jfree.data.Range range71 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double72 = range71.getLength();
        org.jfree.data.Range range75 = org.jfree.data.Range.shift(range71, 1.0d, true);
        org.jfree.data.Range range78 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range80 = org.jfree.data.Range.shift(range78, (-10.0d));
        boolean boolean81 = range71.equals((java.lang.Object) range80);
        boolean boolean82 = range66.equals((java.lang.Object) range80);
        boolean boolean84 = range80.contains(20.0d);
        org.jfree.data.Range range85 = org.jfree.data.Range.combine(range53, range80);
        double double86 = range80.getUpperBound();
        org.jfree.data.Range range88 = org.jfree.data.Range.expandToInclude(range80, (-20.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Range[10999.0,44.5]" + "'", str39, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10999.0d + "'", double40 == 10999.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 11.0d + "'", double52 == 11.0d);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 20.0d + "'", double54 == 20.0d);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-9.0d) + "'", double72 == (-9.0d));
        org.junit.Assert.assertNotNull(range75);
        org.junit.Assert.assertNotNull(range80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(range85);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 90.0d + "'", double86 == 90.0d);
        org.junit.Assert.assertNotNull(range88);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        double double15 = range11.constrain(6108.5d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range11, 83849.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 90.0d + "'", double15 == 90.0d);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (double) 100.0f);
        java.lang.String str15 = range14.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Range[100.0,190.0]" + "'", str15, "Range[100.0,190.0]");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        double double6 = range2.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-9.0d), (-898.0d));
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range2, range10);
        double double12 = range11.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jfree.data.Range range2 = new org.jfree.data.Range(20.0d, (-0.5d));
        boolean boolean5 = range2.intersects(11019.5d, (-101.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, (-9.0d), true);
        double double8 = range4.getCentralValue();
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range4, (-1.0d), (-71.0d));
        double double12 = range4.getUpperBound();
        java.lang.String str13 = range4.toString();
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range4, (double) (short) 1, 100.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[0.0,10.0]" + "'", str13, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, 90.0d, false);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) 100.0f);
        double double9 = range2.getCentralValue();
        java.lang.String str10 = range2.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 55.0d + "'", double9 == 55.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[10.0,100.0]" + "'", str10, "Range[10.0,100.0]");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        double double10 = range5.getLowerBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range13, 1.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range5, range13);
        double double19 = range18.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.5d + "'", double19 == 50.5d);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        boolean boolean8 = range4.contains((double) (short) 10);
        org.jfree.data.Range range9 = null;
        org.jfree.data.Range range12 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, (-1.0d), (double) (byte) 100);
        boolean boolean18 = range12.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range12, (-9.0d), (double) 100L);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, 5.5d);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, 5.5d, (double) 10.0f);
        boolean boolean28 = range23.contains((double) (byte) -1);
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range9, range23);
        org.jfree.data.Range range30 = org.jfree.data.Range.combine(range4, range23);
        double double32 = range4.constrain((double) 0);
        double double34 = range4.constrain(10.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jfree.data.Range range2 = new org.jfree.data.Range(5.5d, (double) 10.0f);
        boolean boolean4 = range2.contains(10.0d);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, (double) 1, (double) 1.0f);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, 37289.0d, (-71.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double3 = range2.getUpperBound();
        double double5 = range2.constrain(0.0d);
        boolean boolean7 = range2.contains(17.5d);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 45.5d, 272.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9.0d) + "'", double5 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range10);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        boolean boolean4 = range2.contains(494.0d);
        boolean boolean7 = range2.intersects(45.0d, 55.5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range6 = org.jfree.data.Range.expandToInclude(range4, (double) 'a');
        double double7 = range6.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range6, (-4914.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 48.5d + "'", double7 == 48.5d);
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range11.getLength();
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range11, (-900.0d), true);
        boolean boolean21 = range11.intersects(71.0d, (double) 10.0f);
        double double23 = range11.constrain(464.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-828.0d) + "'", double15 == (-828.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-899.0d) + "'", double23 == (-899.0d));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, 72.0d, (double) 10.0f);
        double double9 = range2.getUpperBound();
        double double10 = range2.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.5d) + "'", double10 == (-0.5d));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-71.0d), (-828.0d));
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (double) 0);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double14 = range13.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range13, 1.0d, true);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, (-10.0d));
        boolean boolean23 = range13.equals((java.lang.Object) range22);
        double double24 = range22.getCentralValue();
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range22, (double) 100L);
        double double27 = range22.getLength();
        boolean boolean29 = range22.contains(0.0d);
        boolean boolean30 = range8.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 45.0d + "'", double24 == 45.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 90.0d + "'", double27 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        double double22 = range18.getLength();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range18, 11044.5d);
        double double25 = range18.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 90.0d + "'", double22 == 90.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, (-4.0d));
        double double5 = range4.getUpperBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        boolean boolean10 = range4.contains((-109.0d));
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range4, (double) (short) -1, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 0.0d, (-1.0d));
        double double18 = range13.constrain((-109.0d));
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range13, 46.0d, 51.0d);
        double double22 = range21.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 360.0d + "'", double22 == 360.0d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean4 = range2.equals((java.lang.Object) 100L);
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, 10989.0d, (double) '#');
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (-400.5d), false);
        double double12 = range11.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2849.5d + "'", double12 == 2849.5d);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (-109.0d));
        double double3 = range2.getUpperBound();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) (byte) -1, (double) (byte) -1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range6, 32.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) (short) 100, 11.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.combine(range8, range11);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range11);
        double double14 = range11.getCentralValue();
        org.junit.Assert.assertNotNull(range2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-109.0d) + "'", double3 == (-109.0d));
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 55.5d + "'", double14 == 55.5d);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, (-818.0d));
        boolean boolean9 = range7.contains((double) 10.0f);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        boolean boolean20 = range11.intersects(1.0d, (double) (-1));
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range11, (-485.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range22, (-30636.0d), true);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range22, (-10.0d), (double) ' ');
        boolean boolean30 = range28.contains(2.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, (double) (short) 100);
        org.jfree.data.Range range10 = org.jfree.data.Range.combine(range2, range9);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) 10L);
        java.lang.String str13 = range9.toString();
        java.lang.String str14 = range9.toString();
        double double15 = range9.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[10.0,100.0]" + "'", str13, "Range[10.0,100.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Range[10.0,100.0]" + "'", str14, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 55.0d + "'", double15 == 55.0d);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        double double3 = range2.getLowerBound();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-449.0d));
        double double6 = range5.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range14.getCentralValue();
        double double16 = range14.getLowerBound();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range14, (double) (byte) 100, true);
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range14, (-942.0d));
        double double22 = range21.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 21871.0d + "'", double15 == 21871.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 37189.0d + "'", double16 == 37189.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-30636.0d) + "'", double22 == (-30636.0d));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        boolean boolean10 = range4.intersects((-899.0d), 90.0d);
        java.lang.String str11 = range4.toString();
        boolean boolean13 = range4.equals((java.lang.Object) 10.0d);
        double double14 = range4.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[0.0,90.0]" + "'", str11, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 90.0d + "'", double14 == 90.0d);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        java.lang.String str15 = range2.toString();
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range2, (double) (short) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range2, 13.0d);
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (-1.0d), (double) (byte) 100);
        boolean boolean28 = range22.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range22, (-9.0d), (double) 100L);
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range31, (double) 1);
        org.jfree.data.Range range36 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range36, (double) (byte) -1);
        boolean boolean41 = range38.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range42 = org.jfree.data.Range.combine(range31, range38);
        org.jfree.data.Range range45 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range45, (-1.0d), (double) (byte) 100);
        boolean boolean51 = range48.intersects((double) (byte) 10, 10.0d);
        boolean boolean52 = range38.equals((java.lang.Object) boolean51);
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range38, (double) (byte) 100, false);
        double double56 = range55.getUpperBound();
        org.jfree.data.Range range58 = org.jfree.data.Range.shift(range55, 20.0d);
        org.jfree.data.Range range61 = org.jfree.data.Range.expand(range58, (-4.0d), 15.5d);
        double double62 = range61.getCentralValue();
        org.jfree.data.Range range64 = org.jfree.data.Range.shift(range61, 464.5d);
        boolean boolean65 = range2.equals((java.lang.Object) 464.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Range[10.0,1.0]" + "'", str15, "Range[10.0,1.0]");
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1820.75d) + "'", double62 == (-1820.75d));
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jfree.data.Range range2 = new org.jfree.data.Range(26.0d, 52.0d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) (-1.0f));
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range7, 55.0d);
        boolean boolean12 = range9.intersects((-1.093143E7d), 0.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range18, 100.0d, (-0.5d));
        java.lang.String str39 = range38.toString();
        double double40 = range38.getLowerBound();
        org.jfree.data.Range range43 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range43, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range43, (double) 10.0f, false);
        boolean boolean51 = range49.contains((double) 1L);
        double double52 = range49.getUpperBound();
        org.jfree.data.Range range53 = org.jfree.data.Range.combine(range38, range49);
        org.jfree.data.Range range56 = org.jfree.data.Range.expand(range49, 1.0d, (double) 100);
        org.jfree.data.Range range59 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range62 = org.jfree.data.Range.expand(range59, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range65 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range67 = org.jfree.data.Range.shift(range65, (-10.0d));
        org.jfree.data.Range range68 = org.jfree.data.Range.combine(range62, range65);
        org.jfree.data.Range range71 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range73 = org.jfree.data.Range.shift(range71, (-10.0d));
        org.jfree.data.Range range74 = org.jfree.data.Range.combine(range62, range71);
        boolean boolean76 = range71.contains(6553.0d);
        boolean boolean77 = range56.equals((java.lang.Object) 6553.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Range[10999.0,44.5]" + "'", str39, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10999.0d + "'", double40 == 10999.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 11.0d + "'", double52 == 11.0d);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0, (double) 0);
        boolean boolean5 = range2.intersects((double) (short) 1, 0.0d);
        double double6 = range2.getLowerBound();
        java.lang.Class<?> wildcardClass7 = range2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 'a', 10999.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-4.0d), (-9.0d));
        double double6 = range5.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-130824.0d) + "'", double6 == (-130824.0d));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range14.getCentralValue();
        double double16 = range14.getLowerBound();
        double double17 = range14.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 232.75d + "'", double15 == 232.75d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 464.5d + "'", double16 == 464.5d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (-933.0d));
        double double12 = range2.getCentralValue();
        boolean boolean14 = range2.contains(100.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 45.5d + "'", double12 == 45.5d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jfree.data.Range range2 = new org.jfree.data.Range(55.0d, 50.5d);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double14 = range11.constrain((double) (-1));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, 5548.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range11, (-1.0931465E7d));
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, (double) 0, 332.75d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        java.lang.String str12 = range11.toString();
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        java.lang.String str16 = range15.toString();
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double20 = range19.getLength();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range19, (-109.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (-71.0d), (-828.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (double) 100L);
        double double28 = range27.getLength();
        double double30 = range27.constrain(50.5d);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range15, range27);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, (-449.0d));
        boolean boolean34 = range11.equals((java.lang.Object) (-449.0d));
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range11, 6108.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Range[1.0,100.0]" + "'", str12, "Range[1.0,100.0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[10.0,100.0]" + "'", str16, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9.0d) + "'", double20 == (-9.0d));
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(range36);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-0.5d), (-71.0d));
        double double4 = range2.constrain(110.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-71.0d) + "'", double4 == (-71.0d));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 0L, 91.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (double) (-1));
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, (-1.0d), (double) (byte) 100);
        boolean boolean19 = range13.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range13, (-9.0d), (double) 100L);
        double double24 = range22.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range22, (double) (byte) 100);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range22, (double) 'a');
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range22, (double) 1.0f, false);
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range37, 5.5d);
        boolean boolean41 = range37.equals((java.lang.Object) 171.0d);
        boolean boolean44 = range37.intersects((-893.5d), (double) 100L);
        double double46 = range37.constrain(1.0d);
        boolean boolean47 = range31.equals((java.lang.Object) range37);
        org.jfree.data.Range range50 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range53 = org.jfree.data.Range.expand(range50, (-1.0d), (double) (byte) 100);
        boolean boolean56 = range50.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range50, (-9.0d), (double) 100L);
        double double61 = range59.constrain(1.0d);
        org.jfree.data.Range range63 = org.jfree.data.Range.shift(range59, (double) (byte) 100);
        org.jfree.data.Range range65 = org.jfree.data.Range.expandToInclude(range59, (double) 'a');
        org.jfree.data.Range range68 = org.jfree.data.Range.expand(range59, (-1.0d), (-9.0d));
        org.jfree.data.Range range71 = org.jfree.data.Range.shift(range59, 0.0d, true);
        org.jfree.data.Range range73 = org.jfree.data.Range.expandToInclude(range59, (double) (short) 1);
        boolean boolean74 = range31.equals((java.lang.Object) range59);
        org.jfree.data.Range range77 = org.jfree.data.Range.shift(range31, (-2342.5d), true);
        double double79 = range77.constrain(100.0d);
        boolean boolean80 = range8.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-899.0d) + "'", double24 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-899.0d) + "'", double61 == (-899.0d));
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-3240.5d) + "'", double79 == (-3240.5d));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range15, (-799.0d));
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        double double21 = range20.getUpperBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range15, range20);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        double double36 = range34.constrain(1.0d);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range34, (double) (byte) 100);
        org.jfree.data.Range range40 = org.jfree.data.Range.expandToInclude(range34, (double) 'a');
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range34, (double) 1.0f, false);
        org.jfree.data.Range range46 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range49 = org.jfree.data.Range.expand(range46, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range51 = org.jfree.data.Range.shift(range49, 5.5d);
        boolean boolean53 = range49.equals((java.lang.Object) 171.0d);
        boolean boolean56 = range49.intersects((-893.5d), (double) 100L);
        double double58 = range49.constrain(1.0d);
        boolean boolean59 = range43.equals((java.lang.Object) range49);
        org.jfree.data.Range range62 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range65 = org.jfree.data.Range.expand(range62, (-1.0d), (double) (byte) 100);
        boolean boolean68 = range62.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range71 = org.jfree.data.Range.expand(range62, (-9.0d), (double) 100L);
        double double73 = range71.constrain(1.0d);
        org.jfree.data.Range range75 = org.jfree.data.Range.shift(range71, (double) (byte) 100);
        org.jfree.data.Range range77 = org.jfree.data.Range.expandToInclude(range71, (double) 'a');
        org.jfree.data.Range range80 = org.jfree.data.Range.expand(range71, (-1.0d), (-9.0d));
        org.jfree.data.Range range83 = org.jfree.data.Range.shift(range71, 0.0d, true);
        org.jfree.data.Range range85 = org.jfree.data.Range.expandToInclude(range71, (double) (short) 1);
        boolean boolean86 = range43.equals((java.lang.Object) range71);
        org.jfree.data.Range range89 = org.jfree.data.Range.expand(range43, (-822.5d), (-30636.0d));
        double double90 = range43.getLength();
        org.jfree.data.Range range91 = org.jfree.data.Range.combine(range15, range43);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-899.0d) + "'", double36 == (-899.0d));
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-899.0d) + "'", double73 == (-899.0d));
        org.junit.Assert.assertNotNull(range75);
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertNotNull(range80);
        org.junit.Assert.assertNotNull(range83);
        org.junit.Assert.assertNotNull(range85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(range89);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-828.0d) + "'", double90 == (-828.0d));
        org.junit.Assert.assertNotNull(range91);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-449.0d), (-101.0d));
        double double4 = range2.constrain(168.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-101.0d) + "'", double4 == (-101.0d));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        double double18 = range14.getLength();
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range14, (double) 100.0f, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range14, 50.5d, (double) (byte) 0);
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double28 = range27.getLength();
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range27, (-109.0d));
        double double31 = range27.getLength();
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range27, 35.0d, (-893.5d));
        boolean boolean35 = range24.equals((java.lang.Object) 35.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9.0d) + "'", double28 == (-9.0d));
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range14.getCentralValue();
        boolean boolean18 = range14.intersects((double) (-1.0f), 5.5d);
        double double19 = range14.getUpperBound();
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (-1.0d), (double) (byte) 100);
        boolean boolean28 = range22.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range22, (-9.0d), (double) 100L);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, 5.5d);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range33, 5.5d, (double) 10.0f);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (double) (byte) 0, (double) 0.0f);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range36, (double) '#', true);
        double double44 = range42.constrain((double) (short) 0);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range14, range42);
        double double46 = range14.getLength();
        org.jfree.data.Range range49 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double50 = range49.getCentralValue();
        org.jfree.data.Range range53 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double54 = range53.getLength();
        org.jfree.data.Range range56 = org.jfree.data.Range.expandToInclude(range53, (double) (short) 100);
        org.jfree.data.Range range57 = org.jfree.data.Range.combine(range49, range56);
        org.jfree.data.Range range60 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range62 = org.jfree.data.Range.shift(range60, (-10.0d));
        org.jfree.data.Range range64 = org.jfree.data.Range.shift(range62, (double) 0);
        double double65 = range62.getLength();
        boolean boolean68 = range62.intersects((-899.0d), 90.0d);
        java.lang.String str69 = range62.toString();
        boolean boolean71 = range62.contains((-828.0d));
        org.jfree.data.Range range72 = org.jfree.data.Range.combine(range57, range62);
        org.jfree.data.Range range74 = org.jfree.data.Range.shift(range62, 50.5d);
        boolean boolean77 = range74.intersects(6553.0d, (double) '#');
        org.jfree.data.Range range78 = org.jfree.data.Range.combine(range14, range74);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 232.75d + "'", double15 == 232.75d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-9138.5d) + "'", double44 == (-9138.5d));
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-463.5d) + "'", double46 == (-463.5d));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-0.5d) + "'", double50 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-9.0d) + "'", double54 == (-9.0d));
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 90.0d + "'", double65 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Range[0.0,90.0]" + "'", str69, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(range72);
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(range78);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jfree.data.Range range2 = new org.jfree.data.Range(171.0d, (-170.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-385.0d), true);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, (-1.0d), (double) (byte) 100);
        boolean boolean14 = range8.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range8, (-9.0d), (double) 100L);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (double) 1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, 15.5d, (-101.0d));
        boolean boolean23 = range2.equals((java.lang.Object) range22);
        java.lang.String str24 = range22.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Range[-1187.0,-7271.0]" + "'", str24, "Range[-1187.0,-7271.0]");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 0, 107.25d);
        double double3 = range2.getCentralValue();
        double double4 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 53.625d + "'", double3 == 53.625d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 107.25d + "'", double4 == 107.25d);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range15, (-799.0d));
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        double double21 = range20.getUpperBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range15, range20);
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range15, 44.5d);
        double double25 = range24.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) (byte) 100, (-900.0d));
        double double7 = range2.getLength();
        double double8 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean8 = range2.intersects((double) (byte) 0, (-899.0d));
        boolean boolean10 = range2.contains(45.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range2, 90.0d, (-1.5d));
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range2, (-1800.0d), 2827.0d);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range2, 91.0d, true);
        boolean boolean21 = range19.contains(44.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jfree.data.Range range2 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean5 = range2.intersects((double) 100.0f, 90.0d);
        double double7 = range2.constrain((double) '#');
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 52.0d, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-828.0d) + "'", double7 == (-828.0d));
        org.junit.Assert.assertNotNull(range10);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        double double7 = range6.getLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 62.0d + "'", double7 == 62.0d);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 1);
        boolean boolean27 = range25.contains(100.0d);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range30, (-109.0d));
        boolean boolean34 = range25.equals((java.lang.Object) range33);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range33, (-449.0d), false);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range37, 45.5d, false);
        java.lang.Class<?> wildcardClass41 = range37.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        java.lang.String str13 = range8.toString();
        double double14 = range8.getUpperBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range8, (double) 1L);
        double double17 = range8.getLowerBound();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range8, (double) (-1.0f));
        org.jfree.data.Range range22 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (double) (byte) -1);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range22, 10999.0d, true);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range22, 10999.0d);
        double double30 = range22.getLowerBound();
        boolean boolean31 = range19.equals((java.lang.Object) range22);
        java.lang.Class<?> wildcardClass32 = range19.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (-109.0d));
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range17, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range20, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range29, (-1.0d), (double) (byte) 100);
        boolean boolean35 = range29.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range29, (-9.0d), (double) 100L);
        double double40 = range38.constrain(1.0d);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range26, range38);
        boolean boolean42 = range14.equals((java.lang.Object) range26);
        boolean boolean44 = range26.contains((-485.0d));
        boolean boolean45 = range4.equals((java.lang.Object) (-485.0d));
        double double46 = range4.getCentralValue();
        double double47 = range4.getLength();
        org.jfree.data.Range range50 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range53 = org.jfree.data.Range.expand(range50, (-1.0d), (double) (byte) 100);
        boolean boolean56 = range50.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range50, (-9.0d), (double) 100L);
        org.jfree.data.Range range61 = org.jfree.data.Range.expandToInclude(range59, (double) 1);
        org.jfree.data.Range range64 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range64, (double) (byte) -1);
        boolean boolean69 = range66.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range70 = org.jfree.data.Range.combine(range59, range66);
        org.jfree.data.Range range73 = org.jfree.data.Range.shift(range59, (double) (short) -1, false);
        org.jfree.data.Range range76 = org.jfree.data.Range.shift(range59, (double) 100, true);
        org.jfree.data.Range range77 = org.jfree.data.Range.combine(range4, range76);
        java.lang.String str78 = range4.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-899.0d) + "'", double40 == (-899.0d));
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 44.5d + "'", double46 == 44.5d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-109.0d) + "'", double47 == (-109.0d));
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Range[99.0,-10.0]" + "'", str78, "Range[99.0,-10.0]");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        boolean boolean20 = range11.intersects(1.0d, (double) (-1));
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range11, (-485.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range22, (-30636.0d), true);
        double double26 = range25.getCentralValue();
        boolean boolean28 = range25.contains(0.0d);
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range25, 5548.0d);
        org.jfree.data.Range range31 = null;
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range40 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range40, (-10.0d));
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range37, range40);
        double double44 = range43.getLowerBound();
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range31, range43);
        org.jfree.data.Range range46 = org.jfree.data.Range.combine(range25, range31);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-31328.0d) + "'", double26 == (-31328.0d));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(range46);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getUpperBound();
        double double14 = range11.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        double double6 = range2.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-9.0d), (-898.0d));
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range14 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range17, 45.0d, true);
        org.jfree.data.Range range23 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean25 = range23.contains((double) 'a');
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range23, (double) (byte) 0);
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range20, range27);
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range2, range27);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        double double13 = range8.getLength();
        java.lang.String str14 = range8.toString();
        java.lang.Class<?> wildcardClass15 = range8.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.0d) + "'", double13 == (-9.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Range[20.0,11.0]" + "'", str14, "Range[20.0,11.0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) 0);
        boolean boolean8 = range2.intersects(35.0d, (-109.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (-109.0d));
        double double3 = range2.getUpperBound();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) (byte) -1, (double) (byte) -1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range6, 32.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) (short) 100, 11.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.combine(range8, range11);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range11);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range2, 172.0d, (-450.0d));
        org.junit.Assert.assertNotNull(range2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-109.0d) + "'", double3 == (-109.0d));
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range9, (double) (-1), 13.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) (byte) 100);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, (-1.0d), (double) (byte) 100);
        boolean boolean26 = range20.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range20, (-9.0d), (double) 100L);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range29, 45.0d, (-9.0d));
        double double33 = range32.getUpperBound();
        java.lang.Object obj34 = null;
        boolean boolean35 = range32.equals(obj34);
        double double36 = range32.getUpperBound();
        org.jfree.data.Range range37 = org.jfree.data.Range.combine(range17, range32);
        double double38 = range17.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 6553.0d + "'", double33 == 6553.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 6553.0d + "'", double36 == 6553.0d);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jfree.data.Range range2 = new org.jfree.data.Range(5.0d, 0.0d);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.data.Range range2 = new org.jfree.data.Range(928.0d, 83849.0d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-9138.5d), (-449.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, (-170.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, 0.0d, false);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-10.0d), false);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, 107.25d, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range10, 6553.0d, 0.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range10, (-942.0d));
        double double19 = range10.getUpperBound();
        java.lang.Class<?> wildcardClass20 = range10.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        double double9 = range2.getLowerBound();
        double double10 = range2.getCentralValue();
        double double11 = range2.getLength();
        boolean boolean14 = range2.intersects(199.0d, 1.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range2, 496485.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.5d + "'", double10 == 5.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        double double9 = range7.constrain((double) 10);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range7, 0.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (double) (-1.0f), 10999.0d);
        double double15 = range14.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 121000.0d + "'", double15 == 121000.0d);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.data.Range range2 = new org.jfree.data.Range(272.5d, 18595.0d);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        org.jfree.data.Range range19 = org.jfree.data.Range.combine(range13, range16);
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (-10.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range13, range22);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (-828.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range5, range27);
        double double30 = range28.constrain((double) (short) 100);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range28, (double) 10L, true);
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double37 = range36.getLength();
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range36, (-109.0d));
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range36, (double) 100.0f);
        double double42 = range36.getCentralValue();
        boolean boolean43 = range33.equals((java.lang.Object) double42);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-9.0d) + "'", double37 == (-9.0d));
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 5.5d + "'", double42 == 5.5d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 0L, 91.0d);
        double double10 = range2.constrain(484.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, (double) (short) 100);
        org.jfree.data.Range range10 = org.jfree.data.Range.combine(range2, range9);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) 0);
        double double18 = range15.getLength();
        boolean boolean21 = range15.intersects((-899.0d), 90.0d);
        java.lang.String str22 = range15.toString();
        boolean boolean24 = range15.contains((-828.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range10, range15);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range15, 50.5d);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, (-4050.0d), (-26442.5d));
        org.jfree.data.Range range33 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range33, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range36, 0.0d, true);
        boolean boolean42 = range36.intersects((double) 'a', 0.0d);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range27, range36);
        double double44 = range43.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Range[0.0,90.0]" + "'", str22, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 65.75d + "'", double44 == 65.75d);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range49, 45.0d, false);
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range49, 55.0d);
        double double56 = range49.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 199.0d + "'", double56 == 199.0d);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        double double21 = range20.getLowerBound();
        java.lang.String str22 = range20.toString();
        double double23 = range20.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range20, (double) (byte) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.5d), (-27.75d));
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range25, (-899.0d), (-942.0d));
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range25, 101.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-71.0d) + "'", double21 == (-71.0d));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Range[-71.0,0.0]" + "'", str22, "Range[-71.0,0.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 71.0d + "'", double23 == 71.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) '#');
        org.jfree.data.Range range10 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range10, (double) (byte) -1);
        boolean boolean15 = range12.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range12, (double) 0.0f);
        boolean boolean19 = range17.contains(15.5d);
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range7, range17);
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range2, range17);
        double double23 = range21.constrain(742645.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9.0d) + "'", double23 == (-9.0d));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        double double7 = range4.getCentralValue();
        double double8 = range4.getLowerBound();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        boolean boolean17 = range11.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-9.0d), (double) 100L);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range20, (double) 1);
        boolean boolean24 = range20.equals((java.lang.Object) '4');
        double double25 = range20.getLowerBound();
        boolean boolean28 = range20.intersects((double) 100.0f, (-71.0d));
        double double29 = range20.getUpperBound();
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range20, (double) 10L);
        double double33 = range20.constrain((-933.0d));
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range4, range20);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 44.5d + "'", double7 == 44.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 99.0d + "'", double8 == 99.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-71.0d) + "'", double25 == (-71.0d));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-899.0d) + "'", double29 == (-899.0d));
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-71.0d) + "'", double33 == (-71.0d));
        org.junit.Assert.assertNotNull(range34);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double11 = range8.getCentralValue();
        boolean boolean13 = range8.contains((-9929.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range8, 107.25d, false);
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range8, (-10.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.5d + "'", double11 == 15.5d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        boolean boolean10 = range4.intersects((-899.0d), 90.0d);
        java.lang.String str11 = range4.toString();
        boolean boolean13 = range4.equals((java.lang.Object) 10.0d);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        org.jfree.data.Range range21 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double22 = range21.getUpperBound();
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range16, range21);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range23, (double) (-1), false);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double30 = range29.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range29, 1.0d, true);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range23, range33);
        org.jfree.data.Range range37 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range37, (double) 10L);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range34, range37);
        boolean boolean41 = range4.equals((java.lang.Object) range40);
        double double43 = range40.constrain((double) 'a');
        java.lang.Class<?> wildcardClass44 = range40.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[0.0,90.0]" + "'", str11, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9.0d) + "'", double22 == (-9.0d));
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-9.0d) + "'", double30 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2.0d + "'", double43 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        double double18 = range14.getLength();
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range14, (double) 100.0f, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range14, 50.5d, (double) (byte) 0);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range14, 10.0d);
        double double27 = range14.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 90.0d + "'", double27 == 90.0d);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range53, (double) 10L);
        org.jfree.data.Range range58 = org.jfree.data.Range.expand(range53, 44.5d, (-799.0d));
        boolean boolean59 = range2.equals((java.lang.Object) range58);
        org.jfree.data.Range range61 = org.jfree.data.Range.expandToInclude(range2, (-41.0d));
        java.lang.Class<?> wildcardClass62 = range61.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.data.Range range2 = new org.jfree.data.Range(172.0d, 71.0d);
        boolean boolean4 = range2.contains((-13733.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        double double12 = range8.getLength();
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (-10.0d));
        boolean boolean20 = range15.intersects((double) 1, (double) 10L);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (-10.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range26, range29);
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range15, range26);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range8, range15);
        boolean boolean36 = range15.contains((-385.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.0d + "'", double12 == 90.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, (double) (short) 100);
        org.jfree.data.Range range10 = org.jfree.data.Range.combine(range2, range9);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) 0);
        double double18 = range15.getLength();
        boolean boolean21 = range15.intersects((-899.0d), 90.0d);
        java.lang.String str22 = range15.toString();
        boolean boolean24 = range15.contains((-828.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range10, range15);
        java.lang.Class<?> wildcardClass26 = range10.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Range[0.0,90.0]" + "'", str22, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        double double22 = range21.getLowerBound();
        double double23 = range21.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 90.0d + "'", double23 == 90.0d);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) -1, (-9.0d));
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range2, 0.0d, false);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, (-900.0d), true);
        boolean boolean58 = range53.contains((-0.5d));
        org.jfree.data.Range range61 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range63 = org.jfree.data.Range.shift(range61, (double) 10L);
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range63, (-9.0d), true);
        double double67 = range63.getCentralValue();
        org.jfree.data.Range range68 = org.jfree.data.Range.combine(range53, range63);
        double double69 = range68.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 5.0d + "'", double67 == 5.0d);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        boolean boolean17 = range11.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-9.0d), (double) 100L);
        double double22 = range20.constrain(1.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range20, (double) (byte) 100);
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range4, range20);
        boolean boolean28 = range4.intersects((-828.0d), (double) (-1L));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-899.0d) + "'", double22 == (-899.0d));
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        boolean boolean6 = range2.intersects((-9.0d), (double) ' ');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 21871.0d, false);
        java.lang.String str10 = range9.toString();
        double double11 = range9.getCentralValue();
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range14, (-109.0d));
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range14, (double) 100.0f);
        boolean boolean20 = range9.equals((java.lang.Object) range14);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[21871.0,21871.0]" + "'", str10, "Range[21871.0,21871.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 21871.0d + "'", double11 == 21871.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9.0d) + "'", double15 == (-9.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jfree.data.Range range2 = new org.jfree.data.Range(484.0d, (-26442.5d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (short) 0, 21871.0d);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range11, (-13733.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 100.0f, 11.0d);
        double double4 = range2.constrain(72.0d);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, (double) 1L, 55.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, (-345.0d), 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 11.0d + "'", double4 == 11.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        double double9 = range7.constrain((double) 10);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range7, 0.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (double) (-1.0f), 10999.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range11, (-30636.0d));
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double20 = range19.getLength();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range19, (double) 'a');
        boolean boolean25 = range19.intersects((double) (byte) 0, (-899.0d));
        boolean boolean27 = range19.contains(45.0d);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range19, 90.0d, (-1.5d));
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range19, (-1800.0d), 2827.0d);
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range19, 91.0d, true);
        org.jfree.data.Range range37 = org.jfree.data.Range.combine(range11, range36);
        double double38 = range11.getUpperBound();
        boolean boolean40 = range11.contains(2.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9.0d) + "'", double20 == (-9.0d));
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 11.0d + "'", double38 == 11.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jfree.data.Range range2 = new org.jfree.data.Range(55.0d, 6108.5d);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-13662.0d), (-405.0d));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        double double21 = range20.getLowerBound();
        java.lang.String str22 = range20.toString();
        double double23 = range20.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range20, (double) (byte) 1);
        double double27 = range20.constrain((-9.0d));
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, (-1.0d), (double) (byte) 100);
        boolean boolean36 = range30.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range30, (-9.0d), (double) 100L);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range39, 5.5d);
        double double42 = range41.getUpperBound();
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range41, 10.0d);
        boolean boolean45 = range20.equals((java.lang.Object) range41);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-71.0d) + "'", double21 == (-71.0d));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Range[-71.0,0.0]" + "'", str22, "Range[-71.0,0.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 71.0d + "'", double23 == 71.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-9.0d) + "'", double27 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-893.5d) + "'", double42 == (-893.5d));
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        double double36 = range35.getUpperBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range35, 20.0d);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range38, (-4.0d), 15.5d);
        double double43 = range41.constrain((double) (-1));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-3064.5d) + "'", double43 == (-3064.5d));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jfree.data.Range range2 = new org.jfree.data.Range(171.0d, 742645.0d);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        boolean boolean9 = range2.contains((double) (byte) 0);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, 99.0d, 44.5d);
        double double13 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        double double23 = range22.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range22, (double) 1L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range22, (-1560023.25d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 61.0d + "'", double23 == 61.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getUpperBound();
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range11, 17.5d);
        double double16 = range15.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        java.lang.String str19 = range11.toString();
        org.jfree.data.Range range22 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean24 = range22.contains((double) 'a');
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range22, (double) (byte) 0);
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range22, (double) 0L);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range28, (double) (byte) -1, true);
        boolean boolean32 = range11.equals((java.lang.Object) (byte) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range11, (double) (byte) -1);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[-71.0,-899.0]" + "'", str19, "Range[-71.0,-899.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range34);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jfree.data.Range range2 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean5 = range2.intersects((double) 100.0f, 90.0d);
        double double7 = range2.constrain(0.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 50.5d, 10974.5d);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, (-35.0d), false);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, (-4914.0d));
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, (-1.0d), (double) (byte) 100);
        boolean boolean24 = range18.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range18, (-9.0d), (double) 100L);
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range27, (double) 1);
        org.jfree.data.Range range32 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range32, (double) (byte) -1);
        boolean boolean37 = range34.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range38 = org.jfree.data.Range.combine(range27, range34);
        org.jfree.data.Range range41 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range41, (-1.0d), (double) (byte) 100);
        boolean boolean47 = range44.intersects((double) (byte) 10, 10.0d);
        boolean boolean48 = range34.equals((java.lang.Object) boolean47);
        org.jfree.data.Range range51 = org.jfree.data.Range.shift(range34, (double) (byte) 100, false);
        boolean boolean52 = range15.equals((java.lang.Object) range51);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-828.0d) + "'", double7 == (-828.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jfree.data.Range range2 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.0d), (double) (byte) 100);
        boolean boolean11 = range5.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range5, (-9.0d), (double) 100L);
        double double16 = range14.constrain(1.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range14, (double) (byte) 100);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range14, (double) 'a');
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-1.0d), (-9.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range14, 0.0d, true);
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range2, range26);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double31 = range30.getLength();
        double double32 = range30.getLowerBound();
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range27, range30);
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range30, (-822.5d));
        java.lang.Class<?> wildcardClass36 = range30.getClass();
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-899.0d) + "'", double16 == (-899.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range6 = org.jfree.data.Range.expandToInclude(range4, (double) 'a');
        double double7 = range4.getCentralValue();
        java.lang.String str8 = range4.toString();
        double double9 = range4.getLowerBound();
        boolean boolean12 = range4.intersects((-0.5d), 464.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[0.0,10.0]" + "'", str8, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, 90.0d, false);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) 100.0f);
        java.lang.Class<?> wildcardClass9 = range2.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 'a', 10999.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-4.0d), (-9.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, (-449.0d));
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 1.0f, (-899.0d));
        double double12 = range10.constrain(15.5d);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range10, 6553.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range10, (double) (-1L), false);
        boolean boolean18 = range2.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-899.0d) + "'", double12 == (-899.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range10, range13);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (-1.0d), (double) (byte) 100);
        boolean boolean25 = range19.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range19, (-9.0d), (double) 100L);
        double double30 = range28.constrain(1.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range16, range28);
        boolean boolean32 = range2.equals((java.lang.Object) range31);
        double double33 = range2.getUpperBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-899.0d) + "'", double30 == (-899.0d));
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        double double7 = range5.getLength();
        double double8 = range5.getCentralValue();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range5, 11044.5d);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range10, 86.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-900.0d) + "'", double7 == (-900.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-449.0d) + "'", double8 == (-449.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, 45.0d, true);
        boolean boolean11 = range5.intersects(10989.0d, (double) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range5, 4488.5d, true);
        boolean boolean17 = range14.intersects((double) 0, 26.0d);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range14, 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        double double10 = range7.getLowerBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) (byte) -1);
        double double19 = range16.getLowerBound();
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range16, 17.5d);
        boolean boolean23 = range16.contains(72.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range16, 50.5d, 171.0d);
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range7, range26);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) (byte) 0, 18595.0d);
        boolean boolean31 = range7.equals((java.lang.Object) 18595.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        double double27 = range11.getCentralValue();
        double double28 = range11.getUpperBound();
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range11, 0.0d, 0.0d);
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range34, (double) 100);
        double double37 = range36.getLowerBound();
        org.jfree.data.Range range39 = org.jfree.data.Range.expandToInclude(range36, (-71.0d));
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range31, range36);
        org.jfree.data.Range range43 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean46 = range43.intersects((double) 100.0f, 90.0d);
        double double48 = range43.constrain(0.0d);
        boolean boolean49 = range31.equals((java.lang.Object) range43);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 50.5d + "'", double27 == 50.5d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 110.0d + "'", double37 == 110.0d);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-828.0d) + "'", double48 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10999.0d, true);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 296715.25d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (-109.0d));
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range17, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range20, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range29, (-1.0d), (double) (byte) 100);
        boolean boolean35 = range29.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range29, (-9.0d), (double) 100L);
        double double40 = range38.constrain(1.0d);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range26, range38);
        boolean boolean42 = range14.equals((java.lang.Object) range26);
        boolean boolean44 = range26.contains((-485.0d));
        boolean boolean45 = range4.equals((java.lang.Object) (-485.0d));
        org.jfree.data.Range range47 = org.jfree.data.Range.expandToInclude(range4, (double) 100L);
        double double48 = range4.getUpperBound();
        double double49 = range4.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-899.0d) + "'", double40 == (-899.0d));
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-10.0d) + "'", double48 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-109.0d) + "'", double49 == (-109.0d));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range14.getCentralValue();
        double double17 = range14.constrain(168.0d);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range14, (double) (short) 1);
        double double20 = range14.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 21871.0d + "'", double15 == 21871.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 37189.0d + "'", double17 == 37189.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6553.0d + "'", double20 == 6553.0d);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range22, range25);
        boolean boolean38 = range35.intersects(72.0d, (double) 100.0f);
        double double39 = range35.getLength();
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range35, 48.5d, false);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 72.0d + "'", double39 == 72.0d);
        org.junit.Assert.assertNotNull(range42);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0L, (double) (-1L));
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, 11.0d);
        org.jfree.data.Range range7 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, (-1.0d), (double) (byte) 100);
        boolean boolean13 = range7.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range7, (-9.0d), (double) 100L);
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, (double) 1);
        org.jfree.data.Range range21 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, (double) (byte) -1);
        boolean boolean26 = range23.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range16, range23);
        java.lang.String str28 = range23.toString();
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range23, 5.5d, false);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range23, (-485.0d), (double) (byte) 1);
        double double35 = range34.getCentralValue();
        boolean boolean36 = range4.equals((java.lang.Object) range34);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range34, (double) (short) 10, false);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Range[99.0,-10.0]" + "'", str28, "Range[99.0,-10.0]");
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-26442.5d) + "'", double35 == (-26442.5d));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(range39);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-9138.5d), (-449.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, (double) (-1.0f));
        double double5 = range2.getUpperBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-449.0d) + "'", double5 == (-449.0d));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range4, 0.0d, 91.0d);
        double double12 = range11.getLowerBound();
        double double13 = range11.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 99.0d + "'", double12 == 99.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-4915.0d) + "'", double13 == (-4915.0d));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        double double36 = range35.getUpperBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range35, 20.0d);
        boolean boolean41 = range38.intersects((double) (byte) 0, 91.0d);
        boolean boolean44 = range38.intersects(1.0d, 61.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jfree.data.Range range2 = new org.jfree.data.Range(168.0d, (-828.0d));
        double double3 = range2.getUpperBound();
        java.lang.String str4 = range2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-828.0d) + "'", double3 == (-828.0d));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Range[168.0,-828.0]" + "'", str4, "Range[168.0,-828.0]");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        java.lang.Class<?> wildcardClass8 = range7.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range18, 100.0d, (-0.5d));
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range18, (double) (-1.0f), (-109.0d));
        double double42 = range18.getCentralValue();
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range18, 172.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 44.5d + "'", double42 == 44.5d);
        org.junit.Assert.assertNotNull(range44);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getUpperBound();
        boolean boolean15 = range11.contains((double) (-1.0f));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range11, 20.0d, false);
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, (-1.0d), (double) (byte) 100);
        boolean boolean27 = range21.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range21, (-9.0d), (double) 100L);
        double double32 = range30.constrain(1.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range30, (double) (byte) 100);
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range30, (double) 'a');
        double double37 = range30.getLength();
        org.jfree.data.Range range40 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range40, (double) 10L);
        org.jfree.data.Range range45 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range45, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range51 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range51, (-10.0d));
        org.jfree.data.Range range54 = org.jfree.data.Range.combine(range48, range51);
        org.jfree.data.Range range57 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range60 = org.jfree.data.Range.expand(range57, (-1.0d), (double) (byte) 100);
        boolean boolean63 = range57.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range66 = org.jfree.data.Range.expand(range57, (-9.0d), (double) 100L);
        double double68 = range66.constrain(1.0d);
        org.jfree.data.Range range69 = org.jfree.data.Range.combine(range54, range66);
        boolean boolean70 = range40.equals((java.lang.Object) range69);
        org.jfree.data.Range range71 = org.jfree.data.Range.combine(range30, range40);
        double double72 = range40.getUpperBound();
        boolean boolean73 = range11.equals((java.lang.Object) double72);
        boolean boolean76 = range11.intersects((-27.75d), (-898.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-899.0d) + "'", double32 == (-899.0d));
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-828.0d) + "'", double37 == (-828.0d));
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-899.0d) + "'", double68 == (-899.0d));
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        double double6 = range2.getLength();
        double double8 = range2.constrain((-828.0d));
        double double9 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.5d + "'", double9 == 5.5d);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-485.0d), 15.5d);
        double double3 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 500.5d + "'", double3 == 500.5d);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, 494.0d);
        org.junit.Assert.assertNotNull(range2);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        boolean boolean5 = range2.contains((double) 1L);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double9 = range8.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range8, 1.0d, true);
        double double13 = range8.getLength();
        boolean boolean14 = range2.equals((java.lang.Object) range8);
        double double16 = range2.constrain(107.25d);
        java.lang.String str17 = range2.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.0d) + "'", double13 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[0.0,-1.0]" + "'", str17, "Range[0.0,-1.0]");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        boolean boolean12 = range5.intersects((-893.5d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range5, 0.0d);
        org.jfree.data.Range range17 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range17, (double) 10L);
        double double20 = range17.getLowerBound();
        double double21 = range17.getCentralValue();
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range17, (-485.0d), (-449.0d));
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double28 = range27.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range24, range27);
        double double31 = range24.constrain((double) 'a');
        double double32 = range24.getLowerBound();
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range14, range24);
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) (short) -1, 15.5d);
        boolean boolean37 = range33.equals((java.lang.Object) (short) -1);
        double double39 = range33.constrain(5549.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.5d) + "'", double21 == (-0.5d));
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9.0d) + "'", double28 == (-9.0d));
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-449.0d) + "'", double31 == (-449.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 484.0d + "'", double32 == 484.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 91.0d + "'", double39 == 91.0d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0, (double) 0);
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.0d), (double) (byte) 100);
        boolean boolean11 = range5.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range5, (-9.0d), (double) 100L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, 45.0d, (-9.0d));
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range14, (-1.0d));
        java.lang.Class<?> wildcardClass20 = range19.getClass();
        boolean boolean21 = range2.equals((java.lang.Object) range19);
        double double22 = range2.getCentralValue();
        boolean boolean24 = range2.contains((double) (byte) 1);
        boolean boolean27 = range2.intersects((double) (byte) -1, (-31535.0d));
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) (byte) -1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (double) 10);
        double double20 = range19.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.5d + "'", double20 == 4.5d);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        double double18 = range11.getUpperBound();
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, (-1.0d), (double) (byte) 100);
        boolean boolean27 = range21.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range21, (-9.0d), (double) 100L);
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range30, (double) 1);
        org.jfree.data.Range range35 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range35, (double) (byte) -1);
        boolean boolean40 = range37.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range30, range37);
        org.jfree.data.Range range44 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range44, (-1.0d), (double) (byte) 100);
        boolean boolean50 = range47.intersects((double) (byte) 10, 10.0d);
        boolean boolean51 = range37.equals((java.lang.Object) boolean50);
        org.jfree.data.Range range54 = org.jfree.data.Range.shift(range37, (double) (byte) 100, false);
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range37, 100.0d, (-0.5d));
        java.lang.String str58 = range57.toString();
        double double59 = range57.getLowerBound();
        org.jfree.data.Range range62 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range65 = org.jfree.data.Range.expand(range62, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range68 = org.jfree.data.Range.shift(range62, (double) 10.0f, false);
        boolean boolean70 = range68.contains((double) 1L);
        double double71 = range68.getUpperBound();
        org.jfree.data.Range range72 = org.jfree.data.Range.combine(range57, range68);
        boolean boolean74 = range57.contains((-30636.0d));
        boolean boolean75 = range11.equals((java.lang.Object) (-30636.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-899.0d) + "'", double18 == (-899.0d));
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Range[10999.0,44.5]" + "'", str58, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10999.0d + "'", double59 == 10999.0d);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 11.0d + "'", double71 == 11.0d);
        org.junit.Assert.assertNotNull(range72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range22, range25);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range22, (double) 100);
        org.jfree.data.Range range39 = org.jfree.data.Range.expandToInclude(range37, 37189.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range39);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 0L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, 484.0d, false);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, 5.5d);
        org.jfree.data.Range range28 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double29 = range28.getLength();
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range28, 1.0d, true);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range35, (-10.0d));
        boolean boolean38 = range28.equals((java.lang.Object) range37);
        boolean boolean39 = range23.equals((java.lang.Object) range37);
        org.jfree.data.Range range42 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range45 = org.jfree.data.Range.expand(range42, (-1.0d), (double) (byte) 100);
        boolean boolean48 = range42.intersects((double) (byte) -1, (double) (short) -1);
        double double49 = range42.getCentralValue();
        double double50 = range42.getLength();
        double double51 = range42.getLength();
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range37, range42);
        double double53 = range42.getLowerBound();
        org.jfree.data.Range range54 = org.jfree.data.Range.combine(range11, range42);
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range11, (-1100799.0d), 10.0d);
        org.jfree.data.Range range60 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range63 = org.jfree.data.Range.expand(range60, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range66 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range68 = org.jfree.data.Range.shift(range66, (-10.0d));
        org.jfree.data.Range range69 = org.jfree.data.Range.combine(range63, range66);
        org.jfree.data.Range range72 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range74 = org.jfree.data.Range.shift(range72, (-10.0d));
        org.jfree.data.Range range75 = org.jfree.data.Range.combine(range63, range72);
        double double76 = range72.getLowerBound();
        org.jfree.data.Range range78 = org.jfree.data.Range.shift(range72, (double) (byte) -1);
        double double80 = range72.constrain(90.0d);
        org.jfree.data.Range range81 = org.jfree.data.Range.combine(range11, range72);
        double double82 = range72.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-9.0d) + "'", double29 == (-9.0d));
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 5.5d + "'", double49 == 5.5d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-9.0d) + "'", double50 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-9.0d) + "'", double51 == (-9.0d));
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertNotNull(range75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 10.0d + "'", double76 == 10.0d);
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 90.0d + "'", double80 == 90.0d);
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 100.0d + "'", double82 == 100.0d);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) '#', 50.5d);
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range5, (double) 10.0f, false);
        double double12 = range5.getLowerBound();
        boolean boolean13 = range2.equals((java.lang.Object) range5);
        java.lang.String str14 = range5.toString();
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Range[10.0,1.0]" + "'", str14, "Range[10.0,1.0]");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-9138.5d), (-449.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, (-170.0d));
        double double5 = range4.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range4, 100.0d, true);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9138.5d) + "'", double5 == (-9138.5d));
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 332.75d);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (-109.0d));
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range17, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range20, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range29, (-1.0d), (double) (byte) 100);
        boolean boolean35 = range29.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range29, (-9.0d), (double) 100L);
        double double40 = range38.constrain(1.0d);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range26, range38);
        boolean boolean42 = range14.equals((java.lang.Object) range26);
        boolean boolean44 = range26.contains((-485.0d));
        boolean boolean45 = range4.equals((java.lang.Object) (-485.0d));
        org.jfree.data.Range range48 = new org.jfree.data.Range((double) (short) -1, 15.5d);
        org.jfree.data.Range range51 = org.jfree.data.Range.shift(range48, (double) 100.0f, true);
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range4, range48);
        org.jfree.data.Range range55 = org.jfree.data.Range.expand(range52, 11019.5d, 18605.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-899.0d) + "'", double40 == (-899.0d));
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range55);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, (-1820.75d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) ' ', (double) 100L);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jfree.data.Range range2 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.0d), (double) (byte) 100);
        boolean boolean11 = range5.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range5, (-9.0d), (double) 100L);
        double double16 = range14.constrain(1.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range14, (double) (byte) 100);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range14, (double) 'a');
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-1.0d), (-9.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range14, 0.0d, true);
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range2, range26);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range30, (double) (short) 100);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range26, range30);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-899.0d) + "'", double16 == (-899.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range34);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range20, 11044.5d, true);
        double double24 = range23.getLowerBound();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range23, (double) '4', false);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) (short) -1, 15.5d);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range30, (-0.5d), false);
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (-1.0d), (double) (byte) 100);
        boolean boolean42 = range36.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range45 = org.jfree.data.Range.expand(range36, (-9.0d), (double) 100L);
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range45, 5.5d);
        org.jfree.data.Range range50 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double51 = range50.getLength();
        org.jfree.data.Range range54 = org.jfree.data.Range.shift(range50, 1.0d, true);
        org.jfree.data.Range range57 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range59 = org.jfree.data.Range.shift(range57, (-10.0d));
        boolean boolean60 = range50.equals((java.lang.Object) range59);
        boolean boolean61 = range45.equals((java.lang.Object) range59);
        double double62 = range45.getCentralValue();
        org.jfree.data.Range range63 = org.jfree.data.Range.combine(range30, range45);
        double double64 = range30.getLength();
        boolean boolean65 = range23.equals((java.lang.Object) range30);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10974.5d + "'", double24 == 10974.5d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-9.0d) + "'", double51 == (-9.0d));
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-485.0d) + "'", double62 == (-485.0d));
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 16.5d + "'", double64 == 16.5d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        double double7 = range5.getCentralValue();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range5, (-0.5d), true);
        java.lang.String str11 = range10.toString();
        double double12 = range10.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-449.0d) + "'", double7 == (-449.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[0.5,-899.5]" + "'", str11, "Range[0.5,-899.5]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5d + "'", double12 == 0.5d);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-485.0d), (-449.0d));
        org.jfree.data.Range range12 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double13 = range12.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.combine(range9, range12);
        double double15 = range12.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.0d) + "'", double13 == (-9.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5.5d + "'", double15 == 5.5d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range9, 1.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        boolean boolean19 = range9.equals((java.lang.Object) range18);
        double double20 = range18.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range18);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 45.0d, (double) '#');
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, (-1.0d), (double) (byte) 100);
        boolean boolean33 = range27.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range27, (-9.0d), (double) 100L);
        double double38 = range36.constrain(1.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range36, (double) (byte) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range36, (double) 'a');
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range24, range42);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range42, (-71.0d), true);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range42, 91.0d);
        org.jfree.data.Range range51 = org.jfree.data.Range.expand(range42, (double) 10L, (-2342.5d));
        org.jfree.data.Range range54 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range54, (double) 10L);
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range54, 44.5d, (-799.0d));
        org.jfree.data.Range range62 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double63 = range62.getLength();
        org.jfree.data.Range range65 = org.jfree.data.Range.expandToInclude(range62, (double) (short) 100);
        org.jfree.data.Range range66 = org.jfree.data.Range.combine(range54, range62);
        org.jfree.data.Range range68 = org.jfree.data.Range.expandToInclude(range54, 743473.0d);
        org.jfree.data.Range range71 = org.jfree.data.Range.expand(range54, 0.0d, 21.0d);
        boolean boolean72 = range51.equals((java.lang.Object) range54);
        java.lang.String str73 = range54.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-899.0d) + "'", double38 == (-899.0d));
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-9.0d) + "'", double63 == (-9.0d));
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Range[-1.0,0.0]" + "'", str73, "Range[-1.0,0.0]");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, 5.5d);
        boolean boolean30 = range26.equals((java.lang.Object) 171.0d);
        boolean boolean33 = range26.intersects((-893.5d), (double) 100L);
        double double35 = range26.constrain(1.0d);
        boolean boolean36 = range20.equals((java.lang.Object) range26);
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range20, (-9.0d));
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range20, 272.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range40);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        boolean boolean6 = range2.intersects((-9.0d), (double) ' ');
        boolean boolean8 = range2.contains((double) (short) 0);
        double double9 = range2.getUpperBound();
        java.lang.String str10 = range2.toString();
        boolean boolean12 = range2.equals((java.lang.Object) "Range[10.0,100.0]");
        java.lang.Object obj13 = null;
        boolean boolean14 = range2.equals(obj13);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[0.0,0.0]" + "'", str10, "Range[0.0,0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, 32.0d, true);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range10, (-4.0d));
        double double14 = range12.constrain(7.75d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 48.0d + "'", double14 == 48.0d);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 5.5d, (double) 10.0f);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (double) (byte) 0, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range16, (double) '#', true);
        double double24 = range22.constrain((double) (short) 0);
        double double25 = range22.getLowerBound();
        double double26 = range22.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9138.5d) + "'", double24 == (-9138.5d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4523.5d + "'", double25 == 4523.5d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-13662.0d) + "'", double26 == (-13662.0d));
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        double double14 = range12.constrain((-900.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range12, 5.5d);
        org.jfree.data.Range range19 = new org.jfree.data.Range(0.0d, 0.0d);
        java.lang.Class<?> wildcardClass20 = range19.getClass();
        boolean boolean21 = range12.equals((java.lang.Object) wildcardClass20);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 99.0d + "'", double14 == 99.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.data.Range range2 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.0d), (double) (byte) 100);
        boolean boolean11 = range5.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range5, (-9.0d), (double) 100L);
        double double16 = range14.constrain(1.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range14, (double) (byte) 100);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range14, (double) 'a');
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-1.0d), (-9.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range14, 0.0d, true);
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range2, range26);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double31 = range30.getLength();
        double double32 = range30.getLowerBound();
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range27, range30);
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range30, 61.0d, false);
        java.lang.String str37 = range36.toString();
        org.jfree.data.Range range40 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double41 = range40.getCentralValue();
        org.jfree.data.Range range44 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double45 = range44.getLength();
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range44, 1.0d, true);
        org.jfree.data.Range range49 = org.jfree.data.Range.combine(range40, range48);
        double double50 = range40.getLength();
        boolean boolean51 = range36.equals((java.lang.Object) range40);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-899.0d) + "'", double16 == (-899.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Range[71.0,62.0]" + "'", str37, "Range[71.0,62.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-0.5d) + "'", double41 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-9.0d) + "'", double45 == (-9.0d));
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        double double23 = range22.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range22, (double) 1L);
        org.jfree.data.Range range28 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double29 = range28.getLength();
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range28, 1.0d, true);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range35, (-10.0d));
        boolean boolean38 = range28.equals((java.lang.Object) range37);
        double double39 = range28.getLowerBound();
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range22, range28);
        java.lang.String str41 = range40.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 61.0d + "'", double23 == 61.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-9.0d) + "'", double29 == (-9.0d));
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Range[-71.0,1.0]" + "'", str41, "Range[-71.0,1.0]");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        java.lang.String str15 = range14.toString();
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double19 = range18.getLength();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range18, 1.0d, true);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (-10.0d));
        boolean boolean28 = range18.equals((java.lang.Object) range27);
        double double29 = range27.getCentralValue();
        org.jfree.data.Range range30 = org.jfree.data.Range.combine(range14, range27);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, 45.0d, (double) '#');
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (-1.0d), (double) (byte) 100);
        boolean boolean42 = range36.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range45 = org.jfree.data.Range.expand(range36, (-9.0d), (double) 100L);
        double double47 = range45.constrain(1.0d);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range45, (double) (byte) 100);
        org.jfree.data.Range range51 = org.jfree.data.Range.expandToInclude(range45, (double) 'a');
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range33, range51);
        org.jfree.data.Range range55 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double56 = range55.getCentralValue();
        org.jfree.data.Range range59 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double60 = range59.getLength();
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range59, (double) (short) 100);
        org.jfree.data.Range range63 = org.jfree.data.Range.combine(range55, range62);
        org.jfree.data.Range range65 = org.jfree.data.Range.shift(range62, (double) 10L);
        java.lang.String str66 = range62.toString();
        org.jfree.data.Range range67 = org.jfree.data.Range.combine(range33, range62);
        org.jfree.data.Range range68 = org.jfree.data.Range.combine(range4, range67);
        org.jfree.data.Range range71 = org.jfree.data.Range.expand(range4, 2827.0d, (-37118.0d));
        java.lang.Class<?> wildcardClass72 = range71.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Range[1.0,-899.0]" + "'", str15, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9.0d) + "'", double19 == (-9.0d));
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 45.0d + "'", double29 == 45.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-899.0d) + "'", double47 == (-899.0d));
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-0.5d) + "'", double56 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-9.0d) + "'", double60 == (-9.0d));
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Range[10.0,100.0]" + "'", str66, "Range[10.0,100.0]");
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 100.0f, 11.0d);
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        java.lang.String str6 = range5.toString();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double10 = range9.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (-109.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, (-71.0d), (-828.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) 100L);
        double double18 = range17.getLength();
        double double20 = range17.constrain(50.5d);
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range5, range17);
        double double22 = range17.getLength();
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range2, range17);
        double double24 = range17.getLowerBound();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[10.0,100.0]" + "'", str6, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) '#');
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 0L);
        double double5 = range2.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 17.5d + "'", double5 == 17.5d);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 0, 17.5d);
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, 91.0d);
        org.junit.Assert.assertNotNull(range4);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) (byte) -1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (-799.0d));
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range22, 0.0d);
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range27, (-900.0d), true);
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range27, (-4.0d));
        boolean boolean33 = range17.equals((java.lang.Object) range32);
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range32, 91.0d, false);
        boolean boolean38 = range32.contains(97.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        double double9 = range7.constrain((-35.5d));
        org.jfree.data.Range range12 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double13 = range12.getLength();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range12, (-109.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range15, (-71.0d), (-828.0d));
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range18, (double) 100L);
        boolean boolean23 = range18.intersects((double) ' ', 10.0d);
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double27 = range26.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range26, (-109.0d));
        boolean boolean31 = range26.contains(1.0d);
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range26, 37189.0d);
        boolean boolean34 = range18.equals((java.lang.Object) range26);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range7, range18);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.0d) + "'", double13 == (-9.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-9.0d) + "'", double27 == (-9.0d));
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(range35);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        boolean boolean18 = range11.intersects(45.0d, (double) (short) 100);
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, (-1.0d), (double) (byte) 100);
        boolean boolean27 = range21.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range21, (-9.0d), (double) 100L);
        double double32 = range30.constrain(1.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range30, (double) (byte) 100);
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range30, (double) 'a');
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range30, (double) 1.0f, false);
        org.jfree.data.Range range42 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range45 = org.jfree.data.Range.expand(range42, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range45, 5.5d);
        boolean boolean49 = range45.equals((java.lang.Object) 171.0d);
        boolean boolean52 = range45.intersects((-893.5d), (double) 100L);
        double double54 = range45.constrain(1.0d);
        boolean boolean55 = range39.equals((java.lang.Object) range45);
        org.jfree.data.Range range58 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range61 = org.jfree.data.Range.expand(range58, (-1.0d), (double) (byte) 100);
        boolean boolean64 = range58.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range67 = org.jfree.data.Range.expand(range58, (-9.0d), (double) 100L);
        double double69 = range67.constrain(1.0d);
        org.jfree.data.Range range71 = org.jfree.data.Range.shift(range67, (double) (byte) 100);
        org.jfree.data.Range range73 = org.jfree.data.Range.expandToInclude(range67, (double) 'a');
        org.jfree.data.Range range76 = org.jfree.data.Range.expand(range67, (-1.0d), (-9.0d));
        org.jfree.data.Range range79 = org.jfree.data.Range.shift(range67, 0.0d, true);
        org.jfree.data.Range range81 = org.jfree.data.Range.expandToInclude(range67, (double) (short) 1);
        boolean boolean82 = range39.equals((java.lang.Object) range67);
        org.jfree.data.Range range85 = org.jfree.data.Range.shift(range39, (-2342.5d), true);
        boolean boolean87 = range39.contains((-4050.0d));
        org.jfree.data.Range range89 = org.jfree.data.Range.shift(range39, (-799.0d));
        boolean boolean90 = range11.equals((java.lang.Object) range89);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-899.0d) + "'", double32 == (-899.0d));
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-899.0d) + "'", double69 == (-899.0d));
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(range85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(range89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double7 = range2.constrain((-828.0d));
        double double8 = range2.getCentralValue();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range2, 21871.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.5d) + "'", double8 == (-0.5d));
        org.junit.Assert.assertNotNull(range10);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, 0.0d);
        double double7 = range6.getLowerBound();
        double double8 = range6.getLowerBound();
        boolean boolean9 = range2.equals((java.lang.Object) double8);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, 107.25d, (-799.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, 11044.5d, (-10.0d));
        double double16 = range15.getUpperBound();
        boolean boolean19 = range15.intersects(743473.0d, 171.0d);
        boolean boolean21 = range15.contains(5548.0d);
        boolean boolean23 = range15.contains(33.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6108.5d + "'", double16 == 6108.5d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        java.lang.String str15 = range14.toString();
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double19 = range18.getLength();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range18, 1.0d, true);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (-10.0d));
        boolean boolean28 = range18.equals((java.lang.Object) range27);
        double double29 = range27.getCentralValue();
        org.jfree.data.Range range30 = org.jfree.data.Range.combine(range14, range27);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, 45.0d, (double) '#');
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (-1.0d), (double) (byte) 100);
        boolean boolean42 = range36.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range45 = org.jfree.data.Range.expand(range36, (-9.0d), (double) 100L);
        double double47 = range45.constrain(1.0d);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range45, (double) (byte) 100);
        org.jfree.data.Range range51 = org.jfree.data.Range.expandToInclude(range45, (double) 'a');
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range33, range51);
        org.jfree.data.Range range55 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double56 = range55.getCentralValue();
        org.jfree.data.Range range59 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double60 = range59.getLength();
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range59, (double) (short) 100);
        org.jfree.data.Range range63 = org.jfree.data.Range.combine(range55, range62);
        org.jfree.data.Range range65 = org.jfree.data.Range.shift(range62, (double) 10L);
        java.lang.String str66 = range62.toString();
        org.jfree.data.Range range67 = org.jfree.data.Range.combine(range33, range62);
        org.jfree.data.Range range68 = org.jfree.data.Range.combine(range4, range67);
        org.jfree.data.Range range71 = org.jfree.data.Range.expand(range4, 2827.0d, (-37118.0d));
        java.lang.String str72 = range71.toString();
        boolean boolean74 = range71.contains((double) (byte) 0);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Range[1.0,-899.0]" + "'", str15, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9.0d) + "'", double19 == (-9.0d));
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 45.0d + "'", double29 == 45.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-899.0d) + "'", double47 == (-899.0d));
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-0.5d) + "'", double56 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-9.0d) + "'", double60 == (-9.0d));
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Range[10.0,100.0]" + "'", str66, "Range[10.0,100.0]");
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Range[-254430.0,-3340530.0]" + "'", str72, "Range[-254430.0,-3340530.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        double double4 = range2.getLowerBound();
        double double5 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        java.lang.String str3 = range2.toString();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range6, (-109.0d));
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, (-71.0d), (-828.0d));
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (double) 100L);
        double double15 = range14.getLength();
        double double17 = range14.constrain(50.5d);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range2, range14);
        double double19 = range2.getLength();
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range2, 67.0d, 587466.0d);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double26 = range25.getLength();
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range25, 1.0d, true);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range32, (-10.0d));
        boolean boolean35 = range25.equals((java.lang.Object) range34);
        double double36 = range25.getLowerBound();
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range39.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range39, (-9.0d), (double) 100L);
        org.jfree.data.Range range50 = org.jfree.data.Range.expandToInclude(range48, (double) 1);
        org.jfree.data.Range range53 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range53, (double) (byte) -1);
        boolean boolean58 = range55.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range59 = org.jfree.data.Range.combine(range48, range55);
        org.jfree.data.Range range62 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range65 = org.jfree.data.Range.expand(range62, (-1.0d), (double) (byte) 100);
        boolean boolean68 = range65.intersects((double) (byte) 10, 10.0d);
        boolean boolean69 = range55.equals((java.lang.Object) boolean68);
        org.jfree.data.Range range72 = org.jfree.data.Range.shift(range55, (double) (byte) 100, false);
        boolean boolean73 = range25.equals((java.lang.Object) range72);
        org.jfree.data.Range range76 = org.jfree.data.Range.shift(range25, 0.0d, false);
        org.jfree.data.Range range79 = org.jfree.data.Range.shift(range76, 72.0d, true);
        org.jfree.data.Range range81 = org.jfree.data.Range.shift(range76, 743473.0d);
        org.jfree.data.Range range82 = org.jfree.data.Range.combine(range22, range81);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Range[10.0,100.0]" + "'", str3, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 90.0d + "'", double19 == 90.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9.0d) + "'", double26 == (-9.0d));
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(range72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertNotNull(range82);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jfree.data.Range range2 = new org.jfree.data.Range(45.5d, (double) 1L);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        boolean boolean6 = range2.contains((double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-44.5d) + "'", double3 == (-44.5d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 45.5d + "'", double4 == 45.5d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        double double16 = range15.getLowerBound();
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean21 = range19.equals((java.lang.Object) 100L);
        double double22 = range19.getLowerBound();
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range19, 10989.0d, (double) '#');
        org.jfree.data.Range range28 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range28, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, 5.5d);
        boolean boolean35 = range31.equals((java.lang.Object) 171.0d);
        boolean boolean38 = range31.intersects((-893.5d), (double) 100L);
        org.jfree.data.Range range40 = org.jfree.data.Range.expandToInclude(range31, 0.0d);
        boolean boolean41 = range25.equals((java.lang.Object) range40);
        boolean boolean42 = range15.equals((java.lang.Object) range40);
        org.jfree.data.Range range45 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range45, (-1.0d), (double) (byte) 100);
        java.lang.String str49 = range48.toString();
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double53 = range52.getLength();
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range52, 1.0d, true);
        org.jfree.data.Range range59 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range59, (-10.0d));
        boolean boolean62 = range52.equals((java.lang.Object) range61);
        double double63 = range61.getCentralValue();
        org.jfree.data.Range range64 = org.jfree.data.Range.combine(range48, range61);
        double double65 = range61.getLowerBound();
        org.jfree.data.Range range66 = org.jfree.data.Range.combine(range40, range61);
        org.jfree.data.Range range69 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double70 = range69.getCentralValue();
        org.jfree.data.Range range73 = new org.jfree.data.Range(0.0d, 0.0d);
        double double74 = range73.getLowerBound();
        double double75 = range73.getLowerBound();
        boolean boolean76 = range69.equals((java.lang.Object) double75);
        org.jfree.data.Range range78 = org.jfree.data.Range.expandToInclude(range69, (double) 1.0f);
        org.jfree.data.Range range79 = org.jfree.data.Range.combine(range40, range69);
        double double80 = range69.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Range[1.0,-899.0]" + "'", str49, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-9.0d) + "'", double53 == (-9.0d));
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 45.0d + "'", double63 == 45.0d);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-0.5d) + "'", double70 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1L);
        double double18 = range17.getLowerBound();
        java.lang.String str19 = range17.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[0.0,90.0]" + "'", str19, "Range[0.0,90.0]");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range6, 1.0d, true);
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range2, range10);
        double double12 = range10.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 2483.0d);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range28.intersects((double) (byte) 10, 10.0d);
        boolean boolean32 = range18.equals((java.lang.Object) boolean31);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range18, (double) (byte) 100, false);
        double double36 = range35.getUpperBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range35, 20.0d);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range38, (-4.0d), 15.5d);
        double double42 = range38.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-199.0d) + "'", double42 == (-199.0d));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range14.getCentralValue();
        boolean boolean18 = range14.intersects((double) (-1.0f), 5.5d);
        double double19 = range14.getUpperBound();
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (-1.0d), (double) (byte) 100);
        boolean boolean28 = range22.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range22, (-9.0d), (double) 100L);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, 5.5d);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range33, 5.5d, (double) 10.0f);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (double) (byte) 0, (double) 0.0f);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range36, (double) '#', true);
        double double44 = range42.constrain((double) (short) 0);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range14, range42);
        org.jfree.data.Range range48 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double49 = range48.getLength();
        org.jfree.data.Range range51 = org.jfree.data.Range.shift(range48, (-109.0d));
        org.jfree.data.Range range54 = org.jfree.data.Range.expand(range51, (-71.0d), (-828.0d));
        org.jfree.data.Range range57 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range59 = org.jfree.data.Range.shift(range57, (double) 10L);
        double double60 = range57.getLowerBound();
        double double61 = range57.getCentralValue();
        double double62 = range57.getCentralValue();
        org.jfree.data.Range range63 = org.jfree.data.Range.combine(range54, range57);
        org.jfree.data.Range range64 = org.jfree.data.Range.combine(range45, range63);
        java.lang.String str65 = range63.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 232.75d + "'", double15 == 232.75d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-9138.5d) + "'", double44 == (-9138.5d));
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-9.0d) + "'", double49 == (-9.0d));
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-1.0d) + "'", double60 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-0.5d) + "'", double61 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-0.5d) + "'", double62 == (-0.5d));
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Range[-1.0,0.0]" + "'", str65, "Range[-1.0,0.0]");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        double double16 = range15.getLowerBound();
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean21 = range19.equals((java.lang.Object) 100L);
        double double22 = range19.getLowerBound();
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range19, 10989.0d, (double) '#');
        org.jfree.data.Range range28 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range28, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, 5.5d);
        boolean boolean35 = range31.equals((java.lang.Object) 171.0d);
        boolean boolean38 = range31.intersects((-893.5d), (double) 100L);
        org.jfree.data.Range range40 = org.jfree.data.Range.expandToInclude(range31, 0.0d);
        boolean boolean41 = range25.equals((java.lang.Object) range40);
        boolean boolean42 = range15.equals((java.lang.Object) range40);
        org.jfree.data.Range range45 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range45, (-1.0d), (double) (byte) 100);
        java.lang.String str49 = range48.toString();
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double53 = range52.getLength();
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range52, 1.0d, true);
        org.jfree.data.Range range59 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range59, (-10.0d));
        boolean boolean62 = range52.equals((java.lang.Object) range61);
        double double63 = range61.getCentralValue();
        org.jfree.data.Range range64 = org.jfree.data.Range.combine(range48, range61);
        double double65 = range61.getLowerBound();
        org.jfree.data.Range range66 = org.jfree.data.Range.combine(range40, range61);
        org.jfree.data.Range range69 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double70 = range69.getCentralValue();
        org.jfree.data.Range range73 = new org.jfree.data.Range(0.0d, 0.0d);
        double double74 = range73.getLowerBound();
        double double75 = range73.getLowerBound();
        boolean boolean76 = range69.equals((java.lang.Object) double75);
        org.jfree.data.Range range78 = org.jfree.data.Range.expandToInclude(range69, (double) 1.0f);
        org.jfree.data.Range range79 = org.jfree.data.Range.combine(range40, range69);
        java.lang.String str80 = range40.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Range[1.0,-899.0]" + "'", str49, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-9.0d) + "'", double53 == (-9.0d));
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 45.0d + "'", double63 == 45.0d);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-0.5d) + "'", double70 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Range[0.0,91.0]" + "'", str80, "Range[0.0,91.0]");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range25, (double) 1);
        org.jfree.data.Range range30 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (double) (byte) -1);
        boolean boolean35 = range32.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range25, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        boolean boolean46 = range32.equals((java.lang.Object) boolean45);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range32, (double) (byte) 100, false);
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        double double51 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 5.5d + "'", double51 == 5.5d);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range18 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean19 = range11.equals((java.lang.Object) (-10.0d));
        double double20 = range11.getCentralValue();
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double24 = range23.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range23, 1.0d, true);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (-10.0d));
        boolean boolean33 = range23.equals((java.lang.Object) range32);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range11, range32);
        double double35 = range11.getLowerBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range11, 18630.0d, false);
        boolean boolean40 = range38.contains(45.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-485.0d) + "'", double20 == (-485.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9.0d) + "'", double24 == (-9.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-71.0d) + "'", double35 == (-71.0d));
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jfree.data.Range range2 = new org.jfree.data.Range(232.75d, 5549.5d);
        double double3 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2891.125d + "'", double3 == 2891.125d);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jfree.data.Range range2 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean5 = range2.intersects((double) 100.0f, 90.0d);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double9 = range8.getLength();
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (-109.0d));
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-71.0d), (-828.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (double) 100L);
        double double17 = range16.getLength();
        double double18 = range16.getCentralValue();
        org.jfree.data.Range range19 = org.jfree.data.Range.combine(range2, range16);
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range2, (-799.0d));
        double double22 = range21.getLowerBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-799.0d) + "'", double22 == (-799.0d));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 1);
        boolean boolean27 = range25.contains(100.0d);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range30, (-109.0d));
        boolean boolean34 = range25.equals((java.lang.Object) range33);
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range25, 0.0d);
        java.lang.String str37 = range36.toString();
        boolean boolean40 = range36.intersects(0.0d, (-13662.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Range[-71.0,1.0]" + "'", str37, "Range[-71.0,1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-449.0d), (double) (short) -1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 53.625d, (-4.0d));
        org.junit.Assert.assertNotNull(range5);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, 6553.0d);
        boolean boolean8 = range2.intersects(71.0d, 32.0d);
        double double10 = range2.constrain((double) 0.0f);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, (-1.0d), (double) (byte) 100);
        boolean boolean19 = range13.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range13, (-9.0d), (double) 100L);
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range22, (double) 1);
        org.jfree.data.Range range27 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range27, (double) (byte) -1);
        boolean boolean32 = range29.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range22, range29);
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (-1.0d), (double) (byte) 100);
        boolean boolean42 = range39.intersects((double) (byte) 10, 10.0d);
        boolean boolean43 = range29.equals((java.lang.Object) boolean42);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range29, (double) (byte) 100, false);
        org.jfree.data.Range range49 = org.jfree.data.Range.expand(range29, 100.0d, (-0.5d));
        org.jfree.data.Range range52 = org.jfree.data.Range.expand(range29, (double) (-1.0f), (-109.0d));
        double double53 = range52.getUpperBound();
        boolean boolean54 = range2.equals((java.lang.Object) double53);
        java.lang.Class<?> wildcardClass55 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 11871.0d + "'", double53 == 11871.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range18 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean19 = range11.equals((java.lang.Object) (-10.0d));
        double double20 = range11.getCentralValue();
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double24 = range23.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range23, 1.0d, true);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (-10.0d));
        boolean boolean33 = range23.equals((java.lang.Object) range32);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range11, range32);
        org.jfree.data.Range range37 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range40 = org.jfree.data.Range.expand(range37, (-1.0d), (double) (byte) 100);
        boolean boolean43 = range37.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range37, (-9.0d), (double) 100L);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range46, (double) 1);
        org.jfree.data.Range range51 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range51, (double) (byte) -1);
        boolean boolean56 = range53.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range57 = org.jfree.data.Range.combine(range46, range53);
        org.jfree.data.Range range60 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range63 = org.jfree.data.Range.expand(range60, (-1.0d), (double) (byte) 100);
        boolean boolean66 = range63.intersects((double) (byte) 10, 10.0d);
        boolean boolean67 = range53.equals((java.lang.Object) boolean66);
        org.jfree.data.Range range70 = org.jfree.data.Range.shift(range53, (double) (byte) 100, false);
        org.jfree.data.Range range73 = org.jfree.data.Range.expand(range53, 100.0d, (-0.5d));
        double double74 = range53.getLength();
        org.jfree.data.Range range77 = org.jfree.data.Range.shift(range53, 232.75d, false);
        org.jfree.data.Range range78 = org.jfree.data.Range.combine(range11, range77);
        boolean boolean80 = range77.contains((double) 100);
        double double82 = range77.constrain(15.5d);
        boolean boolean84 = range77.contains((double) (-1L));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-485.0d) + "'", double20 == (-485.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9.0d) + "'", double24 == (-9.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-109.0d) + "'", double74 == (-109.0d));
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) -1, 15.5d);
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-0.5d), false);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, (-1.0d), (double) (byte) 100);
        boolean boolean14 = range8.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range8, (-9.0d), (double) 100L);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range17, 5.5d);
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double23 = range22.getLength();
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range22, 1.0d, true);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (-10.0d));
        boolean boolean32 = range22.equals((java.lang.Object) range31);
        boolean boolean33 = range17.equals((java.lang.Object) range31);
        double double34 = range17.getCentralValue();
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range2, range17);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range17, (-109.0d));
        org.jfree.data.Range range40 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range40, (-10.0d));
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range42, (double) 0);
        double double45 = range42.getLength();
        double double46 = range42.getLength();
        boolean boolean48 = range42.contains((-109.0d));
        org.jfree.data.Range range51 = org.jfree.data.Range.expand(range42, 20.0d, (-799.0d));
        double double53 = range42.constrain((double) (-1.0f));
        boolean boolean55 = range42.equals((java.lang.Object) 100L);
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range37, range42);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9.0d) + "'", double23 == (-9.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-485.0d) + "'", double34 == (-485.0d));
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 90.0d + "'", double45 == 90.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 90.0d + "'", double46 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(range56);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        boolean boolean7 = range4.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range4, (double) 0.0f);
        double double10 = range9.getUpperBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) 0);
        boolean boolean19 = range15.contains((double) (short) 10);
        org.jfree.data.Range range20 = null;
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (-1.0d), (double) (byte) 100);
        boolean boolean29 = range23.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range23, (-9.0d), (double) 100L);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range32, 5.5d);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, 5.5d, (double) 10.0f);
        boolean boolean39 = range34.contains((double) (byte) -1);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range20, range34);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range15, range34);
        java.lang.String str42 = range34.toString();
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range34, 11.0d);
        boolean boolean45 = range9.equals((java.lang.Object) range44);
        org.jfree.data.Range range47 = org.jfree.data.Range.expandToInclude(range9, 10989.0d);
        double double49 = range9.constrain(0.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Range[-65.5,-893.5]" + "'", str42, "Range[-65.5,-893.5]");
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-10.0d) + "'", double49 == (-10.0d));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jfree.data.Range range2 = new org.jfree.data.Range(171.0d, (-170.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-385.0d), true);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) '#');
        double double8 = range7.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-135.0d) + "'", double8 == (-135.0d));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range11, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (-1.0d), (double) (byte) 100);
        boolean boolean38 = range32.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range32, (-9.0d), (double) 100L);
        double double43 = range41.constrain(1.0d);
        boolean boolean44 = range29.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range26, range29);
        org.jfree.data.Range range48 = new org.jfree.data.Range((double) 100.0f, 11.0d);
        double double50 = range48.constrain(72.0d);
        boolean boolean51 = range29.equals((java.lang.Object) 72.0d);
        double double52 = range29.getUpperBound();
        double double53 = range29.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-899.0d) + "'", double43 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 11.0d + "'", double50 == 11.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, 0.0d);
        org.jfree.data.Range range25 = new org.jfree.data.Range(171.0d, (double) (byte) 1);
        boolean boolean26 = range20.equals((java.lang.Object) range25);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double30 = range29.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range29, 1.0d, true);
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range36, (-10.0d));
        boolean boolean39 = range29.equals((java.lang.Object) range38);
        double double40 = range38.getCentralValue();
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range38, (double) 100L);
        boolean boolean43 = range20.equals((java.lang.Object) range42);
        double double44 = range20.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-9.0d) + "'", double30 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 45.0d + "'", double40 == 45.0d);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-899.0d) + "'", double44 == (-899.0d));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, (double) (short) 100);
        org.jfree.data.Range range10 = org.jfree.data.Range.combine(range2, range9);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, (-1.0d), (double) (byte) 100);
        boolean boolean19 = range13.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range13, (-9.0d), (double) 100L);
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range22, (double) 1);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range22, (double) (short) -1, false);
        boolean boolean28 = range10.equals((java.lang.Object) range27);
        double double29 = range10.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range15, (-1.0d), (double) (byte) 100);
        boolean boolean21 = range15.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range15, (-9.0d), (double) 100L);
        double double26 = range24.constrain(1.0d);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range24, (double) (byte) 100);
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range24, (double) 'a');
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range24, (-1.0d), (-9.0d));
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range24, 0.0d, true);
        org.jfree.data.Range range37 = org.jfree.data.Range.combine(range12, range36);
        org.jfree.data.Range range40 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double41 = range40.getLength();
        double double42 = range40.getLowerBound();
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range37, range40);
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range7, range40);
        double double45 = range44.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-899.0d) + "'", double26 == (-899.0d));
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-9.0d) + "'", double41 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) '#', 50.5d);
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range5, (double) 10.0f, false);
        double double12 = range5.getLowerBound();
        boolean boolean13 = range2.equals((java.lang.Object) range5);
        double double14 = range5.getLowerBound();
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jfree.data.Range range2 = new org.jfree.data.Range(5549.5d, (-933.0d));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        boolean boolean10 = range4.intersects((-899.0d), 90.0d);
        java.lang.String str11 = range4.toString();
        boolean boolean13 = range4.contains((-828.0d));
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        double double27 = range25.constrain(1.0d);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range25, (double) (byte) 100);
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range25, (double) 'a');
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-1.0d), (-9.0d));
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range34, 0.0d);
        org.jfree.data.Range range39 = new org.jfree.data.Range(171.0d, (double) (byte) 1);
        boolean boolean40 = range34.equals((java.lang.Object) range39);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range4, range39);
        boolean boolean44 = range39.intersects(10989.0d, 46.0d);
        org.jfree.data.Range range47 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range50 = org.jfree.data.Range.expand(range47, (-1.0d), (double) (byte) 100);
        boolean boolean53 = range47.intersects((double) (byte) -1, (double) (short) -1);
        double double54 = range47.getCentralValue();
        double double55 = range47.getLength();
        double double56 = range47.getLength();
        double double58 = range47.constrain(0.0d);
        org.jfree.data.Range range61 = new org.jfree.data.Range((-41.0d), 0.0d);
        double double62 = range61.getLowerBound();
        double double63 = range61.getCentralValue();
        org.jfree.data.Range range64 = org.jfree.data.Range.combine(range47, range61);
        boolean boolean65 = range39.equals((java.lang.Object) range47);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[0.0,90.0]" + "'", str11, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-899.0d) + "'", double27 == (-899.0d));
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 5.5d + "'", double54 == 5.5d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-9.0d) + "'", double55 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-9.0d) + "'", double56 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-41.0d) + "'", double62 == (-41.0d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-20.5d) + "'", double63 == (-20.5d));
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        double double18 = range11.getLength();
        java.lang.String str19 = range11.toString();
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range11, (double) 100);
        java.lang.Class<?> wildcardClass22 = range21.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[-71.0,-899.0]" + "'", str19, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (-109.0d));
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range17, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range20, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range29, (-1.0d), (double) (byte) 100);
        boolean boolean35 = range29.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range29, (-9.0d), (double) 100L);
        double double40 = range38.constrain(1.0d);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range26, range38);
        boolean boolean42 = range14.equals((java.lang.Object) range26);
        boolean boolean44 = range26.contains((-485.0d));
        boolean boolean45 = range4.equals((java.lang.Object) (-485.0d));
        org.jfree.data.Range range47 = org.jfree.data.Range.expandToInclude(range4, (double) 100L);
        org.jfree.data.Range range50 = org.jfree.data.Range.expand(range4, 5548.0d, 104.5d);
        double double51 = range50.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-899.0d) + "'", double40 == (-899.0d));
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-616231.5d) + "'", double51 == (-616231.5d));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getUpperBound();
        boolean boolean15 = range11.contains((double) (-1.0f));
        double double16 = range11.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        boolean boolean9 = range2.contains((double) (byte) 0);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range2, (double) (byte) 100);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range23, (double) 1);
        org.jfree.data.Range range28 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range28, (double) (byte) -1);
        boolean boolean33 = range30.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range23, range30);
        org.jfree.data.Range range37 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range40 = org.jfree.data.Range.expand(range37, (-1.0d), (double) (byte) 100);
        boolean boolean43 = range40.intersects((double) (byte) 10, 10.0d);
        boolean boolean44 = range30.equals((java.lang.Object) boolean43);
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range30, (double) (byte) 100, false);
        org.jfree.data.Range range50 = org.jfree.data.Range.expand(range30, 100.0d, (-0.5d));
        org.jfree.data.Range range53 = org.jfree.data.Range.expand(range30, (double) (-1.0f), (-109.0d));
        boolean boolean54 = range2.equals((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 1);
        boolean boolean27 = range25.contains(100.0d);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range30, (-109.0d));
        boolean boolean34 = range25.equals((java.lang.Object) range33);
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range25, 0.0d);
        java.lang.String str37 = range36.toString();
        org.jfree.data.Range range40 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range43 = org.jfree.data.Range.expand(range40, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range45 = org.jfree.data.Range.shift(range40, 0.0d);
        org.jfree.data.Range range48 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double49 = range48.getLength();
        double double50 = range48.getLowerBound();
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range48, 10.0d, false);
        org.jfree.data.Range range54 = org.jfree.data.Range.combine(range45, range53);
        boolean boolean56 = range45.contains((double) 1.0f);
        boolean boolean57 = range36.equals((java.lang.Object) boolean56);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Range[-71.0,1.0]" + "'", str37, "Range[-71.0,1.0]");
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-9.0d) + "'", double49 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        double double6 = range2.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 0.0d, true);
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range9, range10);
        double double12 = range11.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.5d + "'", double12 == 5.5d);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        boolean boolean7 = range4.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range4, (double) 0.0f);
        double double10 = range9.getUpperBound();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (-13733.0d));
        java.lang.String str13 = range9.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[99.0,-10.0]" + "'", str13, "Range[99.0,-10.0]");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) ' ', (-9138.5d));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.093143E7d), (double) 0.0f);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        java.lang.String str12 = range8.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Range[10.0,100.0]" + "'", str12, "Range[10.0,100.0]");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        java.lang.String str13 = range8.toString();
        double double14 = range8.getUpperBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range8, (double) 1L);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range19, (-10.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, (double) 0);
        double double24 = range21.getLength();
        boolean boolean27 = range21.intersects((-899.0d), 90.0d);
        java.lang.String str28 = range21.toString();
        boolean boolean30 = range21.equals((java.lang.Object) 10.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range8, range21);
        double double33 = range21.constrain((-1.0931465E7d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 90.0d + "'", double24 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Range[0.0,90.0]" + "'", str28, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range9, (double) (-1), 13.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range15, (double) 100L);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (-400.5d));
        java.lang.String str20 = range19.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Range[-400.5,100.0]" + "'", str20, "Range[-400.5,100.0]");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (-109.0d));
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range17, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range20, range23);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range29, (-1.0d), (double) (byte) 100);
        boolean boolean35 = range29.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range29, (-9.0d), (double) 100L);
        double double40 = range38.constrain(1.0d);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range26, range38);
        boolean boolean42 = range14.equals((java.lang.Object) range26);
        boolean boolean44 = range26.contains((-485.0d));
        boolean boolean45 = range4.equals((java.lang.Object) (-485.0d));
        double double46 = range4.getCentralValue();
        double double47 = range4.getLength();
        org.jfree.data.Range range50 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range53 = org.jfree.data.Range.expand(range50, (-1.0d), (double) (byte) 100);
        boolean boolean56 = range50.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range50, (-9.0d), (double) 100L);
        org.jfree.data.Range range61 = org.jfree.data.Range.expandToInclude(range59, (double) 1);
        org.jfree.data.Range range64 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range64, (double) (byte) -1);
        boolean boolean69 = range66.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range70 = org.jfree.data.Range.combine(range59, range66);
        org.jfree.data.Range range73 = org.jfree.data.Range.shift(range59, (double) (short) -1, false);
        org.jfree.data.Range range76 = org.jfree.data.Range.shift(range59, (double) 100, true);
        org.jfree.data.Range range77 = org.jfree.data.Range.combine(range4, range76);
        java.lang.Class<?> wildcardClass78 = range76.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-899.0d) + "'", double40 == (-899.0d));
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 44.5d + "'", double46 == 44.5d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-109.0d) + "'", double47 == (-109.0d));
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        java.lang.String str3 = range2.toString();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range6, (-109.0d));
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, (-71.0d), (-828.0d));
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (double) 100L);
        double double15 = range14.getLength();
        double double17 = range14.constrain(50.5d);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range2, range14);
        double double19 = range14.getLength();
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, (-1.0d), (double) (byte) 100);
        java.lang.String str26 = range25.toString();
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double30 = range29.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range29, 1.0d, true);
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range36, (-10.0d));
        boolean boolean39 = range29.equals((java.lang.Object) range38);
        double double40 = range38.getCentralValue();
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range25, range38);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range41, 45.0d, (double) '#');
        org.jfree.data.Range range47 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range50 = org.jfree.data.Range.expand(range47, (-1.0d), (double) (byte) 100);
        boolean boolean53 = range47.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range56 = org.jfree.data.Range.expand(range47, (-9.0d), (double) 100L);
        double double58 = range56.constrain(1.0d);
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range56, (double) (byte) 100);
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range56, (double) 'a');
        org.jfree.data.Range range63 = org.jfree.data.Range.combine(range44, range62);
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range62, (-71.0d), true);
        boolean boolean67 = range14.equals((java.lang.Object) (-71.0d));
        double double68 = range14.getUpperBound();
        org.jfree.data.Range range71 = org.jfree.data.Range.expand(range14, 4.5d, 71.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Range[10.0,100.0]" + "'", str3, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Range[1.0,-899.0]" + "'", str26, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-9.0d) + "'", double30 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 45.0d + "'", double40 == 45.0d);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-899.0d) + "'", double58 == (-899.0d));
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
        org.junit.Assert.assertNotNull(range71);
    }
}

