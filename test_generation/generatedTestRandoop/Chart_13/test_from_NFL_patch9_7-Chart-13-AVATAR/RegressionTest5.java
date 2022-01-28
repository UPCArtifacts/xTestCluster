import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 0L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (-449.0d), false);
        double double12 = range2.getCentralValue();
        boolean boolean14 = range2.contains(72.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 21.0d + "'", double12 == 21.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 5.5d, (double) 10.0f);
        double double17 = range16.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range16, 37189.0d, 5930.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-13662.0d) + "'", double17 == (-13662.0d));
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range8, (double) 100, 18630.0d);
        org.jfree.data.Range range16 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) 10L);
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range27, (-10.0d));
        org.jfree.data.Range range30 = org.jfree.data.Range.combine(range24, range27);
        org.jfree.data.Range range33 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range33, (-1.0d), (double) (byte) 100);
        boolean boolean39 = range33.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range33, (-9.0d), (double) 100L);
        double double44 = range42.constrain(1.0d);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range30, range42);
        boolean boolean46 = range16.equals((java.lang.Object) range45);
        org.jfree.data.Range range47 = org.jfree.data.Range.combine(range13, range45);
        java.lang.Class<?> wildcardClass48 = range45.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-899.0d) + "'", double44 == (-899.0d));
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, 6553.0d);
        boolean boolean8 = range2.intersects(71.0d, 32.0d);
        double double10 = range2.constrain((double) 0.0f);
        double double11 = range2.getLength();
        java.lang.Class<?> wildcardClass12 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jfree.data.Range range2 = new org.jfree.data.Range(55.5d, (-35.0d));
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        double double6 = range2.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 0.0d, true);
        boolean boolean12 = range2.intersects(232.75d, 18595.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range2, 0.0d, false);
        double double16 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jfree.data.Range range2 = new org.jfree.data.Range(37289.0d, 272.5d);
        double double3 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 272.5d + "'", double3 == 272.5d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        boolean boolean14 = range9.contains((double) '#');
        double double16 = range9.constrain((-4050.0d));
        java.lang.String str17 = range9.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[100.0,-9.0]" + "'", str17, "Range[100.0,-9.0]");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jfree.data.Range range2 = new org.jfree.data.Range(9816525.75d, (-104.5d));
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        boolean boolean6 = range2.intersects((-9.0d), (double) ' ');
        boolean boolean8 = range2.contains((double) (short) 0);
        double double9 = range2.getUpperBound();
        java.lang.Class<?> wildcardClass10 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean7 = range2.contains(5.5d);
        double double9 = range2.constrain(32.0d);
        double double11 = range2.constrain((-1.5d));
        boolean boolean14 = range2.intersects(307001.375d, 0.0d);
        java.lang.String str15 = range2.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Range[10.0,1.0]" + "'", str15, "Range[10.0,1.0]");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        java.lang.String str23 = range21.toString();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Range[854555.25,-1560023.25]" + "'", str23, "Range[854555.25,-1560023.25]");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range59, 5.5d);
        double double63 = range59.constrain((double) (short) 1);
        org.jfree.data.Range range65 = org.jfree.data.Range.expandToInclude(range59, (double) 1);
        boolean boolean68 = range59.intersects(1.0d, (double) (-1));
        org.jfree.data.Range range70 = org.jfree.data.Range.expandToInclude(range59, (-485.0d));
        org.jfree.data.Range range73 = org.jfree.data.Range.shift(range70, (-30636.0d), true);
        boolean boolean74 = range4.equals((java.lang.Object) range70);
        double double75 = range4.getLowerBound();
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
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-899.0d) + "'", double63 == (-899.0d));
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 99.0d + "'", double75 == 99.0d);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        double double67 = range20.getUpperBound();
        double double69 = range20.constrain(11871.0d);
        org.jfree.data.Range range72 = org.jfree.data.Range.expand(range20, (double) 'a', (double) (byte) -1);
        org.jfree.data.Range range74 = org.jfree.data.Range.shift(range20, (double) 'a');
        double double75 = range74.getUpperBound();
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
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-898.0d) + "'", double67 == (-898.0d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-898.0d) + "'", double69 == (-898.0d));
        org.junit.Assert.assertNotNull(range72);
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-801.0d) + "'", double75 == (-801.0d));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        double double19 = range11.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 90.0d + "'", double16 == 90.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 90.0d + "'", double19 == 90.0d);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (-933.0d));
        double double12 = range2.getLowerBound();
        double double13 = range2.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range2, (-1820.75d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.5d + "'", double13 == 45.5d);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, 72.0d, true);
        org.jfree.data.Range range58 = org.jfree.data.Range.shift(range53, 743473.0d);
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range53, (-1820.75d), true);
        java.lang.String str62 = range61.toString();
        org.jfree.data.Range range64 = org.jfree.data.Range.expandToInclude(range61, 5549.5d);
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
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Range[-1810.75,-1819.75]" + "'", str62, "Range[-1810.75,-1819.75]");
        org.junit.Assert.assertNotNull(range64);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range14.getLowerBound();
        java.lang.Object obj16 = null;
        boolean boolean17 = range14.equals(obj16);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 464.5d + "'", double15 == 464.5d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double11 = range8.getCentralValue();
        double double13 = range8.constrain((double) 'a');
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range8, (-65.5d), (-17.75d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.5d + "'", double11 == 15.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 11.0d + "'", double13 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range13.constrain(494.0d);
        double double16 = range13.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-893.5d) + "'", double15 == (-893.5d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-893.5d) + "'", double16 == (-893.5d));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range18, (-449.0d));
        double double22 = range20.constrain(33.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range20, (-83.5d), false);
        boolean boolean28 = range25.intersects(9047.5d, (-41.0d));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Range[10.0,100.0]" + "'", str3, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 100);
        boolean boolean7 = range2.intersects(0.0d, 931.0d);
        double double8 = range2.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jfree.data.Range range2 = new org.jfree.data.Range(55.5d, (-85631.0d));
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
        boolean boolean40 = range33.intersects(190.0d, 71.0d);
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range33, 232.75d, false);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(range43);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 100.0f, 2.9501708E8d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, 45.0d, true);
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range8, (-9138.5d));
        double double11 = range10.getCentralValue();
        double double12 = range10.getUpperBound();
        boolean boolean14 = range10.contains((-399.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-4551.25d) + "'", double11 == (-4551.25d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 36.0d + "'", double12 == 36.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        boolean boolean40 = range35.contains((-899.0d));
        boolean boolean43 = range35.intersects(90.0d, 11019.5d);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        boolean boolean40 = range33.intersects(190.0d, 71.0d);
        java.lang.String str41 = range33.toString();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Range[0.0,0.0]" + "'", str41, "Range[0.0,0.0]");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range20, 52.0d);
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
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jfree.data.Range range2 = new org.jfree.data.Range(91.0d, 27.5d);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double14 = range13.getUpperBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range13, (double) (-1.0f), true);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range17, (-31535.0d), true);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (-1.0d), (double) (byte) 100);
        boolean boolean29 = range23.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range23, (-9.0d), (double) 100L);
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range32, (double) 1);
        org.jfree.data.Range range37 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range37, (double) (byte) -1);
        boolean boolean42 = range39.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range32, range39);
        org.jfree.data.Range range46 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range49 = org.jfree.data.Range.expand(range46, (-1.0d), (double) (byte) 100);
        boolean boolean52 = range46.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range55 = org.jfree.data.Range.expand(range46, (-9.0d), (double) 100L);
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range43, range46);
        org.jfree.data.Range range58 = org.jfree.data.Range.shift(range56, (double) (short) 1);
        double double59 = range56.getLowerBound();
        boolean boolean61 = range56.contains(11044.5d);
        org.jfree.data.Range range62 = org.jfree.data.Range.combine(range20, range56);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-893.5d) + "'", double14 == (-893.5d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-71.0d) + "'", double59 == (-71.0d));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(range62);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double3 = range2.getUpperBound();
        double double5 = range2.constrain(0.0d);
        double double6 = range2.getCentralValue();
        double double8 = range2.constrain((-9929.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9.0d) + "'", double5 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 45.5d + "'", double6 == 45.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, 32.0d, 45.0d);
        boolean boolean40 = range38.contains(206.0d);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        boolean boolean84 = range77.intersects(89.875d, 5549.5d);
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
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        double double8 = range5.getLowerBound();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range5, 17.5d);
        double double11 = range10.getUpperBound();
        double double12 = range10.getCentralValue();
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range10, 7.75d);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-479.5d), (-1792.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 91.0d + "'", double11 == 91.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 46.0d + "'", double12 == 46.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        boolean boolean30 = range26.contains((-799.0d));
        double double31 = range26.getCentralValue();
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range26, (-321401.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 14.5d + "'", double31 == 14.5d);
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
        boolean boolean44 = range41.intersects((-882.5d), 496485.0d);
        boolean boolean46 = range41.equals((java.lang.Object) 232.75d);
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        double double87 = range80.getCentralValue();
        double double88 = range80.getUpperBound();
        org.jfree.data.Range range91 = org.jfree.data.Range.shift(range80, 0.0d, false);
        double double92 = range91.getLength();
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
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 45.0d + "'", double87 == 45.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 90.0d + "'", double88 == 90.0d);
        org.junit.Assert.assertNotNull(range91);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 90.0d + "'", double92 == 90.0d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-184.75d), (-449.0d));
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jfree.data.Range range2 = new org.jfree.data.Range(99.0d, 5.90028264E8d);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (double) (byte) 100, true);
        double double17 = range11.getCentralValue();
        double double18 = range11.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-485.0d) + "'", double17 == (-485.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-71.0d) + "'", double18 == (-71.0d));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0, (double) 0);
        boolean boolean5 = range2.intersects((double) (short) 1, 0.0d);
        java.lang.Class<?> wildcardClass6 = range2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        boolean boolean14 = range9.contains((double) '#');
        double double15 = range9.getCentralValue();
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range9, 0.0d, 6109.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 45.5d + "'", double15 == 45.5d);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        boolean boolean10 = range4.contains((-109.0d));
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range4, (double) (short) -1, (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range4, (double) (byte) 100);
        java.lang.String str16 = range15.toString();
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range15, (-799.0d), (-894.5d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[0.0,100.0]" + "'", str16, "Range[0.0,100.0]");
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        double double10 = range9.getLowerBound();
        boolean boolean12 = range9.contains((-1792.5d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 71.0d, (double) 10);
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range26, (-1.0d), (double) (byte) 100);
        boolean boolean32 = range26.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range26, (-9.0d), (double) 100L);
        double double37 = range35.constrain(1.0d);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range35, (double) (byte) 100);
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range35, (double) 'a');
        double double42 = range35.getUpperBound();
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range20, range35);
        double double44 = range20.getCentralValue();
        org.jfree.data.Range range47 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range50 = org.jfree.data.Range.expand(range47, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range53 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range53, (-10.0d));
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range50, range53);
        org.jfree.data.Range range59 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range62 = org.jfree.data.Range.expand(range59, (-1.0d), (double) (byte) 100);
        boolean boolean65 = range59.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range68 = org.jfree.data.Range.expand(range59, (-9.0d), (double) 100L);
        double double70 = range68.constrain(1.0d);
        org.jfree.data.Range range71 = org.jfree.data.Range.combine(range56, range68);
        org.jfree.data.Range range74 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range77 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range80 = org.jfree.data.Range.expand(range77, (-1.0d), (double) (byte) 100);
        boolean boolean83 = range77.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range86 = org.jfree.data.Range.expand(range77, (-9.0d), (double) 100L);
        double double88 = range86.constrain(1.0d);
        boolean boolean89 = range74.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range90 = org.jfree.data.Range.combine(range71, range74);
        org.jfree.data.Range range93 = org.jfree.data.Range.shift(range74, 10974.5d, false);
        org.jfree.data.Range range94 = org.jfree.data.Range.combine(range20, range74);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-899.0d) + "'", double37 == (-899.0d));
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-899.0d) + "'", double42 == (-899.0d));
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 2827.0d + "'", double44 == 2827.0d);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-899.0d) + "'", double70 == (-899.0d));
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertNotNull(range80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(range86);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-899.0d) + "'", double88 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(range90);
        org.junit.Assert.assertNotNull(range93);
        org.junit.Assert.assertNotNull(range94);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        boolean boolean37 = range2.contains(18630.0d);
        double double38 = range2.getUpperBound();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 15.5d + "'", double38 == 15.5d);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        boolean boolean12 = range5.intersects((-893.5d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range5, 0.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, 0.0d, 0.0d);
        double double19 = range17.constrain((-933.0d));
        boolean boolean21 = range17.contains((-13662.0d));
        double double22 = range17.getUpperBound();
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) (short) 10, (-9.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range25, (-385.0d), true);
        boolean boolean30 = range25.contains((-933.0d));
        boolean boolean31 = range17.equals((java.lang.Object) (-933.0d));
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range17, 0.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 91.0d + "'", double22 == 91.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        java.lang.Class<?> wildcardClass11 = range8.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        boolean boolean10 = range4.contains((-109.0d));
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range4, (double) (short) -1, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range4, 5.5d, true);
        double double17 = range16.getCentralValue();
        boolean boolean20 = range16.intersects((double) 100L, 104.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.5d + "'", double17 == 50.5d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        boolean boolean25 = range22.intersects(10.0d, 55.0d);
        java.lang.Class<?> wildcardClass26 = range22.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jfree.data.Range range2 = new org.jfree.data.Range(21843.25d, 7452.0d);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        java.lang.Class<?> wildcardClass64 = range48.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        boolean boolean55 = range38.contains((-30636.0d));
        org.jfree.data.Range range58 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range58, (double) 10L);
        org.jfree.data.Range range61 = org.jfree.data.Range.combine(range38, range58);
        double double62 = range58.getUpperBound();
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-5465726.0d), 10612.5d);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range18 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean19 = range11.equals((java.lang.Object) (-10.0d));
        double double20 = range11.getCentralValue();
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range11, (-4915.0d), 71.0d);
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        java.lang.String str27 = range26.toString();
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range30, (-109.0d));
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range33, (-71.0d), (-828.0d));
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range36, (double) 100L);
        double double39 = range38.getLength();
        double double41 = range38.constrain(50.5d);
        org.jfree.data.Range range42 = org.jfree.data.Range.combine(range26, range38);
        double double43 = range38.getLength();
        org.jfree.data.Range range46 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range49 = org.jfree.data.Range.expand(range46, (-1.0d), (double) (byte) 100);
        java.lang.String str50 = range49.toString();
        org.jfree.data.Range range53 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double54 = range53.getLength();
        org.jfree.data.Range range57 = org.jfree.data.Range.shift(range53, 1.0d, true);
        org.jfree.data.Range range60 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range62 = org.jfree.data.Range.shift(range60, (-10.0d));
        boolean boolean63 = range53.equals((java.lang.Object) range62);
        double double64 = range62.getCentralValue();
        org.jfree.data.Range range65 = org.jfree.data.Range.combine(range49, range62);
        org.jfree.data.Range range68 = org.jfree.data.Range.expand(range65, 45.0d, (double) '#');
        org.jfree.data.Range range71 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range74 = org.jfree.data.Range.expand(range71, (-1.0d), (double) (byte) 100);
        boolean boolean77 = range71.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range80 = org.jfree.data.Range.expand(range71, (-9.0d), (double) 100L);
        double double82 = range80.constrain(1.0d);
        org.jfree.data.Range range84 = org.jfree.data.Range.shift(range80, (double) (byte) 100);
        org.jfree.data.Range range86 = org.jfree.data.Range.expandToInclude(range80, (double) 'a');
        org.jfree.data.Range range87 = org.jfree.data.Range.combine(range68, range86);
        org.jfree.data.Range range90 = org.jfree.data.Range.shift(range86, (-71.0d), true);
        boolean boolean91 = range38.equals((java.lang.Object) (-71.0d));
        double double92 = range38.getUpperBound();
        boolean boolean93 = range23.equals((java.lang.Object) range38);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-485.0d) + "'", double20 == (-485.0d));
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Range[10.0,100.0]" + "'", str27, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Range[1.0,-899.0]" + "'", str50, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-9.0d) + "'", double54 == (-9.0d));
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 45.0d + "'", double64 == 45.0d);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(range80);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-899.0d) + "'", double82 == (-899.0d));
        org.junit.Assert.assertNotNull(range84);
        org.junit.Assert.assertNotNull(range86);
        org.junit.Assert.assertNotNull(range87);
        org.junit.Assert.assertNotNull(range90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 100.0d + "'", double92 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getUpperBound();
        boolean boolean15 = range11.contains((double) (-1.0f));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range11, 20.0d, false);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range11, (-112.5d), (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-10.0d), true);
        boolean boolean13 = range2.intersects(0.0d, (-41.0d));
        java.lang.Class<?> wildcardClass14 = range2.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range4.getUpperBound();
        double double6 = range4.getLength();
        boolean boolean9 = range4.intersects((-119.0d), 307001.375d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        double double4 = range2.getCentralValue();
        double double5 = range2.getCentralValue();
        java.lang.Class<?> wildcardClass6 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.5d) + "'", double4 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.5d) + "'", double5 == (-0.5d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        double double22 = range21.getLength();
        double double23 = range21.getCentralValue();
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double27 = range26.getLength();
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range26, 1.0d, true);
        double double31 = range26.getLength();
        boolean boolean33 = range26.equals((java.lang.Object) (-109.0d));
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range21, range26);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 90.0d + "'", double22 == 90.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 45.0d + "'", double23 == 45.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-9.0d) + "'", double27 == (-9.0d));
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 5.5d, (double) 10.0f);
        boolean boolean18 = range13.contains((double) (byte) -1);
        double double19 = range13.getUpperBound();
        double double20 = range13.getLength();
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (-10.0d));
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range26, range29);
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, (-1.0d), (double) (byte) 100);
        boolean boolean41 = range35.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range35, (-9.0d), (double) 100L);
        double double46 = range44.constrain(1.0d);
        org.jfree.data.Range range47 = org.jfree.data.Range.combine(range32, range44);
        org.jfree.data.Range range50 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range53 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range56 = org.jfree.data.Range.expand(range53, (-1.0d), (double) (byte) 100);
        boolean boolean59 = range53.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range62 = org.jfree.data.Range.expand(range53, (-9.0d), (double) 100L);
        double double64 = range62.constrain(1.0d);
        boolean boolean65 = range50.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range66 = org.jfree.data.Range.combine(range47, range50);
        boolean boolean67 = range13.equals((java.lang.Object) range66);
        double double68 = range13.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-893.5d) + "'", double19 == (-893.5d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-828.0d) + "'", double20 == (-828.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-899.0d) + "'", double46 == (-899.0d));
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-899.0d) + "'", double64 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-65.5d) + "'", double68 == (-65.5d));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-10.0d));
        double double12 = range2.constrain(44.5d);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range2, (-484.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range2, (-385.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range2, (-36810.0d));
        java.lang.String str19 = range2.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[10.0,1.0]" + "'", str19, "Range[10.0,1.0]");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 100, 11.0d);
        boolean boolean4 = range2.equals((java.lang.Object) (-485.0d));
        boolean boolean7 = range2.intersects((double) 10.0f, 99.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, (double) (byte) 100, (-331.75d));
        org.jfree.data.Range range13 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean15 = range13.contains((double) 'a');
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range13, (double) (byte) 0);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range13, (double) 0L);
        double double20 = range13.getUpperBound();
        boolean boolean23 = range13.intersects(168.0d, 0.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range2, range13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        double double6 = range2.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 0.0d, true);
        double double10 = range9.getLowerBound();
        double double12 = range9.constrain((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        org.jfree.data.Range range68 = org.jfree.data.Range.expandToInclude(range20, 48.0d);
        org.jfree.data.Range range71 = org.jfree.data.Range.expand(range20, (-41.0d), 494.0d);
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
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range71);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, 0.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (-1800.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range24, 206.0d);
        double double27 = range24.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4753.0d + "'", double27 == 4753.0d);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1L);
        boolean boolean19 = range17.contains((-13662.0d));
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range17, (double) (byte) 10);
        double double23 = range21.constrain((double) (byte) 0);
        double double24 = range21.getLowerBound();
        double double25 = range21.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        double double55 = range38.constrain(110.0d);
        org.jfree.data.Range range58 = org.jfree.data.Range.expand(range38, (-1.74063473780276736E17d), 0.5d);
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
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 44.5d + "'", double55 == 44.5d);
        org.junit.Assert.assertNotNull(range58);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (double) (byte) 100, true);
        double double17 = range11.getCentralValue();
        java.lang.String str18 = range11.toString();
        double double19 = range11.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-485.0d) + "'", double17 == (-485.0d));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-899.0d) + "'", double19 == (-899.0d));
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        boolean boolean30 = range23.intersects((double) (byte) 1, 0.0d);
        double double31 = range23.getLowerBound();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10974.5d + "'", double31 == 10974.5d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-0.5d), (-71.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) 1, 0.0d);
        double double6 = range5.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) (byte) 100, (-900.0d));
        double double7 = range2.getLowerBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range2, (-1.0d));
        java.lang.String str10 = range9.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[-1.0,0.0]" + "'", str10, "Range[-1.0,0.0]");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range6, (-13662.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, 10.0d, 32.0d);
        double double13 = range11.constrain((-9929.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9929.0d) + "'", double13 == (-9929.0d));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        double double34 = range33.getLength();
        double double35 = range33.getLowerBound();
        org.jfree.data.Range range38 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range38, (-10.0d));
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range40, (double) 0);
        double double43 = range40.getLength();
        boolean boolean46 = range40.intersects((-899.0d), 90.0d);
        double double47 = range40.getLength();
        org.jfree.data.Range range50 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range53 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range56 = org.jfree.data.Range.expand(range53, (-1.0d), (double) (byte) 100);
        boolean boolean59 = range53.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range62 = org.jfree.data.Range.expand(range53, (-9.0d), (double) 100L);
        double double64 = range62.constrain(1.0d);
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range62, (double) (byte) 100);
        org.jfree.data.Range range68 = org.jfree.data.Range.expandToInclude(range62, (double) 'a');
        org.jfree.data.Range range71 = org.jfree.data.Range.expand(range62, (-1.0d), (-9.0d));
        org.jfree.data.Range range74 = org.jfree.data.Range.shift(range62, 0.0d, true);
        org.jfree.data.Range range75 = org.jfree.data.Range.combine(range50, range74);
        org.jfree.data.Range range78 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double79 = range78.getLength();
        double double80 = range78.getLowerBound();
        org.jfree.data.Range range81 = org.jfree.data.Range.combine(range75, range78);
        boolean boolean82 = range40.equals((java.lang.Object) range78);
        org.jfree.data.Range range83 = org.jfree.data.Range.combine(range33, range40);
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 91.0d + "'", double34 == 91.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 90.0d + "'", double43 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 90.0d + "'", double47 == 90.0d);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-899.0d) + "'", double64 == (-899.0d));
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertNotNull(range75);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-9.0d) + "'", double79 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(range83);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-10.0d), false);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, 107.25d, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range10, 6553.0d, 0.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range10, (-942.0d));
        double double19 = range10.getUpperBound();
        org.jfree.data.Range range22 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (double) 10L);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range24, (-9.0d), true);
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range27, 99.0d, true);
        boolean boolean31 = range10.equals((java.lang.Object) 99.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-199.0d), (-10954.5d));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) -1, 15.5d);
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-0.5d), false);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.5886691E7d), 45.5d);
        java.lang.String str9 = range8.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Range[2.621304E8,765.75]" + "'", str9, "Range[2.621304E8,765.75]");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) -1, 21.0d);
        double double3 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 22.0d + "'", double3 == 22.0d);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range3 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean5 = range3.contains((double) 'a');
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range3, (double) (byte) 0);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range3, (double) 0L);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, 484.0d, false);
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range15, (-1.0d), (double) (byte) 100);
        boolean boolean21 = range15.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range15, (-9.0d), (double) 100L);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range24, 5.5d);
        org.jfree.data.Range range29 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double30 = range29.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range29, 1.0d, true);
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range36, (-10.0d));
        boolean boolean39 = range29.equals((java.lang.Object) range38);
        boolean boolean40 = range24.equals((java.lang.Object) range38);
        org.jfree.data.Range range43 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range43, (-1.0d), (double) (byte) 100);
        boolean boolean49 = range43.intersects((double) (byte) -1, (double) (short) -1);
        double double50 = range43.getCentralValue();
        double double51 = range43.getLength();
        double double52 = range43.getLength();
        org.jfree.data.Range range53 = org.jfree.data.Range.combine(range38, range43);
        double double54 = range43.getLowerBound();
        org.jfree.data.Range range55 = org.jfree.data.Range.combine(range12, range43);
        org.jfree.data.Range range58 = org.jfree.data.Range.expand(range12, (-1100799.0d), 10.0d);
        org.jfree.data.Range range61 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range64 = org.jfree.data.Range.expand(range61, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range67 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range69 = org.jfree.data.Range.shift(range67, (-10.0d));
        org.jfree.data.Range range70 = org.jfree.data.Range.combine(range64, range67);
        org.jfree.data.Range range73 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range75 = org.jfree.data.Range.shift(range73, (-10.0d));
        org.jfree.data.Range range76 = org.jfree.data.Range.combine(range64, range73);
        double double77 = range73.getLowerBound();
        org.jfree.data.Range range79 = org.jfree.data.Range.shift(range73, (double) (byte) -1);
        double double81 = range73.constrain(90.0d);
        org.jfree.data.Range range82 = org.jfree.data.Range.combine(range12, range73);
        org.jfree.data.Range range83 = org.jfree.data.Range.combine(range0, range12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-9.0d) + "'", double30 == (-9.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 5.5d + "'", double50 == 5.5d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-9.0d) + "'", double51 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-9.0d) + "'", double52 == (-9.0d));
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range75);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 90.0d + "'", double81 == 90.0d);
        org.junit.Assert.assertNotNull(range82);
        org.junit.Assert.assertNotNull(range83);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        boolean boolean7 = range4.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range4, (double) 0.0f);
        double double10 = range9.getUpperBound();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (-13733.0d));
        double double13 = range12.getLowerBound();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range12, 11045.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        double double7 = range5.getLength();
        double double8 = range5.getCentralValue();
        double double9 = range5.getCentralValue();
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range5, 6108.5d);
        double double12 = range5.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-900.0d) + "'", double7 == (-900.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-449.0d) + "'", double8 == (-449.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-449.0d) + "'", double9 == (-449.0d));
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-900.0d) + "'", double12 == (-900.0d));
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) -1, 90.0d);
        org.jfree.data.Range range5 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, (double) (byte) -1);
        double double9 = range7.constrain((double) 0L);
        boolean boolean11 = range7.contains(168.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range14, (-109.0d));
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, (-10.0d));
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range23, range26);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (-1.0d), (double) (byte) 100);
        boolean boolean38 = range32.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range32, (-9.0d), (double) 100L);
        double double43 = range41.constrain(1.0d);
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range29, range41);
        boolean boolean45 = range17.equals((java.lang.Object) range29);
        boolean boolean47 = range29.contains((-485.0d));
        boolean boolean48 = range7.equals((java.lang.Object) (-485.0d));
        double double49 = range7.getCentralValue();
        double double50 = range7.getLength();
        org.jfree.data.Range range53 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range56 = org.jfree.data.Range.expand(range53, (-1.0d), (double) (byte) 100);
        boolean boolean59 = range53.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range62 = org.jfree.data.Range.expand(range53, (-9.0d), (double) 100L);
        org.jfree.data.Range range64 = org.jfree.data.Range.expandToInclude(range62, (double) 1);
        org.jfree.data.Range range67 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range69 = org.jfree.data.Range.shift(range67, (double) (byte) -1);
        boolean boolean72 = range69.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range73 = org.jfree.data.Range.combine(range62, range69);
        org.jfree.data.Range range76 = org.jfree.data.Range.shift(range62, (double) (short) -1, false);
        org.jfree.data.Range range79 = org.jfree.data.Range.shift(range62, (double) 100, true);
        org.jfree.data.Range range80 = org.jfree.data.Range.combine(range7, range79);
        org.jfree.data.Range range83 = org.jfree.data.Range.shift(range79, (-9173.5d), false);
        org.jfree.data.Range range84 = null;
        org.jfree.data.Range range86 = org.jfree.data.Range.expandToInclude(range84, (-141.0d));
        boolean boolean87 = range83.equals((java.lang.Object) range86);
        double double88 = range86.getCentralValue();
        org.jfree.data.Range range90 = org.jfree.data.Range.expandToInclude(range86, (-882.5d));
        org.jfree.data.Range range91 = org.jfree.data.Range.combine(range2, range90);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-10.0d) + "'", double9 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9.0d) + "'", double15 == (-9.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-899.0d) + "'", double43 == (-899.0d));
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 44.5d + "'", double49 == 44.5d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-109.0d) + "'", double50 == (-109.0d));
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertNotNull(range80);
        org.junit.Assert.assertNotNull(range83);
        org.junit.Assert.assertNotNull(range86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-141.0d) + "'", double88 == (-141.0d));
        org.junit.Assert.assertNotNull(range90);
        org.junit.Assert.assertNotNull(range91);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        boolean boolean15 = range11.equals((java.lang.Object) '4');
        java.lang.String str16 = range11.toString();
        double double17 = range11.getLowerBound();
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, (-10.0d));
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range23, range26);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (-1.0d), (double) (byte) 100);
        boolean boolean38 = range32.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range32, (-9.0d), (double) 100L);
        double double43 = range41.constrain(1.0d);
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range29, range41);
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range44, 20.0d);
        org.jfree.data.Range range49 = org.jfree.data.Range.expand(range46, 1.0d, (double) ' ');
        double double51 = range49.constrain(48.5d);
        boolean boolean52 = range11.equals((java.lang.Object) 48.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[-71.0,-899.0]" + "'", str16, "Range[-71.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-71.0d) + "'", double17 == (-71.0d));
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-899.0d) + "'", double43 == (-899.0d));
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 48.5d + "'", double51 == 48.5d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.jfree.data.Range range2 = new org.jfree.data.Range(53.625d, 464.5d);
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        double double4 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        java.lang.String str23 = range20.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Range[10.0,10.0]" + "'", str23, "Range[10.0,10.0]");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 0L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (double) (byte) -1, true);
        boolean boolean13 = range11.contains(61.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range11, (double) 'a', (-818.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range11, (-41.0d));
        boolean boolean20 = range11.contains(7.25d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range5.intersects((double) (byte) 10, 10.0d);
        java.lang.String str9 = range5.toString();
        java.lang.String str10 = range5.toString();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range5, (double) 0.0f, false);
        boolean boolean15 = range5.contains(4753.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Range[1.0,-899.0]" + "'", str9, "Range[1.0,-899.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[1.0,-899.0]" + "'", str10, "Range[1.0,-899.0]");
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, 272.5d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        boolean boolean40 = range34.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range43 = org.jfree.data.Range.expand(range34, (-9.0d), (double) 100L);
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range31, range34);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range31, (double) 100);
        double double47 = range31.getLowerBound();
        org.jfree.data.Range range48 = org.jfree.data.Range.combine(range5, range31);
        org.jfree.data.Range range51 = org.jfree.data.Range.expand(range5, 5.90028264E8d, (-321401.0d));
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
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-71.0d) + "'", double47 == (-71.0d));
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range51);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        double double30 = range11.constrain(0.0d);
        java.lang.String str31 = range11.toString();
        boolean boolean34 = range11.intersects(48.5d, 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-899.0d) + "'", double30 == (-899.0d));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Range[-71.0,-899.0]" + "'", str31, "Range[-71.0,-899.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range28, 72.0d);
        double double31 = range30.getCentralValue();
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 86.0d + "'", double31 == 86.0d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.jfree.data.Range range2 = new org.jfree.data.Range(62.0d, 5572.0d);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, (-1.0d), (double) (byte) 100);
        boolean boolean36 = range30.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range30, (-9.0d), (double) 100L);
        double double41 = range39.constrain(1.0d);
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range39, (double) (byte) 100);
        org.jfree.data.Range range45 = org.jfree.data.Range.expandToInclude(range39, (double) 'a');
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range39, (-1.0d), (-9.0d));
        org.jfree.data.Range range51 = org.jfree.data.Range.shift(range39, 0.0d, true);
        org.jfree.data.Range range53 = org.jfree.data.Range.expandToInclude(range39, (double) (short) 1);
        boolean boolean55 = range53.contains(100.0d);
        org.jfree.data.Range range58 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double59 = range58.getLength();
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range58, (-109.0d));
        boolean boolean62 = range53.equals((java.lang.Object) range61);
        org.jfree.data.Range range65 = org.jfree.data.Range.shift(range61, (-449.0d), false);
        org.jfree.data.Range range68 = org.jfree.data.Range.shift(range65, (double) 0.0f, false);
        boolean boolean69 = range2.equals((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass70 = range2.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-899.0d) + "'", double41 == (-899.0d));
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-9.0d) + "'", double59 == (-9.0d));
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        boolean boolean40 = range34.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range43 = org.jfree.data.Range.expand(range34, (-9.0d), (double) 100L);
        org.jfree.data.Range range44 = org.jfree.data.Range.combine(range31, range34);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range31, (double) 100);
        double double47 = range31.getLowerBound();
        org.jfree.data.Range range48 = org.jfree.data.Range.combine(range5, range31);
        double double50 = range5.constrain((-2342.5d));
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
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-71.0d) + "'", double47 == (-71.0d));
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) 10, 11.0d);
        double double5 = range3.constrain((-13662.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range3, 91.0d);
        org.jfree.data.Range range8 = org.jfree.data.Range.combine(range0, range3);
        double double9 = range3.getLength();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double14 = range11.constrain((double) (-1));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, 5548.0d);
        boolean boolean18 = range11.equals((java.lang.Object) (-9138.5d));
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range11, (-9138.5d), 7452.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        double double55 = range44.getCentralValue();
        org.jfree.data.Range range57 = org.jfree.data.Range.shift(range44, (-3064.5d));
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
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 45.0d + "'", double55 == 45.0d);
        org.junit.Assert.assertNotNull(range57);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        boolean boolean30 = range26.contains((-799.0d));
        double double31 = range26.getCentralValue();
        double double32 = range26.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 14.5d + "'", double31 == 14.5d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        java.lang.Class<?> wildcardClass73 = range54.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        org.jfree.data.Range range68 = org.jfree.data.Range.expandToInclude(range20, 48.0d);
        org.jfree.data.Range range71 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range74 = org.jfree.data.Range.expand(range71, (-1.0d), (double) (byte) 100);
        boolean boolean77 = range71.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range80 = org.jfree.data.Range.expand(range71, (-9.0d), (double) 100L);
        org.jfree.data.Range range82 = org.jfree.data.Range.expandToInclude(range80, (double) 1);
        org.jfree.data.Range range84 = org.jfree.data.Range.expandToInclude(range82, 15.5d);
        double double86 = range82.constrain((double) ' ');
        boolean boolean87 = range68.equals((java.lang.Object) range82);
        double double88 = range68.getUpperBound();
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
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(range80);
        org.junit.Assert.assertNotNull(range82);
        org.junit.Assert.assertNotNull(range84);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 1.0d + "'", double86 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 48.0d + "'", double88 == 48.0d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        org.jfree.data.Range range69 = org.jfree.data.Range.shift(range20, 51.0d, true);
        double double70 = range20.getUpperBound();
        double double71 = range20.getUpperBound();
        double double72 = range20.getLowerBound();
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
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-898.0d) + "'", double70 == (-898.0d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-898.0d) + "'", double71 == (-898.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-70.0d) + "'", double72 == (-70.0d));
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        double double18 = range11.getLength();
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        boolean boolean22 = range11.equals((java.lang.Object) 10.0f);
        double double23 = range11.getUpperBound();
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range11, 0.0d);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-13733.0d), (-20.5d));
        java.lang.Class<?> wildcardClass29 = range28.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-899.0d) + "'", double23 == (-899.0d));
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-0.5d), (-71.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) 1, 0.0d);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, (-161858.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (-799.0d));
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        double double9 = range2.getLowerBound();
        boolean boolean12 = range2.intersects((double) (byte) 10, 0.0d);
        boolean boolean14 = range2.contains((-71.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range2, (-345.0d));
        double double17 = range16.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean4 = range2.equals((java.lang.Object) 100L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 18630.0d, true);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range7, 1866.25d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1.0f, 0.0d);
        double double3 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-4.0d), 1907.25d);
        boolean boolean4 = range2.contains((double) (byte) 1);
        double double5 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1907.25d + "'", double5 == 1907.25d);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, 90.0d, false);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) 100.0f);
        double double9 = range2.getCentralValue();
        java.lang.Class<?> wildcardClass10 = range2.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 55.0d + "'", double9 == 55.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.jfree.data.Range range2 = new org.jfree.data.Range(83849.0d, 5527.25d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.jfree.data.Range range2 = new org.jfree.data.Range(13.0d, (-130824.0d));
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        org.jfree.data.Range range40 = org.jfree.data.Range.expandToInclude(range11, (-385.0d));
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range11, 48.5d, false);
        double double44 = range11.getLowerBound();
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
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-71.0d) + "'", double44 == (-71.0d));
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range18 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean19 = range11.equals((java.lang.Object) (-10.0d));
        boolean boolean22 = range11.intersects(3.0085892E7d, 7.25d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
        boolean boolean55 = range38.contains((-30636.0d));
        org.jfree.data.Range range58 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range58, (double) 10L);
        org.jfree.data.Range range61 = org.jfree.data.Range.combine(range38, range58);
        double double62 = range38.getLowerBound();
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10999.0d + "'", double62 == 10999.0d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, 44.5d, (-799.0d));
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.combine(range2, range10);
        double double15 = range10.getLength();
        double double17 = range10.constrain((-119.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9.0d) + "'", double15 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) (-1.0f));
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, 0.0d, false);
        double double13 = range8.constrain((-44.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-11.0d) + "'", double13 == (-11.0d));
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        org.jfree.data.Range range66 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range69 = org.jfree.data.Range.expand(range66, (-1.0d), (double) (byte) 100);
        java.lang.String str70 = range69.toString();
        org.jfree.data.Range range73 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double74 = range73.getLength();
        org.jfree.data.Range range77 = org.jfree.data.Range.shift(range73, 1.0d, true);
        org.jfree.data.Range range80 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range82 = org.jfree.data.Range.shift(range80, (-10.0d));
        boolean boolean83 = range73.equals((java.lang.Object) range82);
        double double84 = range82.getCentralValue();
        org.jfree.data.Range range85 = org.jfree.data.Range.combine(range69, range82);
        double double86 = range85.getLowerBound();
        boolean boolean89 = range85.intersects((-893.5d), 168.0d);
        boolean boolean91 = range85.contains((double) 0);
        java.lang.String str92 = range85.toString();
        org.jfree.data.Range range93 = org.jfree.data.Range.combine(range5, range85);
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
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Range[1.0,-899.0]" + "'", str70, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-9.0d) + "'", double74 == (-9.0d));
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertNotNull(range82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 45.0d + "'", double84 == 45.0d);
        org.junit.Assert.assertNotNull(range85);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Range[0.0,90.0]" + "'", str92, "Range[0.0,90.0]");
        org.junit.Assert.assertNotNull(range93);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        double double78 = range4.getCentralValue();
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
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 44.5d + "'", double78 == 44.5d);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
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
        org.jfree.data.Range range28 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range28, (double) (byte) -1);
        double double32 = range30.constrain((double) 0L);
        boolean boolean34 = range30.contains(168.0d);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range30, 0.0d, 91.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range37, (double) (short) 1, false);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range37, 55.0d);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range10, range37);
        double double44 = range43.getLength();
        org.jfree.data.Range range47 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range47, (double) (byte) -1);
        org.jfree.data.Range range52 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double53 = range52.getUpperBound();
        org.jfree.data.Range range54 = org.jfree.data.Range.combine(range47, range52);
        org.jfree.data.Range range57 = org.jfree.data.Range.shift(range54, (double) (-1), false);
        org.jfree.data.Range range60 = org.jfree.data.Range.expand(range54, (double) (-1), 13.0d);
        org.jfree.data.Range range62 = org.jfree.data.Range.shift(range60, (double) (byte) 100);
        org.jfree.data.Range range65 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range68 = org.jfree.data.Range.expand(range65, (-1.0d), (double) (byte) 100);
        boolean boolean71 = range65.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range74 = org.jfree.data.Range.expand(range65, (-9.0d), (double) 100L);
        org.jfree.data.Range range77 = org.jfree.data.Range.expand(range74, 45.0d, (-9.0d));
        double double78 = range77.getUpperBound();
        java.lang.Object obj79 = null;
        boolean boolean80 = range77.equals(obj79);
        double double81 = range77.getUpperBound();
        org.jfree.data.Range range82 = org.jfree.data.Range.combine(range62, range77);
        org.jfree.data.Range range83 = org.jfree.data.Range.combine(range43, range62);
        double double84 = range83.getLowerBound();
        double double85 = range83.getLength();
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
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-10.0d) + "'", double32 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-9.0d) + "'", double53 == (-9.0d));
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 6553.0d + "'", double78 == 6553.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 6553.0d + "'", double81 == 6553.0d);
        org.junit.Assert.assertNotNull(range82);
        org.junit.Assert.assertNotNull(range83);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 100.0d + "'", double85 == 100.0d);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        double double50 = range29.constrain((-996.0d));
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
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range3, (-1.0d), (double) (byte) 100);
        boolean boolean9 = range3.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range3, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, 5.5d);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, 5.5d, (double) 10.0f);
        boolean boolean19 = range14.contains((double) (byte) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range0, range14);
        double double21 = range14.getUpperBound();
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-893.5d) + "'", double21 == (-893.5d));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-10.0d));
        double double12 = range2.constrain(44.5d);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range2, (-484.0d));
        double double16 = range2.constrain((double) (-1));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        boolean boolean37 = range18.contains(6109.5d);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 71.0d, (double) 10);
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range26, (-1.0d), (double) (byte) 100);
        boolean boolean32 = range26.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range26, (-9.0d), (double) 100L);
        double double37 = range35.constrain(1.0d);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range35, (double) (byte) 100);
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range35, (double) 'a');
        double double42 = range35.getUpperBound();
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range20, range35);
        double double44 = range43.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-899.0d) + "'", double37 == (-899.0d));
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-899.0d) + "'", double42 == (-899.0d));
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-899.0d) + "'", double44 == (-899.0d));
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        double double18 = range14.getLength();
        org.jfree.data.Range range21 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, (-1.0d), (double) (byte) 100);
        boolean boolean27 = range21.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range21, (-9.0d), (double) 100L);
        double double32 = range30.constrain(1.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range30, (double) (byte) 100);
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range30, (double) 'a');
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range30, (-1.0d), (-9.0d));
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range30, 0.0d, true);
        org.jfree.data.Range range44 = org.jfree.data.Range.expandToInclude(range30, (double) (short) 1);
        boolean boolean46 = range44.contains(100.0d);
        org.jfree.data.Range range49 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double50 = range49.getLength();
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range49, (-109.0d));
        boolean boolean53 = range44.equals((java.lang.Object) range52);
        double double55 = range52.constrain((double) '4');
        boolean boolean56 = range14.equals((java.lang.Object) range52);
        org.jfree.data.Range range59 = new org.jfree.data.Range(0.0d, 0.0d);
        double double60 = range59.getLowerBound();
        boolean boolean63 = range59.intersects((-9.0d), (double) ' ');
        org.jfree.data.Range range65 = org.jfree.data.Range.expandToInclude(range59, (double) 1L);
        boolean boolean66 = range52.equals((java.lang.Object) range65);
        java.lang.Class<?> wildcardClass67 = range52.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-899.0d) + "'", double32 == (-899.0d));
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-9.0d) + "'", double50 == (-9.0d));
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range18 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean19 = range11.equals((java.lang.Object) (-10.0d));
        boolean boolean21 = range11.contains((-9.0d));
        java.lang.String str22 = range11.toString();
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range11, 10974.5d, true);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, 33.0d, 5549.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Range[-71.0,-899.0]" + "'", str22, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, (-9.0d), true);
        double double8 = range4.getCentralValue();
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range4, (-1.0d), (-71.0d));
        double double13 = range4.constrain(100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range4, (-1.0d), true);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range4, 1.0d);
        java.lang.String str19 = range4.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[0.0,10.0]" + "'", str19, "Range[0.0,10.0]");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, 72.0d, true);
        org.jfree.data.Range range58 = org.jfree.data.Range.expandToInclude(range56, 33.0d);
        double double59 = range58.getUpperBound();
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
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 73.0d + "'", double59 == 73.0d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range3, (-1.0d), (double) (byte) 100);
        boolean boolean9 = range3.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range3, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, 5.5d);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, 5.5d, (double) 10.0f);
        boolean boolean19 = range14.contains((double) (byte) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range0, range14);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range23, (-1.0d), (double) (byte) 100);
        boolean boolean29 = range23.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range23, (-9.0d), (double) 100L);
        double double34 = range32.constrain(1.0d);
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range32, (double) (byte) 100);
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range32, (double) 'a');
        java.lang.String str39 = range32.toString();
        java.lang.String str40 = range32.toString();
        org.jfree.data.Range range43 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean45 = range43.contains((double) 'a');
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range43, (double) (byte) 0);
        org.jfree.data.Range range49 = org.jfree.data.Range.expandToInclude(range43, (double) 0L);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range49, (double) (byte) -1, true);
        boolean boolean53 = range32.equals((java.lang.Object) (byte) -1);
        org.jfree.data.Range range54 = org.jfree.data.Range.combine(range20, range32);
        double double56 = range32.constrain((double) (short) -1);
        boolean boolean59 = range32.intersects((-399.5d), 32.0d);
        java.lang.String str60 = range32.toString();
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-899.0d) + "'", double34 == (-899.0d));
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Range[-71.0,-899.0]" + "'", str39, "Range[-71.0,-899.0]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Range[-71.0,-899.0]" + "'", str40, "Range[-71.0,-899.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-899.0d) + "'", double56 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Range[-71.0,-899.0]" + "'", str60, "Range[-71.0,-899.0]");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jfree.data.Range range2 = new org.jfree.data.Range(83849.0d, 386.0d);
        double double3 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-83463.0d) + "'", double3 == (-83463.0d));
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        boolean boolean6 = range2.intersects((-9.0d), (double) ' ');
        boolean boolean8 = range2.contains((double) (short) 0);
        double double9 = range2.getUpperBound();
        java.lang.String str10 = range2.toString();
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range2, 5.0d);
        java.lang.String str13 = range12.toString();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range12, 50466.0d, true);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range12, 55.0d);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range18, 7452.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[0.0,0.0]" + "'", str10, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[0.0,5.0]" + "'", str13, "Range[0.0,5.0]");
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, 6553.0d);
        double double6 = range2.getUpperBound();
        double double7 = range2.getLength();
        org.jfree.data.Range range10 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range10, (double) 10L);
        double double13 = range10.getLowerBound();
        double double14 = range10.getCentralValue();
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range10, (-485.0d), (-449.0d));
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double21 = range20.getLength();
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range17, range20);
        java.lang.String str23 = range17.toString();
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range17, 484.0d, (-900.0d));
        boolean boolean27 = range2.equals((java.lang.Object) range26);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.5d) + "'", double14 == (-0.5d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9.0d) + "'", double21 == (-9.0d));
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Range[484.0,-449.0]" + "'", str23, "Range[484.0,-449.0]");
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-9138.5d), (-449.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, (double) (-1.0f));
        double double5 = range2.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-4793.75d) + "'", double5 == (-4793.75d));
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double11 = range8.getUpperBound();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range8, (double) (short) 10);
        java.lang.String str14 = range13.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 11.0d + "'", double11 == 11.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Range[30.0,21.0]" + "'", str14, "Range[30.0,21.0]");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        double double35 = range33.constrain(72.0d);
        org.jfree.data.Range range38 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range38, (-1.0d), (double) (byte) 100);
        boolean boolean44 = range38.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range38, (-9.0d), (double) 100L);
        org.jfree.data.Range range49 = org.jfree.data.Range.expandToInclude(range47, (double) 1);
        org.jfree.data.Range range52 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range54 = org.jfree.data.Range.shift(range52, (double) (byte) -1);
        boolean boolean57 = range54.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range58 = org.jfree.data.Range.combine(range47, range54);
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range47, (double) (short) -1, false);
        org.jfree.data.Range range64 = org.jfree.data.Range.shift(range47, (double) 100, true);
        double double66 = range47.constrain(0.0d);
        boolean boolean69 = range47.intersects(11044.5d, 50.5d);
        org.jfree.data.Range range70 = org.jfree.data.Range.combine(range33, range47);
        double double72 = range70.constrain(6.5d);
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
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 72.0d + "'", double35 == 72.0d);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-899.0d) + "'", double66 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 6.5d + "'", double72 == 6.5d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-900.0d), true);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range7, (-4.0d));
        java.lang.String str13 = range7.toString();
        double double14 = range7.getLength();
        java.lang.String str15 = range7.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[10.0,1.0]" + "'", str13, "Range[10.0,1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Range[10.0,1.0]" + "'", str15, "Range[10.0,1.0]");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jfree.data.Range range2 = new org.jfree.data.Range(6108.5d, 743473.0d);
        double double3 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 743473.0d + "'", double3 == 743473.0d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean4 = range2.equals((java.lang.Object) 100L);
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, 10989.0d, (double) '#');
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (-1.0d), (double) (byte) 100);
        boolean boolean17 = range11.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-9.0d), (double) 100L);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range20, (double) 1);
        org.jfree.data.Range range25 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (double) (byte) -1);
        boolean boolean30 = range27.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range20, range27);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range20, (double) (short) -1, false);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range8, range20);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range8, (-32429.5d), (-72.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double12 = range8.constrain((double) (short) 0);
        java.lang.String str13 = range8.toString();
        double double14 = range8.getUpperBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range8, (double) 1L);
        double double17 = range8.getLowerBound();
        double double18 = range8.getCentralValue();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range8, (double) 10L);
        double double21 = range8.getLowerBound();
        org.jfree.data.Range range24 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range24, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (-10.0d));
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range27, range30);
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (-1.0d), (double) (byte) 100);
        boolean boolean42 = range36.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range45 = org.jfree.data.Range.expand(range36, (-9.0d), (double) 100L);
        double double47 = range45.constrain(1.0d);
        org.jfree.data.Range range48 = org.jfree.data.Range.combine(range33, range45);
        org.jfree.data.Range range51 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range54 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range54, (-1.0d), (double) (byte) 100);
        boolean boolean60 = range54.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range63 = org.jfree.data.Range.expand(range54, (-9.0d), (double) 100L);
        double double65 = range63.constrain(1.0d);
        boolean boolean66 = range51.equals((java.lang.Object) 1.0d);
        org.jfree.data.Range range67 = org.jfree.data.Range.combine(range48, range51);
        org.jfree.data.Range range70 = org.jfree.data.Range.shift(range51, 10974.5d, false);
        org.jfree.data.Range range71 = org.jfree.data.Range.combine(range8, range51);
        double double72 = range51.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 15.5d + "'", double18 == 15.5d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-899.0d) + "'", double47 == (-899.0d));
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-899.0d) + "'", double65 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1.0f, 37189.0d);
        boolean boolean5 = range2.intersects(11.0d, (-109.0d));
        org.jfree.data.Range range6 = null;
        org.jfree.data.Range range7 = org.jfree.data.Range.combine(range2, range6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jfree.data.Range range2 = new org.jfree.data.Range(5549.5d, (-1427.0d));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        boolean boolean6 = range2.intersects((-9.0d), (double) ' ');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 21871.0d, false);
        org.jfree.data.Range range12 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        java.lang.String str13 = range12.toString();
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range16, (-109.0d));
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (-71.0d), (-828.0d));
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (double) 100L);
        double double25 = range24.getLength();
        double double27 = range24.constrain(50.5d);
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range12, range24);
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range9, range28);
        java.lang.String str30 = range29.toString();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range29, (-41.0d), true);
        double double34 = range33.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[10.0,100.0]" + "'", str13, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Range[10.0,21871.0]" + "'", str30, "Range[10.0,21871.0]");
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 21830.0d + "'", double34 == 21830.0d);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-828.0d), true);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (-485.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, 17.5d);
        double double16 = range15.getLowerBound();
        double double17 = range15.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-818.0d) + "'", double16 == (-818.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-400.25d) + "'", double17 == (-400.25d));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        double double9 = range2.getLowerBound();
        double double10 = range2.getCentralValue();
        double double11 = range2.getLength();
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range14, (-109.0d));
        boolean boolean19 = range14.contains(1.0d);
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range14, 37189.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range21, 46.0d);
        boolean boolean24 = range2.equals((java.lang.Object) 46.0d);
        double double25 = range2.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.5d + "'", double10 == 5.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9.0d) + "'", double15 == (-9.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9.0d) + "'", double25 == (-9.0d));
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-71.0d), (-828.0d));
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (double) 100L);
        double double11 = range10.getLength();
        double double12 = range10.getCentralValue();
        java.lang.Class<?> wildcardClass13 = range10.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-331.75d), 5464.0d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        double double14 = range12.constrain((-900.0d));
        boolean boolean17 = range12.intersects((double) (byte) 1, 37189.0d);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range12, 5.0d);
        org.jfree.data.Range range22 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (double) 10L);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range24, (-9.0d), true);
        double double28 = range24.getCentralValue();
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range24, (-1.0d), (-71.0d));
        double double32 = range31.getLowerBound();
        boolean boolean33 = range19.equals((java.lang.Object) range31);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 99.0d + "'", double14 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 5.0d + "'", double28 == 5.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range3, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        org.jfree.data.Range range12 = org.jfree.data.Range.combine(range6, range9);
        double double13 = range12.getLowerBound();
        org.jfree.data.Range range14 = org.jfree.data.Range.combine(range0, range12);
        double double15 = range12.getUpperBound();
        double double16 = range12.getUpperBound();
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double14 = range13.getUpperBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range13, (double) (-1.0f), true);
        double double18 = range13.getUpperBound();
        double double20 = range13.constrain((double) (byte) 0);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-893.5d) + "'", double14 == (-893.5d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-893.5d) + "'", double18 == (-893.5d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-893.5d) + "'", double20 == (-893.5d));
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
        double double55 = range49.constrain((-119.0d));
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
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 20.0d + "'", double55 == 20.0d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
        double double59 = range53.getLength();
        double double61 = range53.constrain(10989.0d);
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
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-9.0d) + "'", double59 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 100L, (-1.093143E7d));
        double double4 = range2.constrain((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.093143E7d) + "'", double4 == (-1.093143E7d));
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, 110.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 61.0d + "'", double23 == 61.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        boolean boolean29 = range2.intersects(199.0d, (-26442.5d));
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jfree.data.Range range2 = new org.jfree.data.Range(21871.0d, (-399.5d));
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        double double6 = range2.getLength();
        double double8 = range2.constrain((double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, 2483.0d, (-1.5d));
        boolean boolean13 = range11.contains((double) 1.0f);
        double double14 = range11.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 22357.0d + "'", double14 == 22357.0d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        double double7 = range2.getLength();
        double double9 = range2.constrain(0.0d);
        java.lang.Class<?> wildcardClass10 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.jfree.data.Range range2 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, 10989.0d, false);
        org.jfree.data.Range range8 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (double) (byte) -1);
        boolean boolean13 = range10.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range10, (double) 0.0f);
        double double16 = range15.getUpperBound();
        double double17 = range15.getUpperBound();
        boolean boolean18 = range2.equals((java.lang.Object) double17);
        double double19 = range2.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-10.0d) + "'", double17 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-64.0d) + "'", double19 == (-64.0d));
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        java.lang.String str26 = range25.toString();
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range25, 50.5d);
        java.lang.Object obj29 = null;
        boolean boolean30 = range28.equals(obj29);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Range[-71.0,90.0]" + "'", str26, "Range[-71.0,90.0]");
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-828.0d), true);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (-485.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, 17.5d);
        double double16 = range13.getUpperBound();
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range13, 9047.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-485.0d) + "'", double16 == (-485.0d));
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        double double67 = range20.getUpperBound();
        double double68 = range20.getCentralValue();
        org.jfree.data.Range range70 = org.jfree.data.Range.expandToInclude(range20, 15.5d);
        org.jfree.data.Range range72 = org.jfree.data.Range.shift(range20, (-2.0465954E7d));
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
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-898.0d) + "'", double67 == (-898.0d));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-484.0d) + "'", double68 == (-484.0d));
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range72);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-495.75d), 10999.0d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, (-1.0d), (double) (byte) 100);
        boolean boolean14 = range8.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range8, (-9.0d), (double) 100L);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (double) 1);
        org.jfree.data.Range range22 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (double) (byte) -1);
        boolean boolean27 = range24.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range17, range24);
        org.jfree.data.Range range31 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range31, (-1.0d), (double) (byte) 100);
        boolean boolean37 = range31.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range40 = org.jfree.data.Range.expand(range31, (-9.0d), (double) 100L);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range28, range31);
        double double42 = range31.getCentralValue();
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range5, range31);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range5, (-36810.0d), (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 5.5d + "'", double42 == 5.5d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        double double20 = range14.constrain(2.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Range[10.0,100.0]" + "'", str3, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range8, 18595.0d);
        java.lang.Class<?> wildcardClass14 = range8.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range14.getCentralValue();
        boolean boolean18 = range14.intersects(100.0d, (double) (byte) -1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range14, (-799.0d));
        double double21 = range14.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 21871.0d + "'", double15 == 21871.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-30636.0d) + "'", double21 == (-30636.0d));
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        boolean boolean37 = range33.intersects(10989.0d, 464.5d);
        org.jfree.data.Range range39 = org.jfree.data.Range.expandToInclude(range33, 13.0d);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(range39);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, 0.0d, true);
        boolean boolean10 = range5.contains(11.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range5, 11044.5d);
        org.jfree.data.Range range15 = new org.jfree.data.Range((-933.0d), (-30636.0d));
        double double16 = range15.getCentralValue();
        double double17 = range15.getLength();
        boolean boolean18 = range5.equals((java.lang.Object) range15);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-15784.5d) + "'", double16 == (-15784.5d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-29703.0d) + "'", double17 == (-29703.0d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10, 11.0d);
        double double4 = range2.constrain((-13662.0d));
        org.jfree.data.Range range7 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range7, (double) 10L);
        double double10 = range7.getLowerBound();
        double double11 = range7.getCentralValue();
        double double12 = range7.getCentralValue();
        boolean boolean15 = range7.intersects((-331.75d), 18605.0d);
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, (-1.0d), (double) (byte) 100);
        boolean boolean24 = range18.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range18, (-9.0d), (double) 100L);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, 45.0d, (-9.0d));
        double double32 = range30.constrain(0.0d);
        double double33 = range30.getCentralValue();
        double double35 = range30.constrain(10974.5d);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range7, range30);
        org.jfree.data.Range range37 = org.jfree.data.Range.combine(range2, range30);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.5d) + "'", double11 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.5d) + "'", double12 == (-0.5d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 37189.0d + "'", double32 == 37189.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 21871.0d + "'", double33 == 21871.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 6553.0d + "'", double35 == 6553.0d);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range37);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1L);
        boolean boolean19 = range17.contains((-13662.0d));
        double double20 = range17.getLength();
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range17, 5.0d, false);
        boolean boolean26 = range17.intersects((-9929.0d), (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 90.0d + "'", double20 == 90.0d);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        org.jfree.data.Range range45 = org.jfree.data.Range.expandToInclude(range24, 0.0d);
        boolean boolean48 = range24.intersects(11.5d, 36.0d);
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
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        java.lang.Class<?> wildcardClass51 = range49.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range4, 0.0d, 91.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (double) (short) 1, false);
        double double16 = range14.constrain(5649.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9928.0d) + "'", double16 == (-9928.0d));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-83.5d), 97.0d);
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.jfree.data.Range range2 = new org.jfree.data.Range(494.0d, 1.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-405.0d));
        org.junit.Assert.assertNotNull(range4);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range13, (-101.0d));
        java.lang.String str24 = range23.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Range[0.0,79.0]" + "'", str24, "Range[0.0,79.0]");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        double double7 = range2.getLowerBound();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, 37280.0d, true);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(range10);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        double double3 = range2.getUpperBound();
        double double5 = range2.constrain((-1.0d));
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, (-1.0d), (double) (byte) 100);
        boolean boolean14 = range8.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range8, (-9.0d), (double) 100L);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range17, 5.5d);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, 5.5d, (double) 10.0f);
        boolean boolean24 = range19.contains((double) (byte) -1);
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double28 = range27.getLength();
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range27, (-109.0d));
        double double31 = range27.getCentralValue();
        boolean boolean32 = range19.equals((java.lang.Object) double31);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range19, (-893.5d));
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, 45.5d, (-345.0d));
        org.jfree.data.Range range38 = org.jfree.data.Range.combine(range2, range37);
        double double39 = range37.getLength();
        double double40 = range37.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9.0d) + "'", double28 == (-9.0d));
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 5.5d + "'", double31 == 5.5d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 247158.0d + "'", double39 == 247158.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 247158.0d + "'", double40 == 247158.0d);
    }
}

