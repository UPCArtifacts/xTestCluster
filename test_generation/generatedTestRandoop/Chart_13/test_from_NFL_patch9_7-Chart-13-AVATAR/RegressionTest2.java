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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        double double28 = range2.getCentralValue();
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range2, (double) (short) 10, (-65.5d));
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range31, 10999.0d);
        boolean boolean36 = range33.intersects((double) 0.0f, (-799.0d));
        boolean boolean38 = range33.contains(71.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-899.0d) + "'", double16 == (-899.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 67.0d + "'", double28 == 67.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-30636.0d), 742645.0d);
        boolean boolean5 = range2.intersects(121000.0d, 33.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range29, 35.0d, 494.0d);
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
        org.junit.Assert.assertNotNull(range57);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        double double7 = range5.constrain((double) 100);
        double double9 = range5.constrain((-13662.0d));
        double double11 = range5.constrain((-933.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 91.0d + "'", double7 == 91.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        double double10 = range5.getLowerBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range13, 1.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range5, range13);
        double double19 = range5.getLength();
        java.lang.Class<?> wildcardClass20 = range5.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 90.0d + "'", double19 == 90.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jfree.data.Range range2 = new org.jfree.data.Range(232.75d, 107.25d);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jfree.data.Range range2 = new org.jfree.data.Range(171.0d, (-170.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-385.0d), true);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, (-1.0d), (double) (byte) 100);
        boolean boolean14 = range8.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range8, (-9.0d), (double) 100L);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (double) 1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, 15.5d, (-101.0d));
        boolean boolean23 = range2.equals((java.lang.Object) range22);
        java.lang.Class<?> wildcardClass24 = range2.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double8 = range7.getCentralValue();
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, 1.0d, true);
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range7, range15);
        boolean boolean17 = range2.equals((java.lang.Object) range7);
        boolean boolean20 = range7.intersects(0.0d, 5548.0d);
        double double21 = range7.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.5d) + "'", double8 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range11, (-1.0d), false);
        org.jfree.data.Range range24 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        double double25 = range24.getUpperBound();
        double double26 = range24.getUpperBound();
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range11, range24);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (double) (short) -1, false);
        double double17 = range16.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-72.0d) + "'", double17 == (-72.0d));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        double double77 = range25.getUpperBound();
        boolean boolean80 = range25.intersects((-170.0d), (-484.0d));
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
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 90.0d + "'", double77 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 0, 107.25d);
        double double3 = range2.getLength();
        org.jfree.data.Range range4 = null;
        org.jfree.data.Range range5 = org.jfree.data.Range.combine(range2, range4);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, (-36810.0d), true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 107.25d + "'", double3 == 107.25d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range6 = org.jfree.data.Range.expandToInclude(range4, (double) 'a');
        double double7 = range6.getCentralValue();
        double double8 = range6.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 48.5d + "'", double7 == 48.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range11, (-1.0d), false);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, (double) (byte) 10, 11871.0d);
        org.jfree.data.Range range27 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double28 = range27.getCentralValue();
        org.jfree.data.Range range31 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double32 = range31.getLength();
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range31, (double) (short) 100);
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range27, range34);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range27, 17.5d, true);
        boolean boolean39 = range21.equals((java.lang.Object) 17.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.5d) + "'", double28 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-9.0d) + "'", double32 == (-9.0d));
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double6 = range5.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range5, 1.0d, true);
        org.jfree.data.Range range12 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range12, (-10.0d));
        boolean boolean15 = range5.equals((java.lang.Object) range14);
        double double16 = range5.getLowerBound();
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (-1.0d), (double) (byte) 100);
        boolean boolean25 = range19.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range19, (-9.0d), (double) 100L);
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range28, (double) 1);
        org.jfree.data.Range range33 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range33, (double) (byte) -1);
        boolean boolean38 = range35.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range39 = org.jfree.data.Range.combine(range28, range35);
        org.jfree.data.Range range42 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range45 = org.jfree.data.Range.expand(range42, (-1.0d), (double) (byte) 100);
        boolean boolean48 = range45.intersects((double) (byte) 10, 10.0d);
        boolean boolean49 = range35.equals((java.lang.Object) boolean48);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range35, (double) (byte) 100, false);
        boolean boolean53 = range5.equals((java.lang.Object) range52);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range5, 0.0d, false);
        org.jfree.data.Range range59 = org.jfree.data.Range.shift(range56, (double) 'a', true);
        boolean boolean62 = range56.intersects((-818.0d), 21.0d);
        org.jfree.data.Range range65 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range67 = org.jfree.data.Range.shift(range65, (double) (byte) -1);
        boolean boolean70 = range67.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range72 = org.jfree.data.Range.shift(range67, (double) 0.0f);
        boolean boolean74 = range72.contains(15.5d);
        boolean boolean75 = range56.equals((java.lang.Object) boolean74);
        org.jfree.data.Range range77 = org.jfree.data.Range.shift(range56, (double) (byte) 1);
        org.jfree.data.Range range78 = org.jfree.data.Range.combine(range2, range77);
        boolean boolean81 = range78.intersects(464.5d, (-101.0d));
        org.jfree.data.Range range83 = org.jfree.data.Range.shift(range78, (-83.5d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(range72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(range83);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 100.0f, 16.5d);
        double double3 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 16.5d + "'", double3 == 16.5d);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        boolean boolean10 = range8.contains((double) 1L);
        double double11 = range8.getUpperBound();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range8, (double) (short) 10);
        java.lang.String str14 = range8.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 11.0d + "'", double11 == 11.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Range[20.0,11.0]" + "'", str14, "Range[20.0,11.0]");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        double double37 = range34.getUpperBound();
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
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-119.0d) + "'", double37 == (-119.0d));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        boolean boolean15 = range11.equals((java.lang.Object) '4');
        double double16 = range11.getLowerBound();
        boolean boolean19 = range11.intersects((double) 100.0f, (-71.0d));
        java.lang.String str20 = range11.toString();
        double double22 = range11.constrain(7.75d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-71.0d) + "'", double16 == (-71.0d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Range[-71.0,-899.0]" + "'", str20, "Range[-71.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-899.0d) + "'", double22 == (-899.0d));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jfree.data.Range range2 = new org.jfree.data.Range(18630.0d, 0.0d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        double double18 = range14.getLowerBound();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range14, (double) (byte) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range14, (-893.5d), false);
        java.lang.String str24 = range14.toString();
        java.lang.Class<?> wildcardClass25 = range14.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Range[10.0,100.0]" + "'", str24, "Range[10.0,100.0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double7 = range2.constrain((-828.0d));
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) (short) 10, (-9.0d));
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, (-385.0d), true);
        org.jfree.data.Range range14 = org.jfree.data.Range.combine(range2, range13);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range11, (double) (byte) -1, 0.0d);
        double double38 = range11.getUpperBound();
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
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        boolean boolean22 = range2.intersects(67.0d, (-31535.0d));
        boolean boolean25 = range2.intersects(272.5d, 10984.5d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Range[10.0,100.0]" + "'", str3, "Range[10.0,100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 90.0d + "'", double19 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        boolean boolean10 = range5.intersects((double) '4', (double) 'a');
        boolean boolean13 = range5.intersects(10612.5d, (-1820.75d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, 0.0d);
        double double7 = range6.getLowerBound();
        double double8 = range6.getLowerBound();
        boolean boolean9 = range2.equals((java.lang.Object) double8);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, 107.25d, (-799.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range12, 4488.5d, false);
        boolean boolean18 = range12.intersects((-26442.5d), (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) (byte) 100, (-900.0d));
        double double7 = range2.getLowerBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range2, (-1.5d));
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range2, (-1.539756E7d), false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-71.0d), (-828.0d));
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (double) 100L);
        double double11 = range10.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range10, (-109.0d), 10999.0d);
        boolean boolean17 = range14.intersects((-9929.0d), 10.0d);
        boolean boolean20 = range14.intersects((-385.0d), (-1560023.25d));
        double double22 = range14.constrain(33.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        double double26 = range21.constrain(26.0d);
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 26.0d + "'", double26 == 26.0d);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        double double18 = range14.getLength();
        double double20 = range14.constrain(107.25d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range30, 1.0d, true);
        org.jfree.data.Range range37 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range37, (-10.0d));
        boolean boolean40 = range30.equals((java.lang.Object) range39);
        double double41 = range30.getLowerBound();
        org.jfree.data.Range range44 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range44, (-1.0d), (double) (byte) 100);
        boolean boolean50 = range44.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range53 = org.jfree.data.Range.expand(range44, (-9.0d), (double) 100L);
        org.jfree.data.Range range55 = org.jfree.data.Range.expandToInclude(range53, (double) 1);
        org.jfree.data.Range range58 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range58, (double) (byte) -1);
        boolean boolean63 = range60.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range64 = org.jfree.data.Range.combine(range53, range60);
        org.jfree.data.Range range67 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range70 = org.jfree.data.Range.expand(range67, (-1.0d), (double) (byte) 100);
        boolean boolean73 = range70.intersects((double) (byte) 10, 10.0d);
        boolean boolean74 = range60.equals((java.lang.Object) boolean73);
        org.jfree.data.Range range77 = org.jfree.data.Range.shift(range60, (double) (byte) 100, false);
        boolean boolean78 = range30.equals((java.lang.Object) range77);
        org.jfree.data.Range range81 = org.jfree.data.Range.shift(range30, 0.0d, false);
        org.jfree.data.Range range84 = org.jfree.data.Range.shift(range81, (double) 'a', true);
        org.jfree.data.Range range86 = org.jfree.data.Range.expandToInclude(range84, 296715.25d);
        boolean boolean87 = range25.equals((java.lang.Object) range84);
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
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertNotNull(range84);
        org.junit.Assert.assertNotNull(range86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range6, 1.0d, true);
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, 10984.5d);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (-10.0d));
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range19, range22);
        org.jfree.data.Range range28 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range28, (-10.0d));
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range19, range28);
        double double32 = range28.getLength();
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range28, (double) 100.0f, false);
        java.lang.Class<?> wildcardClass36 = range28.getClass();
        boolean boolean37 = range10.equals((java.lang.Object) wildcardClass36);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 90.0d + "'", double32 == 90.0d);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-485.0d), (-449.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (double) 10.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 4488.5d, 91.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range11, 11.0d, false);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (-1820.75d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) (byte) -1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (double) 10);
        java.lang.String str20 = range17.toString();
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range17, 10.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range17, 4523.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Range[-1.0,-800.0]" + "'", str20, "Range[-1.0,-800.0]");
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range3, (-1.0d), (double) (byte) 100);
        boolean boolean9 = range3.intersects((double) (byte) -1, (double) (short) -1);
        double double10 = range3.getCentralValue();
        double double11 = range3.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.combine(range0, range3);
        double double14 = range3.constrain((double) 100L);
        boolean boolean16 = range3.equals((java.lang.Object) "Range[484.0,-449.0]");
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range3, 55.0d, (double) (byte) 0);
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range19, 464.5d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.5d + "'", double10 == 5.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 100, 11.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 17.5d, (-942.0d));
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range11, range14);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, (-1.0d), (double) (byte) 100);
        boolean boolean26 = range20.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range20, (-9.0d), (double) 100L);
        double double31 = range29.constrain(1.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range17, range29);
        boolean boolean33 = range5.equals((java.lang.Object) range29);
        java.lang.Class<?> wildcardClass34 = range5.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-899.0d) + "'", double31 == (-899.0d));
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (-1.0f), (double) (byte) 10);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 5.5d, (double) 10.0f);
        boolean boolean18 = range13.contains((double) (byte) -1);
        double double19 = range13.getUpperBound();
        double double20 = range13.getLength();
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range13, (-8.0d), (-4.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-893.5d) + "'", double19 == (-893.5d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-828.0d) + "'", double20 == (-828.0d));
        org.junit.Assert.assertNotNull(range23);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 5.5d, (double) 10.0f);
        double double17 = range16.getLength();
        double double18 = range16.getCentralValue();
        double double19 = range16.getUpperBound();
        org.jfree.data.Range range20 = null;
        org.jfree.data.Range range21 = org.jfree.data.Range.combine(range16, range20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range23 = org.jfree.data.Range.shift(range20, (-119.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) (-1.0f));
        double double10 = range8.constrain((double) (short) 1);
        double double12 = range8.constrain(484.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 51.0d + "'", double12 == 51.0d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 0L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (-449.0d), false);
        boolean boolean14 = range11.intersects((-10.0d), 33.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jfree.data.Range range2 = new org.jfree.data.Range(44.5d, 6553.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, 4523.5d);
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, 2827.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jfree.data.Range range2 = new org.jfree.data.Range(232.75d, 5549.5d);
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double6 = range5.getLength();
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, (-109.0d));
        boolean boolean10 = range5.contains(1.0d);
        boolean boolean12 = range5.contains((double) (byte) 0);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range5, 99.0d, 44.5d);
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range21, (double) (byte) -1);
        double double24 = range21.getLowerBound();
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range21, 17.5d);
        boolean boolean28 = range21.contains(72.0d);
        boolean boolean29 = range5.equals((java.lang.Object) range21);
        boolean boolean30 = range2.equals((java.lang.Object) range21);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jfree.data.Range range2 = new org.jfree.data.Range(10999.0d, (double) 100.0f);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10.0f);
        boolean boolean6 = range2.contains((-449.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, 99.0d);
        double double9 = range2.getUpperBound();
        double double10 = range2.getUpperBound();
        java.lang.Class<?> wildcardClass11 = range2.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 100, 11.0d);
        boolean boolean4 = range2.equals((java.lang.Object) (-485.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.expandToInclude(range2, 332.75d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-4.0d), 10999.0d);
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double31 = range30.getLength();
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range30, 1.0d, true);
        org.jfree.data.Range range37 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range39 = org.jfree.data.Range.shift(range37, (-10.0d));
        boolean boolean40 = range30.equals((java.lang.Object) range39);
        double double41 = range39.getUpperBound();
        boolean boolean43 = range39.contains((double) (-1.0f));
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range39, 20.0d, false);
        org.jfree.data.Range range49 = org.jfree.data.Range.expand(range39, (-828.0d), (-933.0d));
        boolean boolean50 = range2.equals((java.lang.Object) range49);
        org.jfree.data.Range range53 = org.jfree.data.Range.expand(range49, (-9.0d), 100.0d);
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range53, 37189.0d);
        org.jfree.data.Range range58 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range58, (-10.0d));
        org.jfree.data.Range range62 = org.jfree.data.Range.shift(range60, (double) 0);
        boolean boolean64 = range60.contains((double) (short) 10);
        double double65 = range60.getUpperBound();
        boolean boolean66 = range55.equals((java.lang.Object) double65);
        double double68 = range55.constrain(272.5d);
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 90.0d + "'", double41 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 90.0d + "'", double65 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.5886691E7d) + "'", double68 == (-1.5886691E7d));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        double double42 = range41.getCentralValue();
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range41, 464.5d);
        double double45 = range41.getCentralValue();
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
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1820.75d) + "'", double42 == (-1820.75d));
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1820.75d) + "'", double45 == (-1820.75d));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        boolean boolean67 = range64.intersects(11871.0d, (double) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range44, 45.0d, 51.0d);
        org.jfree.data.Range range50 = org.jfree.data.Range.expand(range44, 190.0d, 172.0d);
        double double52 = range44.constrain(0.0d);
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
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0L, (double) (-1L));
        double double3 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range6, 1.0d, true);
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range2, range10);
        double double12 = range11.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        double double18 = range11.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, (double) 0L);
        boolean boolean23 = range20.intersects((-1.0d), (-13662.0d));
        boolean boolean26 = range20.intersects(5548.0d, 0.0d);
        double double27 = range20.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-35.5d) + "'", double27 == (-35.5d));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double11 = range10.getLength();
        double double12 = range10.getLowerBound();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range10, 10.0d, false);
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range7, range15);
        org.jfree.data.Range range19 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range19, (double) (byte) -1);
        boolean boolean24 = range21.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range21, (double) 0.0f);
        boolean boolean28 = range26.contains(15.5d);
        boolean boolean29 = range15.equals((java.lang.Object) boolean28);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range15, 5.5d, 10.0d);
        double double33 = range32.getCentralValue();
        double double34 = range32.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-4.75d) + "'", double33 == (-4.75d));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-4.75d) + "'", double34 == (-4.75d));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        java.lang.String str35 = range32.toString();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Range[0.0,90.0]" + "'", str35, "Range[0.0,90.0]");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double3 = range2.getUpperBound();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-799.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        org.jfree.data.Range range46 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range46, (double) (byte) -1);
        double double50 = range48.constrain((double) 0L);
        double double51 = range48.getLength();
        org.jfree.data.Range range53 = org.jfree.data.Range.expandToInclude(range48, (double) (byte) -1);
        boolean boolean54 = range42.equals((java.lang.Object) (byte) -1);
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
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-10.0d) + "'", double50 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-109.0d) + "'", double51 == (-109.0d));
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        double double10 = range5.getLowerBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range13, 1.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range5, range13);
        double double19 = range5.getLength();
        boolean boolean21 = range5.contains(44.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 90.0d + "'", double19 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, 0.0d, 2483.0d);
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
        org.junit.Assert.assertNotNull(range37);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        double double8 = range5.getLowerBound();
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range5, 17.5d);
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
        double double42 = range15.getLowerBound();
        org.jfree.data.Range range45 = org.jfree.data.Range.expand(range15, (double) 0L, 0.0d);
        boolean boolean46 = range10.equals((java.lang.Object) range15);
        double double48 = range10.constrain((-89.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(range10);
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
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        boolean boolean7 = range4.intersects((double) 1.0f, (double) 0.0f);
        java.lang.String str8 = range4.toString();
        org.jfree.data.Range range11 = new org.jfree.data.Range(0.0d, (double) (-1L));
        boolean boolean12 = range4.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[99.0,-10.0]" + "'", str8, "Range[99.0,-10.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range27, 55.0d, 37289.0d);
        java.lang.String str31 = range30.toString();
        double double32 = range30.getLowerBound();
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-899.0d) + "'", double16 == (-899.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Range[-5901.0,3952669.0]" + "'", str31, "Range[-5901.0,3952669.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-5901.0d) + "'", double32 == (-5901.0d));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (-10.0d), 0.0d);
        double double9 = range2.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-109.0d) + "'", double9 == (-109.0d));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 0L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (-449.0d), false);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, 5549.5d, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-10.0d), false);
        boolean boolean13 = range7.intersects((double) 1.0f, (double) (byte) 0);
        boolean boolean15 = range7.contains(743473.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range27, 0.0d);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range30, (-26442.5d), false);
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
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jfree.data.Range range2 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean5 = range2.intersects((double) 100.0f, 90.0d);
        double double7 = range2.constrain(0.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 50.5d, 10974.5d);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, (-35.0d), false);
        double double14 = range10.getUpperBound();
        double double15 = range10.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-828.0d) + "'", double7 == (-828.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.093143E7d) + "'", double14 == (-1.093143E7d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.093143E7d) + "'", double15 == (-1.093143E7d));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-10.0d), true);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range2, (-36810.0d));
        java.lang.String str13 = range2.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[10.0,1.0]" + "'", str13, "Range[10.0,1.0]");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        double double86 = range53.getCentralValue();
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
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 32.25d + "'", double86 == 32.25d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        double double28 = range27.getCentralValue();
        java.lang.Object obj29 = null;
        boolean boolean30 = range27.equals(obj29);
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10612.5d + "'", double28 == 10612.5d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        double double21 = range8.constrain(90.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.5d) + "'", double15 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.5d) + "'", double16 == (-0.5d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (-1.0f), 11.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, (-933.0d));
        double double5 = range2.getUpperBound();
        double double7 = range2.constrain(2827.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 11.0d + "'", double7 == 11.0d);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (-0.5d));
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.0d), (double) (byte) 100);
        boolean boolean11 = range5.intersects((double) (byte) -1, (double) (short) -1);
        double double12 = range5.getCentralValue();
        java.lang.Class<?> wildcardClass13 = range5.getClass();
        boolean boolean14 = range2.equals((java.lang.Object) range5);
        double double15 = range2.getLength();
        boolean boolean18 = range2.intersects((double) 0.0f, (-199.0d));
        org.junit.Assert.assertNotNull(range2);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.5d + "'", double12 == 5.5d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, (double) (short) 100);
        org.jfree.data.Range range10 = org.jfree.data.Range.combine(range2, range9);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) 10L);
        java.lang.String str13 = range9.toString();
        java.lang.String str14 = range9.toString();
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range9, (double) (short) 100, (-3064.5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[10.0,100.0]" + "'", str13, "Range[10.0,100.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Range[10.0,100.0]" + "'", str14, "Range[10.0,100.0]");
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, (double) 'a', 10999.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range7, 743473.0d);
        java.lang.Object obj13 = null;
        boolean boolean14 = range7.equals(obj13);
        double double15 = range7.getUpperBound();
        double double16 = range7.getLength();
        java.lang.Class<?> wildcardClass17 = range7.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range36, (double) 10.0f, false);
        boolean boolean44 = range42.contains((double) 1L);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range42, (double) 100, 18630.0d);
        org.jfree.data.Range range50 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range50, (double) 10L);
        org.jfree.data.Range range55 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range58 = org.jfree.data.Range.expand(range55, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range61 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range63 = org.jfree.data.Range.shift(range61, (-10.0d));
        org.jfree.data.Range range64 = org.jfree.data.Range.combine(range58, range61);
        org.jfree.data.Range range67 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range70 = org.jfree.data.Range.expand(range67, (-1.0d), (double) (byte) 100);
        boolean boolean73 = range67.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range76 = org.jfree.data.Range.expand(range67, (-9.0d), (double) 100L);
        double double78 = range76.constrain(1.0d);
        org.jfree.data.Range range79 = org.jfree.data.Range.combine(range64, range76);
        boolean boolean80 = range50.equals((java.lang.Object) range79);
        org.jfree.data.Range range81 = org.jfree.data.Range.combine(range47, range79);
        boolean boolean82 = range33.equals((java.lang.Object) range79);
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
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-899.0d) + "'", double78 == (-899.0d));
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        double double10 = range5.getLowerBound();
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range13, 1.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.combine(range5, range13);
        boolean boolean21 = range5.intersects((-1326.0d), (-135.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.shift(range0, 97.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double11 = range10.getLength();
        double double12 = range10.getLowerBound();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range10, 10.0d, false);
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range7, range15);
        java.lang.Class<?> wildcardClass17 = range15.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        double double9 = range2.getLowerBound();
        boolean boolean12 = range2.intersects((double) (-1L), (double) 10L);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range2, 10995.5d, (-1800.0d));
        java.lang.String str16 = range15.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[98969.5,16201.0]" + "'", str16, "Range[98969.5,16201.0]");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range2 = org.jfree.data.Range.shift(range0, (-89.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range2.getLowerBound();
        double double14 = range2.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range2, 45.0d);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range19, (-1.0d), (double) (byte) 100);
        boolean boolean25 = range19.intersects((double) (byte) -1, (double) (short) -1);
        double double26 = range19.getCentralValue();
        double double27 = range19.getLength();
        double double28 = range19.getLength();
        double double30 = range19.constrain(0.0d);
        org.jfree.data.Range range33 = new org.jfree.data.Range((-41.0d), 0.0d);
        double double34 = range33.getLowerBound();
        double double35 = range33.getCentralValue();
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range19, range33);
        boolean boolean37 = range2.equals((java.lang.Object) range36);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5.5d + "'", double26 == 5.5d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-9.0d) + "'", double27 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9.0d) + "'", double28 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-41.0d) + "'", double34 == (-41.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-20.5d) + "'", double35 == (-20.5d));
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        boolean boolean7 = range4.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range4, (double) 0.0f);
        java.lang.Class<?> wildcardClass10 = range4.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range14.getCentralValue();
        double double16 = range14.getLowerBound();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range14, (double) (byte) 100, true);
        boolean boolean21 = range19.contains((-4.0d));
        double double22 = range19.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 21871.0d + "'", double15 == 21871.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 37189.0d + "'", double16 == 37189.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-30636.0d) + "'", double22 == (-30636.0d));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0L, (double) (-1L));
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, 11.0d);
        java.lang.Class<?> wildcardClass5 = range4.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        boolean boolean5 = range2.contains((double) 1L);
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
        boolean boolean37 = range34.intersects((double) (byte) 10, 10.0d);
        boolean boolean38 = range24.equals((java.lang.Object) boolean37);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range24, (double) (byte) 100, false);
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range24, 100.0d, (-0.5d));
        java.lang.String str45 = range44.toString();
        double double46 = range44.getLowerBound();
        org.jfree.data.Range range49 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range52 = org.jfree.data.Range.expand(range49, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range49, (double) 10.0f, false);
        boolean boolean57 = range55.contains((double) 1L);
        double double58 = range55.getUpperBound();
        org.jfree.data.Range range59 = org.jfree.data.Range.combine(range44, range55);
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range55, 32.0d);
        boolean boolean62 = range2.equals((java.lang.Object) range55);
        double double64 = range2.constrain((-485.0d));
        java.lang.Class<?> wildcardClass65 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Range[10999.0,44.5]" + "'", str45, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10999.0d + "'", double46 == 10999.0d);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 11.0d + "'", double58 == 11.0d);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) -1, 15.5d);
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.0d), (double) (byte) 100);
        boolean boolean11 = range5.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range5, (-9.0d), (double) 100L);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, 5.5d);
        double double18 = range14.constrain((double) (short) 1);
        boolean boolean19 = range2.equals((java.lang.Object) (short) 1);
        double double20 = range2.getCentralValue();
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-899.0d) + "'", double18 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.25d + "'", double20 == 7.25d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        org.jfree.data.Range range48 = null;
        org.jfree.data.Range range49 = org.jfree.data.Range.combine(range4, range48);
        double double50 = range49.getLowerBound();
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
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 99.0d + "'", double50 == 99.0d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        double double21 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 45.0d + "'", double19 == 45.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        boolean boolean12 = range5.intersects((-893.5d), (double) 100L);
        boolean boolean14 = range5.contains((double) (short) 100);
        double double15 = range5.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 91.0d + "'", double15 == 91.0d);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, 44.5d, (-799.0d));
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.combine(range2, range10);
        double double15 = range2.getUpperBound();
        double double16 = range2.getCentralValue();
        double double18 = range2.constrain((-41.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.5d) + "'", double16 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        java.lang.String str19 = range11.toString();
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range11, (-942.0d));
        double double22 = range21.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[-71.0,-899.0]" + "'", str19, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1427.0d) + "'", double22 == (-1427.0d));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        org.jfree.data.Range range24 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range24, (double) 100);
        java.lang.String str27 = range26.toString();
        boolean boolean28 = range21.equals((java.lang.Object) str27);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 90.0d + "'", double16 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Range[110.0,110.0]" + "'", str27, "Range[110.0,110.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        org.jfree.data.Range range46 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean49 = range46.intersects((double) 100.0f, 90.0d);
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double53 = range52.getLength();
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range52, (-109.0d));
        org.jfree.data.Range range58 = org.jfree.data.Range.expand(range55, (-71.0d), (-828.0d));
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range58, (double) 100L);
        double double61 = range60.getLength();
        double double62 = range60.getCentralValue();
        org.jfree.data.Range range63 = org.jfree.data.Range.combine(range46, range60);
        boolean boolean64 = range39.equals((java.lang.Object) range60);
        double double65 = range60.getLength();
        boolean boolean68 = range60.intersects(11045.5d, (-27.75d));
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-9.0d) + "'", double53 == (-9.0d));
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        double double9 = range2.getCentralValue();
        double double10 = range2.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range2, (double) 1.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range2, 5.0d);
        double double15 = range2.getLength();
        double double17 = range2.constrain(1907.25d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.5d + "'", double9 == 5.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9.0d) + "'", double15 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range6 = org.jfree.data.Range.expandToInclude(range4, (double) 'a');
        boolean boolean8 = range4.contains((-385.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range6 = org.jfree.data.Range.expandToInclude(range4, (double) 'a');
        double double7 = range4.getCentralValue();
        double double9 = range4.constrain(11.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range9, (double) (-1), 13.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range15, (double) 100L);
        double double18 = range17.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 109.0d + "'", double18 == 109.0d);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, 2891.125d, (-2342.5d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        double double18 = range14.getLowerBound();
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range14, (-170.0d), (-109.0d));
        boolean boolean24 = range14.intersects(104.5d, 10995.5d);
        double double25 = range14.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double11 = range10.getLength();
        double double12 = range10.getLowerBound();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range10, 10.0d, false);
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range7, range15);
        boolean boolean18 = range7.contains((double) 1.0f);
        java.lang.String str19 = range7.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[10.0,1.0]" + "'", str19, "Range[10.0,1.0]");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range9, (double) (-1), 13.0d);
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, 5.5d);
        boolean boolean25 = range21.equals((java.lang.Object) 171.0d);
        boolean boolean28 = range21.intersects((-893.5d), (double) 100L);
        org.jfree.data.Range range30 = org.jfree.data.Range.expandToInclude(range21, 0.0d);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, 0.0d, 0.0d);
        double double35 = range33.constrain((-933.0d));
        boolean boolean37 = range33.contains((-13662.0d));
        org.jfree.data.Range range38 = org.jfree.data.Range.combine(range15, range33);
        double double39 = range33.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 91.0d + "'", double39 == 91.0d);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        java.lang.String str55 = range11.toString();
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Range[0.0,536.0]" + "'", str55, "Range[0.0,536.0]");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        boolean boolean31 = range28.intersects(90.0d, (double) (byte) 10);
        org.jfree.data.Range range32 = null;
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range28, range32);
        double double34 = range28.getUpperBound();
        java.lang.String str35 = range28.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Range[-828.0,100.0]" + "'", str35, "Range[-828.0,100.0]");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jfree.data.Range range2 = new org.jfree.data.Range(71.0d, (-700.0d));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jfree.data.Range range2 = new org.jfree.data.Range(10999.0d, (double) 100.0f);
        boolean boolean5 = range2.intersects(6553.0d, (double) 'a');
        org.jfree.data.Range range8 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (double) 10L);
        double double11 = range8.getLowerBound();
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range8, 72.0d, (double) 10.0f);
        org.jfree.data.Range range17 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, (-1.0d), (double) (byte) 100);
        boolean boolean26 = range20.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range20, (-9.0d), (double) 100L);
        double double31 = range29.constrain(1.0d);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range29, (double) (byte) 100);
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range29, (double) 'a');
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range29, (-1.0d), (-9.0d));
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range29, 0.0d, true);
        org.jfree.data.Range range42 = org.jfree.data.Range.combine(range17, range41);
        double double43 = range17.getCentralValue();
        boolean boolean44 = range14.equals((java.lang.Object) double43);
        boolean boolean45 = range2.equals((java.lang.Object) double43);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-899.0d) + "'", double31 == (-899.0d));
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 67.0d + "'", double43 == 67.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        boolean boolean30 = range5.contains(7.25d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (-933.0d));
        double double12 = range11.getLength();
        double double13 = range11.getLength();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, 6553.0d, false);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-942.0d) + "'", double12 == (-942.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-942.0d) + "'", double13 == (-942.0d));
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        org.jfree.data.Range range57 = org.jfree.data.Range.shift(range54, (-89.0d), true);
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
        org.junit.Assert.assertNotNull(range57);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0L, (double) (-1L));
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, 11.0d);
        java.lang.String str5 = range4.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Range[0.0,11.0]" + "'", str5, "Range[0.0,11.0]");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-449.0d), (-101.0d));
        java.lang.String str3 = range2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Range[-449.0,-101.0]" + "'", str3, "Range[-449.0,-101.0]");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1.0f, 37189.0d);
        double double3 = range2.getCentralValue();
        boolean boolean6 = range2.intersects((-13662.0d), (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 18595.0d + "'", double3 == 18595.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        double double36 = range15.constrain((-101.0d));
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
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, (double) (short) 100);
        org.jfree.data.Range range10 = org.jfree.data.Range.combine(range2, range9);
        double double11 = range2.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 10);
        java.lang.Class<?> wildcardClass14 = range13.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jfree.data.Range range2 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean5 = range2.intersects((double) 100.0f, 90.0d);
        double double7 = range2.constrain(0.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 50.5d, 10974.5d);
        boolean boolean12 = range10.contains(45.5d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-828.0d) + "'", double7 == (-828.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        boolean boolean19 = range14.contains(6553.0d);
        double double21 = range14.constrain(61.0d);
        java.lang.Class<?> wildcardClass22 = range14.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 61.0d + "'", double21 == 61.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jfree.data.Range range2 = new org.jfree.data.Range(18630.0d, 5521.75d);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, (double) 1.0f, false);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, (-13662.0d), true);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range11, (-37118.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        double double12 = range11.getLowerBound();
        boolean boolean15 = range11.intersects((-893.5d), 61.0d);
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, (-1.0d), (double) (byte) 100);
        boolean boolean24 = range18.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range18, (-9.0d), (double) 100L);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range27, 5.5d);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double33 = range32.getLength();
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range32, 1.0d, true);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range39, (-10.0d));
        boolean boolean42 = range32.equals((java.lang.Object) range41);
        boolean boolean43 = range27.equals((java.lang.Object) range41);
        double double44 = range27.getCentralValue();
        double double45 = range27.getLength();
        org.jfree.data.Range range46 = org.jfree.data.Range.combine(range11, range27);
        double double48 = range11.constrain(928.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-9.0d) + "'", double33 == (-9.0d));
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-485.0d) + "'", double44 == (-485.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-828.0d) + "'", double45 == (-828.0d));
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range7, (double) 0.0f);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, 37189.0d, false);
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range15, 90.0d, false);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range15, (double) 100.0f, (double) 100.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range12, range15);
        boolean boolean25 = range12.intersects(107.25d, (double) (byte) 10);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range45, (-71.0d));
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
        org.junit.Assert.assertNotNull(range47);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 0L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (double) (byte) -1, true);
        boolean boolean13 = range11.contains(61.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range11, 743473.0d);
        boolean boolean18 = range15.intersects((-942.0d), 500.5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (-933.0d));
        boolean boolean13 = range2.contains((-31535.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1.0f, (-899.0d));
        double double3 = range2.getLowerBound();
        double double5 = range2.constrain((-35.0d));
        boolean boolean7 = range2.contains(2483.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-899.0d) + "'", double5 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range3, (-1.0d), (double) (byte) 100);
        boolean boolean9 = range3.intersects((double) (byte) -1, (double) (short) -1);
        double double10 = range3.getCentralValue();
        double double11 = range3.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.combine(range0, range3);
        double double14 = range3.constrain((double) 100L);
        java.lang.Class<?> wildcardClass15 = range3.getClass();
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.5d + "'", double10 == 5.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range3, 2849.5d);
        boolean boolean22 = range20.contains((-119.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.5d + "'", double10 == 5.5d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        org.jfree.data.Range range29 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, (double) 10L);
        double double32 = range29.getLowerBound();
        double double33 = range29.getCentralValue();
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range29, (-485.0d), (-449.0d));
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range36, (double) 10.0f);
        boolean boolean39 = range23.equals((java.lang.Object) range38);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range23, 65.75d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-0.5d) + "'", double33 == (-0.5d));
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range41);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-13662.0d), 11871.0d);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range6, 1.0d, true);
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, 10984.5d);
        double double15 = range10.constrain((-35.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getCentralValue();
        double double4 = range2.getUpperBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 6108.5d, false);
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range10, (double) 10.0f, false);
        double double17 = range10.getLowerBound();
        boolean boolean20 = range10.intersects((double) (byte) 10, 0.0d);
        boolean boolean22 = range10.contains((-71.0d));
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range10, (-345.0d));
        boolean boolean25 = range2.equals((java.lang.Object) (-345.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.5d + "'", double3 == 5.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        double double18 = range11.getLength();
        boolean boolean21 = range11.intersects((-4915.0d), (-942.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        java.lang.String str38 = range37.toString();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Range[-449.0,-449.0]" + "'", str38, "Range[-449.0,-449.0]");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        double double19 = range17.constrain(10999.0d);
        boolean boolean22 = range17.intersects(11044.5d, 464.5d);
        org.jfree.data.Range range24 = org.jfree.data.Range.expandToInclude(range17, 2.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.5d) + "'", double15 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.5d) + "'", double16 == (-0.5d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        double double25 = range2.getLowerBound();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range2, 500.5d);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, (-1.0d), (double) (byte) 100);
        boolean boolean36 = range30.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range30, (-9.0d), (double) 100L);
        double double41 = range39.constrain(1.0d);
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range39, (double) (byte) 100);
        org.jfree.data.Range range45 = org.jfree.data.Range.expandToInclude(range39, (double) 'a');
        java.lang.String str46 = range39.toString();
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range39, 0.0d);
        double double49 = range48.getLowerBound();
        java.lang.String str50 = range48.toString();
        double double51 = range48.getLength();
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range48, (double) (byte) 1);
        org.jfree.data.Range range56 = org.jfree.data.Range.expand(range53, (-1.5d), (-27.75d));
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range53, (-899.0d), (-942.0d));
        boolean boolean60 = range2.equals((java.lang.Object) (-899.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-899.0d) + "'", double41 == (-899.0d));
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Range[-71.0,-899.0]" + "'", str46, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-71.0d) + "'", double49 == (-71.0d));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Range[-71.0,0.0]" + "'", str50, "Range[-71.0,0.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 71.0d + "'", double51 == 71.0d);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (double) (short) -1, false);
        java.lang.String str17 = range16.toString();
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double21 = range20.getLength();
        double double22 = range20.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range20, (-799.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range20, 45.0d, (-828.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range16, range20);
        boolean boolean31 = range16.intersects(48.0d, (-898.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[-72.0,-900.0]" + "'", str17, "Range[-72.0,-900.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9.0d) + "'", double21 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (-828.0d));
        boolean boolean21 = range17.contains((-109.0d));
        boolean boolean23 = range17.contains((-1.5d));
        java.lang.Class<?> wildcardClass24 = range17.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 100, 11.0d);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range6, (-1.0d), (double) (byte) 100);
        boolean boolean12 = range6.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range6, (-9.0d), (double) 100L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range15, (double) 1);
        org.jfree.data.Range range20 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, (double) (byte) -1);
        boolean boolean25 = range22.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range15, range22);
        java.lang.String str27 = range22.toString();
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range22, 5.5d, false);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range22, (-485.0d), (double) (byte) 1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expandToInclude(range22, (double) (byte) -1);
        double double37 = range35.constrain((double) '#');
        boolean boolean38 = range2.equals((java.lang.Object) range35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 55.5d + "'", double3 == 55.5d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Range[99.0,-10.0]" + "'", str27, "Range[99.0,-10.0]");
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-10.0d) + "'", double37 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        org.jfree.data.Range range21 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, (double) 10L);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range23, (-9.0d), true);
        double double27 = range23.getCentralValue();
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range23, (-1.0d), (-71.0d));
        boolean boolean31 = range12.equals((java.lang.Object) (-71.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[0.0,0.0]" + "'", str10, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[0.0,5.0]" + "'", str13, "Range[0.0,5.0]");
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5.0d + "'", double27 == 5.0d);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range28, 35.0d, 11871.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range32, (-450.0d));
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
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range34);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        boolean boolean61 = range58.contains(65.75d);
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
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        boolean boolean40 = range37.intersects(5.0d, 15.5d);
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
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (double) (byte) 100, true);
        double double17 = range11.getCentralValue();
        double double18 = range11.getCentralValue();
        double double19 = range11.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-485.0d) + "'", double17 == (-485.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-485.0d) + "'", double18 == (-485.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-828.0d) + "'", double19 == (-828.0d));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        double double20 = range19.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        boolean boolean34 = range31.contains(5814.0d);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        double double10 = range5.getLowerBound();
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range5, (double) 100, 90.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 0.0d, 11044.5d);
        boolean boolean18 = range16.contains((-37118.0d));
        double double19 = range16.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.89872145E8d + "'", double19 == 1.89872145E8d);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range15, (double) 100);
        org.jfree.data.Range range30 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range33 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range33, (-1.0d), (double) (byte) 100);
        boolean boolean39 = range33.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range33, (-9.0d), (double) 100L);
        double double44 = range42.constrain(1.0d);
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range42, (double) (byte) 100);
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range42, (double) 'a');
        org.jfree.data.Range range51 = org.jfree.data.Range.expand(range42, (-1.0d), (-9.0d));
        org.jfree.data.Range range54 = org.jfree.data.Range.shift(range42, 0.0d, true);
        org.jfree.data.Range range55 = org.jfree.data.Range.combine(range30, range54);
        boolean boolean56 = range15.equals((java.lang.Object) range54);
        boolean boolean59 = range54.intersects(0.0d, (-5440482.0d));
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
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-899.0d) + "'", double44 == (-899.0d));
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        java.lang.Class<?> wildcardClass36 = range17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range9, (double) (-1), 13.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range9, 107.25d, false);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jfree.data.Range range2 = new org.jfree.data.Range(171.0d, (double) (byte) 1);
        double double3 = range2.getLength();
        double double5 = range2.constrain((double) '#');
        double double6 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-170.0d) + "'", double3 == (-170.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 86.0d + "'", double6 == 86.0d);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) (byte) -1);
        double double18 = range15.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-799.0d) + "'", double18 == (-799.0d));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, (-818.0d));
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, 0.0d, 51.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range10, (-9929.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        java.lang.String str67 = range40.toString();
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
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Range[0.0,91.0]" + "'", str67, "Range[0.0,91.0]");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        boolean boolean14 = range9.contains((double) '#');
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range9, 91.0d, true);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range17, (-846.375d));
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range17, (-30636.0d), (-13733.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, 72.0d, (double) 10.0f);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, 35.0d, true);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range11, (double) 10L, (-898.0d));
        org.jfree.data.Range range26 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range26, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range29, 45.0d, true);
        boolean boolean33 = range11.equals((java.lang.Object) 45.0d);
        double double34 = range11.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-828.0d) + "'", double34 == (-828.0d));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range2, (-818.0d));
        double double23 = range22.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 45.0d + "'", double19 == 45.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-818.0d) + "'", double23 == (-818.0d));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jfree.data.Range range2 = new org.jfree.data.Range(109.0d, 10.0d);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range(0.0d, 0.0d);
        double double7 = range6.getLowerBound();
        double double8 = range6.getLowerBound();
        boolean boolean9 = range2.equals((java.lang.Object) double8);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range11);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10L, (double) 1.0f);
        boolean boolean5 = range2.intersects((double) 0.0f, (double) 10.0f);
        boolean boolean8 = range2.intersects((-1560023.25d), 32.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) 100, 11.0d);
        boolean boolean4 = range2.equals((java.lang.Object) (-485.0d));
        boolean boolean7 = range2.intersects((double) 10.0f, 99.0d);
        java.lang.Class<?> wildcardClass8 = range2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        double double44 = range39.getCentralValue();
        org.jfree.data.Range range47 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range50 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range53 = org.jfree.data.Range.expand(range50, (-1.0d), (double) (byte) 100);
        boolean boolean56 = range50.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range50, (-9.0d), (double) 100L);
        double double61 = range59.constrain(1.0d);
        org.jfree.data.Range range63 = org.jfree.data.Range.shift(range59, (double) (byte) 100);
        org.jfree.data.Range range65 = org.jfree.data.Range.expandToInclude(range59, (double) 'a');
        org.jfree.data.Range range68 = org.jfree.data.Range.expand(range59, (-1.0d), (-9.0d));
        org.jfree.data.Range range71 = org.jfree.data.Range.shift(range59, 0.0d, true);
        org.jfree.data.Range range72 = org.jfree.data.Range.combine(range47, range71);
        org.jfree.data.Range range75 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double76 = range75.getLength();
        double double77 = range75.getLowerBound();
        org.jfree.data.Range range78 = org.jfree.data.Range.combine(range72, range75);
        org.jfree.data.Range range81 = org.jfree.data.Range.shift(range75, 61.0d, false);
        java.lang.String str82 = range81.toString();
        boolean boolean83 = range39.equals((java.lang.Object) str82);
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
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-899.0d) + "'", double61 == (-899.0d));
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertNotNull(range72);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-9.0d) + "'", double76 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertNotNull(range78);
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Range[71.0,62.0]" + "'", str82, "Range[71.0,62.0]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double3 = range2.getUpperBound();
        double double5 = range2.constrain(0.0d);
        java.lang.String str6 = range2.toString();
        double double7 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9.0d) + "'", double5 == (-9.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[100.0,-9.0]" + "'", str6, "Range[100.0,-9.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-10.0d));
        double double12 = range2.constrain(44.5d);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range2, (-484.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range2, (-385.0d));
        double double17 = range16.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 386.0d + "'", double17 == 386.0d);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        double double45 = range20.getLength();
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
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 7452.0d + "'", double45 == 7452.0d);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0L, (double) (-1L));
        double double3 = range2.getUpperBound();
        double double4 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        boolean boolean14 = range9.contains((double) '#');
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range9, 91.0d, true);
        boolean boolean19 = range17.contains((-31535.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-10.0d), false);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, 0.0d, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double17 = range16.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range16, 1.0d, true);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range23, (-10.0d));
        boolean boolean26 = range16.equals((java.lang.Object) range25);
        double double27 = range16.getLowerBound();
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range13, range16);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (short) -1, 15.5d);
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 100.0f, true);
        double double6 = range5.getCentralValue();
        double double7 = range5.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 107.25d + "'", double6 == 107.25d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 99.0d + "'", double7 == 99.0d);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, 44.5d, (-799.0d));
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.combine(range2, range10);
        double double15 = range14.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range22, (-10.0d));
        boolean boolean27 = range22.intersects((double) 1, (double) 10L);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range30, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range36, (-10.0d));
        org.jfree.data.Range range39 = org.jfree.data.Range.combine(range33, range36);
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range22, range33);
        org.jfree.data.Range range43 = new org.jfree.data.Range(0.0d, (double) '#');
        org.jfree.data.Range range46 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range46, (double) (byte) -1);
        boolean boolean51 = range48.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range48, (double) 0.0f);
        boolean boolean55 = range53.contains(15.5d);
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range43, range53);
        org.jfree.data.Range range57 = org.jfree.data.Range.combine(range33, range43);
        org.jfree.data.Range range58 = org.jfree.data.Range.combine(range19, range57);
        double double59 = range19.getLowerBound();
        org.jfree.data.Range range62 = org.jfree.data.Range.expand(range19, (-882.5d), (-616231.5d));
        java.lang.String str63 = range19.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Range[100.0,100.0]" + "'", str63, "Range[100.0,100.0]");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range7, (double) 0.0f);
        boolean boolean12 = range7.intersects(71.0d, (-828.0d));
        org.jfree.data.Range range15 = new org.jfree.data.Range(10999.0d, (double) 100.0f);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) 10.0f);
        boolean boolean19 = range15.contains((-449.0d));
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range15, 99.0d);
        double double22 = range15.getUpperBound();
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range15, (-11.0d), (-345.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.combine(range7, range15);
        double double27 = range7.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 92.0d + "'", double27 == 92.0d);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-828.0d), true);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (-485.0d));
        java.lang.String str14 = range13.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Range[-818.0,-485.0]" + "'", str14, "Range[-818.0,-485.0]");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        boolean boolean12 = range5.intersects((-893.5d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range5, 0.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, 0.0d, 0.0d);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range17, 10612.5d);
        double double20 = range17.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 91.0d + "'", double20 == 91.0d);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range28, 1.0d, (double) ' ');
        double double33 = range31.constrain(18605.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 5572.0d + "'", double33 == 5572.0d);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0.0f, 37189.0d);
        double double4 = range2.constrain(20.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        java.lang.Class<?> wildcardClass72 = range66.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        double double8 = range7.getLength();
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range7, 11045.5d, (-898.0d));
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range7, (-405.0d), true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        double double23 = range20.getUpperBound();
        org.jfree.data.Range range24 = null;
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range20, range24);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range20, 232.75d, (-846.375d));
        double double29 = range20.getLength();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 71.0d + "'", double29 == 71.0d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        org.jfree.data.Range range76 = org.jfree.data.Range.expandToInclude(range70, 10999.0d);
        double double77 = range76.getLowerBound();
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
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-485.0d) + "'", double77 == (-485.0d));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, 0.0d, true);
        boolean boolean11 = range5.intersects((double) 'a', 0.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range5, 5.5d);
        double double14 = range13.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (-828.0d));
        boolean boolean21 = range17.contains((-109.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range17, 2891.125d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range23);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        double double34 = range32.getLowerBound();
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-4.0d) + "'", double34 == (-4.0d));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-485.0d), (-449.0d));
        org.jfree.data.Range range12 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double13 = range12.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.combine(range9, range12);
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range17, (-1.0d), (double) (byte) 100);
        boolean boolean23 = range17.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range17, (-9.0d), (double) 100L);
        double double28 = range26.constrain(1.0d);
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range26, (double) (byte) 100);
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range26, (double) 'a');
        double double33 = range26.getLength();
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        boolean boolean37 = range26.equals((java.lang.Object) 10.0f);
        boolean boolean38 = range9.equals((java.lang.Object) 10.0f);
        java.lang.String str39 = range9.toString();
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range9, 0.0d, 2483.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.0d) + "'", double13 == (-9.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-899.0d) + "'", double28 == (-899.0d));
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-828.0d) + "'", double33 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Range[484.0,-449.0]" + "'", str39, "Range[484.0,-449.0]");
        org.junit.Assert.assertNotNull(range42);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-485.0d), (-449.0d));
        org.jfree.data.Range range12 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double13 = range12.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.combine(range9, range12);
        double double15 = range9.getLength();
        double double16 = range9.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.0d) + "'", double13 == (-9.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-933.0d) + "'", double15 == (-933.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 484.0d + "'", double16 == 484.0d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range8, 33.0d);
        double double22 = range21.getUpperBound();
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        double double36 = range34.constrain(1.0d);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range34, (double) (byte) 100);
        org.jfree.data.Range range40 = org.jfree.data.Range.expandToInclude(range34, (double) 'a');
        org.jfree.data.Range range43 = org.jfree.data.Range.expand(range34, (-1.0d), (-9.0d));
        org.jfree.data.Range range45 = org.jfree.data.Range.shift(range43, 0.0d);
        org.jfree.data.Range range48 = new org.jfree.data.Range(171.0d, (double) (byte) 1);
        boolean boolean49 = range43.equals((java.lang.Object) range48);
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double53 = range52.getLength();
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range52, 1.0d, true);
        org.jfree.data.Range range59 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range61 = org.jfree.data.Range.shift(range59, (-10.0d));
        boolean boolean62 = range52.equals((java.lang.Object) range61);
        double double63 = range61.getCentralValue();
        org.jfree.data.Range range65 = org.jfree.data.Range.shift(range61, (double) 100L);
        boolean boolean66 = range43.equals((java.lang.Object) range65);
        org.jfree.data.Range range67 = org.jfree.data.Range.combine(range21, range43);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 33.0d + "'", double22 == 33.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-899.0d) + "'", double36 == (-899.0d));
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-9.0d) + "'", double53 == (-9.0d));
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 45.0d + "'", double63 == 45.0d);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(range67);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        double double68 = range66.constrain(100.0d);
        org.jfree.data.Range range70 = org.jfree.data.Range.expandToInclude(range66, 18630.0d);
        org.jfree.data.Range range73 = org.jfree.data.Range.shift(range66, 0.0d, true);
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
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-3240.5d) + "'", double68 == (-3240.5d));
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range73);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        boolean boolean10 = range4.contains((-109.0d));
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range4, 20.0d, (-799.0d));
        double double15 = range4.constrain((double) (-1.0f));
        java.lang.String str16 = range4.toString();
        double double18 = range4.constrain(1.89872145E8d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[0.0,90.0]" + "'", str16, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        boolean boolean53 = range51.contains((double) (short) 100);
        java.lang.String str54 = range51.toString();
        org.jfree.data.Range range57 = new org.jfree.data.Range((double) '4', (-846.375d));
        org.jfree.data.Range range58 = org.jfree.data.Range.combine(range51, range57);
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Range[-1751.0,-393443.0]" + "'", str54, "Range[-1751.0,-393443.0]");
        org.junit.Assert.assertNotNull(range58);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        double double24 = range11.getLength();
        org.jfree.data.Range range27 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean29 = range27.contains((double) 'a');
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range27, (double) (byte) 0);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range27, (double) (-1.0f));
        boolean boolean34 = range11.equals((java.lang.Object) range27);
        double double36 = range11.constrain(7.25d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-828.0d) + "'", double24 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-899.0d) + "'", double36 == (-899.0d));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range13, (-13662.0d));
        double double35 = range34.getUpperBound();
        double double36 = range34.getLowerBound();
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range34, (-4050.0d));
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
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-13733.0d) + "'", double36 == (-13733.0d));
        org.junit.Assert.assertNotNull(range38);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (-1.0d));
        java.lang.String str17 = range16.toString();
        double double18 = range16.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[-72.0,-900.0]" + "'", str17, "Range[-72.0,-900.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-72.0d) + "'", double18 == (-72.0d));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        boolean boolean23 = range21.contains((-893.5d));
        boolean boolean25 = range21.contains((-400.5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        double double7 = range5.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range5, (-170.0d));
        org.jfree.data.Range range12 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean15 = range12.intersects((double) 100.0f, 90.0d);
        double double17 = range12.constrain(0.0d);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range12, 50.5d, 10974.5d);
        double double21 = range20.getLowerBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range5, range20);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-449.0d) + "'", double7 == (-449.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-828.0d) + "'", double17 == (-828.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50466.0d + "'", double21 == 50466.0d);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        boolean boolean19 = range17.contains((double) 'a');
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range17, (-0.5d));
        java.lang.String str22 = range17.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Range[-71.0,97.0]" + "'", str22, "Range[-71.0,97.0]");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        double double22 = range11.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 90.0d + "'", double22 == 90.0d);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (-9173.5d));
        org.junit.Assert.assertNotNull(range2);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range8, (double) (short) -1);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[20.0,11.0]" + "'", str13, "Range[20.0,11.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        double double12 = range8.getLength();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range8, (double) 10, true);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.0d + "'", double12 == 90.0d);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        boolean boolean25 = range21.intersects((-893.5d), 168.0d);
        boolean boolean27 = range21.contains((double) 0);
        java.lang.String str28 = range21.toString();
        double double29 = range21.getLength();
        double double30 = range21.getLength();
        double double31 = range21.getLength();
        org.jfree.data.Range range33 = org.jfree.data.Range.expandToInclude(range21, (-799.0d));
        java.lang.Class<?> wildcardClass34 = range33.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 45.0d + "'", double20 == 45.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Range[0.0,90.0]" + "'", str28, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 90.0d + "'", double29 == 90.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 90.0d + "'", double30 == 90.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 90.0d + "'", double31 == 90.0d);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        double double8 = range2.constrain((double) 0L);
        double double10 = range2.constrain(67.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) -1, (-9138.5d));
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, 62.0d);
        double double5 = range2.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9137.5d) + "'", double5 == (-9137.5d));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.jfree.data.Range range2 = new org.jfree.data.Range(35.0d, (double) (short) 1);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        double double62 = range38.getUpperBound();
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
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 44.5d + "'", double62 == 44.5d);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        boolean boolean7 = range2.intersects((double) 1, (double) 10L);
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-10.0d));
        org.jfree.data.Range range19 = org.jfree.data.Range.combine(range13, range16);
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range2, range13);
        org.jfree.data.Range range23 = new org.jfree.data.Range(0.0d, (double) '#');
        org.jfree.data.Range range26 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, (double) (byte) -1);
        boolean boolean31 = range28.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range28, (double) 0.0f);
        boolean boolean35 = range33.contains(15.5d);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range23, range33);
        org.jfree.data.Range range37 = org.jfree.data.Range.combine(range13, range23);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range37, 11044.5d, false);
        double double41 = range37.getLength();
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range37, 72.0d, true);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 35.0d + "'", double41 == 35.0d);
        org.junit.Assert.assertNotNull(range44);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (double) (short) -1, false);
        java.lang.String str17 = range16.toString();
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double21 = range20.getLength();
        double double22 = range20.getLowerBound();
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range20, (-799.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range20, 45.0d, (-828.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range16, range20);
        double double29 = range28.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[-72.0,-900.0]" + "'", str17, "Range[-72.0,-900.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9.0d) + "'", double21 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 73.0d + "'", double29 == 73.0d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range21, 50466.0d, (-828.0d));
        org.jfree.data.Range range27 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range27, (double) 10L);
        double double30 = range27.getLowerBound();
        double double31 = range27.getCentralValue();
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range27, (-485.0d), (-449.0d));
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range34, (double) 10.0f);
        org.jfree.data.Range range37 = null;
        org.jfree.data.Range range38 = org.jfree.data.Range.combine(range36, range37);
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range36, (double) 'a', false);
        boolean boolean42 = range21.equals((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.5d) + "'", double31 == (-0.5d));
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, 0.0d, true);
        double double9 = range5.getLowerBound();
        boolean boolean11 = range5.equals((java.lang.Object) 52.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        boolean boolean25 = range20.intersects((double) 0.0f, (-345.0d));
        boolean boolean28 = range20.intersects(32.25d, 48.5d);
        java.lang.Class<?> wildcardClass29 = range20.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        double double71 = range20.constrain(484.0d);
        org.jfree.data.Range range74 = org.jfree.data.Range.shift(range20, 172.0d, true);
        java.lang.Class<?> wildcardClass75 = range20.getClass();
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
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-898.0d) + "'", double71 == (-898.0d));
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jfree.data.Range range2 = new org.jfree.data.Range(171.0d, (double) (byte) 1);
        double double3 = range2.getLength();
        java.lang.Class<?> wildcardClass4 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-170.0d) + "'", double3 == (-170.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        double double20 = range19.getUpperBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range19, 168.0d);
        boolean boolean25 = range19.intersects(46.0d, 10974.5d);
        boolean boolean27 = range19.contains(10995.5d);
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
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        boolean boolean15 = range11.equals((java.lang.Object) '4');
        double double16 = range11.getLowerBound();
        double double18 = range11.constrain((double) 10);
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range11, (double) '4', false);
        double double22 = range11.getLowerBound();
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range11, (-4915.0d), true);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-71.0d) + "'", double16 == (-71.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-899.0d) + "'", double18 == (-899.0d));
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-71.0d) + "'", double22 == (-71.0d));
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jfree.data.Range range2 = new org.jfree.data.Range(11045.5d, (double) 0L);
        double double4 = range2.constrain((-31535.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (-0.5d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 11045.5d + "'", double4 == 11045.5d);
        org.junit.Assert.assertNotNull(range6);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.jfree.data.Range range2 = new org.jfree.data.Range(90.0d, 18630.0d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, (-9.0d), true);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, 99.0d, true);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range7, (double) 10.0f);
        java.lang.String str13 = range12.toString();
        double double14 = range12.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[-9.0,10.0]" + "'", str13, "Range[-9.0,10.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        org.jfree.data.Range range50 = org.jfree.data.Range.shift(range4, (double) 10);
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
        org.junit.Assert.assertNotNull(range50);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, (-828.0d), (-364.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (-109.0d));
        double double3 = range2.getUpperBound();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range6, (-1.0d), (double) (byte) 100);
        boolean boolean12 = range6.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range6, (-9.0d), (double) 100L);
        double double17 = range15.constrain(1.0d);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, (-1.0d), (double) (byte) 100);
        boolean boolean26 = range20.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range20, (-9.0d), (double) 100L);
        org.jfree.data.Range range32 = org.jfree.data.Range.expand(range29, 45.0d, (-9.0d));
        double double33 = range32.getUpperBound();
        boolean boolean34 = range15.equals((java.lang.Object) double33);
        boolean boolean35 = range2.equals((java.lang.Object) range15);
        double double37 = range2.constrain((-83.5d));
        org.junit.Assert.assertNotNull(range2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-109.0d) + "'", double3 == (-109.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-899.0d) + "'", double17 == (-899.0d));
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 6553.0d + "'", double33 == 6553.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-109.0d) + "'", double37 == (-109.0d));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range41, (-109.0d), true);
        double double45 = range44.getLowerBound();
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
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-109.0d) + "'", double45 == (-109.0d));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        java.lang.String str19 = range11.toString();
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range11, (-942.0d));
        java.lang.String str22 = range21.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[-71.0,-899.0]" + "'", str19, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Range[-1013.0,-1841.0]" + "'", str22, "Range[-1013.0,-1841.0]");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double13 = range11.getCentralValue();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) 100L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range15, (-71.0d));
        java.lang.String str18 = range17.toString();
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range17, 21871.0d, false);
        double double22 = range21.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 45.0d + "'", double13 == 45.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,190.0]" + "'", str18, "Range[-71.0,190.0]");
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        double double57 = range52.getLowerBound();
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
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getCentralValue();
        double double4 = range2.getUpperBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 6108.5d, false);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 5521.75d);
        double double10 = range9.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.5d + "'", double3 == 5.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5527.25d + "'", double10 == 5527.25d);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        double double25 = range8.getCentralValue();
        org.jfree.data.Range range28 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range28, (-1.0d), (double) (byte) 100);
        boolean boolean34 = range28.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range28, (-9.0d), (double) 100L);
        double double39 = range37.constrain(1.0d);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range37, (double) (byte) 100, true);
        double double43 = range37.getUpperBound();
        boolean boolean45 = range37.contains(100.0d);
        boolean boolean46 = range8.equals((java.lang.Object) 100.0d);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-899.0d) + "'", double39 == (-899.0d));
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-899.0d) + "'", double43 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, 18630.0d);
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
        org.junit.Assert.assertNotNull(range32);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        org.jfree.data.Range range34 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range34, (double) (byte) -1);
        double double38 = range36.constrain((double) 0L);
        boolean boolean40 = range36.contains(168.0d);
        org.jfree.data.Range range43 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double44 = range43.getLength();
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range43, (-109.0d));
        org.jfree.data.Range range49 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range52 = org.jfree.data.Range.expand(range49, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range55 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range57 = org.jfree.data.Range.shift(range55, (-10.0d));
        org.jfree.data.Range range58 = org.jfree.data.Range.combine(range52, range55);
        org.jfree.data.Range range61 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range64 = org.jfree.data.Range.expand(range61, (-1.0d), (double) (byte) 100);
        boolean boolean67 = range61.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range70 = org.jfree.data.Range.expand(range61, (-9.0d), (double) 100L);
        double double72 = range70.constrain(1.0d);
        org.jfree.data.Range range73 = org.jfree.data.Range.combine(range58, range70);
        boolean boolean74 = range46.equals((java.lang.Object) range58);
        boolean boolean76 = range58.contains((-485.0d));
        boolean boolean77 = range36.equals((java.lang.Object) (-485.0d));
        org.jfree.data.Range range79 = org.jfree.data.Range.expandToInclude(range36, (double) 100L);
        double double80 = range36.getCentralValue();
        org.jfree.data.Range range81 = org.jfree.data.Range.combine(range26, range36);
        java.lang.String str82 = range81.toString();
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
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-10.0d) + "'", double38 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-9.0d) + "'", double44 == (-9.0d));
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-899.0d) + "'", double72 == (-899.0d));
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 44.5d + "'", double80 == 44.5d);
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Range[-71.0,100.0]" + "'", str82, "Range[-71.0,100.0]");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        boolean boolean5 = range2.contains((double) 1L);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double9 = range8.getLength();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range8, 1.0d, true);
        double double13 = range8.getLength();
        boolean boolean14 = range2.equals((java.lang.Object) range8);
        boolean boolean16 = range2.contains((-345.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.0d) + "'", double13 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) (-1), false);
        boolean boolean14 = range9.contains((double) '#');
        double double16 = range9.constrain((double) 100L);
        double double17 = range9.getUpperBound();
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range9, (double) (byte) 10);
        double double20 = range19.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.5d + "'", double20 == 0.5d);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jfree.data.Range range2 = new org.jfree.data.Range(14.5d, 46.0d);
        double double3 = range2.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 46.0d + "'", double3 == 46.0d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-135.0d), (-119.0d));
        double double3 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-127.0d) + "'", double3 == (-127.0d));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        boolean boolean48 = range44.intersects(494.0d, 45.5d);
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        java.lang.Object obj21 = null;
        boolean boolean22 = range5.equals(obj21);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-5901.0d), 272.5d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        java.lang.String str28 = range8.toString();
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range8, (double) (byte) 0, false);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Range[10.0,1.0]" + "'", str28, "Range[10.0,1.0]");
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        double double70 = range58.constrain(33.0d);
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
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 11.0d + "'", double70 == 11.0d);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range49, 32.0d);
        java.lang.Class<?> wildcardClass56 = range55.getClass();
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
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-89.0d), (double) 100L);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10, 11.0d);
        double double4 = range2.constrain((-13662.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 91.0d);
        boolean boolean9 = range6.intersects(5.0d, 48.0d);
        boolean boolean11 = range6.contains((-700.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.jfree.data.Range range2 = new org.jfree.data.Range(6108.5d, (-71.0d));
        org.jfree.data.Range range3 = null;
        org.jfree.data.Range range4 = org.jfree.data.Range.combine(range2, range3);
        org.junit.Assert.assertNotNull(range4);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range26, 18630.0d, 484.0d);
        double double33 = range26.constrain(32.25d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 32.25d + "'", double33 == 32.25d);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range2, 37189.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range2, 17.5d, false);
        double double13 = range2.getLowerBound();
        double double15 = range2.constrain(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        double double9 = range7.constrain((double) 10);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range7, 0.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 45.0d);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range19, 5.5d);
        boolean boolean23 = range19.equals((java.lang.Object) 171.0d);
        double double24 = range19.getLowerBound();
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range27, (-10.0d));
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range27, 1.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range19, range27);
        double double33 = range19.getLength();
        boolean boolean34 = range13.equals((java.lang.Object) double33);
        double double35 = range13.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 90.0d + "'", double33 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 50.5d + "'", double35 == 50.5d);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        org.jfree.data.Range range80 = org.jfree.data.Range.shift(range76, (-9173.5d), false);
        boolean boolean82 = range76.contains((-1.0d));
        java.lang.Class<?> wildcardClass83 = range76.getClass();
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
        org.junit.Assert.assertNotNull(range80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (-799.0d));
        java.lang.String str7 = range6.toString();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range6, 0.0d);
        java.lang.String str10 = range9.toString();
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double14 = range13.getLength();
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range13, 1.0d, true);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, (-10.0d));
        boolean boolean23 = range13.equals((java.lang.Object) range22);
        double double24 = range13.getLowerBound();
        double double25 = range13.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range13, 45.0d);
        boolean boolean29 = range27.contains((double) (short) 1);
        org.jfree.data.Range range30 = org.jfree.data.Range.combine(range9, range27);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[0.0,0.0]" + "'", str7, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[0.0,0.0]" + "'", str10, "Range[0.0,0.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9.0d) + "'", double25 == (-9.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        boolean boolean38 = range25.intersects((-485.0d), 10999.0d);
        org.jfree.data.Range range41 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double42 = range41.getLength();
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range41, (-109.0d));
        boolean boolean46 = range41.contains(1.0d);
        org.jfree.data.Range range49 = org.jfree.data.Range.shift(range41, (-828.0d), true);
        double double50 = range49.getLength();
        org.jfree.data.Range range52 = org.jfree.data.Range.expandToInclude(range49, (-485.0d));
        double double53 = range49.getCentralValue();
        org.jfree.data.Range range54 = org.jfree.data.Range.combine(range25, range49);
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range54, (-31535.0d), 50.5d);
        double double58 = range54.getLowerBound();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-9.0d) + "'", double42 == (-9.0d));
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-9.0d) + "'", double50 == (-9.0d));
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-822.5d) + "'", double53 == (-822.5d));
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-818.0d) + "'", double58 == (-818.0d));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double16 = range14.constrain(0.0d);
        java.lang.String str17 = range14.toString();
        double double18 = range14.getLength();
        double double20 = range14.constrain((-130824.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 37189.0d + "'", double16 == 37189.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[37189.0,6553.0]" + "'", str17, "Range[37189.0,6553.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-30636.0d) + "'", double18 == (-30636.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 37189.0d + "'", double20 == 37189.0d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        double double36 = range32.getLowerBound();
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range32, (-20.5d), (-37118.0d));
        org.jfree.data.Range range42 = new org.jfree.data.Range(10999.0d, (double) 100.0f);
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range32, range42);
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
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-71.0d) + "'", double36 == (-71.0d));
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range43);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        boolean boolean19 = range17.contains((double) 'a');
        double double20 = range17.getUpperBound();
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
        boolean boolean67 = range17.equals((java.lang.Object) range66);
        double double68 = range66.getUpperBound();
        org.jfree.data.Range range71 = org.jfree.data.Range.shift(range66, (double) (short) 10, false);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
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
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
        org.junit.Assert.assertNotNull(range71);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        double double46 = range40.constrain((-71.0d));
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 10.0d, false);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, (-10.0d), false);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, 0.0d, true);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, 0.0d);
        double double16 = range13.getUpperBound();
        double double17 = range13.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5.5d + "'", double17 == 5.5d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        double double18 = range17.getLength();
        boolean boolean20 = range17.contains(37289.0d);
        org.jfree.data.Range range21 = null;
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range17, range21);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 72.0d + "'", double18 == 72.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-414.0d), 50.5d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        double double43 = range39.constrain(2827.0d);
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
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range14.getCentralValue();
        double double16 = range14.getLowerBound();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range14, (double) (byte) 100, true);
        boolean boolean21 = range19.contains((-4.0d));
        double double23 = range19.constrain(67.0d);
        org.jfree.data.Range range26 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range26, (double) (byte) -1);
        boolean boolean31 = range28.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range28, (double) 0.0f);
        double double34 = range33.getUpperBound();
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range33, (-13733.0d));
        org.jfree.data.Range range38 = org.jfree.data.Range.expandToInclude(range36, 37189.0d);
        org.jfree.data.Range range39 = org.jfree.data.Range.combine(range19, range38);
        org.jfree.data.Range range42 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double43 = range42.getCentralValue();
        double double44 = range42.getUpperBound();
        org.jfree.data.Range range47 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double48 = range47.getLength();
        org.jfree.data.Range range51 = org.jfree.data.Range.shift(range47, 1.0d, true);
        boolean boolean54 = range51.intersects((double) (byte) 10, 1.0d);
        boolean boolean57 = range51.intersects((double) 'a', (double) (byte) 10);
        java.lang.Class<?> wildcardClass58 = range51.getClass();
        boolean boolean59 = range42.equals((java.lang.Object) wildcardClass58);
        org.jfree.data.Range range62 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double63 = range62.getLength();
        org.jfree.data.Range range65 = org.jfree.data.Range.shift(range62, (-109.0d));
        boolean boolean67 = range62.contains(1.0d);
        org.jfree.data.Range range69 = org.jfree.data.Range.expandToInclude(range62, 37189.0d);
        org.jfree.data.Range range70 = org.jfree.data.Range.combine(range42, range69);
        boolean boolean73 = range42.intersects((double) 100L, (double) 0);
        org.jfree.data.Range range74 = org.jfree.data.Range.combine(range39, range42);
        boolean boolean76 = range42.contains((double) 1.0f);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 21871.0d + "'", double15 == 21871.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 37189.0d + "'", double16 == 37189.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 37289.0d + "'", double23 == 37289.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-10.0d) + "'", double34 == (-10.0d));
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.5d) + "'", double43 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-9.0d) + "'", double48 == (-9.0d));
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-9.0d) + "'", double63 == (-9.0d));
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (double) 10);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, 104.5d);
        boolean boolean7 = range2.intersects(73.0d, (double) (-1.0f));
        org.junit.Assert.assertNotNull(range2);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 0L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, (double) (byte) -1, true);
        boolean boolean13 = range11.contains(61.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range11, (double) 'a', (-818.0d));
        boolean boolean18 = range11.contains((double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jfree.data.Range range0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range3 = org.jfree.data.Range.expand(range0, 18605.0d, 4523.5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'range' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range6 = org.jfree.data.Range.expandToInclude(range4, (double) 'a');
        double double7 = range4.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range4, 18605.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range9, (-485.0d), 45.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.jfree.data.Range range2 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean5 = range2.intersects((double) 100.0f, 90.0d);
        double double7 = range2.constrain(0.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 50.5d, 10974.5d);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, (-1.0d), (double) (byte) 100);
        java.lang.String str17 = range16.toString();
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double21 = range20.getLength();
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range20, 1.0d, true);
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range27, (-10.0d));
        boolean boolean30 = range20.equals((java.lang.Object) range29);
        double double31 = range29.getCentralValue();
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range16, range29);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, 45.0d, (double) '#');
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range10, range32);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range10, (double) ' ', (-1100799.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-828.0d) + "'", double7 == (-828.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[1.0,-899.0]" + "'", str17, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9.0d) + "'", double21 == (-9.0d));
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 45.0d + "'", double31 == 45.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) -1, (double) (byte) -1);
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, 32.0d);
        org.jfree.data.Range range7 = new org.jfree.data.Range((double) (short) 100, 11.0d);
        org.jfree.data.Range range8 = org.jfree.data.Range.combine(range4, range7);
        double double9 = range4.getLength();
        double double10 = range4.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 33.0d + "'", double9 == 33.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) (byte) 100, (-900.0d));
        double double7 = range2.getLowerBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range2, (-1.5d));
        boolean boolean12 = range9.intersects(500.5d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range14.getCentralValue();
        boolean boolean17 = range14.contains((-31328.0d));
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range20, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range20, (double) 10.0f, false);
        boolean boolean28 = range26.contains((double) 1L);
        double double30 = range26.constrain((double) (byte) 0);
        double double31 = range26.getLength();
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean36 = range34.equals((java.lang.Object) 100L);
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        boolean boolean45 = range42.intersects((double) (byte) 10, 10.0d);
        java.lang.String str46 = range42.toString();
        org.jfree.data.Range range47 = org.jfree.data.Range.combine(range34, range42);
        boolean boolean48 = range26.equals((java.lang.Object) range42);
        boolean boolean49 = range14.equals((java.lang.Object) boolean48);
        org.jfree.data.Range range52 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range54 = org.jfree.data.Range.shift(range52, (double) (byte) -1);
        org.jfree.data.Range range57 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double58 = range57.getUpperBound();
        org.jfree.data.Range range59 = org.jfree.data.Range.combine(range52, range57);
        org.jfree.data.Range range62 = org.jfree.data.Range.shift(range59, (double) (-1), false);
        java.lang.String str63 = range62.toString();
        boolean boolean64 = range14.equals((java.lang.Object) range62);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 232.75d + "'", double15 == 232.75d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 20.0d + "'", double30 == 20.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9.0d) + "'", double31 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Range[1.0,-899.0]" + "'", str46, "Range[1.0,-899.0]");
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-9.0d) + "'", double58 == (-9.0d));
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Range[99.0,-10.0]" + "'", str63, "Range[99.0,-10.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-71.0d), (-828.0d));
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (double) 100L);
        java.lang.String str11 = range10.toString();
        double double12 = range10.getCentralValue();
        java.lang.Class<?> wildcardClass13 = range10.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[100.0,100.0]" + "'", str11, "Range[100.0,100.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10, 4488.5d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-882.5d));
        double double5 = range2.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range56, (-71.0d), 10999.0d);
        org.jfree.data.Range range62 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range64 = org.jfree.data.Range.shift(range62, (double) 10L);
        double double65 = range62.getLowerBound();
        org.jfree.data.Range range67 = org.jfree.data.Range.shift(range62, (double) (-1.0f));
        double double68 = range67.getCentralValue();
        org.jfree.data.Range range69 = org.jfree.data.Range.combine(range56, range67);
        double double70 = range56.getCentralValue();
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
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.5d) + "'", double68 == (-1.5d));
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-894.5d) + "'", double70 == (-894.5d));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range13, (-13662.0d));
        double double35 = range34.getUpperBound();
        double double36 = range34.getLowerBound();
        org.jfree.data.Range range39 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean42 = range39.intersects((double) 100.0f, 90.0d);
        org.jfree.data.Range range45 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double46 = range45.getLength();
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range45, (-109.0d));
        org.jfree.data.Range range51 = org.jfree.data.Range.expand(range48, (-71.0d), (-828.0d));
        org.jfree.data.Range range53 = org.jfree.data.Range.shift(range51, (double) 100L);
        double double54 = range53.getLength();
        double double55 = range53.getCentralValue();
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range39, range53);
        org.jfree.data.Range range57 = org.jfree.data.Range.combine(range34, range53);
        double double58 = range53.getCentralValue();
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
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-13733.0d) + "'", double36 == (-13733.0d));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-9.0d) + "'", double46 == (-9.0d));
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 100.0d + "'", double58 == 100.0d);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (-31535.0d));
        org.junit.Assert.assertNotNull(range2);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range4, 0.0d, 91.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (double) (short) 1, false);
        double double15 = range14.getLowerBound();
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range24 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range24, (-10.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range21, range24);
        org.jfree.data.Range range30 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range32 = org.jfree.data.Range.shift(range30, (-10.0d));
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range21, range30);
        double double34 = range30.getLength();
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range30, (double) 100.0f, false);
        org.jfree.data.Range range40 = org.jfree.data.Range.expand(range30, 50.5d, (double) (byte) 0);
        org.jfree.data.Range range41 = org.jfree.data.Range.combine(range14, range30);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 90.0d + "'", double34 == 90.0d);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range41);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        boolean boolean10 = range4.contains((-109.0d));
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range4, (double) (short) -1, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 0.0d, (-1.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, 65.75d);
        java.lang.String str19 = range16.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[90.0,90.0]" + "'", str19, "Range[90.0,90.0]");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-485.0d), (-449.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (double) 10.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 4488.5d, 91.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range11, (-1100799.0d), false);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, 48.5d, 5.0d);
        double double21 = range20.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20320.25d + "'", double21 == 20320.25d);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range11.getLength();
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range11, (-893.5d), false);
        boolean boolean21 = range11.intersects(0.0d, (-65.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-828.0d) + "'", double15 == (-828.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range6, 1.0d, true);
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, 272.5d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, 360.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range3 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range3, (-1.0d), (double) (byte) 100);
        boolean boolean9 = range3.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range3, (-9.0d), (double) 100L);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, 45.0d, (-9.0d));
        double double16 = range15.getCentralValue();
        double double17 = range15.getLowerBound();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range15, (double) (byte) 100, true);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range15, (-942.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range0, range15);
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range0, (double) 0L);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 21871.0d + "'", double16 == 21871.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 37189.0d + "'", double17 == 37189.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        org.jfree.data.Range range7 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double8 = range7.getUpperBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.combine(range2, range7);
        org.jfree.data.Range range12 = new org.jfree.data.Range(10995.5d, (-9173.5d));
        boolean boolean13 = range9.equals((java.lang.Object) range12);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (-1.0d));
        java.lang.String str17 = range16.toString();
        double double18 = range16.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[-72.0,-900.0]" + "'", str17, "Range[-72.0,-900.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10, 4488.5d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-882.5d));
        java.lang.String str5 = range4.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Range[0.0,3606.0]" + "'", str5, "Range[0.0,3606.0]");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        double double5 = range2.getLowerBound();
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (double) 0L, 91.0d);
        double double10 = range8.constrain(11044.5d);
        double double11 = range8.getLowerBound();
        boolean boolean13 = range8.contains((-942.0d));
        double double14 = range8.getUpperBound();
        boolean boolean16 = range8.contains(99.5d);
        boolean boolean19 = range8.intersects(18595.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-818.0d) + "'", double10 == (-818.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-818.0d) + "'", double14 == (-818.0d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jfree.data.Range range2 = new org.jfree.data.Range(10999.0d, (double) 100.0f);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10.0f);
        java.lang.String str5 = range4.toString();
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range4, 5548.0d);
        java.lang.Class<?> wildcardClass8 = range7.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Range[11009.0,110.0]" + "'", str5, "Range[11009.0,110.0]");
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-882.5d), (-109.0d));
        double double3 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-495.75d) + "'", double3 == (-495.75d));
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, (-9.0d), true);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, 99.0d, true);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range7, (double) 10.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expandToInclude(range12, 10999.0d);
        org.jfree.data.Range range17 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean19 = range17.contains((double) 'a');
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range17, (double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range17, (double) 0L);
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range23, (double) (byte) -1, true);
        boolean boolean28 = range26.contains(61.0d);
        java.lang.String str29 = range26.toString();
        double double30 = range26.getUpperBound();
        java.lang.Class<?> wildcardClass31 = range26.getClass();
        boolean boolean32 = range12.equals((java.lang.Object) wildcardClass31);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Range[-11.0,51.0]" + "'", str29, "Range[-11.0,51.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 51.0d + "'", double30 == 51.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-3064.5d), 67.0d);
        org.jfree.data.Range range5 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean7 = range5.contains((double) 'a');
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range5, (double) (byte) 0);
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range5, (double) 0L);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (double) (byte) -1, true);
        boolean boolean16 = range14.contains(61.0d);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range14, (double) 'a', (-818.0d));
        java.lang.String str20 = range14.toString();
        double double21 = range14.getLowerBound();
        boolean boolean22 = range2.equals((java.lang.Object) double21);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Range[-11.0,51.0]" + "'", str20, "Range[-11.0,51.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-11.0d) + "'", double21 == (-11.0d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        double double18 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        double double4 = range2.getUpperBound();
        java.lang.Class<?> wildcardClass5 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        org.jfree.data.Range range57 = org.jfree.data.Range.expand(range32, (-385.0d), (double) (byte) 10);
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
        org.junit.Assert.assertNotNull(range57);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 0.0f);
        java.lang.String str9 = range8.toString();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range8, (-30636.0d), false);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range12, 61.0d, true);
        java.lang.String str16 = range12.toString();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Range[10.0,1.0]" + "'", str9, "Range[10.0,1.0]");
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[0.0,0.0]" + "'", str16, "Range[0.0,0.0]");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        boolean boolean29 = range11.contains((-1326.0d));
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double33 = range32.getLength();
        double double34 = range32.getLowerBound();
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range32, (-799.0d));
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range32, 45.0d, (-828.0d));
        org.jfree.data.Range range40 = null;
        org.jfree.data.Range range42 = org.jfree.data.Range.expandToInclude(range40, (-109.0d));
        double double43 = range42.getUpperBound();
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range42, (double) 10, (-484.0d));
        double double47 = range42.getLowerBound();
        org.jfree.data.Range range50 = new org.jfree.data.Range(26.0d, 11044.5d);
        boolean boolean51 = range42.equals((java.lang.Object) 11044.5d);
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range39, range42);
        boolean boolean53 = range11.equals((java.lang.Object) range52);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-9.0d) + "'", double33 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-109.0d) + "'", double43 == (-109.0d));
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-109.0d) + "'", double47 == (-109.0d));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range5, (double) (byte) -1);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range5, 5.5d, true);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range5, (-1800.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range5, (-2342.5d), false);
        double double17 = range15.constrain(232.75d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.jfree.data.Range range2 = new org.jfree.data.Range(51.0d, 332.75d);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        boolean boolean22 = range2.intersects(2891.125d, (-799.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jfree.data.Range range2 = new org.jfree.data.Range(52.0d, (-9929.0d));
        double double4 = range2.constrain((-828.0d));
        java.lang.String str5 = range2.toString();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 21.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9929.0d) + "'", double4 == (-9929.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Range[52.0,-9929.0]" + "'", str5, "Range[52.0,-9929.0]");
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        java.lang.String str27 = range26.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 21871.0d + "'", double15 == 21871.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Range[37188.0,6552.0]" + "'", str27, "Range[37188.0,6552.0]");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 10.0f, false);
        double double9 = range8.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        boolean boolean68 = range20.contains((-4050.0d));
        org.jfree.data.Range range70 = org.jfree.data.Range.shift(range20, (-799.0d));
        org.jfree.data.Range range73 = org.jfree.data.Range.expand(range70, 296715.25d, 5549.5d);
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
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range73);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double16 = range14.constrain(0.0d);
        java.lang.String str17 = range14.toString();
        boolean boolean20 = range14.intersects((-4.75d), 32.0d);
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) (byte) 0, 107.25d);
        double double24 = range23.getLength();
        org.jfree.data.Range range26 = org.jfree.data.Range.expandToInclude(range23, 1.0d);
        double double27 = range26.getLength();
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range14, range26);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 37189.0d + "'", double16 == 37189.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[37189.0,6553.0]" + "'", str17, "Range[37189.0,6553.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 107.25d + "'", double24 == 107.25d);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 107.25d + "'", double27 == 107.25d);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 0, 107.25d);
        double double3 = range2.getLength();
        org.jfree.data.Range range4 = null;
        org.jfree.data.Range range5 = org.jfree.data.Range.combine(range2, range4);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 496485.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 107.25d + "'", double3 == 107.25d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, 90.0d, false);
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, (double) (short) 0);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        double double69 = range63.getCentralValue();
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
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 5.0d + "'", double69 == 5.0d);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        java.lang.String str15 = range2.toString();
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range2, (double) (short) 1);
        org.jfree.data.Range range20 = new org.jfree.data.Range((-1820.75d), 11045.5d);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, 37289.0d);
        boolean boolean23 = range2.equals((java.lang.Object) range22);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Range[10.0,1.0]" + "'", str15, "Range[10.0,1.0]");
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10L);
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range5, (double) 10.0f, false);
        double double12 = range5.getLowerBound();
        boolean boolean15 = range5.intersects((double) (-1L), (double) 10L);
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range2, range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) (byte) -1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expandToInclude(range17, (double) 10);
        java.lang.String str20 = range17.toString();
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range17, 10.0d);
        double double23 = range22.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Range[-1.0,-800.0]" + "'", str20, "Range[-1.0,-800.0]");
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.5d + "'", double23 == 4.5d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 0.0d);
        double double3 = range2.getLowerBound();
        boolean boolean6 = range2.intersects((-9.0d), (double) ' ');
        boolean boolean8 = range2.contains((double) (short) 0);
        double double9 = range2.getUpperBound();
        java.lang.String str10 = range2.toString();
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range2, 5.0d);
        java.lang.String str13 = range12.toString();
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range12, 50466.0d, true);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range12, 5.0d);
        double double19 = range18.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[0.0,0.0]" + "'", str10, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[0.0,5.0]" + "'", str13, "Range[0.0,5.0]");
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5.0d + "'", double19 == 5.0d);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range14.getCentralValue();
        double double16 = range14.getLowerBound();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range14, (double) (byte) 100, true);
        double double21 = range19.constrain(0.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 21871.0d + "'", double15 == 21871.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 37189.0d + "'", double16 == 37189.0d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 37289.0d + "'", double21 == 37289.0d);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        double double42 = range41.getCentralValue();
        org.jfree.data.Range range44 = org.jfree.data.Range.shift(range41, 464.5d);
        double double45 = range44.getLowerBound();
        org.jfree.data.Range range47 = org.jfree.data.Range.expandToInclude(range44, 171.0d);
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
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1820.75d) + "'", double42 == (-1820.75d));
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-112.5d) + "'", double45 == (-112.5d));
        org.junit.Assert.assertNotNull(range47);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        double double12 = range11.getLowerBound();
        double double13 = range11.getUpperBound();
        java.lang.String str14 = range11.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Range[1.0,100.0]" + "'", str14, "Range[1.0,100.0]");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        double double18 = range14.getLowerBound();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range14, (double) (byte) -1);
        double double22 = range14.constrain(90.0d);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        double double36 = range34.constrain(1.0d);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range34, (double) (byte) 100);
        org.jfree.data.Range range40 = org.jfree.data.Range.expandToInclude(range34, (double) 'a');
        double double41 = range34.getLength();
        org.jfree.data.Range range44 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        boolean boolean45 = range34.equals((java.lang.Object) 10.0f);
        double double46 = range34.getUpperBound();
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range34, 0.0d);
        java.lang.String str49 = range34.toString();
        org.jfree.data.Range range50 = org.jfree.data.Range.combine(range14, range34);
        boolean boolean52 = range50.contains((-83.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 90.0d + "'", double22 == 90.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-899.0d) + "'", double36 == (-899.0d));
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-828.0d) + "'", double41 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-899.0d) + "'", double46 == (-899.0d));
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Range[-71.0,-899.0]" + "'", str49, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, 15.5d);
        boolean boolean17 = range13.contains((double) 10);
        boolean boolean20 = range13.intersects((double) (short) 100, (-9173.5d));
        double double21 = range13.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-35.0d) + "'", double21 == (-35.0d));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 0.0f);
        java.lang.String str9 = range8.toString();
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range8, (-30636.0d), false);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range8, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Range[10.0,1.0]" + "'", str9, "Range[10.0,1.0]");
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range14.getCentralValue();
        double double16 = range14.getLowerBound();
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range14, 37289.0d, false);
        java.lang.Class<?> wildcardClass20 = range14.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 232.75d + "'", double15 == 232.75d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 464.5d + "'", double16 == 464.5d);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (-385.0d));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-400.5d), (-1100799.0d));
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        java.lang.String str30 = range22.toString();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Range[-71.0,-10.0]" + "'", str30, "Range[-71.0,-10.0]");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-331.75d), 0.0d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, 99.0d, 17.5d);
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
        org.junit.Assert.assertNotNull(range39);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        double double68 = range66.constrain(100.0d);
        org.jfree.data.Range range70 = org.jfree.data.Range.expandToInclude(range66, 18630.0d);
        double double71 = range70.getLowerBound();
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
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-3240.5d) + "'", double68 == (-3240.5d));
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-2412.5d) + "'", double71 == (-2412.5d));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        org.jfree.data.Range range24 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range24, (-1.0d), (double) (byte) 100);
        java.lang.String str28 = range27.toString();
        org.jfree.data.Range range31 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double32 = range31.getLength();
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range31, 1.0d, true);
        org.jfree.data.Range range38 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range38, (-10.0d));
        boolean boolean41 = range31.equals((java.lang.Object) range40);
        double double42 = range40.getCentralValue();
        org.jfree.data.Range range43 = org.jfree.data.Range.combine(range27, range40);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range43, 45.0d, (double) '#');
        org.jfree.data.Range range49 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range52 = org.jfree.data.Range.expand(range49, (-1.0d), (double) (byte) 100);
        boolean boolean55 = range49.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range58 = org.jfree.data.Range.expand(range49, (-9.0d), (double) 100L);
        double double60 = range58.constrain(1.0d);
        org.jfree.data.Range range62 = org.jfree.data.Range.shift(range58, (double) (byte) 100);
        org.jfree.data.Range range64 = org.jfree.data.Range.expandToInclude(range58, (double) 'a');
        org.jfree.data.Range range65 = org.jfree.data.Range.combine(range46, range64);
        org.jfree.data.Range range68 = org.jfree.data.Range.shift(range64, (-71.0d), true);
        org.jfree.data.Range range70 = org.jfree.data.Range.expandToInclude(range64, 91.0d);
        double double72 = range70.constrain((-10.0d));
        java.lang.String str73 = range70.toString();
        org.jfree.data.Range range74 = org.jfree.data.Range.combine(range15, range70);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6108.5d + "'", double16 == 6108.5d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Range[1.0,-899.0]" + "'", str28, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-9.0d) + "'", double32 == (-9.0d));
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 45.0d + "'", double42 == 45.0d);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-899.0d) + "'", double60 == (-899.0d));
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertNotNull(range68);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-10.0d) + "'", double72 == (-10.0d));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Range[-71.0,97.0]" + "'", str73, "Range[-71.0,97.0]");
        org.junit.Assert.assertNotNull(range74);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        org.jfree.data.Range range59 = org.jfree.data.Range.expand(range56, (-71.0d), 10999.0d);
        org.jfree.data.Range range62 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range64 = org.jfree.data.Range.shift(range62, (double) 10L);
        double double65 = range62.getLowerBound();
        org.jfree.data.Range range67 = org.jfree.data.Range.shift(range62, (double) (-1.0f));
        double double68 = range67.getCentralValue();
        org.jfree.data.Range range69 = org.jfree.data.Range.combine(range56, range67);
        org.jfree.data.Range range72 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range75 = org.jfree.data.Range.expand(range72, (-1.0d), (double) (byte) 100);
        java.lang.String str76 = range75.toString();
        double double77 = range75.getLength();
        double double78 = range75.getCentralValue();
        org.jfree.data.Range range80 = org.jfree.data.Range.shift(range75, 11044.5d);
        double double82 = range75.constrain((-893.5d));
        boolean boolean83 = range56.equals((java.lang.Object) (-893.5d));
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
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertNotNull(range67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.5d) + "'", double68 == (-1.5d));
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertNotNull(range75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Range[1.0,-899.0]" + "'", str76, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-900.0d) + "'", double77 == (-900.0d));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-449.0d) + "'", double78 == (-449.0d));
        org.junit.Assert.assertNotNull(range80);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-899.0d) + "'", double82 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        double double28 = range11.getUpperBound();
        org.jfree.data.Range range31 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, (-1.0d), (double) (byte) 100);
        boolean boolean40 = range34.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range43 = org.jfree.data.Range.expand(range34, (-9.0d), (double) 100L);
        double double45 = range43.constrain(1.0d);
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range43, (double) (byte) 100);
        org.jfree.data.Range range49 = org.jfree.data.Range.expandToInclude(range43, (double) 'a');
        org.jfree.data.Range range52 = org.jfree.data.Range.expand(range43, (-1.0d), (-9.0d));
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range43, 0.0d, true);
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range31, range55);
        org.jfree.data.Range range59 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double60 = range59.getLength();
        double double61 = range59.getLowerBound();
        org.jfree.data.Range range62 = org.jfree.data.Range.combine(range56, range59);
        org.jfree.data.Range range63 = org.jfree.data.Range.combine(range11, range59);
        boolean boolean66 = range59.intersects((-484.0d), 742645.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-899.0d) + "'", double28 == (-899.0d));
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-899.0d) + "'", double45 == (-899.0d));
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-9.0d) + "'", double60 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range8, (-1.0d), (double) (byte) 100);
        boolean boolean14 = range8.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range8, (-9.0d), (double) 100L);
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range17, 5.5d);
        double double21 = range17.constrain((double) (short) 1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expandToInclude(range17, (double) 1);
        boolean boolean26 = range17.intersects(1.0d, (double) (-1));
        org.jfree.data.Range range28 = org.jfree.data.Range.expandToInclude(range17, (-485.0d));
        org.jfree.data.Range range29 = org.jfree.data.Range.combine(range5, range17);
        double double30 = range29.getCentralValue();
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range29, (-20.5d), true);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-899.0d) + "'", double21 == (-899.0d));
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-485.0d) + "'", double30 == (-485.0d));
        org.junit.Assert.assertNotNull(range33);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        double double28 = range26.constrain(18630.0d);
        double double29 = range26.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 110.0d + "'", double28 == 110.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 65.0d + "'", double29 == 65.0d);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jfree.data.Range range2 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.0d), (double) (byte) 100);
        boolean boolean11 = range5.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range5, (-9.0d), (double) 100L);
        double double16 = range14.constrain(1.0d);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range14, (double) (byte) 100);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range14, (double) 'a');
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range14, (double) 1.0f, false);
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range26, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range31 = org.jfree.data.Range.shift(range29, 5.5d);
        boolean boolean33 = range29.equals((java.lang.Object) 171.0d);
        boolean boolean36 = range29.intersects((-893.5d), (double) 100L);
        double double38 = range29.constrain(1.0d);
        boolean boolean39 = range23.equals((java.lang.Object) range29);
        org.jfree.data.Range range42 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range45 = org.jfree.data.Range.expand(range42, (-1.0d), (double) (byte) 100);
        boolean boolean48 = range42.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range51 = org.jfree.data.Range.expand(range42, (-9.0d), (double) 100L);
        double double53 = range51.constrain(1.0d);
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range51, (double) (byte) 100);
        org.jfree.data.Range range57 = org.jfree.data.Range.expandToInclude(range51, (double) 'a');
        org.jfree.data.Range range60 = org.jfree.data.Range.expand(range51, (-1.0d), (-9.0d));
        org.jfree.data.Range range63 = org.jfree.data.Range.shift(range51, 0.0d, true);
        org.jfree.data.Range range65 = org.jfree.data.Range.expandToInclude(range51, (double) (short) 1);
        boolean boolean66 = range23.equals((java.lang.Object) range51);
        org.jfree.data.Range range69 = org.jfree.data.Range.shift(range23, (-2342.5d), true);
        double double71 = range69.constrain(100.0d);
        org.jfree.data.Range range73 = org.jfree.data.Range.expandToInclude(range69, 18630.0d);
        org.jfree.data.Range range75 = org.jfree.data.Range.expandToInclude(range73, (-10.0d));
        org.jfree.data.Range range76 = org.jfree.data.Range.combine(range2, range73);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-899.0d) + "'", double16 == (-899.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-899.0d) + "'", double53 == (-899.0d));
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-3240.5d) + "'", double71 == (-3240.5d));
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertNotNull(range75);
        org.junit.Assert.assertNotNull(range76);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, 6553.0d);
        boolean boolean8 = range2.intersects(71.0d, 32.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, (-0.5d), false);
        double double13 = range2.constrain(46.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        double double26 = range4.getLength();
        double double28 = range4.constrain(32.25d);
        double double29 = range4.getCentralValue();
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-109.0d) + "'", double26 == (-109.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-10.0d) + "'", double28 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 44.5d + "'", double29 == 44.5d);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-485.0d), (-449.0d));
        org.jfree.data.Range range12 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double13 = range12.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.combine(range9, range12);
        double double16 = range9.constrain((double) 'a');
        double double17 = range9.getLowerBound();
        org.jfree.data.Range range20 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double21 = range20.getCentralValue();
        boolean boolean23 = range20.contains((double) 1L);
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range26, (-1.0d), (double) (byte) 100);
        boolean boolean32 = range26.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range26, (-9.0d), (double) 100L);
        org.jfree.data.Range range37 = org.jfree.data.Range.expandToInclude(range35, (double) 1);
        org.jfree.data.Range range40 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range40, (double) (byte) -1);
        boolean boolean45 = range42.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range46 = org.jfree.data.Range.combine(range35, range42);
        org.jfree.data.Range range49 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range52 = org.jfree.data.Range.expand(range49, (-1.0d), (double) (byte) 100);
        boolean boolean55 = range52.intersects((double) (byte) 10, 10.0d);
        boolean boolean56 = range42.equals((java.lang.Object) boolean55);
        org.jfree.data.Range range59 = org.jfree.data.Range.shift(range42, (double) (byte) 100, false);
        org.jfree.data.Range range62 = org.jfree.data.Range.expand(range42, 100.0d, (-0.5d));
        java.lang.String str63 = range62.toString();
        double double64 = range62.getLowerBound();
        org.jfree.data.Range range67 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range70 = org.jfree.data.Range.expand(range67, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range73 = org.jfree.data.Range.shift(range67, (double) 10.0f, false);
        boolean boolean75 = range73.contains((double) 1L);
        double double76 = range73.getUpperBound();
        org.jfree.data.Range range77 = org.jfree.data.Range.combine(range62, range73);
        org.jfree.data.Range range79 = org.jfree.data.Range.shift(range73, 32.0d);
        boolean boolean80 = range20.equals((java.lang.Object) range73);
        org.jfree.data.Range range81 = org.jfree.data.Range.combine(range9, range20);
        double double82 = range20.getUpperBound();
        double double83 = range20.getUpperBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9.0d) + "'", double13 == (-9.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-449.0d) + "'", double16 == (-449.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 484.0d + "'", double17 == 484.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-0.5d) + "'", double21 == (-0.5d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Range[10999.0,44.5]" + "'", str63, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10999.0d + "'", double64 == 10999.0d);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 11.0d + "'", double76 == 11.0d);
        org.junit.Assert.assertNotNull(range77);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        double double26 = range20.getUpperBound();
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean8 = range2.intersects((double) (byte) 0, (-899.0d));
        boolean boolean10 = range2.contains(45.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range2, 90.0d, (-1.5d));
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range2, (-1800.0d), 2827.0d);
        boolean boolean18 = range16.contains((-0.5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        java.lang.String str47 = range44.toString();
        double double49 = range44.constrain((double) 100L);
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Range[-54.5,-882.5]" + "'", str47, "Range[-54.5,-882.5]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-882.5d) + "'", double49 == (-882.5d));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 0, 107.25d);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, 2891.125d);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range2, (-996.0d), (-893.5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 53.625d + "'", double3 == 53.625d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, 45.0d, true);
        java.lang.Class<?> wildcardClass9 = range8.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, (double) 0.0f);
        java.lang.String str9 = range8.toString();
        java.lang.String str10 = range8.toString();
        double double11 = range8.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Range[10.0,1.0]" + "'", str9, "Range[10.0,1.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[10.0,1.0]" + "'", str10, "Range[10.0,1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), 272.5d);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, (double) (short) 100);
        org.jfree.data.Range range10 = org.jfree.data.Range.combine(range2, range9);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range10, (-405.0d));
        double double14 = range10.constrain((-700.0d));
        org.jfree.data.Range range17 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double18 = range17.getCentralValue();
        double double19 = range17.getUpperBound();
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range17, 6108.5d, false);
        boolean boolean23 = range10.equals((java.lang.Object) 6108.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.5d + "'", double18 == 5.5d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        java.lang.Class<?> wildcardClass73 = range71.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        boolean boolean31 = range28.intersects(90.0d, (double) (byte) 10);
        org.jfree.data.Range range32 = null;
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range28, range32);
        double double34 = range28.getUpperBound();
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range28, (-31535.0d), 1.89872145E8d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertNotNull(range37);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range4, 0.0d, 91.0d);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 100.0d, 0.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range14, 10.0d, false);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range14, (-882.5d), (double) '#');
        double double21 = range14.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1002899.0d + "'", double21 == 1002899.0d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        double double46 = range45.getCentralValue();
        double double48 = range45.constrain(13.0d);
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-35.0d) + "'", double46 == (-35.0d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        org.jfree.data.Range range71 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range74 = org.jfree.data.Range.expand(range71, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range76 = org.jfree.data.Range.shift(range71, 0.0d);
        org.jfree.data.Range range79 = org.jfree.data.Range.shift(range71, (-10.0d), true);
        org.jfree.data.Range range81 = org.jfree.data.Range.shift(range71, (-36810.0d));
        org.jfree.data.Range range83 = org.jfree.data.Range.expandToInclude(range71, 4523.5d);
        boolean boolean84 = range63.equals((java.lang.Object) range71);
        java.lang.String str85 = range71.toString();
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
        org.junit.Assert.assertNotNull(range74);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertNotNull(range83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Range[10.0,1.0]" + "'", str85, "Range[10.0,1.0]");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.jfree.data.Range range2 = new org.jfree.data.Range(20.0d, (-0.5d));
        boolean boolean4 = range2.contains((-10.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, 5.5d, (double) 10.0f);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (double) (byte) 0, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range16, (double) '#', true);
        java.lang.String str23 = range16.toString();
        double double24 = range16.getUpperBound();
        boolean boolean27 = range16.intersects(171.0d, 82.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Range[4488.5,-9173.5]" + "'", str23, "Range[4488.5,-9173.5]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9173.5d) + "'", double24 == (-9173.5d));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, (-9.0d), true);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range7, 99.0d, true);
        org.jfree.data.Range range12 = org.jfree.data.Range.expandToInclude(range7, (double) 10.0f);
        java.lang.String str13 = range12.toString();
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range12, (-8.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[-9.0,10.0]" + "'", str13, "Range[-9.0,10.0]");
        org.junit.Assert.assertNotNull(range15);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        boolean boolean8 = range2.intersects((double) (byte) 0, (-899.0d));
        boolean boolean10 = range2.contains(45.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range2, 90.0d, (-1.5d));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range13, 0.0d, true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-942.0d), (-71.0d));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.jfree.data.Range range2 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean5 = range2.intersects((double) 100.0f, 90.0d);
        double double7 = range2.constrain(0.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 50.5d, 10974.5d);
        org.jfree.data.Range range13 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range16 = org.jfree.data.Range.expand(range13, (-1.0d), (double) (byte) 100);
        java.lang.String str17 = range16.toString();
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double21 = range20.getLength();
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range20, 1.0d, true);
        org.jfree.data.Range range27 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range27, (-10.0d));
        boolean boolean30 = range20.equals((java.lang.Object) range29);
        double double31 = range29.getCentralValue();
        org.jfree.data.Range range32 = org.jfree.data.Range.combine(range16, range29);
        org.jfree.data.Range range35 = org.jfree.data.Range.expand(range32, 45.0d, (double) '#');
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range10, range32);
        org.jfree.data.Range range39 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double40 = range39.getCentralValue();
        org.jfree.data.Range range43 = new org.jfree.data.Range(0.0d, 0.0d);
        double double44 = range43.getLowerBound();
        double double45 = range43.getLowerBound();
        boolean boolean46 = range39.equals((java.lang.Object) double45);
        boolean boolean48 = range39.contains(0.0d);
        org.jfree.data.Range range49 = org.jfree.data.Range.combine(range10, range39);
        double double50 = range39.getLowerBound();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-828.0d) + "'", double7 == (-828.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[1.0,-899.0]" + "'", str17, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9.0d) + "'", double21 == (-9.0d));
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 45.0d + "'", double31 == 45.0d);
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-0.5d) + "'", double40 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (-799.0d));
        java.lang.String str7 = range6.toString();
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range10, (-1.0d), (double) (byte) 100);
        boolean boolean16 = range10.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range10, (-9.0d), (double) 100L);
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range19, (double) 1);
        org.jfree.data.Range range24 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range26 = org.jfree.data.Range.shift(range24, (double) (byte) -1);
        boolean boolean29 = range26.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range30 = org.jfree.data.Range.combine(range19, range26);
        org.jfree.data.Range range33 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range36 = org.jfree.data.Range.expand(range33, (-1.0d), (double) (byte) 100);
        boolean boolean39 = range36.intersects((double) (byte) 10, 10.0d);
        boolean boolean40 = range26.equals((java.lang.Object) boolean39);
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range26, (double) (byte) 100, false);
        org.jfree.data.Range range46 = org.jfree.data.Range.expand(range26, 100.0d, (-0.5d));
        java.lang.String str47 = range46.toString();
        double double48 = range46.getLowerBound();
        org.jfree.data.Range range51 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range54 = org.jfree.data.Range.expand(range51, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range57 = org.jfree.data.Range.shift(range51, (double) 10.0f, false);
        boolean boolean59 = range57.contains((double) 1L);
        double double60 = range57.getUpperBound();
        org.jfree.data.Range range61 = org.jfree.data.Range.combine(range46, range57);
        double double62 = range61.getLowerBound();
        boolean boolean63 = range6.equals((java.lang.Object) range61);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[0.0,0.0]" + "'", str7, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Range[10999.0,44.5]" + "'", str47, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10999.0d + "'", double48 == 10999.0d);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 11.0d + "'", double60 == 11.0d);
        org.junit.Assert.assertNotNull(range61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 20.0d + "'", double62 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-10.0d));
        double double12 = range2.constrain(44.5d);
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range2, (-484.0d));
        boolean boolean17 = range14.intersects((-1800.0d), 83849.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) (byte) 100, (-900.0d));
        double double7 = range2.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, 10612.5d);
        java.lang.Class<?> wildcardClass10 = range9.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-345.0d), 2849.5d);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range2, 50.5d, (double) 0L);
        double double15 = range14.getCentralValue();
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) (byte) 0, 107.25d);
        double double19 = range18.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.combine(range14, range18);
        double double21 = range14.getLowerBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 232.75d + "'", double15 == 232.75d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 107.25d + "'", double19 == 107.25d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 464.5d + "'", double21 == 464.5d);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, 44.5d, (-799.0d));
        java.lang.String str8 = range7.toString();
        double double10 = range7.constrain((double) 1);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[-45.5,-799.0]" + "'", str8, "Range[-45.5,-799.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-799.0d) + "'", double10 == (-799.0d));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) (byte) -1);
        double double6 = range4.constrain((double) 0L);
        boolean boolean8 = range4.contains(168.0d);
        boolean boolean10 = range4.contains(6553.0d);
        double double11 = range4.getCentralValue();
        double double13 = range4.constrain(1.0d);
        double double14 = range4.getLength();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 44.5d + "'", double11 == 44.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-10.0d) + "'", double13 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-109.0d) + "'", double14 == (-109.0d));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        double double18 = range14.getLowerBound();
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range14, (-170.0d), (-109.0d));
        java.lang.Class<?> wildcardClass22 = range21.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double7 = range6.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range6, (double) (short) 100);
        org.jfree.data.Range range10 = org.jfree.data.Range.combine(range2, range9);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range9, (double) 10L);
        java.lang.String str13 = range9.toString();
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range9, 232.75d);
        double double16 = range15.getUpperBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[10.0,100.0]" + "'", str13, "Range[10.0,100.0]");
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 332.75d + "'", double16 == 332.75d);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        double double6 = range2.getLowerBound();
        java.lang.String str7 = range2.toString();
        boolean boolean9 = range2.contains((double) ' ');
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, 48.5d, (-170.0d));
        boolean boolean14 = range12.contains(0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[10.0,1.0]" + "'", str7, "Range[10.0,1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        org.jfree.data.Range range26 = org.jfree.data.Range.expand(range21, 61.0d, 0.0d);
        double double28 = range21.constrain((double) (byte) 10);
        boolean boolean31 = range21.intersects((-331.75d), (-5440482.0d));
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
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double15 = range11.constrain((double) (short) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        double double18 = range11.getLength();
        java.lang.String str19 = range11.toString();
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range11, (double) (-1), (-899.0d));
        double double24 = range11.constrain((-894.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-899.0d) + "'", double15 == (-899.0d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[-71.0,-899.0]" + "'", str19, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-899.0d) + "'", double24 == (-899.0d));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        boolean boolean12 = range5.intersects((-893.5d), (double) 100L);
        boolean boolean14 = range5.contains((double) (short) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range5, (-30636.0d), (double) 10.0f);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range17);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10, 11.0d);
        double double4 = range2.constrain((-449.0d));
        double double5 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        double double28 = range26.constrain(18630.0d);
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range26, 45.5d, (double) (byte) 10);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range31, (-161858.0d), false);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range31, (-3064.5d), 107.25d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 110.0d + "'", double28 == 110.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range37);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-463.5d), (-616231.5d));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range11, (double) 0);
        boolean boolean30 = range11.contains(484.0d);
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
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        double double29 = range22.getUpperBound();
        org.jfree.data.Range range32 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean35 = range32.intersects((double) 100.0f, 90.0d);
        org.jfree.data.Range range38 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double39 = range38.getLength();
        org.jfree.data.Range range41 = org.jfree.data.Range.shift(range38, (-109.0d));
        org.jfree.data.Range range44 = org.jfree.data.Range.expand(range41, (-71.0d), (-828.0d));
        org.jfree.data.Range range46 = org.jfree.data.Range.shift(range44, (double) 100L);
        double double47 = range46.getLength();
        double double48 = range46.getCentralValue();
        org.jfree.data.Range range49 = org.jfree.data.Range.combine(range32, range46);
        double double51 = range46.constrain((double) 10);
        boolean boolean52 = range22.equals((java.lang.Object) range46);
        java.lang.Class<?> wildcardClass53 = range46.getClass();
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-899.0d) + "'", double29 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-9.0d) + "'", double39 == (-9.0d));
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 100.0d + "'", double51 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        boolean boolean10 = range4.intersects((-899.0d), 90.0d);
        java.lang.String str11 = range4.toString();
        boolean boolean13 = range4.contains((-828.0d));
        double double14 = range4.getUpperBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range4, 99.0d, 99.0d);
        org.jfree.data.Range range20 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range20, (double) 10L);
        double double23 = range20.getLowerBound();
        double double24 = range20.getCentralValue();
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range20, (-485.0d), (-449.0d));
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range27, (double) 10.0f);
        org.jfree.data.Range range30 = null;
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range29, range30);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range29, (double) 'a', false);
        double double35 = range34.getLength();
        java.lang.Class<?> wildcardClass36 = range34.getClass();
        boolean boolean37 = range17.equals((java.lang.Object) range34);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[0.0,90.0]" + "'", str11, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 90.0d + "'", double14 == 90.0d);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-0.5d) + "'", double24 == (-0.5d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-933.0d) + "'", double35 == (-933.0d));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jfree.data.Range range2 = new org.jfree.data.Range(110.0d, 37189.0d);
        java.lang.String str3 = range2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Range[110.0,37189.0]" + "'", str3, "Range[110.0,37189.0]");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        double double26 = range20.getLowerBound();
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-71.0d) + "'", double26 == (-71.0d));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        boolean boolean22 = range2.intersects(65.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        java.lang.String str18 = range11.toString();
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range11, 0.0d);
        boolean boolean22 = range11.equals((java.lang.Object) 55.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double14 = range13.getUpperBound();
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range13, (double) (-1.0f), true);
        double double18 = range17.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-893.5d) + "'", double14 == (-893.5d));
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-480.5d) + "'", double18 == (-480.5d));
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-828.0d), true);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, (-13662.0d));
        boolean boolean16 = range13.intersects((-818.0d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jfree.data.Range range2 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean5 = range2.intersects((double) 100.0f, 90.0d);
        double double7 = range2.constrain(0.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range2, 50.5d, 10974.5d);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, (-35.0d), false);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, (-4914.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range15, (double) 'a', false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-828.0d) + "'", double7 == (-828.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range4, (-9.0d), true);
        double double8 = range4.getCentralValue();
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range4, (-1.0d), (-71.0d));
        double double12 = range11.getLowerBound();
        boolean boolean14 = range11.contains((-27.75d));
        java.lang.Class<?> wildcardClass15 = range11.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range6 = org.jfree.data.Range.expandToInclude(range4, (double) 'a');
        double double7 = range4.getCentralValue();
        java.lang.String str8 = range4.toString();
        double double9 = range4.getLowerBound();
        double double11 = range4.constrain(101.0d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[0.0,10.0]" + "'", str8, "Range[0.0,10.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 0L);
        org.jfree.data.Range range10 = org.jfree.data.Range.expandToInclude(range2, (-27.75d));
        double double11 = range10.getLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 79.75d + "'", double11 == 79.75d);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        org.jfree.data.Range range21 = org.jfree.data.Range.shift(range18, (-899.0d), true);
        double double23 = range18.constrain((-5440482.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Range[0.0,0.0]" + "'", str10, "Range[0.0,0.0]");
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Range[0.0,5.0]" + "'", str13, "Range[0.0,5.0]");
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 55.0d + "'", double23 == 55.0d);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        boolean boolean54 = range51.intersects(37189.0d, 171.0d);
        org.jfree.data.Range range57 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range59 = org.jfree.data.Range.shift(range57, (double) (byte) -1);
        org.jfree.data.Range range62 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double63 = range62.getUpperBound();
        org.jfree.data.Range range64 = org.jfree.data.Range.combine(range57, range62);
        org.jfree.data.Range range66 = org.jfree.data.Range.shift(range57, (-933.0d));
        double double67 = range66.getLength();
        org.jfree.data.Range range70 = org.jfree.data.Range.expand(range66, 14.5d, (-414.0d));
        org.jfree.data.Range range71 = org.jfree.data.Range.combine(range51, range66);
        boolean boolean74 = range71.intersects(10999.0d, 82.0d);
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-9.0d) + "'", double63 == (-9.0d));
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertNotNull(range66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-942.0d) + "'", double67 == (-942.0d));
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) 10L);
        double double4 = range2.constrain(20.0d);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, (-71.0d), 587466.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range7);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range8, 18595.0d);
        org.jfree.data.Range range16 = new org.jfree.data.Range(464.5d, 10984.5d);
        boolean boolean17 = range8.equals((java.lang.Object) 464.5d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range7 = org.jfree.data.Range.expand(range2, 44.5d, (-799.0d));
        org.jfree.data.Range range10 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (double) (short) 100);
        org.jfree.data.Range range14 = org.jfree.data.Range.combine(range2, range10);
        double double15 = range2.getUpperBound();
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, (-1.0d), (double) (byte) 100);
        java.lang.String str22 = range21.toString();
        double double23 = range21.getCentralValue();
        org.jfree.data.Range range25 = org.jfree.data.Range.expandToInclude(range21, (-170.0d));
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range21, (double) 100);
        boolean boolean28 = range2.equals((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Range[1.0,-899.0]" + "'", str22, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-449.0d) + "'", double23 == (-449.0d));
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (-170.0d));
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        boolean boolean25 = range20.intersects((double) 0.0f, (-345.0d));
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range20, 10974.5d, 5.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        boolean boolean27 = range25.contains(15.5d);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range25, (-31328.0d));
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(range29);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        java.lang.Class<?> wildcardClass12 = range11.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, 0.0d, true);
        double double9 = range5.getLowerBound();
        double double10 = range5.getLowerBound();
        boolean boolean13 = range5.intersects(172.0d, (-1427.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        org.jfree.data.Range range46 = new org.jfree.data.Range(168.0d, (-828.0d));
        boolean boolean49 = range46.intersects((double) 100.0f, 90.0d);
        org.jfree.data.Range range52 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double53 = range52.getLength();
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range52, (-109.0d));
        org.jfree.data.Range range58 = org.jfree.data.Range.expand(range55, (-71.0d), (-828.0d));
        org.jfree.data.Range range60 = org.jfree.data.Range.shift(range58, (double) 100L);
        double double61 = range60.getLength();
        double double62 = range60.getCentralValue();
        org.jfree.data.Range range63 = org.jfree.data.Range.combine(range46, range60);
        boolean boolean64 = range39.equals((java.lang.Object) range60);
        boolean boolean66 = range60.contains(172.0d);
        double double67 = range60.getLength();
        java.lang.Class<?> wildcardClass68 = range60.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-9.0d) + "'", double53 == (-9.0d));
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertNotNull(range60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.jfree.data.Range range2 = new org.jfree.data.Range(20.0d, (-828.0d));
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double6 = range5.getLength();
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range5, 1.0d, true);
        boolean boolean10 = range2.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        double double25 = range8.getCentralValue();
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range8, (-1820.75d));
        boolean boolean29 = range27.contains((-1.5d));
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 'a', 10999.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) ' ');
        org.junit.Assert.assertNotNull(range4);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-10.0d), (double) '4');
        boolean boolean4 = range2.contains((double) 'a');
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, (double) (byte) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.expandToInclude(range2, (double) 0L);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range8, 484.0d, false);
        double double12 = range8.getUpperBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 100, 171.0d);
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range5, 0.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range10, (-900.0d), true);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range10, (-4.0d));
        boolean boolean16 = range2.equals((java.lang.Object) (-4.0d));
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range2, 0.0d, (-31328.0d));
        org.jfree.data.Range range22 = org.jfree.data.Range.shift(range19, 18695.0d, true);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range22);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        boolean boolean33 = range25.intersects(33.0d, (-13733.0d));
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 100);
        boolean boolean7 = range2.intersects(360.0d, (-1326.0d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        double double18 = range11.getLength();
        org.jfree.data.Range range21 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, (double) 10L);
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range26, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range32, (-10.0d));
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range29, range32);
        org.jfree.data.Range range38 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range38, (-1.0d), (double) (byte) 100);
        boolean boolean44 = range38.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range38, (-9.0d), (double) 100L);
        double double49 = range47.constrain(1.0d);
        org.jfree.data.Range range50 = org.jfree.data.Range.combine(range35, range47);
        boolean boolean51 = range21.equals((java.lang.Object) range50);
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range11, range21);
        java.lang.String str53 = range21.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-899.0d) + "'", double49 == (-899.0d));
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Range[-1.0,0.0]" + "'", str53, "Range[-1.0,0.0]");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, (-199.0d));
        java.lang.Class<?> wildcardClass8 = range7.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        double double27 = range25.getCentralValue();
        java.lang.Class<?> wildcardClass28 = range25.getClass();
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-31328.0d) + "'", double27 == (-31328.0d));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range15, (-799.0d));
        boolean boolean19 = range17.contains(20320.25d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        double double18 = range11.getLength();
        org.jfree.data.Range range21 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, (double) 10L);
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range26, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range32, (-10.0d));
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range29, range32);
        org.jfree.data.Range range38 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range38, (-1.0d), (double) (byte) 100);
        boolean boolean44 = range38.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range38, (-9.0d), (double) 100L);
        double double49 = range47.constrain(1.0d);
        org.jfree.data.Range range50 = org.jfree.data.Range.combine(range35, range47);
        boolean boolean51 = range21.equals((java.lang.Object) range50);
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range11, range21);
        boolean boolean54 = range21.contains(2827.0d);
        double double55 = range21.getLength();
        org.jfree.data.Range range57 = org.jfree.data.Range.expandToInclude(range21, 10.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-899.0d) + "'", double49 == (-899.0d));
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertNotNull(range57);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        boolean boolean13 = range8.contains(91.0d);
        java.lang.String str14 = range8.toString();
        java.lang.String str15 = range8.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Range[10.0,100.0]" + "'", str14, "Range[10.0,100.0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Range[10.0,100.0]" + "'", str15, "Range[10.0,100.0]");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        double double38 = range37.getLength();
        org.jfree.data.Range range40 = org.jfree.data.Range.expandToInclude(range37, (double) (byte) 10);
        org.jfree.data.Range range43 = org.jfree.data.Range.shift(range40, 1907.25d, false);
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range43);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (-1.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range16, 10999.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        double double6 = range2.getLowerBound();
        java.lang.String str7 = range2.toString();
        double double8 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[10.0,1.0]" + "'", str7, "Range[10.0,1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        double double9 = range2.getLowerBound();
        java.lang.Class<?> wildcardClass10 = range2.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        double double38 = range37.getLowerBound();
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
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) (byte) -1);
        java.lang.String str18 = range15.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[0.0,-799.0]" + "'", str18, "Range[0.0,-799.0]");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        org.jfree.data.Range range10 = new org.jfree.data.Range(1.0d, (-37118.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-1.0d), (double) (byte) 100);
        boolean boolean20 = range14.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, (-9.0d), (double) 100L);
        double double25 = range23.constrain(1.0d);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range23, (double) (byte) 100);
        org.jfree.data.Range range29 = org.jfree.data.Range.expandToInclude(range23, (double) 'a');
        java.lang.String str30 = range23.toString();
        org.jfree.data.Range range32 = org.jfree.data.Range.expandToInclude(range23, 0.0d);
        double double33 = range32.getLowerBound();
        java.lang.String str34 = range32.toString();
        double double35 = range32.getLength();
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range32, (double) (byte) 1);
        boolean boolean39 = range32.contains((-828.0d));
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range11, range32);
        org.jfree.data.Range range43 = org.jfree.data.Range.expand(range40, 0.0d, (double) ' ');
        java.lang.String str44 = range40.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-899.0d) + "'", double25 == (-899.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Range[-71.0,-899.0]" + "'", str30, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-71.0d) + "'", double33 == (-71.0d));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Range[-71.0,0.0]" + "'", str34, "Range[-71.0,0.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 71.0d + "'", double35 == 71.0d);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Range[-71.0,1.0]" + "'", str44, "Range[-71.0,1.0]");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        boolean boolean8 = range4.contains((double) (short) 10);
        org.jfree.data.Range range11 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double12 = range11.getLength();
        org.jfree.data.Range range14 = org.jfree.data.Range.shift(range11, (-109.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.expand(range14, (-71.0d), (-828.0d));
        org.jfree.data.Range range19 = org.jfree.data.Range.shift(range17, (double) 100L);
        boolean boolean22 = range19.intersects(0.0d, 0.0d);
        org.jfree.data.Range range25 = new org.jfree.data.Range(10999.0d, (double) 100.0f);
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range25, (double) 10.0f);
        boolean boolean29 = range25.contains((-449.0d));
        double double30 = range25.getCentralValue();
        org.jfree.data.Range range31 = org.jfree.data.Range.combine(range19, range25);
        org.jfree.data.Range range34 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double35 = range34.getCentralValue();
        org.jfree.data.Range range38 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double39 = range38.getLength();
        org.jfree.data.Range range41 = org.jfree.data.Range.expandToInclude(range38, (double) (short) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.combine(range34, range41);
        org.jfree.data.Range range45 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range48 = org.jfree.data.Range.expand(range45, (-1.0d), (double) (byte) 100);
        boolean boolean51 = range45.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range54 = org.jfree.data.Range.expand(range45, (-9.0d), (double) 100L);
        org.jfree.data.Range range56 = org.jfree.data.Range.expandToInclude(range54, (double) 1);
        org.jfree.data.Range range59 = org.jfree.data.Range.shift(range54, (double) (short) -1, false);
        boolean boolean60 = range42.equals((java.lang.Object) range59);
        org.jfree.data.Range range62 = org.jfree.data.Range.expandToInclude(range59, 0.0d);
        org.jfree.data.Range range65 = org.jfree.data.Range.expand(range59, 18630.0d, 18595.0d);
        double double67 = range65.constrain((-83.5d));
        org.jfree.data.Range range69 = org.jfree.data.Range.expandToInclude(range65, 104.5d);
        boolean boolean70 = range25.equals((java.lang.Object) 104.5d);
        boolean boolean71 = range4.equals((java.lang.Object) 104.5d);
        java.lang.String str72 = range4.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 5549.5d + "'", double30 == 5549.5d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-0.5d) + "'", double35 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-9.0d) + "'", double39 == (-9.0d));
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.539756E7d) + "'", double67 == (-1.539756E7d));
        org.junit.Assert.assertNotNull(range69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Range[0.0,90.0]" + "'", str72, "Range[0.0,90.0]");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.jfree.data.Range range2 = new org.jfree.data.Range(33.0d, (double) 100L);
        org.jfree.data.Range range4 = org.jfree.data.Range.expandToInclude(range2, (-83.5d));
        java.lang.Class<?> wildcardClass5 = range4.getClass();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range12 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.expand(range12, (-1.0d), (double) (byte) 100);
        boolean boolean18 = range12.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range12, (-9.0d), (double) 100L);
        double double23 = range21.constrain(1.0d);
        org.jfree.data.Range range25 = org.jfree.data.Range.shift(range21, (double) (byte) 100);
        org.jfree.data.Range range27 = org.jfree.data.Range.expandToInclude(range21, (double) 'a');
        org.jfree.data.Range range30 = org.jfree.data.Range.expand(range21, (-1.0d), (-9.0d));
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range21, 0.0d, true);
        org.jfree.data.Range range34 = org.jfree.data.Range.combine(range9, range33);
        org.jfree.data.Range range37 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double38 = range37.getLength();
        double double39 = range37.getLowerBound();
        org.jfree.data.Range range40 = org.jfree.data.Range.combine(range34, range37);
        double double41 = range40.getCentralValue();
        boolean boolean42 = range6.equals((java.lang.Object) range40);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-899.0d) + "'", double23 == (-899.0d));
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range30);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-9.0d) + "'", double38 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-18.0d) + "'", double41 == (-18.0d));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        org.jfree.data.Range range78 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean80 = range78.equals((java.lang.Object) 100L);
        double double81 = range78.getLowerBound();
        org.jfree.data.Range range84 = org.jfree.data.Range.expand(range78, 10989.0d, (double) '#');
        org.jfree.data.Range range87 = org.jfree.data.Range.shift(range84, (-400.5d), false);
        boolean boolean88 = range25.equals((java.lang.Object) range87);
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
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertNotNull(range84);
        org.junit.Assert.assertNotNull(range87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        double double18 = range11.getLength();
        org.jfree.data.Range range21 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range21, (double) 10L);
        org.jfree.data.Range range26 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range29 = org.jfree.data.Range.expand(range26, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range32 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range32, (-10.0d));
        org.jfree.data.Range range35 = org.jfree.data.Range.combine(range29, range32);
        org.jfree.data.Range range38 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range41 = org.jfree.data.Range.expand(range38, (-1.0d), (double) (byte) 100);
        boolean boolean44 = range38.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range38, (-9.0d), (double) 100L);
        double double49 = range47.constrain(1.0d);
        org.jfree.data.Range range50 = org.jfree.data.Range.combine(range35, range47);
        boolean boolean51 = range21.equals((java.lang.Object) range50);
        org.jfree.data.Range range52 = org.jfree.data.Range.combine(range11, range21);
        boolean boolean54 = range21.contains(2827.0d);
        java.lang.Class<?> wildcardClass55 = range21.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-899.0d) + "'", double49 == (-899.0d));
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, 45.0d, true);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range5, 17.5d, (double) 1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 11044.5d, 0.0d);
        double double15 = range14.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) '#');
        org.jfree.data.Range range5 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, (double) (byte) -1);
        boolean boolean10 = range7.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range7, (double) 0.0f);
        boolean boolean14 = range12.contains(15.5d);
        org.jfree.data.Range range15 = org.jfree.data.Range.combine(range2, range12);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range2, 86.0d, false);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range18);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, (double) (byte) 100, (-900.0d));
        double double7 = range2.getLowerBound();
        org.jfree.data.Range range9 = org.jfree.data.Range.expandToInclude(range2, (-1.0d));
        boolean boolean11 = range9.contains(51.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        boolean boolean10 = range2.intersects((double) (-1.0f), 20.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range2, 7.75d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(range12);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        org.jfree.data.Range range33 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range33, (-10.0d));
        org.jfree.data.Range range37 = org.jfree.data.Range.shift(range35, (double) 0);
        double double38 = range35.getLength();
        boolean boolean41 = range35.intersects((-899.0d), 90.0d);
        java.lang.String str42 = range35.toString();
        boolean boolean43 = range29.equals((java.lang.Object) range35);
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
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 90.0d + "'", double38 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Range[0.0,90.0]" + "'", str42, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (double) (byte) 100, true);
        double double17 = range11.getUpperBound();
        double double18 = range11.getLowerBound();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, 0.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-899.0d) + "'", double17 == (-899.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-71.0d) + "'", double18 == (-71.0d));
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-9.0d), 61.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 97.0d, (-1.5d));
        double double7 = range5.constrain((double) (-1.0f));
        java.lang.String str8 = range5.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-44.0d) + "'", double7 == (-44.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[-6799.0,-44.0]" + "'", str8, "Range[-6799.0,-44.0]");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        org.jfree.data.Range range24 = org.jfree.data.Range.shift(range11, (-1.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-828.0d) + "'", double18 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range24);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        double double9 = range2.getCentralValue();
        double double10 = range2.getLength();
        double double11 = range2.getLength();
        boolean boolean13 = range2.contains(90.0d);
        boolean boolean16 = range2.intersects((-450.0d), 7.75d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.5d + "'", double9 == 5.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        boolean boolean10 = range4.contains((-109.0d));
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range4, (double) (short) -1, (double) 1);
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range4, (double) (byte) 100);
        java.lang.String str16 = range15.toString();
        double double17 = range15.getCentralValue();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Range[0.0,100.0]" + "'", str16, "Range[0.0,100.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        org.jfree.data.Range range6 = org.jfree.data.Range.expandToInclude(range4, (double) 'a');
        double double7 = range4.getCentralValue();
        java.lang.String str8 = range4.toString();
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range4, 26.0d, true);
        double double12 = range11.getLowerBound();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.0d + "'", double7 == 5.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[0.0,10.0]" + "'", str8, "Range[0.0,10.0]");
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 26.0d + "'", double12 == 26.0d);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.jfree.data.Range range2 = new org.jfree.data.Range(386.0d, (-135.0d));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        double double9 = range2.getCentralValue();
        org.jfree.data.Range range11 = org.jfree.data.Range.expandToInclude(range2, 107.25d);
        java.lang.String str12 = range2.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.5d + "'", double9 == 5.5d);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Range[10.0,1.0]" + "'", str12, "Range[10.0,1.0]");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        org.jfree.data.Range range40 = org.jfree.data.Range.shift(range35, (double) 1L);
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
        org.junit.Assert.assertNotNull(range40);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        double double10 = range5.getLowerBound();
        boolean boolean13 = range5.intersects((-1.0d), 21871.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range5, (double) 100L, true);
        java.lang.String str17 = range5.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Range[1.0,91.0]" + "'", str17, "Range[1.0,91.0]");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 100L, 32.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, 484.0d);
        org.junit.Assert.assertNotNull(range4);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        double double18 = range14.getLength();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range14, (double) 100);
        boolean boolean22 = range20.contains((-828.0d));
        boolean boolean24 = range20.contains((-35.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range28, 5521.75d, (-0.5d));
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
        org.junit.Assert.assertNotNull(range31);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.5d), (double) 100L);
        java.lang.Class<?> wildcardClass3 = range2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range11, (double) (byte) 100);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range11, (double) 'a');
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range11, (-1.0d), (-9.0d));
        org.jfree.data.Range range23 = org.jfree.data.Range.shift(range11, 0.0d, true);
        double double24 = range11.getCentralValue();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-485.0d) + "'", double24 == (-485.0d));
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        double double28 = range11.getUpperBound();
        org.jfree.data.Range range31 = new org.jfree.data.Range(99.0d, (double) '#');
        org.jfree.data.Range range34 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range34, (-1.0d), (double) (byte) 100);
        boolean boolean40 = range34.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range43 = org.jfree.data.Range.expand(range34, (-9.0d), (double) 100L);
        double double45 = range43.constrain(1.0d);
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range43, (double) (byte) 100);
        org.jfree.data.Range range49 = org.jfree.data.Range.expandToInclude(range43, (double) 'a');
        org.jfree.data.Range range52 = org.jfree.data.Range.expand(range43, (-1.0d), (-9.0d));
        org.jfree.data.Range range55 = org.jfree.data.Range.shift(range43, 0.0d, true);
        org.jfree.data.Range range56 = org.jfree.data.Range.combine(range31, range55);
        org.jfree.data.Range range59 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double60 = range59.getLength();
        double double61 = range59.getLowerBound();
        org.jfree.data.Range range62 = org.jfree.data.Range.combine(range56, range59);
        org.jfree.data.Range range63 = org.jfree.data.Range.combine(range11, range59);
        boolean boolean65 = range59.contains(7.75d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9.0d) + "'", double17 == (-9.0d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-899.0d) + "'", double28 == (-899.0d));
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(range43);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-899.0d) + "'", double45 == (-899.0d));
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range49);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range55);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-9.0d) + "'", double60 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertNotNull(range62);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 0.0d);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range2, (-449.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range2, 99.5d);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 0.0d, 0.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        boolean boolean15 = range11.contains((-170.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        double double8 = range4.getLength();
        boolean boolean10 = range4.contains((-109.0d));
        org.jfree.data.Range range13 = org.jfree.data.Range.expand(range4, 20.0d, (-799.0d));
        org.jfree.data.Range range15 = org.jfree.data.Range.expandToInclude(range13, 107.25d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, 51.0d);
        double double18 = range15.getUpperBound();
        java.lang.String str19 = range15.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 107.25d + "'", double18 == 107.25d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Range[-1800.0,107.25]" + "'", str19, "Range[-1800.0,107.25]");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        org.jfree.data.Range range31 = new org.jfree.data.Range((double) 1L, 15.5d);
        java.lang.String str32 = range31.toString();
        boolean boolean33 = range11.equals((java.lang.Object) str32);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Range[1.0,15.5]" + "'", str32, "Range[1.0,15.5]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        double double46 = range45.getLength();
        org.jfree.data.Range range48 = org.jfree.data.Range.expandToInclude(range45, 37289.0d);
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 171.0d + "'", double46 == 171.0d);
        org.junit.Assert.assertNotNull(range48);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.jfree.data.Range range2 = new org.jfree.data.Range(1.0d, (-37118.0d));
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range5, (double) 10.0f, false);
        boolean boolean13 = range11.contains((double) 1L);
        double double15 = range11.constrain((double) (byte) 0);
        double double16 = range11.getLength();
        boolean boolean17 = range2.equals((java.lang.Object) double16);
        java.lang.Class<?> wildcardClass18 = range2.getClass();
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range11, (double) 1);
        org.jfree.data.Range range16 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (double) (byte) -1);
        boolean boolean21 = range18.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range22 = org.jfree.data.Range.combine(range11, range18);
        boolean boolean25 = range22.intersects((double) '4', 44.5d);
        double double26 = range22.getLowerBound();
        double double28 = range22.constrain((-4050.0d));
        double double30 = range22.constrain((-10.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-71.0d) + "'", double26 == (-71.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-71.0d) + "'", double28 == (-71.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-10.0d) + "'", double30 == (-10.0d));
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        org.jfree.data.Range range5 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range8 = org.jfree.data.Range.expand(range5, (-1.0d), (double) (byte) 100);
        boolean boolean11 = range5.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range5, (-9.0d), (double) 100L);
        double double16 = range14.constrain(1.0d);
        boolean boolean17 = range2.equals((java.lang.Object) 1.0d);
        double double18 = range2.getLowerBound();
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-899.0d) + "'", double16 == (-899.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (-1.0d));
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range16, (-41.0d));
        org.jfree.data.Range range21 = new org.jfree.data.Range(0.0d, 0.0d);
        double double22 = range21.getLowerBound();
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double26 = range25.getLength();
        double double27 = range25.getLowerBound();
        double double28 = range25.getLowerBound();
        org.jfree.data.Range range31 = org.jfree.data.Range.expand(range25, (double) 0L, 91.0d);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, (double) (-1));
        boolean boolean35 = range31.contains(90.0d);
        org.jfree.data.Range range36 = org.jfree.data.Range.combine(range21, range31);
        java.lang.String str37 = range36.toString();
        boolean boolean38 = range16.equals((java.lang.Object) range36);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9.0d) + "'", double26 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Range[0.0,0.0]" + "'", str37, "Range[0.0,0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.jfree.data.Range range2 = new org.jfree.data.Range(6553.0d, 5.90028264E8d);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        org.jfree.data.Range range31 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range33 = org.jfree.data.Range.shift(range31, (double) 10L);
        org.jfree.data.Range range36 = org.jfree.data.Range.shift(range33, (-9.0d), true);
        boolean boolean37 = range22.equals((java.lang.Object) range36);
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
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        java.lang.Class<?> wildcardClass25 = range24.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 90.0d + "'", double18 == 90.0d);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1.0f, (-899.0d));
        double double4 = range2.constrain(15.5d);
        double double6 = range2.constrain((-141.0d));
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range2, 107.25d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-899.0d) + "'", double4 == (-899.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-899.0d) + "'", double6 == (-899.0d));
        org.junit.Assert.assertNotNull(range8);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-83.5d), (-20.5d));
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        org.jfree.data.Range range34 = org.jfree.data.Range.shift(range21, 110.0d, true);
        boolean boolean36 = range34.contains((-1560023.25d));
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
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        boolean boolean24 = range2.intersects(4488.5d, (double) (byte) 1);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        org.jfree.data.Range range27 = org.jfree.data.Range.shift(range11, (-480.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        java.lang.String str53 = range48.toString();
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Range[-1.0,15.5]" + "'", str53, "Range[-1.0,15.5]");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        java.lang.String str26 = range11.toString();
        java.lang.String str27 = range11.toString();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Range[-71.0,-899.0]" + "'", str26, "Range[-71.0,-899.0]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Range[-71.0,-899.0]" + "'", str27, "Range[-71.0,-899.0]");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean4 = range2.equals((java.lang.Object) 100L);
        double double5 = range2.getLength();
        boolean boolean7 = range2.contains((-1326.0d));
        double double8 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.0d + "'", double5 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range4, (double) 0);
        double double7 = range4.getLength();
        boolean boolean10 = range4.intersects((-899.0d), 90.0d);
        java.lang.String str11 = range4.toString();
        boolean boolean13 = range4.contains((-828.0d));
        boolean boolean15 = range4.contains((double) 10L);
        org.jfree.data.Range range17 = org.jfree.data.Range.expandToInclude(range4, 0.0d);
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range4, 55.5d, (-331.75d));
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[0.0,90.0]" + "'", str11, "Range[0.0,90.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        double double9 = range2.getCentralValue();
        double double10 = range2.getLength();
        java.lang.String str11 = range2.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.5d + "'", double9 == 5.5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Range[10.0,1.0]" + "'", str11, "Range[10.0,1.0]");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        org.jfree.data.Range range38 = org.jfree.data.Range.expand(range35, 4523.5d, 4523.5d);
        double double39 = range35.getLength();
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
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-199.0d) + "'", double39 == (-199.0d));
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        org.jfree.data.Range range46 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double47 = range46.getCentralValue();
        org.jfree.data.Range range50 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double51 = range50.getLength();
        org.jfree.data.Range range53 = org.jfree.data.Range.expandToInclude(range50, (double) (short) 100);
        org.jfree.data.Range range54 = org.jfree.data.Range.combine(range46, range53);
        org.jfree.data.Range range56 = org.jfree.data.Range.shift(range53, (double) 10L);
        java.lang.String str57 = range53.toString();
        org.jfree.data.Range range58 = org.jfree.data.Range.combine(range24, range53);
        boolean boolean60 = range58.contains((-9138.5d));
        org.jfree.data.Range range63 = org.jfree.data.Range.expand(range58, (-4050.0d), 48.5d);
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
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-0.5d) + "'", double47 == (-0.5d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-9.0d) + "'", double51 == (-9.0d));
        org.junit.Assert.assertNotNull(range53);
        org.junit.Assert.assertNotNull(range54);
        org.junit.Assert.assertNotNull(range56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Range[10.0,100.0]" + "'", str57, "Range[10.0,100.0]");
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(range63);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getCentralValue();
        double double4 = range2.getUpperBound();
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range2, 6108.5d, false);
        boolean boolean10 = range7.intersects((-112.5d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.5d + "'", double3 == 5.5d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1.0f, (-899.0d));
        double double4 = range2.constrain(15.5d);
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 6553.0d);
        double double7 = range6.getLength();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-899.0d) + "'", double4 == (-899.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-6554.0d) + "'", double7 == (-6554.0d));
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        double double4 = range2.getLowerBound();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 5.5d);
        java.lang.String str7 = range2.toString();
        double double8 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[10.0,1.0]" + "'", str7, "Range[10.0,1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.5d + "'", double8 == 5.5d);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-35.0d), (-0.5d));
        boolean boolean4 = range2.contains((double) (short) 1);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-35.0d) + "'", double5 == (-35.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-17.75d) + "'", double6 == (-17.75d));
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 0, 5.0d);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, 72.0d, 10984.5d);
        double double6 = range5.getUpperBound();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 54927.5d + "'", double6 == 54927.5d);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range11, 5.5d);
        double double14 = range13.getUpperBound();
        org.jfree.data.Range range16 = org.jfree.data.Range.expandToInclude(range13, 172.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-893.5d) + "'", double14 == (-893.5d));
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range11.getLength();
        boolean boolean17 = range11.contains((-942.0d));
        java.lang.String str18 = range11.toString();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-828.0d) + "'", double15 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Range[-71.0,-899.0]" + "'", str18, "Range[-71.0,-899.0]");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        java.lang.String str6 = range5.toString();
        double double7 = range5.getLength();
        double double8 = range5.getCentralValue();
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range5, 5548.0d);
        org.jfree.data.Range range13 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range15 = org.jfree.data.Range.shift(range13, (double) 10L);
        double double16 = range13.getLowerBound();
        double double17 = range13.getCentralValue();
        org.jfree.data.Range range20 = org.jfree.data.Range.expand(range13, (-485.0d), (-449.0d));
        org.jfree.data.Range range23 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double24 = range23.getLength();
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range20, range23);
        double double27 = range20.constrain((double) 'a');
        double double28 = range20.getLowerBound();
        org.jfree.data.Range range31 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double32 = range31.getCentralValue();
        boolean boolean34 = range31.contains((double) 1L);
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
        java.lang.String str74 = range73.toString();
        double double75 = range73.getLowerBound();
        org.jfree.data.Range range78 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range81 = org.jfree.data.Range.expand(range78, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range84 = org.jfree.data.Range.shift(range78, (double) 10.0f, false);
        boolean boolean86 = range84.contains((double) 1L);
        double double87 = range84.getUpperBound();
        org.jfree.data.Range range88 = org.jfree.data.Range.combine(range73, range84);
        org.jfree.data.Range range90 = org.jfree.data.Range.shift(range84, 32.0d);
        boolean boolean91 = range31.equals((java.lang.Object) range84);
        org.jfree.data.Range range92 = org.jfree.data.Range.combine(range20, range31);
        boolean boolean94 = range31.contains((-1.0d));
        org.jfree.data.Range range95 = org.jfree.data.Range.combine(range10, range31);
        java.lang.Class<?> wildcardClass96 = range31.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Range[1.0,-899.0]" + "'", str6, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-900.0d) + "'", double7 == (-900.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-449.0d) + "'", double8 == (-449.0d));
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.5d) + "'", double17 == (-0.5d));
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9.0d) + "'", double24 == (-9.0d));
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-449.0d) + "'", double27 == (-449.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 484.0d + "'", double28 == 484.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-0.5d) + "'", double32 == (-0.5d));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
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
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Range[10999.0,44.5]" + "'", str74, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10999.0d + "'", double75 == 10999.0d);
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertNotNull(range84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 11.0d + "'", double87 == 11.0d);
        org.junit.Assert.assertNotNull(range88);
        org.junit.Assert.assertNotNull(range90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(range92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(range95);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        double double25 = range20.constrain(90.0d);
        double double26 = range20.getLength();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 71.0d + "'", double26 == 71.0d);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        boolean boolean31 = range28.intersects(90.0d, (double) (byte) 10);
        org.jfree.data.Range range32 = null;
        org.jfree.data.Range range33 = org.jfree.data.Range.combine(range28, range32);
        boolean boolean36 = range28.intersects((-83.5d), 0.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 45.0d, (-9.0d));
        double double15 = range14.getUpperBound();
        java.lang.Object obj16 = null;
        boolean boolean17 = range14.equals(obj16);
        boolean boolean20 = range14.intersects((double) (-1.0f), 10999.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.expand(range14, 0.0d, 90.0d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 6553.0d + "'", double15 == 6553.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range23);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range25, 5549.5d);
        double double29 = range28.getLength();
        double double30 = range28.getUpperBound();
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
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-414.0d) + "'", double29 == (-414.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-25985.5d) + "'", double30 == (-25985.5d));
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.shift(range2, 1.0d, true);
        org.jfree.data.Range range9 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (-10.0d));
        boolean boolean12 = range2.equals((java.lang.Object) range11);
        double double14 = range11.constrain((double) (-1));
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, 5548.0d);
        boolean boolean18 = range11.equals((java.lang.Object) (-9138.5d));
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range11, 496485.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        double double26 = range11.getCentralValue();
        boolean boolean29 = range11.intersects(500.5d, (-37118.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-485.0d) + "'", double26 == (-485.0d));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        org.jfree.data.Range range28 = org.jfree.data.Range.shift(range25, 5549.5d);
        boolean boolean31 = range28.intersects((double) 0.0f, (double) (-1.0f));
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range28, (-2342.5d), (-18.0d));
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
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        org.jfree.data.Range range7 = org.jfree.data.Range.expandToInclude(range2, (-71.0d));
        boolean boolean10 = range7.intersects(0.0d, 18630.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) -1, (double) (byte) 1);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.jfree.data.Range range2 = new org.jfree.data.Range(37189.0d, 71.0d);
        double double3 = range2.getLength();
        double double4 = range2.getUpperBound();
        double double5 = range2.getLength();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-37118.0d) + "'", double3 == (-37118.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 71.0d + "'", double4 == 71.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-37118.0d) + "'", double5 == (-37118.0d));
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (-10.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, 5.5d);
        boolean boolean9 = range5.equals((java.lang.Object) 171.0d);
        double double10 = range5.getLowerBound();
        boolean boolean13 = range5.intersects((-1.0d), 21871.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range5, (double) 100L, true);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range5, (double) (byte) -1, 7.25d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range19);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) (byte) 0, 107.25d);
        double double3 = range2.getLength();
        org.jfree.data.Range range6 = org.jfree.data.Range.expand(range2, 10612.5d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 107.25d + "'", double3 == 107.25d);
        org.junit.Assert.assertNotNull(range6);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double3 = range2.getCentralValue();
        org.jfree.data.Range range5 = org.jfree.data.Range.expandToInclude(range2, 6553.0d);
        boolean boolean8 = range2.intersects(71.0d, 32.0d);
        double double10 = range2.constrain((double) 0.0f);
        double double11 = range2.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range2, 11045.5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5d) + "'", double3 == (-0.5d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(range13);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range8, 18595.0d);
        double double14 = range13.getUpperBound();
        boolean boolean17 = range13.intersects((double) 10L, 5.90028264E8d);
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 18695.0d + "'", double14 == 18695.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (-10.0d));
        boolean boolean7 = range2.intersects((double) 1, (double) 10L);
        java.lang.String str8 = range2.toString();
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Range[10.0,100.0]" + "'", str8, "Range[10.0,100.0]");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        boolean boolean4 = range2.equals((java.lang.Object) 100L);
        org.jfree.data.Range range7 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range10 = org.jfree.data.Range.expand(range7, (-1.0d), (double) (byte) 100);
        boolean boolean13 = range10.intersects((double) (byte) 10, 10.0d);
        java.lang.String str14 = range10.toString();
        org.jfree.data.Range range15 = org.jfree.data.Range.combine(range2, range10);
        org.jfree.data.Range range18 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range21 = org.jfree.data.Range.expand(range18, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range24 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range24, (-1.0d), (double) (byte) 100);
        boolean boolean30 = range24.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range33 = org.jfree.data.Range.expand(range24, (-9.0d), (double) 100L);
        org.jfree.data.Range range35 = org.jfree.data.Range.shift(range33, 5.5d);
        double double37 = range33.constrain((double) (short) 1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expandToInclude(range33, (double) 1);
        boolean boolean42 = range33.intersects(1.0d, (double) (-1));
        org.jfree.data.Range range44 = org.jfree.data.Range.expandToInclude(range33, (-485.0d));
        org.jfree.data.Range range45 = org.jfree.data.Range.combine(range21, range33);
        org.jfree.data.Range range46 = org.jfree.data.Range.combine(range15, range21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Range[1.0,-899.0]" + "'", str14, "Range[1.0,-899.0]");
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(range33);
        org.junit.Assert.assertNotNull(range35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-899.0d) + "'", double37 == (-899.0d));
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(range44);
        org.junit.Assert.assertNotNull(range45);
        org.junit.Assert.assertNotNull(range46);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, 37189.0d);
        double double4 = range2.constrain((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (double) (-1.0f), (double) (short) 0);
        org.jfree.data.Range range8 = org.jfree.data.Range.shift(range5, 0.0d, true);
        boolean boolean10 = range5.contains(11.0d);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range5, 11044.5d);
        double double13 = range12.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 0, 7.75d);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range8 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range8, (-10.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.combine(range5, range8);
        org.jfree.data.Range range14 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range14, (-10.0d));
        org.jfree.data.Range range17 = org.jfree.data.Range.combine(range5, range14);
        double double18 = range14.getLowerBound();
        org.jfree.data.Range range20 = org.jfree.data.Range.shift(range14, (double) (byte) -1);
        double double22 = range14.constrain(90.0d);
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range28 = org.jfree.data.Range.expand(range25, (-1.0d), (double) (byte) 100);
        boolean boolean31 = range25.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range25, (-9.0d), (double) 100L);
        double double36 = range34.constrain(1.0d);
        org.jfree.data.Range range38 = org.jfree.data.Range.shift(range34, (double) (byte) 100);
        org.jfree.data.Range range40 = org.jfree.data.Range.expandToInclude(range34, (double) 'a');
        double double41 = range34.getLength();
        org.jfree.data.Range range44 = new org.jfree.data.Range((double) 10.0f, (double) 10.0f);
        boolean boolean45 = range34.equals((java.lang.Object) 10.0f);
        double double46 = range34.getUpperBound();
        org.jfree.data.Range range48 = org.jfree.data.Range.shift(range34, 0.0d);
        java.lang.String str49 = range34.toString();
        org.jfree.data.Range range50 = org.jfree.data.Range.combine(range14, range34);
        double double51 = range50.getLength();
        java.lang.Class<?> wildcardClass52 = range50.getClass();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(range20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 90.0d + "'", double22 == 90.0d);
        org.junit.Assert.assertNotNull(range28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-899.0d) + "'", double36 == (-899.0d));
        org.junit.Assert.assertNotNull(range38);
        org.junit.Assert.assertNotNull(range40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-828.0d) + "'", double41 == (-828.0d));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-899.0d) + "'", double46 == (-899.0d));
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Range[-71.0,-899.0]" + "'", str49, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 171.0d + "'", double51 == 171.0d);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        org.jfree.data.Range range30 = org.jfree.data.Range.shift(range28, (-4.0d));
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
        org.junit.Assert.assertNotNull(range30);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        org.jfree.data.Range range37 = org.jfree.data.Range.expand(range11, (double) (byte) -1, 0.0d);
        double double38 = range37.getUpperBound();
        java.lang.Class<?> wildcardClass39 = range37.getClass();
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
        org.junit.Assert.assertNotNull(range37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.jfree.data.Range range2 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, (double) 10L);
        double double5 = range2.getLowerBound();
        double double6 = range2.getCentralValue();
        org.jfree.data.Range range9 = org.jfree.data.Range.expand(range2, (-485.0d), (-449.0d));
        org.jfree.data.Range range11 = org.jfree.data.Range.shift(range9, (double) 10.0f);
        org.jfree.data.Range range14 = org.jfree.data.Range.expand(range11, 4488.5d, 91.0d);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range11, 11.0d, false);
        org.jfree.data.Range range20 = new org.jfree.data.Range((double) (byte) -1, (double) (byte) -1);
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range20, 32.0d);
        boolean boolean23 = range11.equals((java.lang.Object) range22);
        double double25 = range22.constrain(5.5d);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-0.5d) + "'", double6 == (-0.5d));
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertNotNull(range14);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.5d + "'", double25 == 5.5d);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range5 = org.jfree.data.Range.expand(range2, (-1.0d), (double) (byte) 100);
        boolean boolean8 = range2.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range11 = org.jfree.data.Range.expand(range2, (-9.0d), (double) 100L);
        double double13 = range11.constrain(1.0d);
        org.jfree.data.Range range16 = org.jfree.data.Range.shift(range11, (double) (byte) 100, true);
        double double17 = range11.getCentralValue();
        double double18 = range11.getCentralValue();
        boolean boolean20 = range11.contains(35.0d);
        double double21 = range11.getLength();
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(range11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-899.0d) + "'", double13 == (-899.0d));
        org.junit.Assert.assertNotNull(range16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-485.0d) + "'", double17 == (-485.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-485.0d) + "'", double18 == (-485.0d));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-828.0d) + "'", double21 == (-828.0d));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (-109.0d));
        boolean boolean7 = range2.contains(1.0d);
        org.jfree.data.Range range10 = org.jfree.data.Range.shift(range2, (-828.0d), true);
        double double11 = range10.getLength();
        org.jfree.data.Range range13 = org.jfree.data.Range.expandToInclude(range10, (-485.0d));
        double double14 = range10.getCentralValue();
        org.jfree.data.Range range15 = null;
        org.jfree.data.Range range16 = org.jfree.data.Range.combine(range10, range15);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(range10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9.0d) + "'", double11 == (-9.0d));
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-822.5d) + "'", double14 == (-822.5d));
        org.junit.Assert.assertNotNull(range16);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        org.jfree.data.Range range36 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range39 = org.jfree.data.Range.expand(range36, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range42 = org.jfree.data.Range.shift(range36, (double) 10.0f, false);
        boolean boolean44 = range42.contains((double) 1L);
        org.jfree.data.Range range47 = org.jfree.data.Range.expand(range42, (double) 100, 18630.0d);
        org.jfree.data.Range range50 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range52 = org.jfree.data.Range.shift(range50, (double) 10L);
        org.jfree.data.Range range55 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range58 = org.jfree.data.Range.expand(range55, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range61 = new org.jfree.data.Range((double) 10.0f, 100.0d);
        org.jfree.data.Range range63 = org.jfree.data.Range.shift(range61, (-10.0d));
        org.jfree.data.Range range64 = org.jfree.data.Range.combine(range58, range61);
        org.jfree.data.Range range67 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range70 = org.jfree.data.Range.expand(range67, (-1.0d), (double) (byte) 100);
        boolean boolean73 = range67.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range76 = org.jfree.data.Range.expand(range67, (-9.0d), (double) 100L);
        double double78 = range76.constrain(1.0d);
        org.jfree.data.Range range79 = org.jfree.data.Range.combine(range64, range76);
        boolean boolean80 = range50.equals((java.lang.Object) range79);
        org.jfree.data.Range range81 = org.jfree.data.Range.combine(range47, range79);
        org.jfree.data.Range range82 = org.jfree.data.Range.combine(range33, range79);
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
        org.junit.Assert.assertNotNull(range39);
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range52);
        org.junit.Assert.assertNotNull(range58);
        org.junit.Assert.assertNotNull(range63);
        org.junit.Assert.assertNotNull(range64);
        org.junit.Assert.assertNotNull(range70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-899.0d) + "'", double78 == (-899.0d));
        org.junit.Assert.assertNotNull(range79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(range81);
        org.junit.Assert.assertNotNull(range82);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        boolean boolean53 = range51.contains((double) (short) 100);
        org.jfree.data.Range range56 = new org.jfree.data.Range(171.0d, (-170.0d));
        org.jfree.data.Range range59 = org.jfree.data.Range.shift(range56, (-385.0d), true);
        org.jfree.data.Range range62 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range65 = org.jfree.data.Range.expand(range62, (-1.0d), (double) (byte) 100);
        boolean boolean68 = range62.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range71 = org.jfree.data.Range.expand(range62, (-9.0d), (double) 100L);
        org.jfree.data.Range range73 = org.jfree.data.Range.expandToInclude(range71, (double) 1);
        org.jfree.data.Range range76 = org.jfree.data.Range.expand(range73, 15.5d, (-101.0d));
        boolean boolean77 = range56.equals((java.lang.Object) range76);
        org.jfree.data.Range range78 = org.jfree.data.Range.combine(range51, range56);
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(range59);
        org.junit.Assert.assertNotNull(range65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(range71);
        org.junit.Assert.assertNotNull(range73);
        org.junit.Assert.assertNotNull(range76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(range78);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.jfree.data.Range range2 = new org.jfree.data.Range(0.0d, (double) '#');
        org.jfree.data.Range range5 = new org.jfree.data.Range(100.0d, (-9.0d));
        org.jfree.data.Range range7 = org.jfree.data.Range.shift(range5, (double) (byte) -1);
        boolean boolean10 = range7.intersects((double) 1.0f, (double) 0.0f);
        org.jfree.data.Range range12 = org.jfree.data.Range.shift(range7, (double) 0.0f);
        boolean boolean14 = range12.contains(15.5d);
        org.jfree.data.Range range15 = org.jfree.data.Range.combine(range2, range12);
        org.jfree.data.Range range18 = org.jfree.data.Range.shift(range12, (-31328.0d), true);
        org.jfree.data.Range range20 = org.jfree.data.Range.expandToInclude(range12, 190.0d);
        org.junit.Assert.assertNotNull(range7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(range15);
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range20);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.jfree.data.Range range0 = null;
        org.jfree.data.Range range2 = org.jfree.data.Range.expandToInclude(range0, (double) 10);
        org.jfree.data.Range range4 = org.jfree.data.Range.shift(range2, 104.5d);
        org.jfree.data.Range range7 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range9 = org.jfree.data.Range.shift(range7, (double) 10L);
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range7, 44.5d, (-799.0d));
        org.jfree.data.Range range15 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double16 = range15.getLength();
        org.jfree.data.Range range18 = org.jfree.data.Range.expandToInclude(range15, (double) (short) 100);
        org.jfree.data.Range range19 = org.jfree.data.Range.combine(range7, range15);
        org.jfree.data.Range range21 = org.jfree.data.Range.expandToInclude(range7, 743473.0d);
        org.jfree.data.Range range24 = org.jfree.data.Range.expand(range7, 0.0d, 21.0d);
        org.jfree.data.Range range27 = org.jfree.data.Range.expand(range24, 168.0d, (-331.75d));
        org.jfree.data.Range range28 = org.jfree.data.Range.combine(range2, range24);
        org.junit.Assert.assertNotNull(range2);
        org.junit.Assert.assertNotNull(range4);
        org.junit.Assert.assertNotNull(range9);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertNotNull(range18);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertNotNull(range21);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(range28);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        boolean boolean84 = range77.intersects((double) 100L, 6553.0d);
        double double86 = range77.constrain(45.0d);
        org.jfree.data.Range range88 = org.jfree.data.Range.shift(range77, (-899.0d));
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
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertNotNull(range88);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double3 = range2.getLength();
        org.jfree.data.Range range5 = org.jfree.data.Range.shift(range2, (double) 'a');
        double double6 = range2.getLowerBound();
        java.lang.String str7 = range2.toString();
        boolean boolean9 = range2.contains((double) ' ');
        org.jfree.data.Range range12 = org.jfree.data.Range.expand(range2, 48.5d, (-170.0d));
        org.jfree.data.Range range15 = new org.jfree.data.Range((-1.0d), (double) (byte) 0);
        org.jfree.data.Range range17 = org.jfree.data.Range.shift(range15, (double) 10L);
        double double18 = range15.getLowerBound();
        double double19 = range15.getCentralValue();
        org.jfree.data.Range range22 = org.jfree.data.Range.expand(range15, (-485.0d), (-449.0d));
        org.jfree.data.Range range25 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        double double26 = range25.getLength();
        org.jfree.data.Range range27 = org.jfree.data.Range.combine(range22, range25);
        double double29 = range22.constrain((double) 'a');
        double double30 = range22.getLowerBound();
        org.jfree.data.Range range33 = new org.jfree.data.Range(0.0d, (double) (short) -1);
        double double34 = range33.getCentralValue();
        boolean boolean36 = range33.contains((double) 1L);
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
        org.jfree.data.Range range75 = org.jfree.data.Range.expand(range55, 100.0d, (-0.5d));
        java.lang.String str76 = range75.toString();
        double double77 = range75.getLowerBound();
        org.jfree.data.Range range80 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range83 = org.jfree.data.Range.expand(range80, (-1.0d), (double) (byte) 100);
        org.jfree.data.Range range86 = org.jfree.data.Range.shift(range80, (double) 10.0f, false);
        boolean boolean88 = range86.contains((double) 1L);
        double double89 = range86.getUpperBound();
        org.jfree.data.Range range90 = org.jfree.data.Range.combine(range75, range86);
        org.jfree.data.Range range92 = org.jfree.data.Range.shift(range86, 32.0d);
        boolean boolean93 = range33.equals((java.lang.Object) range86);
        org.jfree.data.Range range94 = org.jfree.data.Range.combine(range22, range33);
        org.jfree.data.Range range97 = org.jfree.data.Range.shift(range94, (double) (-1L), true);
        boolean boolean98 = range2.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[10.0,1.0]" + "'", str7, "Range[10.0,1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.5d) + "'", double19 == (-0.5d));
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9.0d) + "'", double26 == (-9.0d));
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-449.0d) + "'", double29 == (-449.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 484.0d + "'", double30 == 484.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-0.5d) + "'", double34 == (-0.5d));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
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
        org.junit.Assert.assertNotNull(range75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Range[10999.0,44.5]" + "'", str76, "Range[10999.0,44.5]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10999.0d + "'", double77 == 10999.0d);
        org.junit.Assert.assertNotNull(range83);
        org.junit.Assert.assertNotNull(range86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 11.0d + "'", double89 == 11.0d);
        org.junit.Assert.assertNotNull(range90);
        org.junit.Assert.assertNotNull(range92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(range94);
        org.junit.Assert.assertNotNull(range97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        double double31 = range4.getLowerBound();
        org.jfree.data.Range range34 = org.jfree.data.Range.expand(range4, (double) 0L, 0.0d);
        double double35 = range34.getLength();
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 90.0d + "'", double35 == 90.0d);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        org.jfree.data.Range range40 = new org.jfree.data.Range((double) 10, (double) ' ');
        boolean boolean42 = range40.contains((double) (byte) 0);
        double double43 = range40.getUpperBound();
        double double45 = range40.constrain((-13662.0d));
        org.jfree.data.Range range46 = org.jfree.data.Range.combine(range33, range40);
        boolean boolean48 = range46.contains(2827.0d);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 32.0d + "'", double43 == 32.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNotNull(range46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.jfree.data.Range range2 = new org.jfree.data.Range((double) 1.0f, (-899.0d));
        double double4 = range2.constrain((-9.0d));
        org.jfree.data.Range range6 = org.jfree.data.Range.expandToInclude(range2, (double) (byte) 10);
        java.lang.String str7 = range6.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-899.0d) + "'", double4 == (-899.0d));
        org.junit.Assert.assertNotNull(range6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Range[1.0,10.0]" + "'", str7, "Range[1.0,10.0]");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.jfree.data.Range range2 = new org.jfree.data.Range(44.5d, (double) 10);
        boolean boolean4 = range2.contains((-828.0d));
        java.lang.String str5 = range2.toString();
        boolean boolean8 = range2.intersects((-485.0d), (-4914.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Range[44.5,10.0]" + "'", str5, "Range[44.5,10.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.jfree.data.Range range2 = new org.jfree.data.Range(100.0d, (-9.0d));
        double double3 = range2.getUpperBound();
        double double5 = range2.constrain(0.0d);
        double double6 = range2.getLowerBound();
        double double7 = range2.getUpperBound();
        boolean boolean10 = range2.intersects(90.0d, 21871.0d);
        org.jfree.data.Range range13 = org.jfree.data.Range.shift(range2, (double) 10.0f, true);
        org.jfree.data.Range range16 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range19 = org.jfree.data.Range.expand(range16, (-1.0d), (double) (byte) 100);
        boolean boolean22 = range16.intersects((double) (byte) -1, (double) (short) -1);
        org.jfree.data.Range range25 = org.jfree.data.Range.expand(range16, (-9.0d), (double) 100L);
        double double27 = range25.constrain(1.0d);
        org.jfree.data.Range range29 = org.jfree.data.Range.shift(range25, (double) (byte) 100);
        org.jfree.data.Range range31 = org.jfree.data.Range.expandToInclude(range25, (double) 'a');
        java.lang.String str32 = range25.toString();
        org.jfree.data.Range range34 = org.jfree.data.Range.expandToInclude(range25, 0.0d);
        double double35 = range25.getLowerBound();
        double double36 = range25.getCentralValue();
        org.jfree.data.Range range39 = new org.jfree.data.Range((double) 10.0f, (double) 1);
        org.jfree.data.Range range42 = org.jfree.data.Range.expand(range39, (-1.0d), (double) (byte) 100);
        java.lang.String str43 = range42.toString();
        double double44 = range42.getLength();
        double double45 = range42.getCentralValue();
        org.jfree.data.Range range47 = org.jfree.data.Range.shift(range42, 5548.0d);
        org.jfree.data.Range range48 = org.jfree.data.Range.combine(range25, range42);
        double double49 = range25.getUpperBound();
        double double50 = range25.getCentralValue();
        org.jfree.data.Range range51 = org.jfree.data.Range.combine(range2, range25);
        java.lang.Class<?> wildcardClass52 = range2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9.0d) + "'", double5 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9.0d) + "'", double7 == (-9.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(range13);
        org.junit.Assert.assertNotNull(range19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-899.0d) + "'", double27 == (-899.0d));
        org.junit.Assert.assertNotNull(range29);
        org.junit.Assert.assertNotNull(range31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Range[-71.0,-899.0]" + "'", str32, "Range[-71.0,-899.0]");
        org.junit.Assert.assertNotNull(range34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-71.0d) + "'", double35 == (-71.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-485.0d) + "'", double36 == (-485.0d));
        org.junit.Assert.assertNotNull(range42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Range[1.0,-899.0]" + "'", str43, "Range[1.0,-899.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-900.0d) + "'", double44 == (-900.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-449.0d) + "'", double45 == (-449.0d));
        org.junit.Assert.assertNotNull(range47);
        org.junit.Assert.assertNotNull(range48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-899.0d) + "'", double49 == (-899.0d));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-485.0d) + "'", double50 == (-485.0d));
        org.junit.Assert.assertNotNull(range51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        org.jfree.data.Range range22 = org.jfree.data.Range.expandToInclude(range2, (-818.0d));
        boolean boolean25 = range2.intersects((-3825.0d), 107.25d);
        double double26 = range2.getLowerBound();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.0d) + "'", double3 == (-9.0d));
        org.junit.Assert.assertNotNull(range5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9.0d) + "'", double9 == (-9.0d));
        org.junit.Assert.assertNotNull(range12);
        org.junit.Assert.assertNotNull(range17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 45.0d + "'", double19 == 45.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(range22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
    }
}

