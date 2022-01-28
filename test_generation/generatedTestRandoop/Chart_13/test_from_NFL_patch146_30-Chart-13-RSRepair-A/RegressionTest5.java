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
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range2, (double) (short) 100, false);
        java.lang.String str17 = range2.toString();
        double double18 = range2.getCentralValue();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range2, (-6500.0d));
        org.jfree.data.Range range21 = null;
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range2, range21);
        double double23 = range2.getLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[0.0,10.0]" + "'", str17, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.0d + "'", double18 == 5.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, (double) 1L, 0.0d);
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) (byte) 10, 82.5d);
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range7, range10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range11);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jfree.data.Range range2 = new org.jfree.data.Range(132.0d, (-1000.0d));
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        boolean boolean11 = range9.contains((double) 0L);
        double double13 = range9.constrain(50.5d);
        double double14 = range9.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 11.0d + "'", double13 == 11.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double7 = range5.constrain((double) (short) 1);
        boolean boolean9 = range5.contains((double) '4');
        double double10 = range5.getLowerBound();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range5, 100.0d);
        boolean boolean15 = range5.intersects((double) 100.0f, 1.0d);
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range18.getLength();
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range18, (double) (short) 10);
        double double22 = range21.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range21, (double) 100L);
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, 100.0d, (double) 100);
        boolean boolean31 = range24.equals((java.lang.Object) range27);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range24, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range36 = org.jfree.data.Range.expandToInclude(range24, (double) 100.0f);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range24, range39);
        boolean boolean41 = range5.equals((java.lang.Object) range40);
        org.jfree.data.Range range43 = org.jfree.data.Range.expandToInclude(range40, 1010.0d);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range40, 264.5d, false);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9899.0d) + "'", double10 == (-9899.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (byte) 0, (double) (-1L));
        double double6 = range2.getUpperBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 10);
        org.jfree.data.Range range11 = new org.jfree.data.Range(11.0d, (-1.0d));
        org.jfree.data.Range range12 = org.jfree.data.Range.combine(range8, range11);
        java.lang.Class<?> wildcardClass13 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        org.jfree.data.Range range8 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double9 = range8.getLength();
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range8, (double) (short) 10);
        double double12 = range11.getLowerBound();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) 100L);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) 100L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range8, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range8, (double) 100.0f);
        double double21 = range8.getCentralValue();
        boolean boolean23 = range8.equals((java.lang.Object) 0);
        org.jfree.data.Range range26 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double27 = range26.getLength();
        double double29 = range26.constrain(0.0d);
        java.lang.String str30 = range26.toString();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range26, (double) (short) 1, true);
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range33, (double) '4');
        org.jfree.data.Range range37 = org.jfree.data.Range.expandToInclude(range35, (double) 1L);
        org.jfree.data.Range range38 = org.jfree.data.Range.combine(range8, range35);
        double double40 = range38.constrain(50.5d);
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range38, (-2006.0d), false);
        double double44 = range43.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Range[0.0,10.0]" + "'", str30, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 50.5d + "'", double40 == 50.5d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 2006.0d + "'", double44 == 2006.0d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1.0f, 10000.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 0);
        double double5 = range2.getLength();
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 'a', false);
        double double9 = range8.getCentralValue();
        boolean boolean11 = range8.contains((double) 0);
        double double12 = range8.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9999.0d + "'", double5 == 9999.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5097.5d + "'", double9 == 5097.5d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9999.0d + "'", double12 == 9999.0d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jfree.data.Range range2 = new org.jfree.data.Range(43.0d, (-1.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 19757.0d, 5346.0d);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (-45.0d), true);
        double double9 = range8.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-46.0d) + "'", double9 == (-46.0d));
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean9 = range2.equals((java.lang.Object) 10);
        boolean boolean11 = range2.contains((double) 1.0f);
        double double12 = range2.getUpperBound();
        double double13 = range2.getUpperBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = range16.equals(obj17);
        boolean boolean21 = range16.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range24 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double25 = range24.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range24, (double) (short) 10);
        double double28 = range27.getLowerBound();
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range27, (double) 100L);
        boolean boolean31 = range16.equals((java.lang.Object) 100L);
        boolean boolean33 = range16.contains(35.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range2, range16);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range34, 10000.0d, false);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range34, 1011.0d, true);
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range34, 2010.0d);
        java.lang.String str43 = range42.toString();
        boolean boolean46 = range42.intersects(19999.0d, 37.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Range[0.0,2010.0]" + "'", str43, "Range[0.0,2010.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range3 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = range3.equals(obj4);
        boolean boolean8 = range3.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double13 = range11.constrain(10.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.combine(range3, range11);
        org.jfree.data.Range range17 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double18 = range17.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range17, (double) (short) 10);
        double double21 = range20.getLowerBound();
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range20, (double) 100L);
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range26, 100.0d, (double) 100);
        boolean boolean30 = range23.equals((java.lang.Object) range26);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range23, (double) 100);
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range14, range32);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range33, (double) ' ', 1.0d);
        boolean boolean39 = range33.intersects((double) 1L, (double) (byte) 1);
        org.jfree.data.Range range42 = new org.jfree.data.Range(11.0d, (double) (byte) -1);
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range42, (double) 0);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range33, range44);
        double double46 = range33.getLowerBound();
        org.jfree.data.Range range47 = org.jfree.data.Range.combine(range0, range33);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(range47);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        double double7 = range5.constrain((double) (short) 1);
        boolean boolean9 = range5.contains((double) '4');
        double double10 = range5.getLowerBound();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range5, 100.0d);
        double double13 = range5.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9899.0d) + "'", double10 == (-9899.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 19899.0d + "'", double13 == 19899.0d);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        boolean boolean5 = range2.contains((double) (-1L));
        double double6 = range2.getLength();
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, 100.0d, (double) 100);
        double double13 = range9.getLength();
        boolean boolean14 = range2.equals((java.lang.Object) double13);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range2, 5346.0d);
        org.jfree.data.Range range19 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = range19.equals(obj20);
        boolean boolean24 = range19.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range27 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double29 = range27.constrain(10.0d);
        org.jfree.data.Range range30 = org.jfree.data.Range.combine(range19, range27);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range19, (double) (short) 100, false);
        java.lang.String str34 = range19.toString();
        double double35 = range19.getCentralValue();
        org.jfree.data.Range range38 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range38, 100.0d, (double) 100);
        double double43 = range41.constrain((double) (short) 1);
        boolean boolean45 = range41.contains((double) '4');
        double double46 = range41.getLowerBound();
        double double48 = range41.constrain(54.0d);
        org.jfree.data.Range range51 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double52 = range51.getCentralValue();
        org.jfree.data.Range range54 = org.jfree.data.Range.shift(range51, (double) 1);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range51, (double) 'a');
        boolean boolean58 = range51.equals((java.lang.Object) 10);
        boolean boolean60 = range51.contains((double) 1.0f);
        double double61 = range51.getUpperBound();
        org.jfree.data.Range range62 = org.jfree.data.Range.combine(range41, range51);
        boolean boolean63 = range19.equals((java.lang.Object) range62);
        org.jfree.data.Range range64 = org.jfree.data.Range.combine(range2, range19);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 99.0d + "'", double13 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Range[0.0,10.0]" + "'", str34, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 5.0d + "'", double35 == 5.0d);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-9899.0d) + "'", double46 == (-9899.0d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 54.0d + "'", double48 == 54.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 5.0d + "'", double52 == 5.0d);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(range64);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (-1));
        double double5 = range4.getUpperBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range4, (double) 1, true);
        double double10 = range8.constrain(49.5d);
        org.jfree.data.Range range13 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double14 = range13.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, (double) (short) 10);
        double double17 = range16.getLowerBound();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range16, (double) 100L);
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range22, 100.0d, (double) 100);
        boolean boolean26 = range19.equals((java.lang.Object) range22);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range19, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range19, (double) 100.0f);
        double double32 = range19.getCentralValue();
        org.jfree.data.Range range35 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double36 = range35.getLength();
        double double38 = range35.constrain(0.0d);
        java.lang.String str39 = range35.toString();
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range35, (double) (short) 1, true);
        double double43 = range42.getLowerBound();
        boolean boolean46 = range42.intersects((double) 0, (double) 10);
        org.jfree.data.Range range47 = org.jfree.data.Range.combine(range19, range42);
        org.jfree.data.Range range48 = org.jfree.data.Range.combine(range8, range19);
        org.jfree.data.Range range50 = org.jfree.data.Range.expandToInclude(range8, 10000.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.0d + "'", double5 == 99.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 49.5d + "'", double10 == 49.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 50.0d + "'", double32 == 50.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Range[0.0,10.0]" + "'", str39, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range50);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 100.0f, (double) (byte) 10);
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, (-6500.0d));
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = range7.equals(obj8);
        boolean boolean12 = range7.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range7, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range7, (double) (byte) 10);
        org.jfree.data.Range range20 = new org.jfree.data.Range(100.0d, (double) (byte) 100);
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range7, range20);
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range21, (-1001.0d));
        boolean boolean24 = range2.equals((java.lang.Object) range23);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        boolean boolean5 = range2.contains((double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) 10.0f);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, 11.0d);
        java.lang.String str11 = range10.toString();
        double double12 = range10.getUpperBound();
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) (-1.0f), (double) '#');
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range10, range15);
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range15, (-9.94899E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[-989.0,121.0]" + "'", str11, "Range[-989.0,121.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 121.0d + "'", double12 == 121.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (short) 100);
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        double double11 = range10.getLowerBound();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (-1.0f));
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = range16.equals(obj17);
        boolean boolean21 = range16.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range16, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range16, (double) (short) -1);
        double double28 = range26.constrain(50.5d);
        double double30 = range26.constrain((double) (short) 10);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range26, (double) 1.0f, false);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range10, range26);
        double double35 = range26.getLowerBound();
        boolean boolean36 = borderArrangement0.equals((java.lang.Object) double35);
        org.jfree.chart.block.BorderArrangement borderArrangement37 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement37.clear();
        org.jfree.data.Range range41 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean42 = borderArrangement37.equals((java.lang.Object) range41);
        borderArrangement37.clear();
        org.jfree.data.Range range46 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj47 = new java.lang.Object();
        boolean boolean48 = range46.equals(obj47);
        boolean boolean49 = borderArrangement37.equals(obj47);
        org.jfree.data.Range range52 = new org.jfree.data.Range(1.0d, (double) (short) 10);
        boolean boolean53 = borderArrangement37.equals((java.lang.Object) range52);
        boolean boolean54 = borderArrangement0.equals((java.lang.Object) boolean53);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 100.0d, (double) 100);
        double double18 = range16.constrain((double) (short) 1);
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.data.Range range23 = new org.jfree.data.Range(1.0d, (double) 10.0f);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) 10.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement27 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement27.clear();
        org.jfree.data.Range range31 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean32 = borderArrangement27.equals((java.lang.Object) range31);
        boolean boolean34 = borderArrangement27.equals((java.lang.Object) 1.0f);
        java.lang.Object obj35 = null;
        boolean boolean36 = borderArrangement27.equals(obj35);
        org.jfree.data.Range range39 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj40 = new java.lang.Object();
        boolean boolean41 = range39.equals(obj40);
        boolean boolean44 = range39.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range47 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double49 = range47.constrain(10.0d);
        org.jfree.data.Range range50 = org.jfree.data.Range.combine(range39, range47);
        org.jfree.data.Range range53 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double54 = range53.getLength();
        org.jfree.data.Range range56 = org.jfree.data.Range.expandToInclude(range53, (double) (short) 10);
        double double57 = range56.getLowerBound();
        org.jfree.data.Range range59 = org.jfree.data.Range.expandToInclude(range56, (double) 100L);
        org.jfree.data.Range range62 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range65 = org.jfree.data.Range.expand(range62, 100.0d, (double) 100);
        boolean boolean66 = range59.equals((java.lang.Object) range62);
        org.jfree.data.Range range68 = org.jfree.data.Range.shift(range59, (double) 100);
        org.jfree.data.Range range69 = org.jfree.data.Range.combine(range50, range68);
        boolean boolean70 = borderArrangement27.equals((java.lang.Object) range50);
        borderArrangement27.clear();
        boolean boolean73 = borderArrangement27.equals((java.lang.Object) (byte) -1);
        borderArrangement27.clear();
        boolean boolean75 = borderArrangement0.equals((java.lang.Object) borderArrangement27);
        borderArrangement27.clear();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        boolean boolean11 = range8.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) (short) 10);
        double double18 = range17.getLowerBound();
        boolean boolean20 = range17.contains((double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range17, (double) 1.0f, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range8, range23);
        double double25 = range24.getLength();
        org.jfree.data.Range range28 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double29 = range28.getLength();
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range28, (double) (short) 10);
        double double32 = range31.getLowerBound();
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range31, (double) 100L);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range34, (double) 100L, true);
        boolean boolean38 = range24.equals((java.lang.Object) range34);
        boolean boolean40 = range34.contains((double) 0.0f);
        org.jfree.data.Range range43 = new org.jfree.data.Range((double) (byte) 100, 101.0d);
        boolean boolean44 = range34.equals((java.lang.Object) range43);
        double double45 = range34.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double17 = range16.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range16, (double) (short) 10);
        double double20 = range19.getLowerBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range19, (double) 100L);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, 100.0d, (double) 100);
        boolean boolean29 = range22.equals((java.lang.Object) range25);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range22, (double) 100);
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range13, range31);
        java.lang.String str33 = range13.toString();
        double double35 = range13.constrain((double) 0);
        double double37 = range13.constrain(135.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Range[0.0,10.0]" + "'", str33, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (-1.0f), (double) '#');
        double double3 = range2.getLowerBound();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 265.0d, false);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, 11.0d);
        boolean boolean11 = range6.contains((-77.25d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 300.0d + "'", double7 == 300.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (double) 100L, true);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range8, (double) 100, false);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range8, 35.0d, true);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range8, (double) (short) 1);
        double double20 = range19.getLowerBound();
        java.lang.String str21 = range19.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Range[1.0,101.0]" + "'", str21, "Range[1.0,101.0]");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, 10097.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, (double) (byte) 0, (double) (-1L));
        double double15 = range11.getUpperBound();
        org.jfree.data.Range range18 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double19 = range18.getLength();
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range18, (double) (short) 10);
        double double22 = range21.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range21, (double) 100L);
        boolean boolean27 = range24.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range30 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double31 = range30.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range30, (double) (short) 10);
        double double34 = range33.getLowerBound();
        boolean boolean36 = range33.contains((double) (byte) 0);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range33, (double) 1.0f, false);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range24, range39);
        double double41 = range40.getLength();
        org.jfree.data.Range range44 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double46 = range44.constrain(10.0d);
        boolean boolean49 = range44.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str50 = range44.toString();
        boolean boolean51 = range40.equals((java.lang.Object) range44);
        boolean boolean52 = range11.equals((java.lang.Object) range44);
        boolean boolean53 = range5.equals((java.lang.Object) range44);
        org.jfree.data.Range range54 = null;
        org.jfree.data.Range range55 = org.jfree.data.Range.combine(range44, range54);
        boolean boolean57 = range55.equals((java.lang.Object) 0L);
        double double58 = range55.getUpperBound();
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range55, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Range[0.0,10.0]" + "'", str50, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertNotNull(range60);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, (double) (-1));
        double double8 = range7.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9900.0d) + "'", double8 == (-9900.0d));
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.jfree.data.Range range2 = new org.jfree.data.Range(102.0d, 118.0d);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        boolean boolean7 = range4.equals((java.lang.Object) (byte) 100);
        double double8 = range4.getUpperBound();
        double double10 = range4.constrain((double) (short) 10);
        java.lang.Class<?> wildcardClass11 = range4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jfree.data.Range range2 = new org.jfree.data.Range(17.0d, 99.0d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.data.Range range4 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean5 = borderArrangement0.equals((java.lang.Object) range4);
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range11, (double) (short) 10);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) 100L);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, 100.0d, (double) 100);
        boolean boolean24 = range17.equals((java.lang.Object) range20);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range17, (double) 1.0f, (double) 'a');
        boolean boolean28 = borderArrangement0.equals((java.lang.Object) range17);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range35 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, 100.0d, (double) 100);
        boolean boolean41 = range35.intersects((double) 'a', (-9899.0d));
        double double43 = range35.constrain((double) 10L);
        org.jfree.data.Range range45 = org.jfree.data.Range.shift(range35, 38.0d);
        boolean boolean46 = borderArrangement0.equals((java.lang.Object) 38.0d);
        org.jfree.chart.block.Block block47 = null;
        org.jfree.data.Range range50 = new org.jfree.data.Range(10.0d, (double) '4');
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range50, (double) 1.0f, false);
        boolean boolean55 = range53.contains((double) 0L);
        double double56 = range53.getLowerBound();
        java.lang.String str57 = range53.toString();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block47, (java.lang.Object) str57);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 11.0d + "'", double56 == 11.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Range[11.0,53.0]" + "'", str57, "Range[11.0,53.0]");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (double) (-1));
        double double16 = range15.getUpperBound();
        boolean boolean19 = range15.intersects(50.0d, 5.0d);
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double23 = range22.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range22, (double) (short) 10);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range15, range22);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range15, (double) (byte) 10);
        boolean boolean29 = borderArrangement3.equals((java.lang.Object) range15);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, 100.0d, (double) 100);
        double double36 = range35.getLowerBound();
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range35, (double) (byte) -1, (double) 100L);
        double double41 = range35.constrain(265.0d);
        boolean boolean42 = range15.equals((java.lang.Object) range35);
        double double43 = range35.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.0d + "'", double16 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-9899.0d) + "'", double36 == (-9899.0d));
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 265.0d + "'", double41 == 265.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10000.0d + "'", double43 == 10000.0d);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean9 = range2.equals((java.lang.Object) 10);
        boolean boolean11 = range2.contains((double) 1.0f);
        boolean boolean14 = range2.intersects(5.0d, 54.0d);
        double double15 = range2.getUpperBound();
        double double16 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double4 = range2.constrain(10.0d);
        double double5 = range2.getLowerBound();
        boolean boolean8 = range2.intersects((double) (byte) 0, 0.0d);
        double double10 = range2.constrain((double) (byte) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range2, (double) 100);
        org.jfree.data.Range range15 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double16 = range15.getLength();
        double double18 = range15.constrain(0.0d);
        java.lang.String str19 = range15.toString();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range15, (double) (short) 1, true);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range15, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (double) (short) 10, (double) 10L);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range25, (double) (byte) 1, (double) (-1));
        org.jfree.data.Range range34 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double35 = range34.getLength();
        org.jfree.data.Range range37 = org.jfree.data.Range.expandToInclude(range34, (double) (short) 10);
        double double38 = range37.getLowerBound();
        org.jfree.data.Range range40 = org.jfree.data.Range.expandToInclude(range37, (double) 100L);
        boolean boolean43 = range40.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range46 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double47 = range46.getLength();
        org.jfree.data.Range range49 = org.jfree.data.Range.expandToInclude(range46, (double) (short) 10);
        double double50 = range49.getLowerBound();
        boolean boolean52 = range49.contains((double) (byte) 0);
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range49, (double) 1.0f, false);
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range40, range55);
        double double57 = range56.getLength();
        org.jfree.data.Range range60 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double61 = range60.getLength();
        org.jfree.data.Range range63 = org.jfree.data.Range.expandToInclude(range60, (double) (short) 10);
        double double64 = range63.getLowerBound();
        org.jfree.data.Range range66 = org.jfree.data.Range.expandToInclude(range63, (double) 100L);
        org.jfree.data.Range range69 = org.jfree.data.Range.shift(range66, (double) 100L, true);
        boolean boolean70 = range56.equals((java.lang.Object) range66);
        double double71 = range66.getCentralValue();
        org.jfree.data.Range range72 = org.jfree.data.Range.combine(range31, range66);
        org.jfree.data.Range range75 = new org.jfree.data.Range((double) 10.0f, 0.0d);
        org.jfree.data.Range range76 = org.jfree.data.Range.combine(range72, range75);
        boolean boolean77 = range2.equals((java.lang.Object) range75);
        boolean boolean80 = range75.intersects((-495.0d), (-99990.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[0.0,10.0]" + "'", str19, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 50.0d + "'", double71 == 50.0d);
        org.junit.Assert.assertNotNull(range72);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range8, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range8, (double) 100.0f);
        double double21 = range8.getCentralValue();
        double double23 = range8.constrain(49.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range8, 97.0d);
        double double26 = range25.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 49.0d + "'", double23 == 49.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-4924.0d), (double) (short) 0);
        org.jfree.data.Range range5 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double6 = range5.getLength();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) (short) 10);
        double double9 = range8.getLowerBound();
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range8, (double) 100L);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, 100.0d, (double) 100);
        boolean boolean18 = range11.equals((java.lang.Object) range14);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range11, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range11, (double) 100.0f);
        double double24 = range11.getCentralValue();
        boolean boolean26 = range11.equals((java.lang.Object) 0);
        org.jfree.data.Range range29 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double30 = range29.getLength();
        double double32 = range29.constrain(0.0d);
        java.lang.String str33 = range29.toString();
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range29, (double) (short) 1, true);
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range36, (double) '4');
        org.jfree.data.Range range39 = org.jfree.data.Range.combine(range11, range36);
        org.jfree.data.Range range42 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj43 = new java.lang.Object();
        boolean boolean44 = range42.equals(obj43);
        boolean boolean47 = range42.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range50 = org.jfree.data.Range.expand(range42, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range42, (double) (byte) 10);
        org.jfree.data.Range range55 = new org.jfree.data.Range(100.0d, (double) (byte) 100);
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range42, range55);
        org.jfree.data.Range range57 = org.jfree.data.Range.combine(range36, range55);
        double double58 = range55.getUpperBound();
        org.jfree.data.Range range59 = org.jfree.data.Range.combine(range2, range55);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 50.0d + "'", double24 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Range[0.0,10.0]" + "'", str33, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 100.0d + "'", double58 == 100.0d);
        org.junit.Assert.assertNotNull(range59);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean9 = range2.equals((java.lang.Object) 10);
        boolean boolean11 = range2.contains((double) 1.0f);
        double double12 = range2.getUpperBound();
        double double13 = range2.getUpperBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = range16.equals(obj17);
        boolean boolean21 = range16.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range24 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double25 = range24.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range24, (double) (short) 10);
        double double28 = range27.getLowerBound();
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range27, (double) 100L);
        boolean boolean31 = range16.equals((java.lang.Object) 100L);
        boolean boolean33 = range16.contains(35.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range2, range16);
        org.jfree.data.Range range37 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj38 = new java.lang.Object();
        boolean boolean39 = range37.equals(obj38);
        boolean boolean42 = range37.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range45 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double46 = range45.getLength();
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range45, (double) (short) 10);
        double double49 = range48.getLowerBound();
        org.jfree.data.Range range51 = org.jfree.data.Range.expandToInclude(range48, (double) 100L);
        boolean boolean52 = range37.equals((java.lang.Object) 100L);
        boolean boolean54 = range37.contains((double) (byte) 100);
        double double55 = range37.getUpperBound();
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range34, range37);
        double double57 = range34.getLength();
        org.jfree.data.Range range60 = org.jfree.data.Range.expand(range34, 0.0d, 26.5d);
        org.jfree.data.Range range63 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double64 = range63.getLength();
        org.jfree.data.Range range66 = org.jfree.data.Range.expandToInclude(range63, (double) (short) 10);
        double double67 = range63.getCentralValue();
        boolean boolean70 = range63.intersects((double) 100L, (double) (short) 0);
        boolean boolean72 = range63.contains((double) (short) 1);
        double double73 = range63.getUpperBound();
        boolean boolean74 = range60.equals((java.lang.Object) range63);
        double double76 = range63.constrain((double) 1L);
        double double77 = range63.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 5.0d + "'", double67 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1L));
        borderArrangement3.clear();
        boolean boolean7 = range2.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement3.add(block8, obj9);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (double) (-1));
        double double16 = range15.getUpperBound();
        boolean boolean19 = range15.intersects(50.0d, 5.0d);
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double23 = range22.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range22, (double) (short) 10);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range15, range22);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range15, (double) (byte) 10);
        boolean boolean29 = borderArrangement3.equals((java.lang.Object) range15);
        borderArrangement3.clear();
        borderArrangement3.clear();
        org.jfree.chart.block.BorderArrangement borderArrangement32 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement32.clear();
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean37 = borderArrangement32.equals((java.lang.Object) range36);
        borderArrangement32.clear();
        boolean boolean40 = borderArrangement32.equals((java.lang.Object) (short) 0);
        org.jfree.data.Range range43 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double44 = range43.getLength();
        org.jfree.data.Range range46 = org.jfree.data.Range.expandToInclude(range43, (double) (short) 10);
        double double47 = range46.getLowerBound();
        org.jfree.data.Range range49 = org.jfree.data.Range.expandToInclude(range46, (double) 100L);
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range55 = org.jfree.data.Range.expand(range52, 100.0d, (double) 100);
        boolean boolean56 = range49.equals((java.lang.Object) range52);
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range49, (double) 1.0f, (double) 'a');
        boolean boolean60 = borderArrangement32.equals((java.lang.Object) range49);
        borderArrangement32.clear();
        borderArrangement32.clear();
        borderArrangement32.clear();
        org.jfree.data.Range range66 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range69 = org.jfree.data.Range.expand(range66, 100.0d, (double) 100);
        boolean boolean70 = borderArrangement32.equals((java.lang.Object) range69);
        double double72 = range69.constrain((-1.0d));
        double double73 = range69.getCentralValue();
        boolean boolean74 = borderArrangement3.equals((java.lang.Object) double73);
        org.jfree.chart.block.Block block75 = null;
        java.lang.Object obj76 = null;
        borderArrangement3.add(block75, obj76);
        org.jfree.chart.block.Block block78 = null;
        org.jfree.data.Range range81 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double82 = range81.getCentralValue();
        org.jfree.data.Range range84 = org.jfree.data.Range.shift(range81, (double) 1);
        org.jfree.data.Range range86 = org.jfree.data.Range.shift(range81, (double) 'a');
        org.jfree.data.Range range89 = org.jfree.data.Range.expand(range81, (double) (short) 1, 107.0d);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement3.add(block78, (java.lang.Object) 107.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 99.0d + "'", double16 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-1.0d) + "'", double72 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 50.5d + "'", double73 == 50.5d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 5.0d + "'", double82 == 5.0d);
        org.junit.Assert.assertNotNull(range84);
        org.junit.Assert.assertNotNull(range86);
        org.junit.Assert.assertNotNull(range89);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        boolean boolean15 = range8.equals((java.lang.Object) range11);
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range8, (double) 1.0f, (double) 'a');
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range8, (-1.0d), 100.0d);
        java.lang.String str22 = range21.toString();
        boolean boolean25 = range21.intersects(1011.0d, 50.5d);
        double double26 = range21.getUpperBound();
        double double27 = range21.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Range[100.0,10100.0]" + "'", str22, "Range[100.0,10100.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10100.0d + "'", double26 == 10100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean9 = range2.equals((java.lang.Object) 10);
        boolean boolean11 = range2.contains((double) 1.0f);
        double double12 = range2.getUpperBound();
        double double13 = range2.getUpperBound();
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = range16.equals(obj17);
        boolean boolean21 = range16.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range24 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double25 = range24.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range24, (double) (short) 10);
        double double28 = range27.getLowerBound();
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range27, (double) 100L);
        boolean boolean31 = range16.equals((java.lang.Object) 100L);
        boolean boolean33 = range16.contains(35.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range2, range16);
        org.jfree.data.Range range37 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj38 = new java.lang.Object();
        boolean boolean39 = range37.equals(obj38);
        boolean boolean42 = range37.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range45 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double46 = range45.getLength();
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range45, (double) (short) 10);
        double double49 = range48.getLowerBound();
        org.jfree.data.Range range51 = org.jfree.data.Range.expandToInclude(range48, (double) 100L);
        boolean boolean52 = range37.equals((java.lang.Object) 100L);
        boolean boolean54 = range37.contains((double) (byte) 100);
        double double55 = range37.getUpperBound();
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range34, range37);
        double double57 = range34.getLength();
        org.jfree.data.Range range60 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj61 = new java.lang.Object();
        boolean boolean62 = range60.equals(obj61);
        boolean boolean65 = range60.intersects(1.0d, (double) (short) 10);
        double double66 = range60.getUpperBound();
        double double68 = range60.constrain(10.0d);
        org.jfree.data.Range range69 = org.jfree.data.Range.combine(range34, range60);
        org.jfree.data.Range range72 = org.jfree.data.Range.expand(range60, 0.0d, (-1.0d));
        org.jfree.data.Range range75 = org.jfree.data.Range.expand(range72, 15.0d, 15.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertNotNull(range72);
        org.junit.Assert.assertNotNull(range75);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) ' ', 100.0d);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-12.0d), 75.5d);
        org.jfree.data.Range range5 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double6 = range5.getLength();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) (short) 10);
        double double9 = range8.getLowerBound();
        boolean boolean11 = range8.contains((double) (byte) 0);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range8, (double) 1.0f, false);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (double) (short) 1, (double) (-1L));
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double22 = range20.constrain(10.0d);
        boolean boolean25 = range20.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str26 = range20.toString();
        double double28 = range20.constrain((double) 100L);
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range17, range20);
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range29, (double) 100);
        org.jfree.data.Range range34 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj35 = new java.lang.Object();
        boolean boolean36 = range34.equals(obj35);
        boolean boolean39 = range34.intersects(5.0d, (double) 100L);
        double double40 = range34.getLength();
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range34, 0.0d);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range31, range34);
        boolean boolean45 = range43.contains((double) (byte) 10);
        boolean boolean46 = range2.equals((java.lang.Object) range43);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Range[0.0,10.0]" + "'", str26, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 0.0d);
        java.lang.String str3 = range2.toString();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double7 = range6.getCentralValue();
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range6, (double) 0L, (double) '4');
        double double11 = range10.getCentralValue();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, 90.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range10, 10000.0d);
        double double16 = range10.getCentralValue();
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range2, range10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Range[10.0,0.0]" + "'", str3, "Range[10.0,0.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 265.0d + "'", double11 == 265.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 265.0d + "'", double16 == 265.0d);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double4 = range2.constrain(10.0d);
        boolean boolean7 = range2.intersects((double) 10.0f, (double) (-1.0f));
        java.lang.String str8 = range2.toString();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (double) 100L);
        boolean boolean12 = range10.contains(5.0d);
        double double14 = range10.constrain((double) 1L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[0.0,10.0]" + "'", str8, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) 0L, (double) '4');
        double double7 = range2.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) 0);
        double double10 = range9.getLowerBound();
        double double11 = range9.getCentralValue();
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = range14.equals(obj15);
        boolean boolean19 = range14.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range22 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double24 = range22.constrain(10.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range14, range22);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range14, (double) (short) 100, false);
        boolean boolean31 = range14.intersects((double) '#', (double) 0.0f);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range14, 10000.0d, 1011.0d);
        org.jfree.data.Range range35 = null;
        org.jfree.data.Range range38 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double39 = range38.getCentralValue();
        double double40 = range38.getLowerBound();
        double double41 = range38.getLowerBound();
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range38, 142.0d, false);
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range35, range38);
        org.jfree.data.Range range46 = org.jfree.data.Range.combine(range34, range45);
        org.jfree.data.Range range47 = org.jfree.data.Range.combine(range9, range45);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.0d + "'", double11 == 5.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 5.0d + "'", double39 == 5.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range47);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double4 = range2.constrain(10.0d);
        double double5 = range2.getLowerBound();
        boolean boolean8 = range2.intersects((double) (byte) 0, 0.0d);
        double double10 = range2.constrain((double) (byte) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range2, 11.0d);
        double double13 = range12.getUpperBound();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range12, 31.0d);
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range18, (double) (-1));
        double double21 = range20.getUpperBound();
        boolean boolean24 = range20.intersects(50.0d, 5.0d);
        org.jfree.data.Range range27 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double28 = range27.getLength();
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range27, (double) (short) 10);
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range20, range27);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range20, (double) (byte) 10);
        double double35 = range33.constrain(11.0d);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range12, range33);
        double double37 = range12.getUpperBound();
        java.lang.Class<?> wildcardClass38 = range12.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 11.0d + "'", double13 == 11.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 99.0d + "'", double21 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 19.0d + "'", double35 == 19.0d);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 11.0d + "'", double37 == 11.0d);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.Block block5 = null;
        org.jfree.data.Range range6 = null;
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range6, 10.0d);
        borderArrangement0.add(block5, (java.lang.Object) range6);
        org.jfree.data.Range range12 = new org.jfree.data.Range(10.0d, (double) '4');
        boolean boolean14 = range12.contains((double) 1L);
        boolean boolean17 = range12.intersects((-1.0d), (double) (byte) 10);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range12, 265.0d);
        boolean boolean20 = borderArrangement0.equals((java.lang.Object) 265.0d);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) (byte) 100, 101.0d);
        boolean boolean24 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block27 = null;
        java.lang.Object obj28 = null;
        borderArrangement0.add(block27, obj28);
        org.jfree.data.Range range32 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double33 = range32.getCentralValue();
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range32, (double) 1);
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range32, (double) 'a');
        boolean boolean39 = range37.equals((java.lang.Object) 100);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range37, 0.0d);
        double double42 = range41.getLowerBound();
        double double43 = range41.getUpperBound();
        double double45 = range41.constrain(275.0d);
        java.lang.String str46 = range41.toString();
        boolean boolean47 = borderArrangement0.equals((java.lang.Object) str46);
        org.jfree.chart.block.Block block48 = null;
        org.jfree.data.Range range51 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double52 = range51.getLength();
        double double54 = range51.constrain(0.0d);
        java.lang.String str55 = range51.toString();
        org.jfree.data.Range range58 = org.jfree.data.Range.shift(range51, (double) (short) 1, true);
        boolean boolean60 = range58.contains((double) 0L);
        double double62 = range58.constrain(50.5d);
        org.jfree.data.Range range64 = org.jfree.data.Range.expandToInclude(range58, (double) 1.0f);
        org.jfree.data.Range range67 = org.jfree.data.Range.expand(range64, (double) 10.0f, 300.0d);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block48, (java.lang.Object) range64);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.data.Range cannot be cast to org.jfree.chart.util.RectangleEdge");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 5.0d + "'", double33 == 5.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 97.0d + "'", double42 == 97.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 107.0d + "'", double43 == 107.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 107.0d + "'", double45 == 107.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Range[97.0,107.0]" + "'", str46, "Range[97.0,107.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Range[0.0,10.0]" + "'", str55, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 11.0d + "'", double62 == 11.0d);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertNotNull(range67);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double12 = range10.constrain(10.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double17 = range16.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range16, (double) (short) 10);
        double double20 = range19.getLowerBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range19, (double) 100L);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, 100.0d, (double) 100);
        boolean boolean29 = range22.equals((java.lang.Object) range25);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range22, (double) 100);
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range13, range31);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, (double) ' ', 1.0d);
        boolean boolean37 = range32.contains((-1.0d));
        org.jfree.data.Range range40 = org.jfree.data.Range.expand(range32, 0.0d, (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(range40);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) 0L, (double) '4');
        boolean boolean9 = range6.intersects((double) (short) 1, (double) 0.0f);
        double double10 = range6.getLowerBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj14 = new java.lang.Object();
        boolean boolean15 = range13.equals(obj14);
        boolean boolean18 = range13.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range21 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double23 = range21.constrain(10.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range13, range21);
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range6, range24);
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range6, 10.0d, false);
        double double29 = range6.getCentralValue();
        java.lang.Class<?> wildcardClass30 = range6.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 265.0d + "'", double29 == 265.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        org.jfree.data.Range range8 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = range8.equals(obj9);
        boolean boolean13 = range8.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range16 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double17 = range16.getLength();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range16, (double) (short) 10);
        double double20 = range19.getLowerBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range19, (double) 100L);
        boolean boolean23 = range8.equals((java.lang.Object) 100L);
        double double24 = range8.getCentralValue();
        org.jfree.data.Range range27 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double28 = range27.getLength();
        double double30 = range27.constrain(0.0d);
        java.lang.String str31 = range27.toString();
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range27, (double) (short) 1, true);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range27, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range40 = org.jfree.data.Range.expand(range37, (double) (short) 10, (double) 10L);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range8, range37);
        boolean boolean42 = borderArrangement0.equals((java.lang.Object) range8);
        org.jfree.data.Range range45 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range45, (double) (-1));
        double double48 = range47.getUpperBound();
        boolean boolean51 = range47.intersects(50.0d, 5.0d);
        org.jfree.data.Range range54 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double55 = range54.getLength();
        org.jfree.data.Range range57 = org.jfree.data.Range.expandToInclude(range54, (double) (short) 10);
        org.jfree.data.Range range58 = org.jfree.data.Range.combine(range47, range54);
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range54, 1.0d, false);
        boolean boolean62 = borderArrangement0.equals((java.lang.Object) false);
        org.jfree.chart.block.BorderArrangement borderArrangement63 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement63.clear();
        org.jfree.data.Range range67 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        boolean boolean68 = borderArrangement63.equals((java.lang.Object) range67);
        boolean boolean69 = borderArrangement0.equals((java.lang.Object) borderArrangement63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 5.0d + "'", double24 == 5.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Range[0.0,10.0]" + "'", str31, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 99.0d + "'", double48 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1L));
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.data.Range range9 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) (-1L));
        borderArrangement10.clear();
        boolean boolean14 = range9.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement10.add(block15, obj16);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) (short) 10, (double) (short) 100);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, (double) (-1));
        double double23 = range22.getUpperBound();
        boolean boolean26 = range22.intersects(50.0d, 5.0d);
        org.jfree.data.Range range29 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double30 = range29.getLength();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range29, (double) (short) 10);
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range22, range29);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range22, (double) (byte) 10);
        boolean boolean36 = borderArrangement10.equals((java.lang.Object) range22);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        double double40 = range39.getUpperBound();
        org.jfree.data.Range range43 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double44 = range43.getCentralValue();
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range43, (double) 1);
        org.jfree.data.Range range49 = org.jfree.data.Range.expand(range46, (double) (byte) 0, 100.0d);
        org.jfree.data.Range range50 = org.jfree.data.Range.combine(range39, range46);
        org.jfree.data.Range range52 = org.jfree.data.Range.expandToInclude(range46, (double) '4');
        boolean boolean53 = borderArrangement10.equals((java.lang.Object) '4');
        boolean boolean54 = borderArrangement0.equals((java.lang.Object) borderArrangement10);
        org.jfree.chart.block.BlockContainer blockContainer55 = null;
        java.awt.Graphics2D graphics2D56 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint57 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D58 = borderArrangement10.arrange(blockContainer55, graphics2D56, rectangleConstraint57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 99.0d + "'", double23 == 99.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 5.0d + "'", double44 == 5.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range5.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range5, (double) 100L);
        boolean boolean11 = range8.intersects((double) (byte) 10, 0.0d);
        org.jfree.data.Range range14 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double15 = range14.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range14, (double) (short) 10);
        double double18 = range17.getLowerBound();
        boolean boolean20 = range17.contains((double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range17, (double) 1.0f, false);
        org.jfree.data.Range range24 = org.jfree.data.Range.combine(range8, range23);
        double double25 = range24.getLength();
        java.lang.String str26 = range24.toString();
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range24, (-39.5d), 75.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Range[0.0,100.0]" + "'", str26, "Range[0.0,100.0]");
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 1);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, 50.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, (-6400.0d), 107.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range7, 67.5d);
        boolean boolean14 = range12.contains(335.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        double double6 = range2.getUpperBound();
        double double7 = range2.getLength();
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, 100.0d, (double) 100);
        double double14 = range13.getLowerBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range13, (double) (byte) -1, (double) 100L);
        double double19 = range13.constrain(265.0d);
        java.lang.String str20 = range13.toString();
        double double21 = range13.getLength();
        boolean boolean22 = range2.equals((java.lang.Object) range13);
        double double24 = range13.constrain(54.0d);
        double double25 = range13.getLength();
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range13, 97.0d, true);
        double double30 = range13.constrain(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9899.0d) + "'", double14 == (-9899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 265.0d + "'", double19 == 265.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Range[-9899.0,10000.0]" + "'", str20, "Range[-9899.0,10000.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 19899.0d + "'", double21 == 19899.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 54.0d + "'", double24 == 54.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 19899.0d + "'", double25 == 19899.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = range2.equals(obj3);
        boolean boolean7 = range2.intersects(5.0d, (double) 100L);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 0.0d, (double) (byte) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range2, (double) (byte) 10);
        org.jfree.data.Range range15 = new org.jfree.data.Range(100.0d, (double) (byte) 100);
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range2, range15);
        java.lang.String str17 = range15.toString();
        double double18 = range15.getCentralValue();
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range15, (-235.0d), false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[100.0,100.0]" + "'", str17, "Range[100.0,100.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getLength();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (double) (short) 1, true);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, (double) 100.0f, (double) (byte) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (double) ' ');
        double double15 = range12.getLength();
        java.lang.String str16 = range12.toString();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range12, 254.0d, true);
        double double21 = range12.constrain((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[0.0,10.0]" + "'", str6, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2010.0d + "'", double15 == 2010.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[-1000.0,1010.0]" + "'", str16, "Range[-1000.0,1010.0]");
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 100.0d, (double) 100);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, (double) ' ');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range7, 10.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, (double) (short) -1, 82.5d);
        boolean boolean15 = range9.intersects((double) 1.0f, 5.0d);
        double double17 = range9.constrain((double) 100L);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 100, (double) 1.0f);
        double double3 = range2.getUpperBound();
        java.lang.String str4 = range2.toString();
        double double5 = range2.getCentralValue();
        boolean boolean7 = range2.contains((double) (-1));
        org.jfree.data.Range range10 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 10);
        double double14 = range13.getLowerBound();
        double double15 = range13.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range2, range13);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range16, 51.0d, false);
        org.jfree.data.Range range22 = new org.jfree.data.Range((-209948.0d), 121.0d);
        boolean boolean23 = range16.equals((java.lang.Object) (-209948.0d));
        boolean boolean26 = range16.intersects(265.0d, 510.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Range[100.0,1.0]" + "'", str4, "Range[100.0,1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.5d + "'", double5 == 50.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1001.0d), (-99990.0d));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (byte) 0, (double) (-1L));
        double double6 = range2.getUpperBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (-1.0d));
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 1L, (double) 100.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, (double) 100);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range18 = org.jfree.data.Range.expand(range14, (double) (byte) -1, (double) 100L);
        double double20 = range14.constrain(265.0d);
        java.lang.String str21 = range14.toString();
        boolean boolean24 = range14.intersects(101.0d, (double) (byte) 100);
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range8, range14);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range8, (double) ' ', 99.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9899.0d) + "'", double15 == (-9899.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 265.0d + "'", double20 == 265.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Range[-9899.0,10000.0]" + "'", str21, "Range[-9899.0,10000.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double3 = range2.getCentralValue();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = new org.jfree.data.Range(0.0d, (double) 10.0f);
        double double8 = range7.getCentralValue();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (double) 1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range7, (double) (short) 10);
        org.jfree.data.Range range13 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, 330.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range13, (double) (byte) 10, false);
        double double20 = range13.constrain((double) (byte) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range13, (-749.0d), true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(range23);
    }
}

