import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        long long3 = frequency0.getCount((int) (byte) 1);
        double double5 = frequency0.getCumPct(0L);
        long long7 = frequency0.getCount(0L);
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = frequency8.toString();
        java.lang.Object obj12 = null;
        double double13 = frequency8.getCumPct(obj12);
        double double15 = frequency8.getCumPct('a');
        double double17 = frequency8.getCumPct((int) (byte) 100);
        long long19 = frequency8.getCount(0L);
        double double21 = frequency8.getCumPct((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        double double24 = frequency22.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double26 = frequency22.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double28 = frequency22.getPct((int) 'a');
        frequency22.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long32 = frequency22.getCount((int) '4');
        long long34 = frequency22.getCumFreq((long) ' ');
        double double35 = frequency8.getCumPct((java.lang.Object) ' ');
        long long37 = frequency8.getCumFreq((int) (byte) -1);
        double double39 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        double double41 = frequency8.getPct((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Object) frequency8);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        double double6 = frequency4.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double8 = frequency4.getCumPct((long) (short) 100);
        long long10 = frequency4.getCumFreq('#');
        java.lang.Class<?> wildcardClass11 = frequency4.getClass();
        boolean boolean12 = frequency0.equals((java.lang.Object) wildcardClass11);
        frequency0.clear();
        double double15 = frequency0.getCumPct((int) (short) 0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor16 = frequency0.valuesIterator();
        double double18 = frequency0.getCumPct((int) 'a');
        double double20 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardComparableItor16);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        frequency0.addValue('a');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        double double14 = frequency12.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double16 = frequency12.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double17 = frequency0.getCumPct((java.lang.Object) double16);
        double double19 = frequency0.getCumPct('a');
        double double21 = frequency0.getCumPct(0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        double double6 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        long long8 = frequency0.getCount(0L);
        double double10 = frequency0.getCumPct(10L);
        frequency0.addValue((java.lang.Integer) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        long long8 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        double double5 = frequency3.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double7 = frequency3.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double9 = frequency3.getPct((int) 'a');
        long long11 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double13 = frequency3.getCumPct('a');
        long long15 = frequency3.getCumFreq((int) '#');
        java.lang.String str16 = frequency3.toString();
        boolean boolean17 = frequency0.equals((java.lang.Object) str16);
        long long19 = frequency0.getCount('4');
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double24 = frequency20.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double26 = frequency20.getPct((int) 'a');
        frequency20.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor29 = frequency20.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        boolean boolean31 = frequency20.equals((java.lang.Object) frequency30);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = frequency0.getCount((java.lang.Object) frequency30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(wildcardComparableItor29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        double double17 = frequency15.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long19 = frequency15.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getPct((java.lang.Object) (byte) -1);
        double double23 = frequency15.getPct((java.lang.Object) (byte) -1);
        double double25 = frequency15.getCumPct((java.lang.Object) (-1.0f));
        double double27 = frequency15.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        double double30 = frequency28.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long32 = frequency28.getCount((long) (byte) 10);
        double double34 = frequency28.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        frequency15.addValue((java.lang.Object) double34);
        boolean boolean36 = frequency0.equals((java.lang.Object) double34);
        long long38 = frequency0.getCount(0);
        long long40 = frequency0.getCount(100L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double12 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        long long14 = frequency0.getCount(10);
        long long16 = frequency0.getCumFreq('4');
        double double18 = frequency0.getCumPct((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getCumPct((java.lang.Object) 10L);
        long long12 = frequency0.getCount((int) (short) 1);
        double double14 = frequency0.getCumPct('#');
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        double double17 = frequency15.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor18 = frequency15.valuesIterator();
        double double20 = frequency15.getPct(' ');
        boolean boolean21 = frequency0.equals((java.lang.Object) double20);
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        double double24 = frequency22.getPct((java.lang.Object) (byte) -1);
        double double26 = frequency22.getPct(1);
        double double28 = frequency22.getCumPct((int) '4');
        frequency22.addValue((long) '#');
        double double32 = frequency22.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency22.addValue((java.lang.Integer) 100);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double39 = frequency35.getPct(0);
        double double41 = frequency35.getCumPct('a');
        long long43 = frequency35.getCount(1);
        double double45 = frequency35.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double47 = frequency35.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean48 = frequency22.equals((java.lang.Object) frequency35);
        boolean boolean49 = frequency0.equals((java.lang.Object) boolean48);
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency();
        double double52 = frequency50.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double54 = frequency50.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double56 = frequency50.getPct((int) 'a');
        frequency50.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor59 = frequency50.valuesIterator();
        long long60 = frequency50.getSumFreq();
        long long62 = frequency50.getCount(2L);
        double double63 = frequency0.getPct((java.lang.Object) long62);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(wildcardComparableItor18);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(wildcardComparableItor59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 1.0d + "'", double63 == 1.0d);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((java.lang.Object) (byte) -1);
        double double8 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double10 = frequency0.getCumPct((java.lang.Object) (-1.0f));
        double double12 = frequency0.getPct('a');
        long long14 = frequency0.getCumFreq(' ');
        java.lang.String str15 = frequency0.toString();
        double double17 = frequency0.getPct(1);
        long long19 = frequency0.getCumFreq((long) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        double double12 = frequency0.getPct((java.lang.Object) 1L);
        frequency0.addValue(' ');
        double double16 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        long long6 = frequency0.getCumFreq('4');
        long long8 = frequency0.getCumFreq((java.lang.Object) true);
        long long10 = frequency0.getCount((long) (short) 100);
        double double12 = frequency0.getCumPct('a');
        double double14 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        long long16 = frequency0.getCount('a');
        long long17 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        java.lang.Object obj5 = null;
        boolean boolean6 = frequency0.equals(obj5);
        frequency0.clear();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t50%\t50%\n35\t1\t50%\t100%\n");
        long long11 = frequency0.getCount((int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        double double6 = frequency4.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double8 = frequency4.getCumPct((long) (short) 100);
        long long10 = frequency4.getCumFreq('#');
        java.lang.Class<?> wildcardClass11 = frequency4.getClass();
        boolean boolean12 = frequency0.equals((java.lang.Object) wildcardClass11);
        frequency0.clear();
        double double15 = frequency0.getCumPct((int) (short) 0);
        long long17 = frequency0.getCumFreq(10L);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = frequency18.toString();
        java.lang.Object obj22 = null;
        double double23 = frequency18.getCumPct(obj22);
        double double25 = frequency18.getCumPct('a');
        double double27 = frequency18.getCumPct((int) (byte) 100);
        long long29 = frequency18.getCount(0L);
        double double31 = frequency18.getCumPct((long) (short) -1);
        long long32 = frequency18.getSumFreq();
        frequency18.addValue((int) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long39 = frequency35.getCount((java.lang.Object) 1L);
        long long41 = frequency35.getCumFreq('4');
        long long43 = frequency35.getCumFreq((java.lang.Object) true);
        double double45 = frequency35.getCumPct(' ');
        long long47 = frequency35.getCumFreq((int) '#');
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency();
        double double50 = frequency48.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double52 = frequency48.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double54 = frequency48.getPct((int) 'a');
        long long56 = frequency48.getCount((long) (byte) 1);
        boolean boolean57 = frequency35.equals((java.lang.Object) frequency48);
        long long59 = frequency48.getCumFreq((long) (short) 1);
        double double60 = frequency18.getPct((java.lang.Object) (short) 1);
        long long62 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long64 = frequency18.getCount((-1));
        long long66 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor67 = frequency18.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            double double68 = frequency0.getPct((java.lang.Object) wildcardComparableItor67);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.TreeMap$KeyIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor67);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        boolean boolean20 = frequency0.equals((java.lang.Object) 10);
        java.lang.String str21 = frequency0.toString();
        long long23 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = frequency24.toString();
        java.lang.Object obj28 = null;
        double double29 = frequency24.getCumPct(obj28);
        double double31 = frequency24.getCumPct('a');
        double double33 = frequency24.getCumPct((int) (byte) 100);
        long long35 = frequency24.getCount(0L);
        double double36 = frequency0.getPct((java.lang.Object) long35);
        long long38 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str42 = frequency41.toString();
        double double44 = frequency41.getCumPct('a');
        frequency41.addValue((java.lang.Comparable<java.lang.String>) "");
        long long47 = frequency0.getCumFreq((java.lang.Object) "");
        long long49 = frequency0.getCount('4');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor50 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str42, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor50);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        frequency0.addValue(' ');
        double double9 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        double double12 = frequency10.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long14 = frequency10.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        double double17 = frequency15.getPct((java.lang.Object) (byte) -1);
        double double18 = frequency10.getPct((java.lang.Object) (byte) -1);
        double double20 = frequency10.getCumPct((java.lang.Object) (-1.0f));
        double double22 = frequency10.getPct('a');
        double double24 = frequency10.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        long long26 = frequency10.getCumFreq((long) (short) -1);
        long long27 = frequency0.getCumFreq((java.lang.Object) (short) -1);
        long long29 = frequency0.getCumFreq((long) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        java.lang.String str11 = frequency0.toString();
        double double13 = frequency0.getPct('4');
        double double15 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        frequency0.addValue((java.lang.Integer) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        frequency0.addValue('a');
        long long12 = frequency0.getCount('#');
        long long14 = frequency0.getCount(1L);
        frequency0.clear();
        long long17 = frequency0.getCount('4');
        long long19 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        long long12 = frequency0.getCumFreq((int) '#');
        double double14 = frequency0.getCumPct((long) (short) 10);
        long long16 = frequency0.getCumFreq('4');
        long long18 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        long long20 = frequency0.getCount(0);
        double double22 = frequency0.getPct((int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((int) (short) 100);
        double double6 = frequency0.getCumPct((int) (short) -1);
        long long8 = frequency0.getCount(' ');
        long long10 = frequency0.getCumFreq((long) (short) 0);
        double double12 = frequency0.getCumPct((long) 0);
        double double14 = frequency0.getCumPct((long) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getPct(0);
        double double6 = frequency0.getCumPct('a');
        long long8 = frequency0.getCount(1);
        double double10 = frequency0.getCumPct(0L);
        long long12 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double14 = frequency0.getPct(0L);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        double double17 = frequency15.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency15.getCumPct((long) (short) 100);
        long long21 = frequency15.getCumFreq('#');
        frequency15.addValue((java.lang.Integer) 0);
        double double25 = frequency15.getPct((int) (byte) 10);
        long long27 = frequency15.getCumFreq('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor28 = frequency15.valuesIterator();
        double double30 = frequency15.getCumPct(100L);
        boolean boolean31 = frequency0.equals((java.lang.Object) double30);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((long) 100);
        double double8 = frequency0.getPct(1L);
        frequency0.addValue(10);
        double double12 = frequency0.getPct((int) (byte) 100);
        long long14 = frequency0.getCount(0);
        long long16 = frequency0.getCount(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        double double6 = frequency4.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double8 = frequency4.getCumPct((long) (short) 100);
        long long10 = frequency4.getCumFreq('#');
        java.lang.Class<?> wildcardClass11 = frequency4.getClass();
        boolean boolean12 = frequency0.equals((java.lang.Object) wildcardClass11);
        frequency0.clear();
        double double15 = frequency0.getCumPct((int) (short) 0);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long20 = frequency16.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        double double23 = frequency21.getPct((java.lang.Object) (byte) -1);
        double double24 = frequency16.getPct((java.lang.Object) (byte) -1);
        double double26 = frequency16.getCumPct((java.lang.Object) (-1.0f));
        frequency16.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        double double31 = frequency29.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double33 = frequency29.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double35 = frequency29.getPct((int) 'a');
        long long37 = frequency29.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double39 = frequency29.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        double double42 = frequency40.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double44 = frequency40.getCumPct((long) (short) 100);
        long long46 = frequency40.getCumFreq((long) (byte) -1);
        double double47 = frequency29.getPct((java.lang.Object) long46);
        boolean boolean49 = frequency29.equals((java.lang.Object) 10);
        java.lang.String str50 = frequency29.toString();
        double double52 = frequency29.getCumPct((int) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency53 = new org.apache.commons.math.stat.Frequency();
        double double55 = frequency53.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double57 = frequency53.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double59 = frequency53.getPct((int) 'a');
        long long61 = frequency53.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double63 = frequency53.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency64 = new org.apache.commons.math.stat.Frequency();
        double double66 = frequency64.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double68 = frequency64.getCumPct((long) (short) 100);
        long long70 = frequency64.getCumFreq((long) (byte) -1);
        double double71 = frequency53.getPct((java.lang.Object) long70);
        long long73 = frequency53.getCumFreq((int) (short) -1);
        double double74 = frequency29.getCumPct((java.lang.Object) (short) -1);
        double double75 = frequency16.getPct((java.lang.Object) double74);
        frequency0.addValue((java.lang.Object) double75);
        long long78 = frequency0.getCount(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str50, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        double double6 = frequency4.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double8 = frequency4.getCumPct((long) (short) 100);
        long long10 = frequency4.getCumFreq('#');
        java.lang.Class<?> wildcardClass11 = frequency4.getClass();
        boolean boolean12 = frequency0.equals((java.lang.Object) wildcardClass11);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = frequency13.toString();
        long long18 = frequency13.getCumFreq(0L);
        long long19 = frequency0.getCumFreq((java.lang.Object) 0L);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str21 = frequency20.toString();
        double double23 = frequency20.getCumPct('a');
        java.lang.String str24 = frequency20.toString();
        double double25 = frequency0.getPct((java.lang.Object) str24);
        double double27 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        java.lang.String str28 = frequency0.toString();
        long long29 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Object) 1.0d);
        double double12 = frequency0.getPct(1);
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double18 = frequency0.getPct((java.lang.Object) "");
        long long20 = frequency0.getCount('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getCumPct((int) (byte) 100);
        frequency0.clear();
        long long11 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        double double14 = frequency12.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long16 = frequency12.getCount((java.lang.Object) 1L);
        long long18 = frequency12.getCumFreq('4');
        double double20 = frequency12.getCumPct(100);
        double double21 = frequency0.getPct((java.lang.Object) 100);
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        double double24 = frequency22.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long26 = frequency22.getCount((java.lang.Object) 1L);
        long long28 = frequency22.getCumFreq('4');
        long long30 = frequency22.getCumFreq((java.lang.Object) true);
        double double32 = frequency22.getCumPct(' ');
        long long34 = frequency22.getCumFreq((int) '#');
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double39 = frequency35.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double41 = frequency35.getPct((int) 'a');
        long long43 = frequency35.getCount((long) (byte) 1);
        boolean boolean44 = frequency22.equals((java.lang.Object) frequency35);
        long long46 = frequency35.getCumFreq((long) 100);
        double double48 = frequency35.getPct((long) (short) 10);
        boolean boolean49 = frequency0.equals((java.lang.Object) double48);
        double double51 = frequency0.getCumPct((long) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object obj9 = null;
        long long10 = frequency0.getCumFreq(obj9);
        double double12 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1.0\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double17 = frequency13.getCumPct((long) (short) 100);
        long long19 = frequency13.getCumFreq('#');
        frequency13.addValue((java.lang.Integer) 0);
        double double23 = frequency13.getCumPct((java.lang.Object) 10L);
        long long25 = frequency13.getCount((int) (short) 1);
        double double27 = frequency13.getCumPct('#');
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        double double30 = frequency28.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor31 = frequency28.valuesIterator();
        double double33 = frequency28.getPct(' ');
        boolean boolean34 = frequency13.equals((java.lang.Object) double33);
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getPct((java.lang.Object) (byte) -1);
        double double39 = frequency35.getPct(1);
        double double41 = frequency35.getCumPct((int) '4');
        frequency35.addValue((long) '#');
        double double45 = frequency35.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency35.addValue((java.lang.Integer) 100);
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency();
        double double50 = frequency48.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double52 = frequency48.getPct(0);
        double double54 = frequency48.getCumPct('a');
        long long56 = frequency48.getCount(1);
        double double58 = frequency48.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double60 = frequency48.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean61 = frequency35.equals((java.lang.Object) frequency48);
        boolean boolean62 = frequency13.equals((java.lang.Object) boolean61);
        java.lang.Class<?> wildcardClass63 = frequency13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            long long64 = frequency0.getCumFreq((java.lang.Object) frequency13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(wildcardComparableItor31);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        boolean boolean20 = frequency0.equals((java.lang.Object) 10);
        java.lang.String str21 = frequency0.toString();
        long long23 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = frequency24.toString();
        java.lang.Object obj28 = null;
        double double29 = frequency24.getCumPct(obj28);
        double double31 = frequency24.getCumPct('a');
        double double33 = frequency24.getCumPct((int) (byte) 100);
        long long35 = frequency24.getCount(0L);
        double double36 = frequency0.getPct((java.lang.Object) long35);
        long long38 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double40 = frequency0.getCumPct(0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        java.lang.String str11 = frequency0.toString();
        double double13 = frequency0.getCumPct(0L);
        long long15 = frequency0.getCumFreq(100);
        double double17 = frequency0.getCumPct((int) '4');
        double double19 = frequency0.getPct(' ');
        long long20 = frequency0.getSumFreq();
        double double22 = frequency0.getPct((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nNaN\t1\t100%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        long long28 = frequency0.getCumFreq((int) ' ');
        frequency0.addValue(2L);
        double double32 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n");
        double double34 = frequency0.getPct(100L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor19 = frequency0.valuesIterator();
        long long21 = frequency0.getCumFreq((java.lang.Object) (byte) -1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor22 = frequency0.valuesIterator();
        double double24 = frequency0.getCumPct((long) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardComparableItor19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor22);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getPct((java.lang.Object) (byte) -1);
        double double15 = frequency11.getPct(1);
        double double17 = frequency11.getCumPct((int) '4');
        frequency11.addValue((long) '#');
        long long21 = frequency11.getCount((long) 0);
        long long22 = frequency0.getCount((java.lang.Object) long21);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((int) (byte) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq((long) (byte) -1);
        long long8 = frequency0.getCount((long) (short) 1);
        long long10 = frequency0.getCumFreq((int) (byte) -1);
        double double12 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        double double14 = frequency0.getCumPct((int) (short) -1);
        long long15 = frequency0.getSumFreq();
        long long17 = frequency0.getCumFreq((int) (short) -1);
        frequency0.addValue(2L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getCumPct((int) (byte) 100);
        long long11 = frequency0.getCount(0L);
        double double13 = frequency0.getCumPct((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        double double16 = frequency14.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double18 = frequency14.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double20 = frequency14.getPct((int) 'a');
        frequency14.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long24 = frequency14.getCount((int) '4');
        long long26 = frequency14.getCumFreq((long) ' ');
        double double27 = frequency0.getCumPct((java.lang.Object) ' ');
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        double double30 = frequency28.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double32 = frequency28.getCumPct((long) (short) 100);
        long long34 = frequency28.getCumFreq('#');
        frequency28.addValue((java.lang.Integer) 0);
        double double38 = frequency28.getPct((int) (byte) 10);
        long long40 = frequency28.getCumFreq('#');
        frequency28.addValue((java.lang.Integer) 10);
        double double44 = frequency28.getCumPct('a');
        long long45 = frequency0.getCumFreq((java.lang.Object) 'a');
        double double47 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long49 = frequency0.getCount((-1L));
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency();
        double double52 = frequency50.getPct((java.lang.Object) (byte) -1);
        double double54 = frequency50.getPct(1);
        double double56 = frequency50.getCumPct((int) '4');
        frequency50.addValue((long) '#');
        double double60 = frequency50.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long61 = frequency50.getSumFreq();
        double double63 = frequency50.getPct((int) (short) 100);
        long long65 = frequency50.getCumFreq(100);
        double double66 = frequency0.getCumPct((java.lang.Object) long65);
        long long68 = frequency0.getCount('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        double double12 = frequency10.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double14 = frequency10.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double16 = frequency10.getPct((int) 'a');
        long long18 = frequency10.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double20 = frequency10.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        double double23 = frequency21.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double25 = frequency21.getCumPct((long) (short) 100);
        long long27 = frequency21.getCumFreq((long) (byte) -1);
        double double28 = frequency10.getPct((java.lang.Object) long27);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor29 = frequency10.valuesIterator();
        long long31 = frequency10.getCumFreq((java.lang.Object) (byte) -1);
        long long32 = frequency0.getCount((java.lang.Object) (byte) -1);
        frequency0.addValue((java.lang.Integer) 0);
        double double36 = frequency0.getCumPct('a');
        frequency0.addValue((long) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(wildcardComparableItor29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Object) 1.0d);
        double double12 = frequency0.getPct(1);
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long18 = frequency0.getCount((int) (short) 1);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = frequency19.toString();
        java.lang.Object obj23 = null;
        double double24 = frequency19.getCumPct(obj23);
        double double26 = frequency19.getCumPct('a');
        double double28 = frequency19.getCumPct((int) (byte) 100);
        long long30 = frequency19.getCount(0L);
        double double32 = frequency19.getCumPct((long) (short) -1);
        double double34 = frequency19.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Object) double34);
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency();
        double double39 = frequency37.getPct((java.lang.Object) (byte) -1);
        frequency37.addValue((long) (short) 100);
        java.lang.Object obj42 = null;
        boolean boolean43 = frequency37.equals(obj42);
        long long45 = frequency37.getCumFreq('a');
        boolean boolean46 = frequency0.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        double double6 = frequency4.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double8 = frequency4.getCumPct((long) (short) 100);
        long long10 = frequency4.getCumFreq('#');
        java.lang.Class<?> wildcardClass11 = frequency4.getClass();
        boolean boolean12 = frequency0.equals((java.lang.Object) wildcardClass11);
        frequency0.clear();
        long long15 = frequency0.getCumFreq(0);
        long long17 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        double double3 = frequency0.getCumPct('a');
        double double5 = frequency0.getPct((long) 100);
        frequency0.addValue((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        long long6 = frequency0.getCumFreq('4');
        long long8 = frequency0.getCumFreq((java.lang.Object) true);
        double double10 = frequency0.getCumPct(' ');
        double double12 = frequency0.getCumPct((int) (byte) 100);
        long long14 = frequency0.getCount((int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        double double6 = frequency0.getCumPct(1);
        double double8 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue(' ');
        double double12 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Object) 1.0d);
        double double12 = frequency0.getPct(1);
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double18 = frequency0.getPct((java.lang.Object) "");
        long long20 = frequency0.getCumFreq(' ');
        long long22 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        long long24 = frequency0.getCumFreq('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        frequency0.addValue((long) (short) 100);
        java.lang.String str5 = frequency0.toString();
        frequency0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        double double6 = frequency0.getPct((long) (short) 100);
        long long8 = frequency0.getCount(100L);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        double double11 = frequency9.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str12 = frequency9.toString();
        java.lang.Object obj13 = null;
        double double14 = frequency9.getCumPct(obj13);
        double double16 = frequency9.getCumPct('a');
        double double18 = frequency9.getPct(1);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str22 = frequency19.toString();
        java.lang.Object obj23 = null;
        double double24 = frequency19.getCumPct(obj23);
        double double26 = frequency19.getCumPct('a');
        double double28 = frequency19.getCumPct((int) (byte) 100);
        frequency19.addValue((java.lang.Integer) 0);
        double double32 = frequency19.getCumPct((int) ' ');
        frequency9.addValue((java.lang.Object) double32);
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        double double36 = frequency34.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str37 = frequency34.toString();
        java.lang.Object obj38 = null;
        double double39 = frequency34.getCumPct(obj38);
        double double41 = frequency34.getCumPct('a');
        double double43 = frequency34.getPct(1);
        double double45 = frequency34.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long47 = frequency34.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double48 = frequency9.getCumPct((java.lang.Object) long47);
        double double50 = frequency9.getCumPct((int) (byte) 1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor51 = frequency9.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            long long52 = frequency0.getCumFreq((java.lang.Object) frequency9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str37, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor51);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getCumPct((java.lang.Object) 10L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        double double13 = frequency0.getCumPct((long) (short) 0);
        long long15 = frequency0.getCount((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (byte) 10);
        double double6 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        double double8 = frequency0.getPct('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency0.valuesIterator();
        long long11 = frequency0.getCount('4');
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        double double14 = frequency12.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double16 = frequency12.getCumPct((long) (short) 100);
        long long18 = frequency12.getCumFreq('#');
        frequency12.addValue((java.lang.Integer) 0);
        double double22 = frequency12.getPct((int) (byte) 10);
        long long24 = frequency12.getCount((long) 1);
        double double26 = frequency12.getCumPct((long) (short) 100);
        long long28 = frequency12.getCount((long) 0);
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        double double31 = frequency29.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long33 = frequency29.getCount((long) (short) 100);
        frequency29.clear();
        frequency29.addValue('#');
        long long37 = frequency12.getCumFreq((java.lang.Object) '#');
        double double38 = frequency0.getCumPct((java.lang.Object) long37);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double43 = frequency39.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double45 = frequency39.getPct((int) 'a');
        frequency39.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long48 = frequency39.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency();
        double double51 = frequency49.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double53 = frequency49.getCumPct((long) (short) 100);
        long long55 = frequency49.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency56 = new org.apache.commons.math.stat.Frequency();
        double double58 = frequency56.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double60 = frequency56.getCumPct((long) (short) 100);
        long long62 = frequency56.getCumFreq('#');
        boolean boolean63 = frequency49.equals((java.lang.Object) long62);
        double double65 = frequency49.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency66 = new org.apache.commons.math.stat.Frequency();
        double double68 = frequency66.getPct((java.lang.Object) (byte) -1);
        double double70 = frequency66.getPct(1);
        double double72 = frequency66.getCumPct((int) '4');
        double double74 = frequency66.getPct((long) (byte) 10);
        long long75 = frequency49.getCumFreq((java.lang.Object) (byte) 10);
        double double77 = frequency49.getCumPct(' ');
        frequency49.addValue((int) (byte) 10);
        long long81 = frequency49.getCumFreq((long) (short) 1);
        frequency49.addValue((java.lang.Integer) 1);
        double double84 = frequency39.getCumPct((java.lang.Object) 1);
        boolean boolean85 = frequency0.equals((java.lang.Object) frequency39);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        double double5 = frequency3.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double7 = frequency3.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double9 = frequency3.getPct((int) 'a');
        long long11 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double13 = frequency3.getCumPct('a');
        long long15 = frequency3.getCumFreq((int) '#');
        java.lang.String str16 = frequency3.toString();
        boolean boolean17 = frequency0.equals((java.lang.Object) str16);
        long long19 = frequency0.getCount(' ');
        double double21 = frequency0.getPct('4');
        long long23 = frequency0.getCumFreq((long) '#');
        long long25 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n100\t1\t50%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCount('a');
        double double14 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long16 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        frequency0.addValue((long) (byte) 1);
        long long20 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nNaN\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        boolean boolean20 = frequency0.equals((java.lang.Object) 10);
        java.lang.String str21 = frequency0.toString();
        double double23 = frequency0.getCumPct((int) (byte) 10);
        double double25 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double27 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        frequency0.addValue(0L);
        double double31 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor32 = frequency0.valuesIterator();
        java.lang.String str33 = frequency0.toString();
        long long35 = frequency0.getCount('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str33, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (byte) 10);
        double double6 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        double double8 = frequency0.getPct('#');
        double double10 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getPct('4');
        double double15 = frequency0.getPct(' ');
        double double17 = frequency0.getCumPct(100L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor18 = frequency0.valuesIterator();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor19 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Integer) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor18);
        org.junit.Assert.assertNotNull(wildcardComparableItor19);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        long long28 = frequency0.getCumFreq((int) ' ');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        double double33 = frequency31.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double35 = frequency31.getPct(0);
        double double37 = frequency31.getCumPct('a');
        long long39 = frequency31.getCount(1);
        double double41 = frequency31.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long42 = frequency0.getCumFreq((java.lang.Object) double41);
        long long44 = frequency0.getCumFreq((int) '4');
        double double46 = frequency0.getCumPct((long) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCumFreq('#');
        double double14 = frequency0.getPct((int) (byte) -1);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        frequency0.clear();
        long long19 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = frequency20.toString();
        java.lang.Object obj24 = null;
        double double25 = frequency20.getCumPct(obj24);
        double double27 = frequency20.getCumPct('a');
        double double29 = frequency20.getCumPct((int) (byte) 100);
        frequency20.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long33 = frequency20.getCumFreq((int) (short) 10);
        double double35 = frequency20.getCumPct((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double36 = frequency0.getCumPct((java.lang.Object) frequency20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object obj9 = null;
        long long10 = frequency0.getCumFreq(obj9);
        double double12 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1.0\t1\t100%\t100%\n");
        frequency0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (byte) 10);
        double double6 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        double double8 = frequency0.getPct((long) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getCumPct((java.lang.Object) 10L);
        long long12 = frequency0.getCount((int) (short) 1);
        double double14 = frequency0.getCumPct('#');
        long long16 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = frequency0.toString();
        double double19 = frequency0.getPct(0L);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double24 = frequency20.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double26 = frequency20.getPct((int) 'a');
        long long28 = frequency20.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double30 = frequency20.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        double double33 = frequency31.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double35 = frequency31.getCumPct((long) (short) 100);
        long long37 = frequency31.getCumFreq((long) (byte) -1);
        double double38 = frequency20.getPct((java.lang.Object) long37);
        boolean boolean40 = frequency20.equals((java.lang.Object) 10);
        java.lang.String str41 = frequency20.toString();
        double double43 = frequency20.getCumPct((int) (byte) 10);
        long long45 = frequency20.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        boolean boolean46 = frequency0.equals((java.lang.Object) frequency20);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str41, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        double double6 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        long long8 = frequency0.getCumFreq(0);
        double double10 = frequency0.getPct((long) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue(100);
        double double6 = frequency0.getPct('a');
        long long8 = frequency0.getCount(10);
        frequency0.addValue((java.lang.Integer) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        long long7 = frequency0.getCumFreq(1);
        long long9 = frequency0.getCount(10L);
        frequency0.clear();
        long long11 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        frequency0.clear();
        frequency0.addValue('#');
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double12 = frequency8.getCumPct((long) (short) 100);
        long long14 = frequency8.getCumFreq((long) (byte) -1);
        long long16 = frequency8.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long17 = frequency0.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str21 = frequency18.toString();
        java.lang.Object obj22 = null;
        double double23 = frequency18.getCumPct(obj22);
        double double25 = frequency18.getCumPct('a');
        double double27 = frequency18.getCumPct((int) (byte) 100);
        long long29 = frequency18.getCount(0L);
        double double31 = frequency18.getCumPct((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        double double34 = frequency32.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double36 = frequency32.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double38 = frequency32.getPct((int) 'a');
        frequency32.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long42 = frequency32.getCount((int) '4');
        long long44 = frequency32.getCumFreq((long) ' ');
        double double45 = frequency18.getCumPct((java.lang.Object) ' ');
        long long47 = frequency18.getCumFreq((int) (byte) -1);
        double double49 = frequency18.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        boolean boolean50 = frequency0.equals((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((int) 'a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency();
        double double3 = frequency1.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double5 = frequency1.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getCumPct((java.lang.Object) "");
        frequency0.addValue((java.lang.Integer) 1);
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double12 = frequency0.getCumPct('#');
        double double14 = frequency0.getCumPct('a');
        frequency0.addValue((long) (byte) 100);
        frequency0.addValue((long) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        boolean boolean11 = frequency0.equals((java.lang.Object) frequency10);
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        double double14 = frequency12.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long16 = frequency12.getCount((java.lang.Object) 1L);
        double double18 = frequency12.getCumPct(1);
        long long19 = frequency10.getCount((java.lang.Object) 1);
        double double21 = frequency10.getCumPct('4');
        long long23 = frequency10.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getCumPct((int) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        double double12 = frequency10.getPct((java.lang.Object) (byte) -1);
        double double14 = frequency10.getPct(1);
        double double16 = frequency10.getCumPct((int) '4');
        frequency10.addValue((long) '#');
        double double20 = frequency10.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double21 = frequency0.getPct((java.lang.Object) double20);
        long long23 = frequency0.getCumFreq(3L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor3 = frequency0.valuesIterator();
        double double5 = frequency0.getPct(' ');
        frequency0.addValue('a');
        double double9 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        java.lang.Class<?> wildcardClass10 = frequency0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(wildcardComparableItor3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        long long12 = frequency0.getCumFreq((int) '#');
        double double14 = frequency0.getCumPct((long) (short) 10);
        long long16 = frequency0.getCumFreq('4');
        long long18 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        double double20 = frequency0.getPct((int) ' ');
        long long22 = frequency0.getCount('4');
        long long24 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        java.lang.Class<?> wildcardClass25 = frequency0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        frequency0.addValue('a');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        double double13 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long15 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long20 = frequency16.getCount((java.lang.Object) 1L);
        double double22 = frequency16.getCumPct(1);
        double double24 = frequency16.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long26 = frequency16.getCount('a');
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        double double29 = frequency27.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = frequency27.toString();
        java.lang.Object obj31 = null;
        double double32 = frequency27.getCumPct(obj31);
        double double34 = frequency27.getCumPct('a');
        double double36 = frequency27.getCumPct((int) (byte) 100);
        frequency27.addValue((java.lang.Integer) 0);
        frequency16.addValue((java.lang.Object) 0);
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        double double42 = frequency40.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str43 = frequency40.toString();
        java.lang.Object obj44 = null;
        double double45 = frequency40.getCumPct(obj44);
        double double47 = frequency40.getCumPct('a');
        double double49 = frequency40.getPct(1);
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency();
        double double52 = frequency50.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str53 = frequency50.toString();
        java.lang.Object obj54 = null;
        double double55 = frequency50.getCumPct(obj54);
        double double57 = frequency50.getCumPct('a');
        double double59 = frequency50.getCumPct((int) (byte) 100);
        frequency50.addValue((java.lang.Integer) 0);
        double double63 = frequency50.getCumPct((int) ' ');
        frequency40.addValue((java.lang.Object) double63);
        long long65 = frequency16.getCount((java.lang.Object) double63);
        long long67 = frequency16.getCount((long) (short) 10);
        double double69 = frequency16.getPct((long) 1);
        boolean boolean70 = frequency0.equals((java.lang.Object) double69);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str30, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str43, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str53, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 1.0d + "'", double63 == 1.0d);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        double double6 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        long long8 = frequency0.getCumFreq(0);
        double double10 = frequency0.getCumPct((long) (short) 1);
        double double12 = frequency0.getPct(' ');
        frequency0.addValue((long) 10);
        double double16 = frequency0.getPct(0L);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double21 = frequency17.getCumPct((long) (short) 100);
        long long23 = frequency17.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double28 = frequency24.getCumPct((long) (short) 100);
        long long30 = frequency24.getCumFreq('#');
        boolean boolean31 = frequency17.equals((java.lang.Object) long30);
        double double33 = frequency17.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        double double36 = frequency34.getPct((java.lang.Object) (byte) -1);
        double double38 = frequency34.getPct(1);
        double double40 = frequency34.getCumPct((int) '4');
        double double42 = frequency34.getPct((long) (byte) 10);
        long long43 = frequency17.getCumFreq((java.lang.Object) (byte) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor44 = frequency17.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency45 = new org.apache.commons.math.stat.Frequency();
        double double47 = frequency45.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double49 = frequency45.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double51 = frequency45.getPct((long) 100);
        boolean boolean52 = frequency17.equals((java.lang.Object) frequency45);
        double double54 = frequency45.getCumPct(10L);
        double double56 = frequency45.getCumPct((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double57 = frequency0.getPct((java.lang.Object) frequency45);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor44);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        frequency0.addValue('a');
        double double12 = frequency0.getCumPct((int) 'a');
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        long long16 = frequency0.getCumFreq(0L);
        long long18 = frequency0.getCumFreq((-1));
        long long20 = frequency0.getCumFreq('a');
        double double22 = frequency0.getCumPct(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getPct(1);
        long long11 = frequency0.getCumFreq((int) (byte) -1);
        double double13 = frequency0.getCumPct((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((java.lang.Object) (byte) -1);
        double double8 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double10 = frequency0.getCumPct((java.lang.Object) (-1.0f));
        double double12 = frequency0.getPct('a');
        long long14 = frequency0.getCumFreq(' ');
        double double16 = frequency0.getCumPct((long) (byte) -1);
        long long18 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double23 = frequency19.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double25 = frequency19.getPct((int) 'a');
        long long27 = frequency19.getCount((long) (byte) 1);
        long long29 = frequency19.getCumFreq((long) 100);
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        double double32 = frequency30.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long34 = frequency30.getCount((java.lang.Object) 1L);
        long long36 = frequency30.getCumFreq('4');
        long long38 = frequency30.getCumFreq((java.lang.Object) true);
        frequency19.addValue((java.lang.Object) long38);
        long long41 = frequency19.getCount(0);
        boolean boolean42 = frequency0.equals((java.lang.Object) long41);
        double double44 = frequency0.getPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getCumPct(' ');
        java.lang.String str11 = frequency0.toString();
        long long13 = frequency0.getCount(0);
        long long15 = frequency0.getCount((long) (byte) 10);
        java.lang.String str16 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        long long3 = frequency0.getCount((int) (byte) 1);
        long long5 = frequency0.getCumFreq('4');
        long long7 = frequency0.getCount((int) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double12 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double14 = frequency8.getPct((int) 'a');
        long long16 = frequency8.getCount((long) (byte) 1);
        long long18 = frequency8.getCumFreq((long) 100);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long23 = frequency19.getCount((java.lang.Object) 1L);
        long long25 = frequency19.getCumFreq('4');
        long long27 = frequency19.getCumFreq((java.lang.Object) true);
        frequency8.addValue((java.lang.Object) long27);
        frequency8.addValue((int) (short) -1);
        long long32 = frequency8.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        long long34 = frequency8.getCumFreq(0);
        double double36 = frequency8.getPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        frequency0.addValue((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor38 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nNaN\t1\t100%\t100%\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 2L + "'", long34 == 2L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor38);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor3 = frequency0.valuesIterator();
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str8 = frequency5.toString();
        java.lang.Object obj9 = null;
        double double10 = frequency5.getCumPct(obj9);
        double double12 = frequency5.getCumPct('a');
        double double14 = frequency5.getCumPct((int) (byte) 100);
        frequency5.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double17 = frequency0.getPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double22 = frequency18.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double24 = frequency18.getPct((int) 'a');
        long long26 = frequency18.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double28 = frequency18.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        double double31 = frequency29.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double33 = frequency29.getCumPct((long) (short) 100);
        long long35 = frequency29.getCumFreq((long) (byte) -1);
        double double36 = frequency18.getPct((java.lang.Object) long35);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor37 = frequency18.valuesIterator();
        long long39 = frequency18.getCount(100);
        long long40 = frequency0.getCount((java.lang.Object) long39);
        java.lang.String str41 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(wildcardComparableItor3);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(wildcardComparableItor37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str41, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq((long) (byte) -1);
        long long8 = frequency0.getCount((long) (short) -1);
        frequency0.addValue((java.lang.Integer) 1);
        long long12 = frequency0.getCount(0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        boolean boolean11 = frequency0.equals((java.lang.Object) frequency10);
        frequency10.addValue('4');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor14 = frequency10.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardComparableItor14);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor27 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        double double30 = frequency28.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double32 = frequency28.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double34 = frequency28.getPct((long) 100);
        boolean boolean35 = frequency0.equals((java.lang.Object) frequency28);
        double double37 = frequency28.getCumPct(10L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor38 = frequency28.valuesIterator();
        frequency28.addValue((java.lang.Object) 1L);
        long long41 = frequency28.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor27);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(wildcardComparableItor38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        frequency0.clear();
        frequency0.addValue('#');
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double12 = frequency8.getCumPct((long) (short) 100);
        long long14 = frequency8.getCumFreq((long) (byte) -1);
        long long16 = frequency8.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long17 = frequency0.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double19 = frequency0.getPct((int) (byte) -1);
        long long21 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        double double23 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getPct(1);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        double double12 = frequency10.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = frequency10.toString();
        java.lang.Object obj14 = null;
        double double15 = frequency10.getCumPct(obj14);
        double double17 = frequency10.getCumPct('a');
        double double19 = frequency10.getCumPct((int) (byte) 100);
        frequency10.addValue((java.lang.Integer) 0);
        double double23 = frequency10.getCumPct((int) ' ');
        frequency0.addValue((java.lang.Object) double23);
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        double double27 = frequency25.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = frequency25.toString();
        java.lang.Object obj29 = null;
        double double30 = frequency25.getCumPct(obj29);
        double double32 = frequency25.getCumPct('a');
        double double34 = frequency25.getPct(1);
        double double36 = frequency25.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long38 = frequency25.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double39 = frequency0.getCumPct((java.lang.Object) long38);
        long long41 = frequency0.getCount(2L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((java.lang.Object) (byte) -1);
        double double8 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double10 = frequency0.getCumPct((java.lang.Object) (-1.0f));
        double double12 = frequency0.getPct('a');
        long long14 = frequency0.getCumFreq(' ');
        long long16 = frequency0.getCumFreq((int) (byte) 100);
        double double18 = frequency0.getPct((long) ' ');
        frequency0.addValue((int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getPct(0);
        double double6 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = frequency7.toString();
        java.lang.Object obj11 = null;
        double double12 = frequency7.getCumPct(obj11);
        double double14 = frequency7.getCumPct('a');
        double double16 = frequency7.getCumPct((int) (byte) 100);
        long long18 = frequency7.getCount(0L);
        double double19 = frequency0.getPct((java.lang.Object) long18);
        long long21 = frequency0.getCount(100);
        long long23 = frequency0.getCount((long) (byte) -1);
        long long24 = frequency0.getSumFreq();
        java.lang.String str25 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        long long6 = frequency0.getCumFreq('4');
        long long8 = frequency0.getCumFreq((java.lang.Object) true);
        double double10 = frequency0.getCumPct(' ');
        long long12 = frequency0.getCumFreq((int) '#');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double17 = frequency13.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double19 = frequency13.getPct((int) 'a');
        long long21 = frequency13.getCount((long) (byte) 1);
        boolean boolean22 = frequency0.equals((java.lang.Object) frequency13);
        long long24 = frequency13.getCumFreq((long) (short) 1);
        double double26 = frequency13.getCumPct((long) (short) 0);
        java.lang.String str27 = frequency13.toString();
        frequency13.addValue(1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Object) 1.0d);
        double double12 = frequency0.getPct(1);
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double18 = frequency0.getPct((java.lang.Object) "");
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double23 = frequency19.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double25 = frequency19.getPct((int) 'a');
        long long27 = frequency19.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double29 = frequency19.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        double double32 = frequency30.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double34 = frequency30.getCumPct((long) (short) 100);
        long long36 = frequency30.getCumFreq((long) (byte) -1);
        double double37 = frequency19.getPct((java.lang.Object) long36);
        boolean boolean39 = frequency19.equals((java.lang.Object) 10);
        java.lang.String str40 = frequency19.toString();
        long long42 = frequency19.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long44 = frequency19.getCount((long) (-1));
        boolean boolean45 = frequency0.equals((java.lang.Object) (-1));
        double double47 = frequency0.getPct(' ');
        long long49 = frequency0.getCumFreq(0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str40, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct(' ');
        long long18 = frequency0.getCumFreq((long) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCumFreq('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency0.valuesIterator();
        double double15 = frequency0.getCumPct(100L);
        frequency0.addValue(1L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCount((long) '#');
        long long8 = frequency0.getCount((int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        long long28 = frequency0.getCumFreq((int) ' ');
        double double30 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double32 = frequency0.getCumPct((long) (byte) 1);
        frequency0.addValue((long) (-1));
        frequency0.addValue((long) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency();
        double double39 = frequency37.getPct((java.lang.Object) (byte) -1);
        frequency37.addValue((long) (short) 100);
        long long43 = frequency37.getCount('#');
        frequency37.addValue((-1L));
        long long47 = frequency37.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nNaN\t1\t100%\t100%\n");
        // The following exception was thrown during execution in test generation
        try {
            long long48 = frequency0.getCumFreq((java.lang.Object) frequency37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        long long12 = frequency0.getCumFreq((int) '#');
        double double14 = frequency0.getCumPct((long) (short) 10);
        long long16 = frequency0.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double21 = frequency17.getCumPct((long) (short) 100);
        double double23 = frequency17.getCumPct((java.lang.Object) 0);
        boolean boolean24 = frequency0.equals((java.lang.Object) double23);
        double double26 = frequency0.getPct('4');
        long long28 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        long long30 = frequency0.getCount((int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getPct((int) (short) 100);
        double double15 = frequency0.getCumPct((int) (byte) 10);
        long long16 = frequency0.getSumFreq();
        frequency0.addValue(10);
        double double20 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (byte) 10);
        double double6 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        double double8 = frequency0.getPct('#');
        double double10 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        java.lang.Class<?> wildcardClass11 = frequency0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency();
        double double3 = frequency1.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double5 = frequency1.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getCumPct((java.lang.Object) "");
        frequency0.addValue((java.lang.Integer) 1);
        long long10 = frequency0.getCumFreq(' ');
        long long12 = frequency0.getCumFreq(10L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        double double16 = frequency14.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str17 = frequency14.toString();
        java.lang.Object obj18 = null;
        double double19 = frequency14.getCumPct(obj18);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double24 = frequency20.getCumPct((long) (short) 100);
        long long26 = frequency20.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        double double29 = frequency27.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double31 = frequency27.getCumPct((long) (short) 100);
        long long33 = frequency27.getCumFreq('#');
        boolean boolean34 = frequency20.equals((java.lang.Object) long33);
        double double36 = frequency20.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency();
        double double39 = frequency37.getPct((java.lang.Object) (byte) -1);
        double double41 = frequency37.getPct(1);
        double double43 = frequency37.getCumPct((int) '4');
        double double45 = frequency37.getPct((long) (byte) 10);
        long long46 = frequency20.getCumFreq((java.lang.Object) (byte) 10);
        long long48 = frequency20.getCumFreq((int) ' ');
        frequency20.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency();
        double double53 = frequency51.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double55 = frequency51.getPct(0);
        double double57 = frequency51.getCumPct('a');
        long long59 = frequency51.getCount(1);
        double double61 = frequency51.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long62 = frequency20.getCumFreq((java.lang.Object) double61);
        long long64 = frequency20.getCumFreq((int) '4');
        boolean boolean65 = frequency14.equals((java.lang.Object) frequency20);
        long long66 = frequency0.getCount((java.lang.Object) boolean65);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object obj9 = null;
        long long10 = frequency0.getCumFreq(obj9);
        long long12 = frequency0.getCount(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getPct((long) (byte) 10);
        double double10 = frequency0.getCumPct((-1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        long long4 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "hi!");
        long long6 = frequency0.getCumFreq('#');
        double double8 = frequency0.getCumPct((int) (short) 100);
        long long9 = frequency0.getSumFreq();
        long long11 = frequency0.getCumFreq('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        double double3 = frequency0.getCumPct('a');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        double double7 = frequency0.getPct((long) (byte) 1);
        long long9 = frequency0.getCount((int) (short) 100);
        long long11 = frequency0.getCumFreq((long) 10);
        double double13 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double12 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = frequency0.toString();
        long long15 = frequency0.getCount(1L);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = frequency16.toString();
        double double20 = frequency0.getCumPct((java.lang.Object) str19);
        long long22 = frequency0.getCount((int) (short) 100);
        long long24 = frequency0.getCount('#');
        long long26 = frequency0.getCount(0L);
        double double28 = frequency0.getCumPct(100L);
        double double30 = frequency0.getPct((long) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        double double16 = frequency14.getPct((java.lang.Object) (byte) -1);
        double double18 = frequency14.getPct(1);
        double double20 = frequency14.getCumPct((int) '4');
        frequency14.addValue((long) '#');
        double double24 = frequency14.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double26 = frequency14.getPct((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str27 = frequency14.toString();
        long long29 = frequency14.getCount(1L);
        double double31 = frequency14.getCumPct((int) (byte) 0);
        double double32 = frequency0.getCumPct((java.lang.Object) double31);
        long long34 = frequency0.getCount(1);
        long long36 = frequency0.getCount((long) (short) 100);
        double double38 = frequency0.getCumPct((int) (short) -1);
        double double40 = frequency0.getCumPct((long) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCount((long) 1);
        double double14 = frequency0.getCumPct((long) (short) 100);
        long long16 = frequency0.getCount((long) 0);
        frequency0.addValue((java.lang.Integer) 0);
        frequency0.addValue((int) '4');
        double double22 = frequency0.getCumPct('a');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor23 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor23);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        double double3 = frequency0.getCumPct('a');
        frequency0.addValue((java.lang.Integer) (-1));
        double double7 = frequency0.getPct('#');
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long12 = frequency8.getCount((java.lang.Object) 1L);
        long long14 = frequency8.getCumFreq('4');
        long long16 = frequency8.getCumFreq((java.lang.Object) true);
        java.lang.String str17 = frequency8.toString();
        long long18 = frequency8.getSumFreq();
        long long20 = frequency8.getCount('#');
        long long22 = frequency8.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        // The following exception was thrown during execution in test generation
        try {
            double double23 = frequency0.getCumPct((java.lang.Object) frequency8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        frequency0.addValue('a');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        double double14 = frequency12.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double16 = frequency12.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double17 = frequency0.getCumPct((java.lang.Object) double16);
        double double19 = frequency0.getCumPct((int) 'a');
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getPct((java.lang.Object) (byte) -1);
        double double24 = frequency20.getPct(1);
        double double26 = frequency20.getCumPct((int) '4');
        frequency20.addValue((long) '#');
        double double30 = frequency20.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double32 = frequency20.getPct((java.lang.Comparable<java.lang.String>) "");
        long long34 = frequency20.getCount('a');
        double double35 = frequency0.getPct((java.lang.Object) long34);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((java.lang.Object) (byte) -1);
        double double8 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double10 = frequency0.getCumPct((java.lang.Object) (-1.0f));
        double double12 = frequency0.getPct('a');
        long long14 = frequency0.getCumFreq(' ');
        java.lang.String str15 = frequency0.toString();
        double double17 = frequency0.getPct(1);
        long long19 = frequency0.getCumFreq(1);
        java.lang.String str20 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = frequency0.toString();
        long long11 = frequency0.getCumFreq((long) (short) -1);
        double double13 = frequency0.getPct((long) (byte) -1);
        long long15 = frequency0.getCumFreq((long) '#');
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = frequency16.toString();
        java.lang.Object obj20 = null;
        double double21 = frequency16.getCumPct(obj20);
        double double23 = frequency16.getCumPct('a');
        double double25 = frequency16.getPct(1);
        double double27 = frequency16.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long29 = frequency16.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        long long30 = frequency16.getSumFreq();
        frequency16.addValue((int) (byte) 1);
        long long34 = frequency16.getCumFreq('a');
        double double35 = frequency0.getPct((java.lang.Object) long34);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        java.lang.String str11 = frequency0.toString();
        double double13 = frequency0.getCumPct(0L);
        long long15 = frequency0.getCumFreq(100);
        double double17 = frequency0.getCumPct((int) '4');
        double double19 = frequency0.getCumPct('a');
        long long21 = frequency0.getCumFreq('4');
        long long23 = frequency0.getCount((long) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (byte) 10);
        double double6 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        double double8 = frequency0.getPct('#');
        double double10 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        frequency0.addValue((int) (byte) 1);
        double double14 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        frequency0.addValue(0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCount((long) 1);
        long long14 = frequency0.getCount(10);
        frequency0.addValue((java.lang.Integer) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getPct((int) (short) 100);
        double double15 = frequency0.getCumPct((-1));
        double double17 = frequency0.getCumPct(1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        double double8 = frequency0.getCumPct((int) (byte) 0);
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        long long12 = frequency0.getCount((int) 'a');
        double double14 = frequency0.getPct('4');
        long long16 = frequency0.getCumFreq((int) ' ');
        double double18 = frequency0.getPct(0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getCumPct((int) (byte) 100);
        long long11 = frequency0.getCount(0L);
        java.lang.String str12 = frequency0.toString();
        double double14 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str15 = frequency0.toString();
        long long17 = frequency0.getCumFreq((int) (short) 10);
        long long19 = frequency0.getCount((long) (short) 10);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double24 = frequency20.getCumPct((long) (short) 100);
        long long26 = frequency20.getCount((long) '#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor27 = frequency20.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            double double28 = frequency0.getCumPct((java.lang.Object) frequency20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor27);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        java.lang.String str5 = frequency0.toString();
        double double7 = frequency0.getPct('#');
        long long9 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        double double3 = frequency0.getCumPct('a');
        java.lang.String str4 = frequency0.toString();
        frequency0.addValue((int) (byte) 0);
        double double8 = frequency0.getPct(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str4, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        long long6 = frequency0.getCumFreq('4');
        long long8 = frequency0.getCumFreq((java.lang.Object) true);
        double double10 = frequency0.getCumPct(' ');
        long long12 = frequency0.getCumFreq((int) (byte) 1);
        frequency0.addValue((java.lang.Integer) 0);
        long long16 = frequency0.getCount((long) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        double double6 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        long long8 = frequency0.getCumFreq(0);
        double double10 = frequency0.getCumPct((long) (short) 1);
        double double12 = frequency0.getPct(' ');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getPct(0);
        double double6 = frequency0.getCumPct('a');
        long long8 = frequency0.getCount(1);
        double double10 = frequency0.getCumPct(0L);
        long long12 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long14 = frequency0.getCount((long) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        double double17 = frequency15.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency15.getCumPct((long) (short) 100);
        java.lang.String str20 = frequency15.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = frequency0.getCumFreq((java.lang.Object) frequency15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue(100);
        java.lang.String str11 = frequency0.toString();
        long long13 = frequency0.getCumFreq((long) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        frequency0.addValue('a');
        long long12 = frequency0.getCount('#');
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        double double17 = frequency15.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency15.getCumPct((long) (short) 100);
        long long21 = frequency15.getCumFreq('#');
        frequency15.addValue((java.lang.Integer) 0);
        double double25 = frequency15.getCumPct((java.lang.Object) 10L);
        long long27 = frequency15.getCount((int) (short) 1);
        double double29 = frequency15.getCumPct('#');
        long long30 = frequency0.getCumFreq((java.lang.Object) double29);
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        double double34 = frequency32.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double36 = frequency32.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double37 = frequency31.getCumPct((java.lang.Object) "");
        double double39 = frequency31.getPct((-1L));
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        double double42 = frequency40.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long44 = frequency40.getCount((java.lang.Object) 1L);
        double double46 = frequency40.getCumPct(1);
        double double48 = frequency40.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long50 = frequency40.getCount('a');
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency();
        double double53 = frequency51.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str54 = frequency51.toString();
        java.lang.Object obj55 = null;
        double double56 = frequency51.getCumPct(obj55);
        double double58 = frequency51.getCumPct('a');
        double double60 = frequency51.getCumPct((int) (byte) 100);
        frequency51.addValue((java.lang.Integer) 0);
        frequency40.addValue((java.lang.Object) 0);
        long long65 = frequency40.getCumFreq((long) (short) 1);
        double double66 = frequency31.getPct((java.lang.Object) (short) 1);
        frequency31.clear();
        double double69 = frequency31.getPct(' ');
        long long70 = frequency0.getCumFreq((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((int) (short) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str54, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((java.lang.Object) (byte) -1);
        double double8 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double10 = frequency0.getCumPct((java.lang.Object) (-1.0f));
        double double12 = frequency0.getPct('a');
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        double double17 = frequency15.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency15.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double21 = frequency15.getPct((int) 'a');
        long long23 = frequency15.getCount((long) (byte) 1);
        frequency15.addValue('a');
        long long27 = frequency15.getCount('#');
        double double29 = frequency15.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double31 = frequency15.getCumPct(1);
        frequency15.clear();
        frequency15.clear();
        long long35 = frequency15.getCount('a');
        boolean boolean36 = frequency0.equals((java.lang.Object) 'a');
        long long38 = frequency0.getCount((-1L));
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double43 = frequency39.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double45 = frequency39.getPct((int) 'a');
        frequency39.addValue((int) (byte) 1);
        frequency0.addValue((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        long long6 = frequency0.getCumFreq('4');
        long long8 = frequency0.getCumFreq((java.lang.Object) true);
        long long10 = frequency0.getCount((long) (short) 100);
        double double12 = frequency0.getCumPct('a');
        frequency0.clear();
        long long15 = frequency0.getCount((int) (byte) 100);
        long long17 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n\t1\t100%\t100%\n");
        double double19 = frequency0.getPct((long) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        long long6 = frequency0.getCumFreq('4');
        double double8 = frequency0.getPct((long) (byte) -1);
        double double10 = frequency0.getCumPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        frequency0.addValue('a');
        long long12 = frequency0.getCount('#');
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double16 = frequency0.getCumPct(1);
        java.lang.String str17 = frequency0.toString();
        long long19 = frequency0.getCumFreq((long) 'a');
        java.lang.String str20 = frequency0.toString();
        long long22 = frequency0.getCumFreq('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        double double3 = frequency0.getCumPct('a');
        long long5 = frequency0.getCumFreq('a');
        double double7 = frequency0.getPct((int) (short) -1);
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double12 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double14 = frequency8.getPct((int) 'a');
        long long16 = frequency8.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double18 = frequency8.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double23 = frequency19.getCumPct((long) (short) 100);
        long long25 = frequency19.getCumFreq((long) (byte) -1);
        double double26 = frequency8.getPct((java.lang.Object) long25);
        boolean boolean28 = frequency8.equals((java.lang.Object) 10);
        java.lang.String str29 = frequency8.toString();
        long long31 = frequency8.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        double double34 = frequency32.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str35 = frequency32.toString();
        java.lang.Object obj36 = null;
        double double37 = frequency32.getCumPct(obj36);
        double double39 = frequency32.getCumPct('a');
        double double41 = frequency32.getCumPct((int) (byte) 100);
        long long43 = frequency32.getCount(0L);
        double double44 = frequency8.getPct((java.lang.Object) long43);
        long long46 = frequency8.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double48 = frequency8.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        long long49 = frequency0.getCount((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str35, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        frequency0.addValue((long) (short) 100);
        long long6 = frequency0.getCount('#');
        frequency0.addValue((-1L));
        double double10 = frequency0.getPct(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getCumPct(' ');
        frequency0.addValue((java.lang.Integer) (-1));
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "");
        double double16 = frequency0.getCumPct((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = frequency0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.5d + "'", double16 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor3 = frequency0.valuesIterator();
        double double5 = frequency0.getPct(' ');
        double double7 = frequency0.getCumPct((int) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double12 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double14 = frequency8.getPct((int) 'a');
        long long16 = frequency8.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double18 = frequency8.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double23 = frequency19.getCumPct((long) (short) 100);
        long long25 = frequency19.getCumFreq((long) (byte) -1);
        double double26 = frequency8.getPct((java.lang.Object) long25);
        boolean boolean28 = frequency8.equals((java.lang.Object) 10);
        java.lang.String str29 = frequency8.toString();
        long long31 = frequency8.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency8.addValue((java.lang.Integer) (-1));
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        double double36 = frequency34.getPct((java.lang.Object) (byte) -1);
        double double38 = frequency34.getPct(1);
        double double40 = frequency34.getCumPct((int) '4');
        frequency34.addValue((long) '#');
        double double44 = frequency34.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double46 = frequency34.getPct((java.lang.Comparable<java.lang.String>) "");
        long long48 = frequency34.getCount('a');
        long long50 = frequency34.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        frequency8.addValue((java.lang.Object) long50);
        java.lang.String str52 = frequency8.toString();
        double double53 = frequency0.getPct((java.lang.Object) str52);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(wildcardComparableItor3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n" + "'", str52, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double53));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 10);
        java.lang.String str15 = frequency0.toString();
        long long17 = frequency0.getCumFreq((long) '4');
        double double19 = frequency0.getPct(' ');
        double double21 = frequency0.getCumPct((long) (short) 10);
        frequency0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        long long5 = frequency0.getCumFreq(0L);
        double double7 = frequency0.getPct((long) (byte) 100);
        long long8 = frequency0.getSumFreq();
        double double10 = frequency0.getCumPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getPct(1);
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        double double12 = frequency10.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str13 = frequency10.toString();
        java.lang.Object obj14 = null;
        double double15 = frequency10.getCumPct(obj14);
        double double17 = frequency10.getCumPct('a');
        double double19 = frequency10.getCumPct((int) (byte) 100);
        frequency10.addValue((java.lang.Integer) 0);
        double double23 = frequency10.getCumPct((int) ' ');
        frequency0.addValue((java.lang.Object) double23);
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        double double27 = frequency25.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double29 = frequency25.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double31 = frequency25.getPct((int) 'a');
        frequency25.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long34 = frequency25.getSumFreq();
        boolean boolean35 = frequency0.equals((java.lang.Object) frequency25);
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency();
        double double38 = frequency36.getPct((java.lang.Object) (byte) -1);
        double double40 = frequency36.getPct(1);
        boolean boolean41 = frequency0.equals((java.lang.Object) double40);
        long long43 = frequency0.getCumFreq(10L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long10 = frequency0.getCount((int) (byte) 1);
        long long12 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double14 = frequency0.getPct((int) (short) 10);
        long long16 = frequency0.getCount('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue(100);
        double double6 = frequency0.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double13 = frequency7.getPct((int) 'a');
        long long15 = frequency7.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double17 = frequency7.getCumPct('a');
        long long19 = frequency7.getCumFreq((int) '#');
        double double21 = frequency7.getCumPct((long) (short) 10);
        long long23 = frequency7.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getPct((java.lang.Object) (byte) -1);
        double double28 = frequency24.getPct(1);
        double double30 = frequency24.getCumPct((int) '4');
        frequency24.addValue((long) '#');
        long long34 = frequency24.getCount((int) ' ');
        boolean boolean35 = frequency7.equals((java.lang.Object) long34);
        long long37 = frequency7.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        double double39 = frequency7.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        java.lang.String str40 = frequency7.toString();
        long long41 = frequency0.getCumFreq((java.lang.Object) str40);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str40, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        double double12 = frequency10.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double14 = frequency10.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double16 = frequency10.getPct((int) 'a');
        long long18 = frequency10.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double20 = frequency10.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        double double23 = frequency21.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double25 = frequency21.getCumPct((long) (short) 100);
        long long27 = frequency21.getCumFreq((long) (byte) -1);
        double double28 = frequency10.getPct((java.lang.Object) long27);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor29 = frequency10.valuesIterator();
        long long31 = frequency10.getCumFreq((java.lang.Object) (byte) -1);
        long long32 = frequency0.getCount((java.lang.Object) (byte) -1);
        long long34 = frequency0.getCumFreq((long) (byte) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor35 = frequency0.valuesIterator();
        double double37 = frequency0.getCumPct(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(wildcardComparableItor29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor35);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        frequency0.addValue((long) (short) 100);
        frequency0.addValue((long) 0);
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long11 = frequency7.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        double double14 = frequency12.getPct((java.lang.Object) (byte) -1);
        double double15 = frequency7.getPct((java.lang.Object) (byte) -1);
        double double17 = frequency7.getCumPct((java.lang.Object) (-1.0f));
        double double19 = frequency7.getPct('a');
        long long21 = frequency7.getCumFreq(' ');
        double double23 = frequency7.getCumPct((long) (byte) -1);
        double double24 = frequency0.getPct((java.lang.Object) double23);
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        double double27 = frequency25.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long29 = frequency25.getCount((long) (short) 100);
        frequency25.clear();
        java.lang.Class<?> wildcardClass31 = frequency25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = frequency0.getCount((java.lang.Object) wildcardClass31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency0.addValue((java.lang.Integer) 100);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double17 = frequency13.getPct(0);
        double double19 = frequency13.getCumPct('a');
        long long21 = frequency13.getCount(1);
        double double23 = frequency13.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double25 = frequency13.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean26 = frequency0.equals((java.lang.Object) frequency13);
        long long28 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n\t1\t100%\t100%\n");
        frequency0.addValue((int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((long) 100);
        double double8 = frequency0.getPct(1L);
        frequency0.addValue(10);
        double double12 = frequency0.getPct((int) (byte) 100);
        long long14 = frequency0.getCount('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        frequency0.addValue('a');
        long long12 = frequency0.getCount('#');
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double16 = frequency0.getCumPct(1);
        frequency0.clear();
        frequency0.clear();
        long long20 = frequency0.getCumFreq(0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        frequency0.addValue((long) (short) 100);
        frequency0.addValue((long) 0);
        long long8 = frequency0.getCount('a');
        long long10 = frequency0.getCount((int) (short) 0);
        double double12 = frequency0.getPct((long) '#');
        frequency0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq((long) (byte) -1);
        frequency0.clear();
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        long long12 = frequency0.getCumFreq((int) '#');
        double double14 = frequency0.getCumPct((long) (short) 10);
        frequency0.addValue((long) (-1));
        double double18 = frequency0.getPct(0);
        double double20 = frequency0.getCumPct('#');
        java.lang.Comparable<java.lang.String> strComparable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = frequency0.getCount(strComparable21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor19 = frequency0.valuesIterator();
        long long21 = frequency0.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        double double24 = frequency22.getPct((java.lang.Object) (byte) -1);
        frequency22.addValue((long) (short) 100);
        long long28 = frequency22.getCount('#');
        double double29 = frequency0.getCumPct((java.lang.Object) '#');
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str31 = frequency30.toString();
        double double33 = frequency30.getCumPct('a');
        double double35 = frequency30.getPct((long) 100);
        frequency30.addValue((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = frequency0.getCumFreq((java.lang.Object) frequency30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardComparableItor19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str31, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        double double8 = frequency0.getPct(10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        double double6 = frequency4.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double8 = frequency4.getCumPct((long) (short) 100);
        long long10 = frequency4.getCumFreq('#');
        java.lang.Class<?> wildcardClass11 = frequency4.getClass();
        boolean boolean12 = frequency0.equals((java.lang.Object) wildcardClass11);
        frequency0.clear();
        double double15 = frequency0.getCumPct((int) (short) 0);
        double double17 = frequency0.getCumPct((int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        double double3 = frequency0.getCumPct('a');
        java.lang.String str4 = frequency0.toString();
        double double6 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = frequency7.toString();
        long long12 = frequency7.getCumFreq(0L);
        long long13 = frequency0.getCumFreq((java.lang.Object) long12);
        long long14 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        double double17 = frequency15.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double19 = frequency15.getCumPct((long) (short) 100);
        long long21 = frequency15.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        double double24 = frequency22.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double26 = frequency22.getCumPct((long) (short) 100);
        long long28 = frequency22.getCumFreq('#');
        boolean boolean29 = frequency15.equals((java.lang.Object) long28);
        double double31 = frequency15.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency();
        double double34 = frequency32.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double36 = frequency32.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double38 = frequency32.getPct((int) 'a');
        long long40 = frequency32.getCount((long) (byte) 1);
        long long42 = frequency32.getCumFreq((long) 100);
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency();
        double double45 = frequency43.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long47 = frequency43.getCount((java.lang.Object) 1L);
        long long49 = frequency43.getCumFreq('4');
        long long51 = frequency43.getCumFreq((java.lang.Object) true);
        frequency32.addValue((java.lang.Object) long51);
        org.apache.commons.math.stat.Frequency frequency53 = new org.apache.commons.math.stat.Frequency();
        double double55 = frequency53.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double57 = frequency53.getCumPct((long) (short) 100);
        long long59 = frequency53.getCumFreq('#');
        frequency53.addValue((java.lang.Integer) 0);
        double double63 = frequency53.getCumPct((java.lang.Object) 10L);
        long long65 = frequency53.getCount((int) (short) 1);
        double double67 = frequency53.getCumPct('#');
        long long69 = frequency53.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean70 = frequency32.equals((java.lang.Object) "hi!");
        frequency15.addValue((java.lang.Object) "hi!");
        boolean boolean72 = frequency0.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str4, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 1.0d + "'", double63 == 1.0d);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        long long12 = frequency0.getCumFreq((int) '#');
        double double14 = frequency0.getCumPct((long) (short) 10);
        long long16 = frequency0.getCumFreq('4');
        long long18 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        double double20 = frequency0.getPct('#');
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        double double23 = frequency21.getPct((java.lang.Object) (byte) -1);
        double double25 = frequency21.getPct(1);
        frequency0.addValue((java.lang.Object) 1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor27 = frequency0.valuesIterator();
        java.lang.String str28 = frequency0.toString();
        long long30 = frequency0.getCount((long) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(wildcardComparableItor27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object obj9 = null;
        long long10 = frequency0.getCumFreq(obj9);
        long long12 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double14 = frequency0.getCumPct((long) (short) 1);
        long long16 = frequency0.getCount((long) (byte) -1);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long20 = frequency0.getCumFreq((int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        long long3 = frequency0.getCount((int) (byte) 1);
        double double5 = frequency0.getCumPct(0L);
        long long7 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        frequency0.addValue(' ');
        double double9 = frequency0.getPct('4');
        double double11 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((java.lang.Object) (byte) -1);
        double double8 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double10 = frequency0.getCumPct((java.lang.Object) (-1.0f));
        double double12 = frequency0.getPct('a');
        long long14 = frequency0.getCumFreq(' ');
        double double16 = frequency0.getCumPct((long) (byte) -1);
        double double18 = frequency0.getCumPct('4');
        frequency0.addValue((java.lang.Integer) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor27 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        double double30 = frequency28.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double32 = frequency28.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double34 = frequency28.getPct((long) 100);
        boolean boolean35 = frequency0.equals((java.lang.Object) frequency28);
        double double37 = frequency0.getCumPct((long) (-1));
        long long39 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        double double41 = frequency0.getPct((-1L));
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor27);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCumFreq('#');
        long long14 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        double double17 = frequency15.getPct((java.lang.Object) (byte) -1);
        frequency15.addValue((long) (short) 100);
        double double21 = frequency15.getPct((int) (byte) 0);
        long long22 = frequency0.getCumFreq((java.lang.Object) double21);
        long long24 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        java.lang.String str25 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        double double28 = frequency26.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str29 = frequency26.toString();
        java.lang.Object obj30 = null;
        double double31 = frequency26.getCumPct(obj30);
        double double33 = frequency26.getCumPct('a');
        double double35 = frequency26.getPct(1);
        double double37 = frequency26.getCumPct((java.lang.Comparable<java.lang.String>) "");
        frequency26.addValue('a');
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        double double42 = frequency40.getPct((java.lang.Object) (byte) -1);
        frequency40.addValue((long) (short) 100);
        java.lang.String str45 = frequency40.toString();
        boolean boolean46 = frequency26.equals((java.lang.Object) str45);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor47 = frequency26.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency();
        double double50 = frequency48.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str51 = frequency48.toString();
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency();
        double double54 = frequency52.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double56 = frequency52.getCumPct((long) (short) 100);
        long long58 = frequency52.getCumFreq('#');
        java.lang.Class<?> wildcardClass59 = frequency52.getClass();
        boolean boolean60 = frequency48.equals((java.lang.Object) wildcardClass59);
        frequency48.clear();
        double double63 = frequency48.getCumPct((int) (short) 0);
        double double64 = frequency26.getCumPct((java.lang.Object) (short) 0);
        long long66 = frequency26.getCumFreq((long) (byte) -1);
        long long67 = frequency0.getCumFreq((java.lang.Object) long66);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str29, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str45, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardComparableItor47);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str51, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        boolean boolean10 = frequency0.equals((java.lang.Object) (byte) 0);
        frequency0.addValue('#');
        long long14 = frequency0.getCount((long) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        boolean boolean11 = frequency0.equals((java.lang.Object) frequency10);
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        double double14 = frequency12.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long16 = frequency12.getCount((java.lang.Object) 1L);
        double double18 = frequency12.getCumPct(1);
        long long19 = frequency10.getCount((java.lang.Object) 1);
        double double21 = frequency10.getCumPct('4');
        long long23 = frequency10.getCumFreq((int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getCumPct((int) (byte) 100);
        long long11 = frequency0.getCount(0L);
        frequency0.addValue((long) (byte) 0);
        long long15 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double17 = frequency0.getCumPct(10L);
        long long19 = frequency0.getCount((int) (byte) 10);
        long long21 = frequency0.getCount('a');
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        double double24 = frequency22.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double26 = frequency22.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double28 = frequency22.getPct((int) 'a');
        frequency22.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double32 = frequency22.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        double double34 = frequency22.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        long long36 = frequency22.getCount('a');
        // The following exception was thrown during execution in test generation
        try {
            long long37 = frequency0.getCumFreq((java.lang.Object) frequency22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) 100);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double20 = frequency16.getCumPct((long) (short) 100);
        long long22 = frequency16.getCumFreq('#');
        frequency16.addValue((java.lang.Integer) 0);
        double double26 = frequency16.getPct((int) (byte) 10);
        long long28 = frequency16.getCount((long) 1);
        double double30 = frequency16.getCumPct((long) ' ');
        double double31 = frequency0.getCumPct((java.lang.Object) double30);
        long long33 = frequency0.getCumFreq((int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getCumPct((int) (byte) 100);
        long long11 = frequency0.getCount(0L);
        double double13 = frequency0.getCumPct((long) (short) -1);
        long long14 = frequency0.getSumFreq();
        frequency0.addValue((int) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long21 = frequency17.getCount((java.lang.Object) 1L);
        long long23 = frequency17.getCumFreq('4');
        long long25 = frequency17.getCumFreq((java.lang.Object) true);
        double double27 = frequency17.getCumPct(' ');
        long long29 = frequency17.getCumFreq((int) '#');
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency();
        double double32 = frequency30.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double34 = frequency30.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double36 = frequency30.getPct((int) 'a');
        long long38 = frequency30.getCount((long) (byte) 1);
        boolean boolean39 = frequency17.equals((java.lang.Object) frequency30);
        long long41 = frequency30.getCumFreq((long) (short) 1);
        double double42 = frequency0.getPct((java.lang.Object) (short) 1);
        long long44 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double46 = frequency0.getPct((int) (byte) 10);
        double double48 = frequency0.getCumPct('#');
        java.lang.String str49 = frequency0.toString();
        long long51 = frequency0.getCount((int) (short) -1);
        java.lang.String str52 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str49, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str52, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        boolean boolean20 = frequency0.equals((java.lang.Object) 10);
        java.lang.String str21 = frequency0.toString();
        long long23 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double25 = frequency0.getCumPct((-1));
        frequency0.clear();
        double double28 = frequency0.getCumPct(100);
        long long30 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        long long12 = frequency0.getCumFreq((int) '#');
        double double14 = frequency0.getCumPct((long) (short) 10);
        long long16 = frequency0.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double21 = frequency17.getCumPct((long) (short) 100);
        double double23 = frequency17.getCumPct((java.lang.Object) 0);
        boolean boolean24 = frequency0.equals((java.lang.Object) double23);
        long long26 = frequency0.getCount('4');
        frequency0.addValue((java.lang.Integer) 10);
        double double30 = frequency0.getPct(0);
        double double32 = frequency0.getPct(' ');
        double double34 = frequency0.getCumPct((int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        double double8 = frequency0.getCumPct('4');
        long long10 = frequency0.getCumFreq((long) (short) 0);
        long long12 = frequency0.getCount((int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        frequency0.addValue('a');
        long long12 = frequency0.getCount('#');
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        double double17 = frequency15.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long19 = frequency15.getCount((java.lang.Object) 1L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor20 = frequency15.valuesIterator();
        boolean boolean21 = frequency0.equals((java.lang.Object) frequency15);
        double double23 = frequency15.getCumPct(100);
        double double25 = frequency15.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        double double27 = frequency15.getCumPct((long) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        frequency0.addValue('a');
        long long12 = frequency0.getCount('#');
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (byte) 10);
        double double6 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        double double8 = frequency0.getPct('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency0.valuesIterator();
        long long11 = frequency0.getCount('4');
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        double double14 = frequency12.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double16 = frequency12.getCumPct((long) (short) 100);
        long long18 = frequency12.getCumFreq('#');
        frequency12.addValue((java.lang.Integer) 0);
        double double22 = frequency12.getPct((int) (byte) 10);
        long long24 = frequency12.getCount((long) 1);
        double double26 = frequency12.getCumPct((long) (short) 100);
        long long28 = frequency12.getCount((long) 0);
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        double double31 = frequency29.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long33 = frequency29.getCount((long) (short) 100);
        frequency29.clear();
        frequency29.addValue('#');
        long long37 = frequency12.getCumFreq((java.lang.Object) '#');
        double double38 = frequency0.getCumPct((java.lang.Object) long37);
        double double40 = frequency0.getCumPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 10);
        java.lang.String str15 = frequency0.toString();
        long long17 = frequency0.getCumFreq((long) '4');
        double double19 = frequency0.getPct(' ');
        frequency0.addValue((long) (short) 1);
        long long23 = frequency0.getCumFreq((long) 0);
        java.lang.Comparable<java.lang.String> strComparable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = frequency0.getPct(strComparable24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        long long12 = frequency0.getCumFreq((int) '#');
        double double14 = frequency0.getCumPct((long) (short) 10);
        long long16 = frequency0.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double21 = frequency17.getCumPct((long) (short) 100);
        double double23 = frequency17.getCumPct((java.lang.Object) 0);
        boolean boolean24 = frequency0.equals((java.lang.Object) double23);
        double double26 = frequency0.getPct('4');
        double double28 = frequency0.getCumPct(0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        double double3 = frequency0.getCumPct('a');
        long long5 = frequency0.getCount((int) (short) 1);
        double double7 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        frequency0.addValue((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        double double8 = frequency0.getCumPct((int) (byte) 0);
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        long long12 = frequency0.getCount((int) 'a');
        double double14 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq((long) (byte) -1);
        long long8 = frequency0.getCount((long) (short) 1);
        long long10 = frequency0.getCount((long) 10);
        long long12 = frequency0.getCount((long) 10);
        double double14 = frequency0.getPct(100L);
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency();
        double double17 = frequency15.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long19 = frequency15.getCount((java.lang.Object) 1L);
        long long21 = frequency15.getCumFreq('4');
        long long23 = frequency15.getCumFreq((java.lang.Object) true);
        long long25 = frequency15.getCount((long) (short) 100);
        double double27 = frequency15.getCumPct((-1L));
        java.lang.Comparable<java.lang.String> strComparable28 = null;
        double double29 = frequency15.getPct(strComparable28);
        double double31 = frequency15.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        // The following exception was thrown during execution in test generation
        try {
            long long32 = frequency0.getCumFreq((java.lang.Object) frequency15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq((long) (byte) -1);
        long long8 = frequency0.getCount((long) (short) -1);
        long long10 = frequency0.getCumFreq(' ');
        frequency0.addValue('4');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        long long6 = frequency0.getCumFreq('4');
        long long8 = frequency0.getCumFreq((java.lang.Object) true);
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        frequency0.addValue((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCount((long) 1);
        double double14 = frequency0.getCumPct((long) (short) 100);
        long long16 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long21 = frequency17.getCount((long) (short) 100);
        frequency17.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        // The following exception was thrown during execution in test generation
        try {
            long long24 = frequency0.getCount((java.lang.Object) frequency17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor27 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        double double30 = frequency28.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double32 = frequency28.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double34 = frequency28.getPct((long) 100);
        boolean boolean35 = frequency0.equals((java.lang.Object) frequency28);
        double double37 = frequency28.getCumPct(10L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor38 = frequency28.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getPct((java.lang.Object) (byte) -1);
        frequency39.addValue((long) (short) 100);
        frequency39.addValue((long) 0);
        long long47 = frequency39.getCount((int) (short) 100);
        long long49 = frequency39.getCumFreq('a');
        long long51 = frequency39.getCumFreq('#');
        boolean boolean52 = frequency28.equals((java.lang.Object) long51);
        java.lang.Object obj53 = null;
        boolean boolean54 = frequency28.equals(obj53);
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency();
        double double57 = frequency55.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double59 = frequency55.getCumPct((long) (short) 100);
        long long61 = frequency55.getCumFreq('#');
        frequency55.addValue((java.lang.Integer) 0);
        double double65 = frequency55.getPct((int) (byte) 10);
        long long67 = frequency55.getCumFreq('#');
        double double69 = frequency55.getCumPct('4');
        java.lang.String str70 = frequency55.toString();
        double double72 = frequency55.getPct((int) (short) 100);
        boolean boolean73 = frequency28.equals((java.lang.Object) double72);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor27);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(wildcardComparableItor38);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str70, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        double double3 = frequency0.getCumPct('a');
        long long5 = frequency0.getCumFreq('a');
        long long7 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double12 = frequency8.getPct(0);
        double double14 = frequency8.getCumPct('a');
        long long16 = frequency8.getCount(1);
        double double18 = frequency8.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getPct((java.lang.Object) (byte) -1);
        frequency19.addValue((long) (short) 100);
        java.lang.String str24 = frequency19.toString();
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        double double27 = frequency25.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double29 = frequency25.getPct(0);
        double double31 = frequency25.getCumPct('a');
        long long33 = frequency25.getCount(1);
        double double35 = frequency25.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        boolean boolean36 = frequency19.equals((java.lang.Object) double35);
        frequency19.clear();
        boolean boolean38 = frequency8.equals((java.lang.Object) frequency19);
        double double40 = frequency8.getPct(' ');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor41 = frequency8.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            long long42 = frequency0.getCumFreq((java.lang.Object) frequency8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(wildcardComparableItor41);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        long long28 = frequency0.getCumFreq((int) ' ');
        frequency0.addValue('4');
        double double32 = frequency0.getCumPct((long) 'a');
        double double34 = frequency0.getPct(10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        boolean boolean20 = frequency0.equals((java.lang.Object) 10);
        java.lang.String str21 = frequency0.toString();
        long long23 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = frequency24.toString();
        java.lang.Object obj28 = null;
        double double29 = frequency24.getCumPct(obj28);
        double double31 = frequency24.getCumPct('a');
        double double33 = frequency24.getCumPct((int) (byte) 100);
        long long35 = frequency24.getCount(0L);
        double double36 = frequency0.getPct((java.lang.Object) long35);
        double double38 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        long long40 = frequency0.getCount(0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        frequency0.addValue('a');
        double double12 = frequency0.getCumPct((int) 'a');
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        long long16 = frequency0.getCumFreq(0L);
        java.lang.Class<?> wildcardClass17 = frequency0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long10 = frequency0.getCount((int) (byte) 1);
        long long12 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double14 = frequency0.getPct((int) (short) 10);
        frequency0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getPct(0);
        double double6 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = frequency7.toString();
        java.lang.Object obj11 = null;
        double double12 = frequency7.getCumPct(obj11);
        double double14 = frequency7.getCumPct('a');
        double double16 = frequency7.getCumPct((int) (byte) 100);
        long long18 = frequency7.getCount(0L);
        double double19 = frequency0.getPct((java.lang.Object) long18);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getPct((java.lang.Object) (byte) -1);
        double double24 = frequency20.getPct(1);
        double double26 = frequency20.getCumPct((int) '4');
        frequency20.addValue((long) '#');
        double double30 = frequency20.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long31 = frequency20.getSumFreq();
        double double33 = frequency20.getPct('4');
        double double35 = frequency20.getPct((long) (byte) -1);
        long long36 = frequency0.getCumFreq((java.lang.Object) (byte) -1);
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str38 = frequency37.toString();
        double double40 = frequency37.getCumPct('a');
        double double42 = frequency37.getCumPct((int) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency();
        double double45 = frequency43.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double47 = frequency43.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double49 = frequency43.getPct((int) 'a');
        frequency43.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long53 = frequency43.getCount((int) (byte) 1);
        long long55 = frequency43.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double56 = frequency37.getCumPct((java.lang.Object) long55);
        long long57 = frequency0.getCount((java.lang.Object) long55);
        double double59 = frequency0.getCumPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str38, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        frequency0.addValue((long) (short) 100);
        frequency0.addValue((long) 0);
        long long8 = frequency0.getCumFreq(' ');
        frequency0.addValue((long) 1);
        long long12 = frequency0.getCount((long) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((java.lang.Object) (byte) -1);
        double double8 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double10 = frequency0.getCumPct((java.lang.Object) (-1.0f));
        double double12 = frequency0.getPct('a');
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        double double16 = frequency14.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double18 = frequency14.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double20 = frequency14.getPct((int) 'a');
        long long22 = frequency14.getCount((long) (byte) 1);
        double double24 = frequency14.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double25 = frequency0.getPct((java.lang.Object) double24);
        frequency0.addValue('a');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getCumPct((int) (byte) 100);
        long long11 = frequency0.getCount(0L);
        double double13 = frequency0.getCumPct((long) (short) -1);
        double double15 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Integer) 1);
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long22 = frequency18.getCount((java.lang.Object) 1L);
        long long24 = frequency18.getCumFreq('4');
        long long26 = frequency18.getCumFreq((java.lang.Object) true);
        double double28 = frequency18.getCumPct(' ');
        double double30 = frequency18.getCumPct((int) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        double double33 = frequency31.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double35 = frequency31.getCumPct((long) (short) 100);
        long long37 = frequency31.getCumFreq('#');
        frequency31.addValue((java.lang.Integer) 0);
        double double41 = frequency31.getPct((int) (byte) 10);
        java.lang.String str42 = frequency31.toString();
        double double44 = frequency31.getCumPct(0L);
        long long46 = frequency31.getCumFreq(100);
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency();
        double double49 = frequency47.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double51 = frequency47.getPct(0);
        double double53 = frequency47.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency54 = new org.apache.commons.math.stat.Frequency();
        double double56 = frequency54.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str57 = frequency54.toString();
        java.lang.Object obj58 = null;
        double double59 = frequency54.getCumPct(obj58);
        double double61 = frequency54.getCumPct('a');
        double double63 = frequency54.getCumPct((int) (byte) 100);
        long long65 = frequency54.getCount(0L);
        double double66 = frequency47.getPct((java.lang.Object) long65);
        long long67 = frequency31.getCumFreq((java.lang.Object) long65);
        long long69 = frequency31.getCount((int) (short) 10);
        long long70 = frequency18.getCount((java.lang.Object) long69);
        double double72 = frequency18.getPct((long) (byte) 100);
        boolean boolean73 = frequency0.equals((java.lang.Object) frequency18);
        long long74 = frequency18.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency75 = new org.apache.commons.math.stat.Frequency();
        double double77 = frequency75.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double79 = frequency75.getCumPct((long) (short) 100);
        long long81 = frequency75.getCumFreq('#');
        double double83 = frequency75.getCumPct('4');
        double double85 = frequency75.getPct((long) 0);
        double double87 = frequency75.getPct('#');
        double double88 = frequency18.getCumPct((java.lang.Object) '#');
        double double90 = frequency18.getPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str42, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str57, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertTrue(Double.isNaN(double90));
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        frequency0.clear();
        frequency0.addValue('#');
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double12 = frequency8.getCumPct((long) (short) 100);
        long long14 = frequency8.getCumFreq((long) (byte) -1);
        long long16 = frequency8.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long17 = frequency0.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double19 = frequency0.getPct((int) (byte) -1);
        long long21 = frequency0.getCumFreq('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double12 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = frequency0.toString();
        long long15 = frequency0.getCount(1L);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = frequency16.toString();
        double double20 = frequency0.getCumPct((java.lang.Object) str19);
        long long22 = frequency0.getCumFreq((long) 'a');
        double double24 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nNaN\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        double double6 = frequency4.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double8 = frequency4.getCumPct((long) (short) 100);
        long long10 = frequency4.getCumFreq('#');
        java.lang.Class<?> wildcardClass11 = frequency4.getClass();
        boolean boolean12 = frequency0.equals((java.lang.Object) wildcardClass11);
        frequency0.addValue((int) (byte) 10);
        double double16 = frequency0.getPct((int) (short) 100);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = frequency17.toString();
        java.lang.Object obj21 = null;
        double double22 = frequency17.getCumPct(obj21);
        double double24 = frequency17.getCumPct('a');
        double double26 = frequency17.getCumPct((int) (byte) 100);
        long long28 = frequency17.getCount(0L);
        frequency17.addValue((long) (byte) 0);
        long long32 = frequency17.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double34 = frequency17.getCumPct(' ');
        long long36 = frequency17.getCount((int) (byte) 10);
        frequency0.addValue((java.lang.Object) long36);
        java.lang.Class<?> wildcardClass38 = frequency0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor19 = frequency0.valuesIterator();
        long long21 = frequency0.getCumFreq('#');
        double double23 = frequency0.getCumPct((long) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardComparableItor19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        long long3 = frequency0.getCumFreq((long) '4');
        double double5 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        frequency0.addValue((long) 'a');
        double double9 = frequency0.getCumPct((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object obj9 = null;
        long long10 = frequency0.getCumFreq(obj9);
        java.lang.Object obj11 = null;
        double double12 = frequency0.getPct(obj11);
        long long14 = frequency0.getCumFreq(1);
        double double16 = frequency0.getPct((int) (short) 10);
        double double18 = frequency0.getCumPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        double double8 = frequency0.getCumPct('4');
        long long9 = frequency0.getSumFreq();
        frequency0.addValue((java.lang.Integer) 10);
        frequency0.addValue((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass14 = frequency0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getPct(1);
        double double11 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        double double16 = frequency14.getPct((java.lang.Object) (byte) -1);
        frequency14.addValue((long) (short) 100);
        java.lang.String str19 = frequency14.toString();
        boolean boolean20 = frequency0.equals((java.lang.Object) str19);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor21 = frequency0.valuesIterator();
        double double23 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1.0\t1\t100%\t100%\n");
        double double25 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long26 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardComparableItor21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        double double5 = frequency3.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double7 = frequency3.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double9 = frequency3.getPct((int) 'a');
        long long11 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double13 = frequency3.getCumPct('a');
        long long15 = frequency3.getCumFreq((int) '#');
        java.lang.String str16 = frequency3.toString();
        boolean boolean17 = frequency0.equals((java.lang.Object) str16);
        long long19 = frequency0.getCount('4');
        frequency0.addValue((java.lang.Integer) (-1));
        long long23 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue('a');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getCumPct((java.lang.Object) 10L);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getPct((java.lang.Object) (byte) -1);
        frequency11.addValue((long) (short) 100);
        java.lang.Object obj16 = null;
        boolean boolean17 = frequency11.equals(obj16);
        frequency11.addValue((int) (short) 1);
        long long21 = frequency11.getCumFreq((int) (byte) 1);
        boolean boolean22 = frequency0.equals((java.lang.Object) frequency11);
        long long24 = frequency0.getCumFreq((long) 0);
        long long26 = frequency0.getCumFreq('4');
        double double28 = frequency0.getPct((int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        frequency0.clear();
        long long6 = frequency0.getCumFreq(1L);
        frequency0.addValue(100);
        double double10 = frequency0.getPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getCumPct((int) (byte) 100);
        frequency0.addValue((long) '#');
        long long13 = frequency0.getCumFreq((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        frequency0.addValue((long) (short) 100);
        frequency0.addValue((long) 0);
        frequency0.addValue((int) ' ');
        long long10 = frequency0.getCumFreq((-1L));
        long long12 = frequency0.getCumFreq((long) 0);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        double double16 = frequency14.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double18 = frequency14.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double19 = frequency13.getCumPct((java.lang.Object) "");
        long long21 = frequency13.getCount('4');
        long long23 = frequency13.getCumFreq('4');
        long long25 = frequency13.getCount(0L);
        long long27 = frequency13.getCumFreq(0);
        long long28 = frequency0.getCumFreq((java.lang.Object) long27);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (byte) 10);
        double double6 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        long long8 = frequency0.getCount(0);
        long long10 = frequency0.getCumFreq((int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        long long28 = frequency0.getCumFreq((int) ' ');
        frequency0.addValue('4');
        double double32 = frequency0.getPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        long long12 = frequency0.getCumFreq((int) '#');
        double double14 = frequency0.getCumPct((long) (short) 10);
        long long16 = frequency0.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double21 = frequency17.getCumPct((long) (short) 100);
        double double23 = frequency17.getCumPct((java.lang.Object) 0);
        boolean boolean24 = frequency0.equals((java.lang.Object) double23);
        frequency0.addValue((java.lang.Integer) 10);
        long long28 = frequency0.getCumFreq((long) (byte) 1);
        double double30 = frequency0.getCumPct((int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        long long10 = frequency0.getCumFreq((long) 100);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long15 = frequency11.getCount((java.lang.Object) 1L);
        long long17 = frequency11.getCumFreq('4');
        long long19 = frequency11.getCumFreq((java.lang.Object) true);
        frequency0.addValue((java.lang.Object) long19);
        double double22 = frequency0.getPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double24 = frequency0.getPct('a');
        long long26 = frequency0.getCount((long) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCumFreq('#');
        double double14 = frequency0.getCumPct('4');
        java.lang.String str15 = frequency0.toString();
        double double17 = frequency0.getPct((int) (short) 100);
        frequency0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        long long10 = frequency0.getCount((long) 0);
        long long12 = frequency0.getCumFreq('4');
        double double14 = frequency0.getCumPct((int) (byte) 10);
        frequency0.clear();
        double double17 = frequency0.getCumPct(3L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double12 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = frequency0.toString();
        long long15 = frequency0.getCount(1L);
        long long17 = frequency0.getCount('a');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double22 = frequency18.getPct(0);
        double double24 = frequency18.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        double double27 = frequency25.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = frequency25.toString();
        java.lang.Object obj29 = null;
        double double30 = frequency25.getCumPct(obj29);
        double double32 = frequency25.getCumPct('a');
        double double34 = frequency25.getCumPct((int) (byte) 100);
        long long36 = frequency25.getCount(0L);
        double double37 = frequency18.getPct((java.lang.Object) long36);
        long long39 = frequency18.getCount(100);
        boolean boolean40 = frequency0.equals((java.lang.Object) frequency18);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue(' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        long long6 = frequency0.getCumFreq('4');
        long long8 = frequency0.getCumFreq((java.lang.Object) true);
        double double10 = frequency0.getCumPct(' ');
        long long12 = frequency0.getCount(2L);
        long long14 = frequency0.getCumFreq(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        frequency0.clear();
        long long6 = frequency0.getCumFreq(1L);
        double double8 = frequency0.getPct((long) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        double double5 = frequency3.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double7 = frequency3.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double9 = frequency3.getPct((int) 'a');
        long long11 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double13 = frequency3.getCumPct('a');
        long long15 = frequency3.getCumFreq((int) '#');
        java.lang.String str16 = frequency3.toString();
        boolean boolean17 = frequency0.equals((java.lang.Object) str16);
        long long19 = frequency0.getCount('4');
        frequency0.addValue((java.lang.Integer) 100);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor22 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor22);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getPct(1);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        long long13 = frequency0.getCount((int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        double double5 = frequency0.getCumPct(0);
        long long7 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        double double9 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        double double5 = frequency3.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double7 = frequency3.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double9 = frequency3.getPct((int) 'a');
        long long11 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double13 = frequency3.getCumPct('a');
        long long15 = frequency3.getCumFreq((int) '#');
        java.lang.String str16 = frequency3.toString();
        boolean boolean17 = frequency0.equals((java.lang.Object) str16);
        long long19 = frequency0.getCumFreq((int) 'a');
        frequency0.clear();
        frequency0.addValue((int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (byte) 10);
        double double6 = frequency0.getPct(1);
        long long8 = frequency0.getCount((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        long long6 = frequency0.getCumFreq('4');
        long long8 = frequency0.getCumFreq((java.lang.Object) true);
        double double10 = frequency0.getCumPct(' ');
        long long12 = frequency0.getCumFreq((int) '#');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double17 = frequency13.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double19 = frequency13.getPct((int) 'a');
        long long21 = frequency13.getCount((long) (byte) 1);
        boolean boolean22 = frequency0.equals((java.lang.Object) frequency13);
        long long24 = frequency13.getCumFreq((long) (short) 1);
        double double26 = frequency13.getCumPct((long) (short) 0);
        double double28 = frequency13.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1.0\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        double double31 = frequency29.getPct((java.lang.Object) (byte) -1);
        frequency29.addValue((long) (short) 100);
        double double35 = frequency29.getPct((-1L));
        long long37 = frequency29.getCumFreq((int) '#');
        java.lang.String str38 = frequency29.toString();
        double double39 = frequency13.getPct((java.lang.Object) str38);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str38, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (byte) 10);
        double double6 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        double double8 = frequency0.getPct('#');
        long long10 = frequency0.getCumFreq((java.lang.Object) (short) 100);
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getPct(0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((long) 100);
        double double8 = frequency0.getPct(1L);
        frequency0.addValue('#');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str14 = frequency11.toString();
        java.lang.Object obj15 = null;
        double double16 = frequency11.getCumPct(obj15);
        double double18 = frequency11.getCumPct('a');
        double double20 = frequency11.getPct(1);
        double double22 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long24 = frequency11.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        long long25 = frequency11.getSumFreq();
        frequency11.addValue((java.lang.Integer) 1);
        long long29 = frequency11.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double31 = frequency11.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        long long33 = frequency11.getCount(10);
        double double34 = frequency0.getPct((java.lang.Object) long33);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str14, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((long) 100);
        double double8 = frequency0.getPct(1L);
        frequency0.addValue(10);
        double double12 = frequency0.getPct((int) (byte) 100);
        double double14 = frequency0.getCumPct((int) (short) 100);
        double double16 = frequency0.getPct(10);
        frequency0.addValue((long) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCumFreq('#');
        double double14 = frequency0.getCumPct('4');
        java.lang.String str15 = frequency0.toString();
        double double17 = frequency0.getCumPct((int) (short) -1);
        frequency0.addValue((int) (short) 0);
        frequency0.addValue((java.lang.Integer) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Integer) (-1));
        java.lang.String str5 = frequency0.toString();
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        frequency0.clear();
        frequency0.addValue('#');
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double12 = frequency8.getCumPct((long) (short) 100);
        long long14 = frequency8.getCumFreq((long) (byte) -1);
        long long16 = frequency8.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long17 = frequency0.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        frequency0.addValue('#');
        long long21 = frequency0.getCount('#');
        long long23 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2L + "'", long21 == 2L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        double double3 = frequency0.getCumPct('a');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        double double7 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long9 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        long long11 = frequency0.getCumFreq(2L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getCumPct((java.lang.Object) 10L);
        long long12 = frequency0.getCount((int) (short) 1);
        long long14 = frequency0.getCount((java.lang.Object) (-1L));
        long long16 = frequency0.getCount(' ');
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        frequency17.addValue((long) '#');
        double double27 = frequency17.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double29 = frequency17.getPct((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str30 = frequency17.toString();
        long long32 = frequency17.getCount(1L);
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency();
        double double35 = frequency33.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str36 = frequency33.toString();
        double double37 = frequency17.getCumPct((java.lang.Object) str36);
        long long39 = frequency17.getCount((int) (short) 100);
        long long41 = frequency17.getCount('#');
        long long43 = frequency17.getCount(' ');
        boolean boolean44 = frequency0.equals((java.lang.Object) ' ');
        java.lang.String str45 = frequency0.toString();
        java.lang.String str46 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str30, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str36, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str45, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str46, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq((long) (byte) -1);
        long long8 = frequency0.getCount((long) (short) 1);
        long long10 = frequency0.getCumFreq((int) (byte) -1);
        double double12 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        double double14 = frequency0.getCumPct((int) (short) -1);
        long long16 = frequency0.getCount('4');
        double double18 = frequency0.getCumPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        double double8 = frequency6.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency6.getCumPct((long) (short) 100);
        long long12 = frequency6.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double17 = frequency13.getCumPct((long) (short) 100);
        long long19 = frequency13.getCumFreq('#');
        boolean boolean20 = frequency6.equals((java.lang.Object) long19);
        double double22 = frequency6.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        double double25 = frequency23.getPct((java.lang.Object) (byte) -1);
        double double27 = frequency23.getPct(1);
        double double29 = frequency23.getCumPct((int) '4');
        double double31 = frequency23.getPct((long) (byte) 10);
        long long32 = frequency6.getCumFreq((java.lang.Object) (byte) 10);
        long long34 = frequency6.getCumFreq((int) ' ');
        frequency6.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency();
        double double39 = frequency37.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double41 = frequency37.getPct(0);
        double double43 = frequency37.getCumPct('a');
        long long45 = frequency37.getCount(1);
        double double47 = frequency37.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long48 = frequency6.getCumFreq((java.lang.Object) double47);
        long long50 = frequency6.getCumFreq((int) '4');
        boolean boolean51 = frequency0.equals((java.lang.Object) frequency6);
        long long53 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nNaN\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        frequency0.clear();
        double double13 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        double double15 = frequency0.getPct((int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        boolean boolean20 = frequency0.equals((java.lang.Object) 10);
        java.lang.String str21 = frequency0.toString();
        double double23 = frequency0.getCumPct((int) (byte) 10);
        double double25 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Integer) (-1));
        long long29 = frequency0.getCumFreq((int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        frequency0.addValue((long) (short) 100);
        double double6 = frequency0.getPct((int) (byte) 0);
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        double double12 = frequency0.getPct(' ');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency0.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue('#');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        long long12 = frequency0.getCumFreq((int) '#');
        double double14 = frequency0.getCumPct((long) (short) 10);
        long long16 = frequency0.getCumFreq('4');
        long long18 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        double double20 = frequency0.getPct('#');
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        double double23 = frequency21.getPct((java.lang.Object) (byte) -1);
        double double25 = frequency21.getPct(1);
        frequency0.addValue((java.lang.Object) 1);
        long long28 = frequency0.getCumFreq((long) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor29 = frequency0.valuesIterator();
        double double31 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(wildcardComparableItor29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency();
        double double3 = frequency1.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double5 = frequency1.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getCumPct((java.lang.Object) "");
        double double8 = frequency0.getPct((-1L));
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        double double11 = frequency9.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double13 = frequency9.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double15 = frequency9.getPct((int) 'a');
        frequency9.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency9.clear();
        long long20 = frequency9.getCount(100L);
        long long22 = frequency9.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        // The following exception was thrown during execution in test generation
        try {
            double double23 = frequency0.getCumPct((java.lang.Object) frequency9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        long long10 = frequency0.getCount((int) ' ');
        long long12 = frequency0.getCount((long) (short) -1);
        double double14 = frequency0.getPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency();
        double double3 = frequency1.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double5 = frequency1.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getCumPct((java.lang.Object) "");
        frequency0.addValue((java.lang.Integer) 1);
        long long10 = frequency0.getCumFreq(' ');
        long long12 = frequency0.getCumFreq(10L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency0.valuesIterator();
        frequency0.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency0.valuesIterator();
        long long17 = frequency0.getCumFreq((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        java.lang.String str11 = frequency0.toString();
        double double13 = frequency0.getCumPct(0L);
        long long15 = frequency0.getCumFreq(100);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double20 = frequency16.getPct(0);
        double double22 = frequency16.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        double double25 = frequency23.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = frequency23.toString();
        java.lang.Object obj27 = null;
        double double28 = frequency23.getCumPct(obj27);
        double double30 = frequency23.getCumPct('a');
        double double32 = frequency23.getCumPct((int) (byte) 100);
        long long34 = frequency23.getCount(0L);
        double double35 = frequency16.getPct((java.lang.Object) long34);
        long long36 = frequency0.getCumFreq((java.lang.Object) long34);
        long long38 = frequency0.getCount((int) (short) 10);
        long long40 = frequency0.getCount((int) (short) -1);
        frequency0.addValue((int) (byte) 10);
        frequency0.addValue((int) (short) 0);
        double double46 = frequency0.getPct(10L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str26, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.3333333333333333d + "'", double46 == 0.3333333333333333d);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        long long5 = frequency0.getCumFreq(0L);
        double double7 = frequency0.getPct((long) (byte) 100);
        double double9 = frequency0.getCumPct(10L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCumFreq('#');
        double double14 = frequency0.getPct((int) (byte) -1);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        frequency0.clear();
        frequency0.addValue((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor20 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor20);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        long long28 = frequency0.getCumFreq((int) ' ');
        double double30 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double32 = frequency0.getCumPct((long) (byte) 1);
        long long34 = frequency0.getCount(0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        long long6 = frequency0.getCumFreq('4');
        long long8 = frequency0.getCumFreq((java.lang.Object) true);
        double double10 = frequency0.getCumPct(' ');
        long long12 = frequency0.getCumFreq((int) '#');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double17 = frequency13.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double19 = frequency13.getPct((int) 'a');
        long long21 = frequency13.getCount((long) (byte) 1);
        boolean boolean22 = frequency0.equals((java.lang.Object) frequency13);
        frequency0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        boolean boolean20 = frequency0.equals((java.lang.Object) 10);
        java.lang.String str21 = frequency0.toString();
        long long23 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = frequency24.toString();
        java.lang.Object obj28 = null;
        double double29 = frequency24.getCumPct(obj28);
        double double31 = frequency24.getCumPct('a');
        double double33 = frequency24.getCumPct((int) (byte) 100);
        long long35 = frequency24.getCount(0L);
        double double36 = frequency0.getPct((java.lang.Object) long35);
        double double38 = frequency0.getPct(' ');
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double43 = frequency39.getCumPct((long) (short) 100);
        long long45 = frequency39.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency();
        double double48 = frequency46.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double50 = frequency46.getCumPct((long) (short) 100);
        long long52 = frequency46.getCumFreq('#');
        boolean boolean53 = frequency39.equals((java.lang.Object) long52);
        org.apache.commons.math.stat.Frequency frequency54 = new org.apache.commons.math.stat.Frequency();
        double double56 = frequency54.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long58 = frequency54.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency59 = new org.apache.commons.math.stat.Frequency();
        double double61 = frequency59.getPct((java.lang.Object) (byte) -1);
        double double62 = frequency54.getPct((java.lang.Object) (byte) -1);
        double double64 = frequency54.getCumPct((java.lang.Object) (-1.0f));
        double double66 = frequency54.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency67 = new org.apache.commons.math.stat.Frequency();
        double double69 = frequency67.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long71 = frequency67.getCount((long) (byte) 10);
        double double73 = frequency67.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        frequency54.addValue((java.lang.Object) double73);
        boolean boolean75 = frequency39.equals((java.lang.Object) double73);
        long long76 = frequency0.getCumFreq((java.lang.Object) double73);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor77 = frequency0.valuesIterator();
        double double79 = frequency0.getPct((long) 0);
        long long81 = frequency0.getCount(0L);
        double double83 = frequency0.getCumPct((int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor77);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((java.lang.Object) (byte) -1);
        double double8 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double10 = frequency0.getCumPct((java.lang.Object) (-1.0f));
        double double12 = frequency0.getPct('a');
        frequency0.addValue((java.lang.Integer) 10);
        double double16 = frequency0.getPct(100L);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str20 = frequency17.toString();
        java.lang.Object obj21 = null;
        double double22 = frequency17.getCumPct(obj21);
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency();
        double double25 = frequency23.getPct((java.lang.Object) (byte) -1);
        double double27 = frequency23.getPct(1);
        double double29 = frequency23.getCumPct((int) '4');
        frequency23.addValue((long) '#');
        double double33 = frequency23.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long34 = frequency23.getSumFreq();
        double double35 = frequency17.getPct((java.lang.Object) long34);
        double double37 = frequency17.getCumPct((long) 10);
        double double39 = frequency17.getCumPct('#');
        boolean boolean40 = frequency0.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        boolean boolean20 = frequency0.equals((java.lang.Object) 10);
        java.lang.String str21 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        double double24 = frequency22.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double26 = frequency22.getCumPct((long) (short) 100);
        long long28 = frequency22.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        double double31 = frequency29.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double33 = frequency29.getCumPct((long) (short) 100);
        long long35 = frequency29.getCumFreq('#');
        boolean boolean36 = frequency22.equals((java.lang.Object) long35);
        double double38 = frequency22.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getPct((java.lang.Object) (byte) -1);
        double double43 = frequency39.getPct(1);
        double double45 = frequency39.getCumPct((int) '4');
        double double47 = frequency39.getPct((long) (byte) 10);
        long long48 = frequency22.getCumFreq((java.lang.Object) (byte) 10);
        long long50 = frequency22.getCumFreq((int) ' ');
        frequency22.addValue((java.lang.Integer) (-1));
        double double53 = frequency0.getPct((java.lang.Object) (-1));
        frequency0.clear();
        double double56 = frequency0.getPct((long) (short) -1);
        long long58 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long60 = frequency0.getCumFreq(10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        long long10 = frequency0.getCumFreq((long) 100);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long15 = frequency11.getCount((java.lang.Object) 1L);
        long long17 = frequency11.getCumFreq('4');
        long long19 = frequency11.getCumFreq((java.lang.Object) true);
        frequency0.addValue((java.lang.Object) long19);
        double double22 = frequency0.getPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long24 = frequency0.getCumFreq('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        double double5 = frequency0.getCumPct(0);
        long long7 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double12 = frequency8.getCumPct((long) (short) 100);
        long long14 = frequency8.getCumFreq('#');
        double double16 = frequency8.getCumPct('4');
        long long17 = frequency8.getSumFreq();
        double double19 = frequency8.getCumPct((-1L));
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double24 = frequency20.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double26 = frequency20.getPct((int) 'a');
        frequency20.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency20.clear();
        double double31 = frequency20.getPct('4');
        long long32 = frequency8.getCount((java.lang.Object) double31);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor33 = frequency8.valuesIterator();
        boolean boolean34 = frequency0.equals((java.lang.Object) frequency8);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        long long28 = frequency0.getCumFreq((int) ' ');
        frequency0.addValue('4');
        double double32 = frequency0.getCumPct((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((long) (-1));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        double double8 = frequency0.getCumPct('4');
        long long9 = frequency0.getSumFreq();
        frequency0.addValue((java.lang.Integer) 0);
        double double13 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        long long15 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((long) 100);
        double double8 = frequency0.getCumPct((int) (byte) 100);
        double double10 = frequency0.getPct('4');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double22 = frequency18.getCumPct((long) (short) 100);
        long long24 = frequency18.getCumFreq('#');
        boolean boolean25 = frequency11.equals((java.lang.Object) long24);
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency();
        double double28 = frequency26.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long30 = frequency26.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        double double33 = frequency31.getPct((java.lang.Object) (byte) -1);
        double double34 = frequency26.getPct((java.lang.Object) (byte) -1);
        double double36 = frequency26.getCumPct((java.lang.Object) (-1.0f));
        double double38 = frequency26.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long43 = frequency39.getCount((long) (byte) 10);
        double double45 = frequency39.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        frequency26.addValue((java.lang.Object) double45);
        boolean boolean47 = frequency11.equals((java.lang.Object) double45);
        double double49 = frequency11.getCumPct((long) 0);
        boolean boolean50 = frequency0.equals((java.lang.Object) frequency11);
        long long52 = frequency11.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor19 = frequency0.valuesIterator();
        long long21 = frequency0.getCount(' ');
        frequency0.clear();
        long long24 = frequency0.getCumFreq('#');
        double double26 = frequency0.getCumPct((long) (byte) -1);
        double double28 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n\t1\t100%\t100%\n");
        double double30 = frequency0.getCumPct(100L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardComparableItor19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        long long10 = frequency0.getCumFreq((long) 100);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long15 = frequency11.getCount((java.lang.Object) 1L);
        long long17 = frequency11.getCumFreq('4');
        long long19 = frequency11.getCumFreq((java.lang.Object) true);
        frequency0.addValue((java.lang.Object) long19);
        frequency0.addValue((int) (short) -1);
        long long24 = frequency0.getCount(100L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getCumPct((int) (byte) 100);
        frequency0.addValue((long) '#');
        long long13 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        frequency0.addValue((java.lang.Integer) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        boolean boolean20 = frequency0.equals((java.lang.Object) 10);
        java.lang.String str21 = frequency0.toString();
        long long23 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = frequency24.toString();
        java.lang.Object obj28 = null;
        double double29 = frequency24.getCumPct(obj28);
        double double31 = frequency24.getCumPct('a');
        double double33 = frequency24.getCumPct((int) (byte) 100);
        long long35 = frequency24.getCount(0L);
        double double36 = frequency0.getPct((java.lang.Object) long35);
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency();
        double double39 = frequency37.getPct((java.lang.Object) (byte) -1);
        frequency37.addValue((long) (short) 100);
        frequency37.addValue((long) 0);
        long long45 = frequency37.getCount('a');
        boolean boolean46 = frequency0.equals((java.lang.Object) frequency37);
        java.lang.String str47 = frequency37.toString();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor48 = frequency37.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n100\t1\t50%\t100%\n" + "'", str47, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        org.junit.Assert.assertNotNull(wildcardComparableItor48);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long10 = frequency0.getCumFreq((long) ' ');
        double double12 = frequency0.getPct(0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getCumPct((int) (byte) 100);
        long long11 = frequency0.getCount(0L);
        frequency0.addValue((long) (byte) 0);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor14 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor14);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        long long3 = frequency0.getCount((int) (byte) 1);
        long long5 = frequency0.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        double double8 = frequency6.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str9 = frequency6.toString();
        long long11 = frequency6.getCumFreq(0L);
        double double12 = frequency0.getPct((java.lang.Object) 0L);
        long long14 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str9, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency();
        double double3 = frequency1.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double5 = frequency1.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getCumPct((java.lang.Object) "");
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double13 = frequency7.getPct((int) 'a');
        long long15 = frequency7.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double17 = frequency7.getCumPct('a');
        long long19 = frequency7.getCumFreq((int) '#');
        double double21 = frequency7.getCumPct((long) (short) 10);
        long long23 = frequency7.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double28 = frequency24.getCumPct((long) (short) 100);
        double double30 = frequency24.getCumPct((java.lang.Object) 0);
        boolean boolean31 = frequency7.equals((java.lang.Object) double30);
        long long33 = frequency7.getCount('4');
        frequency7.addValue((java.lang.Integer) 10);
        double double37 = frequency7.getPct(0);
        double double38 = frequency0.getCumPct((java.lang.Object) 0);
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getPct((java.lang.Object) (byte) -1);
        double double43 = frequency39.getPct(1);
        double double45 = frequency39.getCumPct((int) '4');
        frequency39.addValue((long) '#');
        double double49 = frequency39.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double51 = frequency39.getPct((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str52 = frequency39.toString();
        long long54 = frequency39.getCount(1L);
        double double56 = frequency39.getCumPct((int) (byte) 0);
        frequency0.addValue((java.lang.Object) double56);
        java.lang.String str58 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str52, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0.0\t1\t100%\t100%\n" + "'", str58, "Value \t Freq. \t Pct. \t Cum Pct. \n0.0\t1\t100%\t100%\n");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        long long12 = frequency0.getCumFreq((int) '#');
        double double14 = frequency0.getCumPct((long) (short) 10);
        long long16 = frequency0.getCumFreq('4');
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str18 = frequency17.toString();
        double double20 = frequency17.getCumPct('a');
        frequency17.addValue((java.lang.Comparable<java.lang.String>) "");
        double double24 = frequency17.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        boolean boolean25 = frequency0.equals((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        double double27 = frequency0.getPct((long) 100);
        double double29 = frequency0.getPct((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str18, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getCumPct((int) (byte) 100);
        long long11 = frequency0.getCount(0L);
        double double13 = frequency0.getCumPct((long) (short) -1);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor14 = frequency0.valuesIterator();
        long long16 = frequency0.getCount((long) '#');
        long long18 = frequency0.getCount(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(wildcardComparableItor14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        long long29 = frequency0.getSumFreq();
        long long30 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        double double33 = frequency31.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double35 = frequency31.getCumPct((long) (short) 100);
        long long37 = frequency31.getCumFreq('#');
        frequency31.addValue((java.lang.Integer) 0);
        double double41 = frequency31.getCumPct((java.lang.Object) 10L);
        frequency31.addValue(100L);
        // The following exception was thrown during execution in test generation
        try {
            double double44 = frequency0.getCumPct((java.lang.Object) frequency31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getPct(1);
        double double11 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        long long13 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        long long14 = frequency0.getSumFreq();
        frequency0.addValue((java.lang.Integer) 1);
        long long18 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double20 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        long long22 = frequency0.getCount(10);
        double double24 = frequency0.getCumPct(0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getPct(0);
        double double6 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = frequency7.toString();
        java.lang.Object obj11 = null;
        double double12 = frequency7.getCumPct(obj11);
        double double14 = frequency7.getCumPct('a');
        double double16 = frequency7.getCumPct((int) (byte) 100);
        long long18 = frequency7.getCount(0L);
        double double19 = frequency0.getPct((java.lang.Object) long18);
        long long21 = frequency0.getCount(100);
        long long23 = frequency0.getCount(0);
        long long25 = frequency0.getCumFreq(0);
        java.lang.String str26 = frequency0.toString();
        double double28 = frequency0.getPct(0L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str26, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency();
        double double3 = frequency1.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double5 = frequency1.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getCumPct((java.lang.Object) "");
        frequency0.addValue((java.lang.Integer) 1);
        long long10 = frequency0.getCumFreq(' ');
        long long12 = frequency0.getCumFreq(10L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency0.valuesIterator();
        frequency0.clear();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency0.valuesIterator();
        long long17 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long2 = frequency0.getCount((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        frequency0.addValue((long) (short) 100);
        java.lang.Object obj5 = null;
        boolean boolean6 = frequency0.equals(obj5);
        frequency0.addValue((int) (short) 1);
        long long10 = frequency0.getCumFreq((int) (byte) 1);
        double double12 = frequency0.getCumPct((int) (short) 0);
        long long14 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long16 = frequency0.getCumFreq('a');
        long long18 = frequency0.getCumFreq('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        frequency0.addValue('4');
        java.lang.String str8 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        long long28 = frequency0.getCumFreq((int) ' ');
        double double30 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double32 = frequency0.getCumPct((long) (byte) 1);
        frequency0.addValue((long) (-1));
        frequency0.addValue((long) (byte) 10);
        double double38 = frequency0.getPct(3L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        double double6 = frequency4.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double8 = frequency4.getCumPct((long) (short) 100);
        long long10 = frequency4.getCumFreq('#');
        java.lang.Class<?> wildcardClass11 = frequency4.getClass();
        boolean boolean12 = frequency0.equals((java.lang.Object) wildcardClass11);
        frequency0.clear();
        double double15 = frequency0.getCumPct((int) (short) 0);
        double double17 = frequency0.getPct((int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        java.lang.String str11 = frequency0.toString();
        double double13 = frequency0.getCumPct(0L);
        long long15 = frequency0.getCumFreq(100);
        double double17 = frequency0.getCumPct((int) '4');
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency();
        double double20 = frequency18.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double22 = frequency18.getCumPct((long) (short) 100);
        long long24 = frequency18.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency();
        double double27 = frequency25.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double29 = frequency25.getCumPct((long) (short) 100);
        long long31 = frequency25.getCumFreq('#');
        boolean boolean32 = frequency18.equals((java.lang.Object) long31);
        double double34 = frequency18.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getPct((java.lang.Object) (byte) -1);
        double double39 = frequency35.getPct(1);
        double double41 = frequency35.getCumPct((int) '4');
        double double43 = frequency35.getPct((long) (byte) 10);
        long long44 = frequency18.getCumFreq((java.lang.Object) (byte) 10);
        long long46 = frequency18.getCumFreq((int) ' ');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor47 = frequency18.valuesIterator();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor48 = frequency18.valuesIterator();
        double double50 = frequency18.getCumPct((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double51 = frequency0.getPct((java.lang.Object) frequency18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor47);
        org.junit.Assert.assertNotNull(wildcardComparableItor48);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency();
        double double5 = frequency3.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double7 = frequency3.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double9 = frequency3.getPct((int) 'a');
        long long11 = frequency3.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double13 = frequency3.getCumPct('a');
        long long15 = frequency3.getCumFreq((int) '#');
        java.lang.String str16 = frequency3.toString();
        boolean boolean17 = frequency0.equals((java.lang.Object) str16);
        long long19 = frequency0.getCount('4');
        long long20 = frequency0.getSumFreq();
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        double double23 = frequency21.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = frequency21.toString();
        java.lang.Object obj25 = null;
        double double26 = frequency21.getCumPct(obj25);
        double double28 = frequency21.getCumPct('a');
        double double30 = frequency21.getCumPct((int) (byte) 100);
        long long32 = frequency21.getCount(0L);
        double double34 = frequency21.getCumPct((long) (short) -1);
        double double36 = frequency21.getCumPct(0L);
        frequency21.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        double double39 = frequency0.getPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        boolean boolean20 = frequency0.equals((java.lang.Object) 10);
        java.lang.String str21 = frequency0.toString();
        long long23 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str27 = frequency24.toString();
        java.lang.Object obj28 = null;
        double double29 = frequency24.getCumPct(obj28);
        double double31 = frequency24.getCumPct('a');
        double double33 = frequency24.getCumPct((int) (byte) 100);
        long long35 = frequency24.getCount(0L);
        double double36 = frequency0.getPct((java.lang.Object) long35);
        long long38 = frequency0.getCount((long) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str27, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getCumPct((int) (byte) 100);
        long long11 = frequency0.getCount(0L);
        double double13 = frequency0.getCumPct((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        double double16 = frequency14.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double18 = frequency14.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double20 = frequency14.getPct((int) 'a');
        frequency14.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long24 = frequency14.getCount((int) '4');
        long long26 = frequency14.getCumFreq((long) ' ');
        double double27 = frequency0.getCumPct((java.lang.Object) ' ');
        long long29 = frequency0.getCumFreq((int) (byte) -1);
        java.lang.String str30 = frequency0.toString();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor31 = frequency0.valuesIterator();
        double double33 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str30, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor31);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 10);
        java.lang.String str15 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = frequency16.toString();
        java.lang.Object obj20 = null;
        double double21 = frequency16.getCumPct(obj20);
        double double23 = frequency16.getCumPct('a');
        double double25 = frequency16.getPct(1);
        double double26 = frequency0.getCumPct((java.lang.Object) 1);
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        double double29 = frequency27.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str30 = frequency27.toString();
        java.lang.Object obj31 = null;
        double double32 = frequency27.getCumPct(obj31);
        double double34 = frequency27.getCumPct('a');
        double double36 = frequency27.getCumPct((int) (byte) 100);
        long long38 = frequency27.getCount(0L);
        java.lang.String str39 = frequency27.toString();
        double double41 = frequency27.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double43 = frequency27.getCumPct('a');
        long long44 = frequency0.getCount((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.5d + "'", double26 == 0.5d);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str30, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str39, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getPct(0);
        double double6 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = frequency7.toString();
        java.lang.Object obj11 = null;
        double double12 = frequency7.getCumPct(obj11);
        double double14 = frequency7.getCumPct('a');
        double double16 = frequency7.getCumPct((int) (byte) 100);
        long long18 = frequency7.getCount(0L);
        double double19 = frequency0.getPct((java.lang.Object) long18);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getPct((java.lang.Object) (byte) -1);
        double double24 = frequency20.getPct(1);
        double double26 = frequency20.getCumPct((int) '4');
        frequency20.addValue((long) '#');
        double double30 = frequency20.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long31 = frequency20.getSumFreq();
        double double33 = frequency20.getPct('4');
        double double35 = frequency20.getPct((long) (byte) -1);
        long long36 = frequency0.getCumFreq((java.lang.Object) (byte) -1);
        java.lang.String str37 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str37, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        double double8 = frequency0.getCumPct(' ');
        long long10 = frequency0.getCumFreq(0);
        frequency0.addValue((long) '4');
        double double14 = frequency0.getPct((int) (short) 0);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0.0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        frequency0.addValue((long) (short) 100);
        java.lang.Object obj5 = null;
        boolean boolean6 = frequency0.equals(obj5);
        long long8 = frequency0.getCumFreq('a');
        long long10 = frequency0.getCumFreq((int) (short) -1);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long15 = frequency11.getCount((long) (short) 100);
        frequency11.addValue((long) (byte) 1);
        double double19 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Object) frequency11);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((long) (byte) 1);
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        double double11 = frequency9.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double13 = frequency9.getCumPct((long) (short) 100);
        long long15 = frequency9.getCumFreq((long) (byte) -1);
        long long16 = frequency0.getCount((java.lang.Object) (byte) -1);
        frequency0.addValue((java.lang.Integer) 1);
        frequency0.addValue((java.lang.Integer) (-1));
        double double22 = frequency0.getPct((int) (short) -1);
        long long24 = frequency0.getCount('4');
        frequency0.addValue((java.lang.Integer) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.5d + "'", double22 == 0.5d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getPct('4');
        frequency0.addValue((java.lang.Integer) 100);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double20 = frequency16.getCumPct((long) (short) 100);
        long long22 = frequency16.getCumFreq('#');
        frequency16.addValue((java.lang.Integer) 0);
        double double26 = frequency16.getPct((int) (byte) 10);
        long long28 = frequency16.getCount((long) 1);
        double double30 = frequency16.getCumPct((long) ' ');
        double double31 = frequency0.getCumPct((java.lang.Object) double30);
        double double33 = frequency0.getPct((int) ' ');
        double double35 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t50%\t50%\n100\t1\t50%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency();
        double double38 = frequency36.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str39 = frequency36.toString();
        frequency36.clear();
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        double double43 = frequency41.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long45 = frequency41.getCount((java.lang.Object) 1L);
        long long47 = frequency41.getCumFreq('4');
        double double49 = frequency41.getPct((long) (byte) -1);
        boolean boolean50 = frequency36.equals((java.lang.Object) double49);
        long long52 = frequency36.getCount(100);
        frequency36.addValue(1L);
        // The following exception was thrown during execution in test generation
        try {
            double double55 = frequency0.getCumPct((java.lang.Object) frequency36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str39, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor27 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        double double30 = frequency28.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double32 = frequency28.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double34 = frequency28.getPct((long) 100);
        boolean boolean35 = frequency0.equals((java.lang.Object) frequency28);
        double double37 = frequency0.getCumPct((long) (-1));
        long long39 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        double double41 = frequency0.getCumPct('a');
        long long43 = frequency0.getCount(100L);
        long long45 = frequency0.getCount((int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor27);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCount((long) 1);
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        long long16 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        boolean boolean20 = frequency0.equals((java.lang.Object) 10);
        java.lang.String str21 = frequency0.toString();
        double double23 = frequency0.getCumPct((int) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double28 = frequency24.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double30 = frequency24.getPct((int) 'a');
        long long32 = frequency24.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double34 = frequency24.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double39 = frequency35.getCumPct((long) (short) 100);
        long long41 = frequency35.getCumFreq((long) (byte) -1);
        double double42 = frequency24.getPct((java.lang.Object) long41);
        long long44 = frequency24.getCumFreq((int) (short) -1);
        double double45 = frequency0.getCumPct((java.lang.Object) (short) -1);
        double double47 = frequency0.getCumPct((int) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency();
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency();
        double double51 = frequency49.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double53 = frequency49.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double54 = frequency48.getCumPct((java.lang.Object) "");
        long long56 = frequency48.getCount('4');
        long long58 = frequency48.getCumFreq('4');
        long long60 = frequency48.getCumFreq((int) (short) -1);
        boolean boolean61 = frequency0.equals((java.lang.Object) long60);
        java.lang.String str62 = frequency0.toString();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor63 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str62, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(wildcardComparableItor63);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double13 = frequency7.getPct((int) 'a');
        frequency7.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long17 = frequency7.getCount((int) '4');
        long long19 = frequency7.getCumFreq((long) ' ');
        frequency0.addValue((java.lang.Object) long19);
        double double22 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        double double24 = frequency0.getPct((long) 10);
        double double26 = frequency0.getPct((long) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor27 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        double double30 = frequency28.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double32 = frequency28.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double34 = frequency28.getPct((long) 100);
        boolean boolean35 = frequency0.equals((java.lang.Object) frequency28);
        double double37 = frequency28.getCumPct(10L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor38 = frequency28.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency();
        double double41 = frequency39.getPct((java.lang.Object) (byte) -1);
        frequency39.addValue((long) (short) 100);
        frequency39.addValue((long) 0);
        long long47 = frequency39.getCount((int) (short) 100);
        long long49 = frequency39.getCumFreq('a');
        long long51 = frequency39.getCumFreq('#');
        boolean boolean52 = frequency28.equals((java.lang.Object) long51);
        long long54 = frequency28.getCount('4');
        long long56 = frequency28.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n100\t1\t50%\t100%\n\t1\t100%\t100%\n");
        double double58 = frequency28.getPct((long) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor27);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(wildcardComparableItor38);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor27 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        double double30 = frequency28.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double32 = frequency28.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double34 = frequency28.getPct((long) 100);
        boolean boolean35 = frequency0.equals((java.lang.Object) frequency28);
        double double37 = frequency0.getCumPct((long) (-1));
        long long39 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        double double41 = frequency0.getCumPct('a');
        double double43 = frequency0.getCumPct('4');
        long long45 = frequency0.getCumFreq(1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor27);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getCumPct((java.lang.Object) 10L);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getPct((java.lang.Object) (byte) -1);
        frequency11.addValue((long) (short) 100);
        java.lang.Object obj16 = null;
        boolean boolean17 = frequency11.equals(obj16);
        frequency11.addValue((int) (short) 1);
        long long21 = frequency11.getCumFreq((int) (byte) 1);
        boolean boolean22 = frequency0.equals((java.lang.Object) frequency11);
        double double24 = frequency11.getCumPct('#');
        long long26 = frequency11.getCumFreq((int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        double double6 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        long long8 = frequency0.getCount(0L);
        frequency0.addValue(1L);
        frequency0.addValue((int) 'a');
        long long14 = frequency0.getCumFreq((-1));
        double double16 = frequency0.getCumPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        long long6 = frequency0.getCumFreq('4');
        long long8 = frequency0.getCumFreq((java.lang.Object) true);
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long11 = frequency0.getSumFreq();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor12 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getPct((java.lang.Object) (byte) -1);
        double double17 = frequency13.getPct(1);
        double double19 = frequency13.getCumPct((int) '4');
        frequency13.addValue((long) '#');
        double double23 = frequency13.getCumPct(' ');
        java.lang.String str24 = frequency13.toString();
        long long26 = frequency13.getCount(0);
        long long28 = frequency13.getCount('#');
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        double double31 = frequency29.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long33 = frequency29.getCount((java.lang.Object) 1L);
        double double35 = frequency29.getCumPct(1);
        double double37 = frequency29.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long39 = frequency29.getCount('a');
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency();
        double double42 = frequency40.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str43 = frequency40.toString();
        java.lang.Object obj44 = null;
        double double45 = frequency40.getCumPct(obj44);
        double double47 = frequency40.getCumPct('a');
        double double49 = frequency40.getCumPct((int) (byte) 100);
        frequency40.addValue((java.lang.Integer) 0);
        frequency29.addValue((java.lang.Object) 0);
        boolean boolean53 = frequency13.equals((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double54 = frequency0.getCumPct((java.lang.Object) frequency13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str43, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        long long12 = frequency0.getCumFreq((int) '#');
        double double14 = frequency0.getCumPct((long) (short) 10);
        long long16 = frequency0.getCumFreq('4');
        long long18 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        double double20 = frequency0.getPct('#');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor21 = frequency0.valuesIterator();
        double double23 = frequency0.getPct((long) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(wildcardComparableItor21);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency();
        double double3 = frequency1.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double5 = frequency1.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getCumPct((java.lang.Object) "");
        frequency0.addValue((java.lang.Integer) 1);
        long long10 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "hi!");
        double double12 = frequency0.getPct('a');
        frequency0.addValue((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            frequency0.addValue((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        long long28 = frequency0.getCumFreq((int) ' ');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        double double33 = frequency31.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double35 = frequency31.getPct(0);
        double double37 = frequency31.getCumPct('a');
        long long39 = frequency31.getCount(1);
        double double41 = frequency31.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long42 = frequency0.getCumFreq((java.lang.Object) double41);
        long long44 = frequency0.getCumFreq((int) '4');
        long long45 = frequency0.getSumFreq();
        java.lang.Comparable<java.lang.String> strComparable46 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double47 = frequency0.getCumPct(strComparable46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        long long16 = frequency0.getCumFreq(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        double double6 = frequency4.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double8 = frequency4.getCumPct((long) (short) 100);
        long long10 = frequency4.getCumFreq('#');
        java.lang.Class<?> wildcardClass11 = frequency4.getClass();
        boolean boolean12 = frequency0.equals((java.lang.Object) wildcardClass11);
        frequency0.clear();
        double double15 = frequency0.getCumPct((int) (short) 0);
        frequency0.addValue('4');
        double double19 = frequency0.getPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue(100);
        frequency0.addValue((java.lang.Integer) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        java.lang.String str11 = frequency0.toString();
        java.lang.String str12 = frequency0.toString();
        long long14 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct(' ');
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency17.addValue((java.lang.Object) 1.0d);
        long long28 = frequency0.getCount((java.lang.Object) 1.0d);
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency();
        double double31 = frequency29.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double33 = frequency29.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double35 = frequency29.getPct((long) 100);
        double double37 = frequency29.getPct(1L);
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency();
        double double40 = frequency38.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double42 = frequency38.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double44 = frequency38.getPct((int) 'a');
        long long46 = frequency38.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double48 = frequency38.getCumPct('a');
        long long50 = frequency38.getCumFreq((int) '#');
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency();
        double double53 = frequency51.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency51.addValue((java.lang.Integer) (-1));
        long long57 = frequency51.getCumFreq('4');
        long long58 = frequency38.getCumFreq((java.lang.Object) long57);
        double double59 = frequency29.getPct((java.lang.Object) long58);
        long long61 = frequency29.getCount('a');
        double double63 = frequency29.getCumPct('a');
        long long64 = frequency0.getCumFreq((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 10);
        java.lang.String str15 = frequency0.toString();
        long long17 = frequency0.getCount((long) (short) 1);
        java.lang.String str18 = frequency0.toString();
        long long20 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n" + "'", str18, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        long long8 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double10 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        double double13 = frequency11.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double15 = frequency11.getCumPct((long) (short) 100);
        long long17 = frequency11.getCumFreq((long) (byte) -1);
        double double18 = frequency0.getPct((java.lang.Object) long17);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor19 = frequency0.valuesIterator();
        long long21 = frequency0.getCount(' ');
        double double23 = frequency0.getPct('#');
        double double25 = frequency0.getPct((int) '#');
        long long27 = frequency0.getCount(0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardComparableItor19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getPct(1);
        double double11 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        frequency0.addValue('a');
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        double double16 = frequency14.getPct((java.lang.Object) (byte) -1);
        frequency14.addValue((long) (short) 100);
        java.lang.String str19 = frequency14.toString();
        boolean boolean20 = frequency0.equals((java.lang.Object) str19);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor21 = frequency0.valuesIterator();
        double double23 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1.0\t1\t100%\t100%\n");
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency();
        double double26 = frequency24.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double28 = frequency24.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double30 = frequency24.getPct((int) 'a');
        long long32 = frequency24.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double34 = frequency24.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency();
        double double37 = frequency35.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double39 = frequency35.getCumPct((long) (short) 100);
        long long41 = frequency35.getCumFreq((long) (byte) -1);
        double double42 = frequency24.getPct((java.lang.Object) long41);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor43 = frequency24.valuesIterator();
        long long45 = frequency24.getCount(100);
        long long47 = frequency24.getCumFreq(0L);
        double double49 = frequency24.getPct(' ');
        java.lang.String str50 = frequency24.toString();
        long long51 = frequency0.getCount((java.lang.Object) str50);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardComparableItor21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(wildcardComparableItor43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str50, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((java.lang.Object) (byte) -1);
        double double8 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double10 = frequency0.getCumPct((java.lang.Object) (-1.0f));
        double double12 = frequency0.getPct('a');
        double double14 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
        long long16 = frequency0.getCumFreq((long) (short) -1);
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long21 = frequency17.getCount((java.lang.Object) 1L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor22 = frequency17.valuesIterator();
        long long24 = frequency17.getCumFreq(1);
        long long26 = frequency17.getCount(10L);
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        double double29 = frequency27.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double31 = frequency27.getCumPct((long) (short) 100);
        long long33 = frequency27.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency();
        double double36 = frequency34.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double38 = frequency34.getCumPct((long) (short) 100);
        long long40 = frequency34.getCumFreq('#');
        boolean boolean41 = frequency27.equals((java.lang.Object) long40);
        boolean boolean42 = frequency17.equals((java.lang.Object) long40);
        boolean boolean43 = frequency0.equals((java.lang.Object) long40);
        double double45 = frequency0.getCumPct((int) (byte) 10);
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency();
        frequency46.addValue((long) (-1));
        boolean boolean49 = frequency0.equals((java.lang.Object) frequency46);
        double double51 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((int) 'a');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor9 = frequency0.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency();
        boolean boolean11 = frequency0.equals((java.lang.Object) frequency10);
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency();
        double double14 = frequency12.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long16 = frequency12.getCount((java.lang.Object) 1L);
        double double18 = frequency12.getCumPct(1);
        long long19 = frequency10.getCount((java.lang.Object) 1);
        frequency10.addValue(2L);
        long long23 = frequency10.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        double double7 = frequency0.getCumPct('a');
        double double9 = frequency0.getPct(1);
        double double11 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double13 = frequency0.getPct((int) (byte) 100);
        long long15 = frequency0.getCumFreq((int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency();
        double double3 = frequency1.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double5 = frequency1.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getCumPct((java.lang.Object) "");
        double double8 = frequency0.getPct((-1L));
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency();
        double double11 = frequency9.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long13 = frequency9.getCount((java.lang.Object) 1L);
        double double15 = frequency9.getCumPct(1);
        double double17 = frequency9.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long19 = frequency9.getCount('a');
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str23 = frequency20.toString();
        java.lang.Object obj24 = null;
        double double25 = frequency20.getCumPct(obj24);
        double double27 = frequency20.getCumPct('a');
        double double29 = frequency20.getCumPct((int) (byte) 100);
        frequency20.addValue((java.lang.Integer) 0);
        frequency9.addValue((java.lang.Object) 0);
        long long34 = frequency9.getCumFreq((long) (short) 1);
        double double35 = frequency0.getPct((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass36 = frequency0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue(100);
        double double6 = frequency0.getPct(' ');
        long long8 = frequency0.getCumFreq(100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (byte) 10);
        double double6 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        double double8 = frequency0.getPct('#');
        long long10 = frequency0.getCumFreq((java.lang.Object) (short) 100);
        frequency0.clear();
        long long13 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue((java.lang.Integer) (-1));
        java.lang.String str5 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        double double8 = frequency6.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long10 = frequency6.getCount((long) (short) 100);
        frequency6.addValue('4');
        boolean boolean13 = frequency0.equals((java.lang.Object) '4');
        double double15 = frequency0.getCumPct((long) (byte) 100);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double20 = frequency16.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double22 = frequency16.getPct((int) 'a');
        long long24 = frequency16.getCount((long) (byte) 1);
        frequency16.addValue('a');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor27 = frequency16.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency();
        double double30 = frequency28.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double32 = frequency28.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double33 = frequency16.getCumPct((java.lang.Object) double32);
        double double34 = frequency0.getPct((java.lang.Object) double33);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor27);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        double double8 = frequency0.getCumPct('4');
        long long9 = frequency0.getSumFreq();
        double double11 = frequency0.getCumPct((-1L));
        long long12 = frequency0.getSumFreq();
        long long14 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n\t1\t100%\t100%\n");
        long long18 = frequency0.getCount((-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getPct((long) 100);
        double double8 = frequency0.getPct(1L);
        frequency0.addValue(10);
        double double12 = frequency0.getPct((int) (byte) 100);
        double double14 = frequency0.getPct(3L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        long long28 = frequency0.getCumFreq((int) ' ');
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        long long32 = frequency0.getCount((int) (byte) 100);
        long long34 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        java.lang.String str11 = frequency0.toString();
        double double13 = frequency0.getCumPct(0L);
        long long15 = frequency0.getCumFreq(100);
        double double17 = frequency0.getCumPct((int) '4');
        double double19 = frequency0.getPct(' ');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor20 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor20);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        java.lang.String str5 = frequency0.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCumFreq('#');
        double double14 = frequency0.getPct((int) (byte) -1);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        frequency0.clear();
        frequency0.addValue((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        frequency0.clear();
        long long22 = frequency0.getCount((long) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long11 = frequency0.getSumFreq();
        double double13 = frequency0.getPct('4');
        double double15 = frequency0.getPct(' ');
        double double17 = frequency0.getCumPct(100L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor18 = frequency0.valuesIterator();
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor19 = frequency0.valuesIterator();
        double double21 = frequency0.getCumPct(' ');
        double double23 = frequency0.getCumPct((long) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor18);
        org.junit.Assert.assertNotNull(wildcardComparableItor19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((java.lang.Object) (byte) -1);
        double double8 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double10 = frequency0.getCumPct((java.lang.Object) (-1.0f));
        double double12 = frequency0.getPct('a');
        long long14 = frequency0.getCumFreq(' ');
        double double16 = frequency0.getCumPct((long) (byte) -1);
        long long18 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double23 = frequency19.getCumPct((long) (short) 100);
        long long25 = frequency19.getCumFreq('#');
        frequency0.addValue((java.lang.Object) '#');
        frequency0.addValue(' ');
        double double30 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double32 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long34 = frequency0.getCount('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency();
        double double7 = frequency5.getPct((java.lang.Object) (byte) -1);
        double double8 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double10 = frequency0.getCumPct((java.lang.Object) (-1.0f));
        double double12 = frequency0.getPct('a');
        frequency0.clear();
        boolean boolean15 = frequency0.equals((java.lang.Object) 1.0d);
        double double17 = frequency0.getPct((long) 0);
        frequency0.addValue((java.lang.Integer) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        long long28 = frequency0.getCumFreq((int) ' ');
        double double30 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        double double32 = frequency0.getCumPct((long) (byte) 1);
        double double34 = frequency0.getCumPct((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        frequency0.addValue((long) '#');
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double12 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str13 = frequency0.toString();
        long long15 = frequency0.getCount(1L);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        double double18 = frequency16.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str19 = frequency16.toString();
        double double20 = frequency0.getCumPct((java.lang.Object) str19);
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency();
        double double24 = frequency22.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double26 = frequency22.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double28 = frequency22.getPct((int) 'a');
        frequency22.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long32 = frequency22.getCount((int) '4');
        boolean boolean33 = frequency0.equals((java.lang.Object) '4');
        double double35 = frequency0.getCumPct(10);
        double double37 = frequency0.getPct('#');
        double double39 = frequency0.getCumPct(3L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n35\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq((long) (byte) -1);
        long long8 = frequency0.getCount((long) (short) 1);
        long long10 = frequency0.getCount((long) 10);
        long long12 = frequency0.getCount((long) 10);
        long long14 = frequency0.getCumFreq(0L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor15 = frequency0.valuesIterator();
        frequency0.addValue('a');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor15);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        double double3 = frequency0.getCumPct('a');
        java.lang.String str4 = frequency0.toString();
        double double6 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = frequency7.toString();
        long long12 = frequency7.getCumFreq(0L);
        long long13 = frequency0.getCumFreq((java.lang.Object) long12);
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        double double16 = frequency14.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double18 = frequency14.getCumPct((long) (short) 100);
        long long20 = frequency14.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency();
        double double23 = frequency21.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double25 = frequency21.getCumPct((long) (short) 100);
        long long27 = frequency21.getCumFreq('#');
        boolean boolean28 = frequency14.equals((java.lang.Object) long27);
        double double30 = frequency14.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        double double33 = frequency31.getPct((java.lang.Object) (byte) -1);
        double double35 = frequency31.getPct(1);
        double double37 = frequency31.getCumPct((int) '4');
        double double39 = frequency31.getPct((long) (byte) 10);
        long long40 = frequency14.getCumFreq((java.lang.Object) (byte) 10);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor41 = frequency14.valuesIterator();
        long long43 = frequency14.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        long long45 = frequency14.getCount((long) (-1));
        frequency0.addValue((java.lang.Object) long45);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str4, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getPct((int) (byte) 10);
        long long12 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 10);
        java.lang.String str15 = frequency0.toString();
        long long17 = frequency0.getCumFreq((long) '4');
        double double19 = frequency0.getPct(' ');
        frequency0.addValue((long) (short) 1);
        frequency0.addValue((int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n" + "'", str15, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency();
        double double3 = frequency1.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double5 = frequency1.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double6 = frequency0.getCumPct((java.lang.Object) "");
        frequency0.clear();
        long long9 = frequency0.getCumFreq('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        frequency0.addValue((long) (short) 100);
        java.lang.String str5 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        double double8 = frequency6.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency6.getPct(0);
        double double12 = frequency6.getCumPct('a');
        long long14 = frequency6.getCount(1);
        double double16 = frequency6.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        boolean boolean17 = frequency0.equals((java.lang.Object) double16);
        frequency0.clear();
        long long20 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        long long22 = frequency0.getCount(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.lang.String str1 = frequency0.toString();
        long long3 = frequency0.getCount((int) (byte) 1);
        long long5 = frequency0.getCumFreq('4');
        long long7 = frequency0.getCount((int) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double12 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double14 = frequency8.getPct((int) 'a');
        long long16 = frequency8.getCount((long) (byte) 1);
        long long18 = frequency8.getCumFreq((long) 100);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long23 = frequency19.getCount((java.lang.Object) 1L);
        long long25 = frequency19.getCumFreq('4');
        long long27 = frequency19.getCumFreq((java.lang.Object) true);
        frequency8.addValue((java.lang.Object) long27);
        frequency8.addValue((int) (short) -1);
        long long32 = frequency8.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        long long34 = frequency8.getCumFreq(0);
        double double36 = frequency8.getPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        frequency0.addValue((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        java.lang.String str38 = frequency0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str1, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 2L + "'", long34 == 2L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n\t1\t100%\t100%\n" + "'", str38, "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n\t1\t100%\t100%\n");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Object) (byte) -1);
        double double4 = frequency0.getPct(1);
        double double6 = frequency0.getCumPct((int) '4');
        double double8 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency0.addValue(100);
        frequency0.addValue((long) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        long long6 = frequency0.getCumFreq('4');
        long long8 = frequency0.getCumFreq((java.lang.Object) true);
        double double10 = frequency0.getCumPct(' ');
        long long12 = frequency0.getCumFreq((int) '#');
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long17 = frequency13.getCount((java.lang.Object) 1L);
        double double19 = frequency13.getCumPct(1);
        double double21 = frequency13.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double23 = frequency13.getPct((java.lang.Comparable<java.lang.String>) "");
        frequency13.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        double double26 = frequency0.getPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getPct(0);
        double double6 = frequency0.getCumPct('a');
        long long8 = frequency0.getCount(1);
        double double10 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency0.addValue('#');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        long long6 = frequency0.getCumFreq('4');
        long long8 = frequency0.getCumFreq((java.lang.Object) true);
        long long10 = frequency0.getCount((long) (short) 100);
        double double12 = frequency0.getCumPct((-1L));
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        double double14 = frequency0.getPct(strComparable13);
        frequency0.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1.0\t1\t100%\t100%\n");
        long long17 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        double double6 = frequency4.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double8 = frequency4.getCumPct((long) (short) 100);
        long long10 = frequency4.getCumFreq('#');
        java.lang.Class<?> wildcardClass11 = frequency4.getClass();
        boolean boolean12 = frequency0.equals((java.lang.Object) wildcardClass11);
        frequency0.clear();
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency();
        double double16 = frequency14.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double18 = frequency14.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double20 = frequency14.getPct((int) 'a');
        long long22 = frequency14.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double24 = frequency14.getCumPct('a');
        long long26 = frequency14.getCumFreq((int) '#');
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency();
        double double29 = frequency27.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        frequency27.addValue((java.lang.Integer) (-1));
        long long33 = frequency27.getCumFreq('4');
        long long34 = frequency14.getCumFreq((java.lang.Object) long33);
        // The following exception was thrown during execution in test generation
        try {
            double double35 = frequency0.getCumPct((java.lang.Object) frequency14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.math.stat.Frequency cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency();
        double double6 = frequency4.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double8 = frequency4.getCumPct((long) (short) 100);
        long long10 = frequency4.getCumFreq('#');
        java.lang.Class<?> wildcardClass11 = frequency4.getClass();
        boolean boolean12 = frequency0.equals((java.lang.Object) wildcardClass11);
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        double double15 = frequency13.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str16 = frequency13.toString();
        long long18 = frequency13.getCumFreq(0L);
        long long19 = frequency0.getCumFreq((java.lang.Object) 0L);
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency();
        double double22 = frequency20.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double24 = frequency20.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double26 = frequency20.getPct((int) 'a');
        long long28 = frequency20.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double30 = frequency20.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency();
        double double33 = frequency31.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double35 = frequency31.getCumPct((long) (short) 100);
        long long37 = frequency31.getCumFreq((long) (byte) -1);
        double double38 = frequency20.getPct((java.lang.Object) long37);
        boolean boolean40 = frequency20.equals((java.lang.Object) 10);
        long long42 = frequency20.getCumFreq((java.lang.Comparable<java.lang.String>) "");
        boolean boolean43 = frequency0.equals((java.lang.Object) "");
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency();
        double double46 = frequency44.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double48 = frequency44.getCumPct((long) (short) 100);
        long long50 = frequency44.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency();
        double double53 = frequency51.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double55 = frequency51.getCumPct((long) (short) 100);
        long long57 = frequency51.getCumFreq('#');
        boolean boolean58 = frequency44.equals((java.lang.Object) long57);
        double double60 = frequency44.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency61 = new org.apache.commons.math.stat.Frequency();
        double double63 = frequency61.getPct((java.lang.Object) (byte) -1);
        double double65 = frequency61.getPct(1);
        double double67 = frequency61.getCumPct((int) '4');
        double double69 = frequency61.getPct((long) (byte) 10);
        long long70 = frequency44.getCumFreq((java.lang.Object) (byte) 10);
        double double72 = frequency44.getCumPct(' ');
        frequency44.addValue((int) (byte) 10);
        double double76 = frequency44.getPct((java.lang.Object) (-1.0f));
        org.apache.commons.math.stat.Frequency frequency77 = new org.apache.commons.math.stat.Frequency();
        double double79 = frequency77.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double81 = frequency77.getCumPct((java.lang.Comparable<java.lang.String>) "");
        double double83 = frequency77.getPct((int) 'a');
        long long85 = frequency77.getCount((long) (byte) 1);
        long long87 = frequency77.getCumFreq((long) 100);
        frequency77.addValue((int) (byte) -1);
        double double90 = frequency44.getPct((java.lang.Object) (byte) -1);
        boolean boolean91 = frequency0.equals((java.lang.Object) double90);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((long) (short) 100);
        frequency0.clear();
        frequency0.addValue('#');
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency();
        double double10 = frequency8.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double12 = frequency8.getCumPct((long) (short) 100);
        long long14 = frequency8.getCumFreq((long) (byte) -1);
        long long16 = frequency8.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        long long17 = frequency0.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        frequency0.addValue('#');
        long long21 = frequency0.getCount((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = frequency0.toString();
        java.lang.Object obj4 = null;
        double double5 = frequency0.getCumPct(obj4);
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        double double8 = frequency6.getPct((java.lang.Object) (byte) -1);
        double double10 = frequency6.getPct(1);
        double double12 = frequency6.getCumPct((int) '4');
        frequency6.addValue((long) '#');
        double double16 = frequency6.getPct((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long17 = frequency6.getSumFreq();
        double double18 = frequency0.getPct((java.lang.Object) long17);
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency();
        double double21 = frequency19.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double23 = frequency19.getCumPct((long) (short) 100);
        long long25 = frequency19.getCumFreq((long) (byte) -1);
        long long27 = frequency19.getCount((long) (short) 1);
        long long29 = frequency19.getCount((java.lang.Object) 10.0d);
        frequency19.addValue((int) '4');
        long long32 = frequency0.getCount((java.lang.Object) '4');
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor33 = frequency0.valuesIterator();
        long long35 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str3, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double11 = frequency7.getCumPct((long) (short) 100);
        long long13 = frequency7.getCumFreq('#');
        boolean boolean14 = frequency0.equals((java.lang.Object) long13);
        double double16 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "");
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency();
        double double19 = frequency17.getPct((java.lang.Object) (byte) -1);
        double double21 = frequency17.getPct(1);
        double double23 = frequency17.getCumPct((int) '4');
        double double25 = frequency17.getPct((long) (byte) 10);
        long long26 = frequency0.getCumFreq((java.lang.Object) (byte) 10);
        long long28 = frequency0.getCumFreq(0L);
        frequency0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        frequency0.addValue((java.lang.Integer) 0);
        double double10 = frequency0.getCumPct((java.lang.Object) 10L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor11 = frequency0.valuesIterator();
        long long12 = frequency0.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardComparableItor11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getPct(0);
        double double6 = frequency0.getCumPct('a');
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency();
        double double9 = frequency7.getPct((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str10 = frequency7.toString();
        java.lang.Object obj11 = null;
        double double12 = frequency7.getCumPct(obj11);
        double double14 = frequency7.getCumPct('a');
        double double16 = frequency7.getCumPct((int) (byte) 100);
        long long18 = frequency7.getCount(0L);
        double double19 = frequency0.getPct((java.lang.Object) long18);
        long long21 = frequency0.getCount(100);
        double double23 = frequency0.getPct((int) (short) 100);
        double double25 = frequency0.getPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        double double4 = frequency0.getCumPct((long) (short) 100);
        long long6 = frequency0.getCumFreq('#');
        double double8 = frequency0.getCumPct((int) (byte) 0);
        long long10 = frequency0.getCount((long) '4');
        double double12 = frequency0.getPct((-1));
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor13 = frequency0.valuesIterator();
        long long15 = frequency0.getCumFreq((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardComparableItor13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getCumPct((java.lang.Comparable<java.lang.String>) "hi!");
        long long4 = frequency0.getCount((java.lang.Object) 1L);
        java.util.Iterator<java.lang.Comparable<?>> wildcardComparableItor5 = frequency0.valuesIterator();
        long long7 = frequency0.getCumFreq(1);
        long long9 = frequency0.getCount(10L);
        frequency0.clear();
        long long12 = frequency0.getCount((int) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardComparableItor5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }
}

