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
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        long long9 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((int) (short) 0);
        double double17 = frequency11.getCumPct(1L);
        long long19 = frequency11.getCumFreq((java.lang.Object) 10.0d);
        frequency11.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long23 = frequency11.getCount((java.lang.Object) 1.0f);
        double double25 = frequency11.getCumPct((long) (byte) -1);
        double double27 = frequency11.getPct((int) (short) 0);
        java.util.Comparator comparator28 = null;
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency(comparator28);
        double double31 = frequency29.getCumPct((java.lang.Object) (short) -1);
        long long33 = frequency29.getCumFreq(' ');
        double double35 = frequency29.getPct(1L);
        frequency29.addValue((long) 10);
        long long38 = frequency11.getCumFreq((java.lang.Object) frequency29);
        double double39 = frequency1.getPct((java.lang.Object) frequency29);
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        long long43 = frequency41.getCount((java.lang.Object) 100.0f);
        frequency41.addValue((int) '#');
        long long47 = frequency41.getCumFreq('a');
        long long49 = frequency41.getCount((long) 0);
        long long50 = frequency29.getCumFreq((java.lang.Object) 0);
        frequency29.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        long long9 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount((java.lang.Object) 100.0f);
        long long16 = frequency13.getSumFreq();
        long long17 = frequency13.getSumFreq();
        long long19 = frequency13.getCount((java.lang.Object) "");
        double double21 = frequency13.getPct((int) (short) 100);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        long long25 = frequency23.getCount((java.lang.Object) 100.0f);
        long long27 = frequency23.getCount((int) (short) 0);
        double double29 = frequency23.getCumPct(1L);
        long long31 = frequency23.getCumFreq((java.lang.Object) 10.0d);
        double double32 = frequency13.getCumPct((java.lang.Object) long31);
        double double34 = frequency13.getPct(1);
        long long36 = frequency13.getCount(' ');
        frequency13.addValue(10L);
        long long40 = frequency13.getCount(100);
        long long41 = frequency1.getCount((java.lang.Object) frequency13);
        long long43 = frequency13.getCount((long) 0);
        long long45 = frequency13.getCumFreq((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        long long12 = frequency10.getCount((java.lang.Object) 100.0f);
        long long14 = frequency10.getCount((long) '#');
        frequency1.addValue((java.lang.Object) long14);
        long long17 = frequency1.getCount(0L);
        frequency1.clear();
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        long long24 = frequency22.getCount((java.lang.Object) 100.0f);
        long long25 = frequency22.getSumFreq();
        long long26 = frequency22.getSumFreq();
        long long28 = frequency22.getCumFreq(' ');
        frequency22.addValue((java.lang.Integer) 10);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        long long34 = frequency32.getCount((java.lang.Object) 100.0f);
        long long36 = frequency32.getCount((java.lang.Object) 100.0f);
        double double38 = frequency32.getPct((int) (short) 1);
        double double40 = frequency32.getCumPct((int) (short) 100);
        java.util.Iterator iterator41 = frequency32.valuesIterator();
        double double43 = frequency32.getCumPct(0L);
        java.util.Comparator comparator44 = null;
        org.apache.commons.math.stat.Frequency frequency45 = new org.apache.commons.math.stat.Frequency(comparator44);
        long long47 = frequency45.getCount((java.lang.Object) 100.0f);
        long long49 = frequency45.getCount((int) (short) 0);
        double double51 = frequency45.getCumPct(1L);
        long long53 = frequency45.getCumFreq((java.lang.Object) 10.0d);
        frequency45.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Comparator comparator56 = null;
        org.apache.commons.math.stat.Frequency frequency57 = new org.apache.commons.math.stat.Frequency(comparator56);
        long long59 = frequency57.getCount((java.lang.Object) 100.0f);
        long long60 = frequency57.getSumFreq();
        long long61 = frequency57.getSumFreq();
        long long63 = frequency57.getCumFreq(' ');
        long long65 = frequency57.getCount((java.lang.Object) (byte) -1);
        long long66 = frequency45.getCumFreq((java.lang.Object) long65);
        java.lang.String str67 = frequency45.toString();
        java.util.Comparator comparator68 = null;
        org.apache.commons.math.stat.Frequency frequency69 = new org.apache.commons.math.stat.Frequency(comparator68);
        long long71 = frequency69.getCount((java.lang.Object) 100.0f);
        long long73 = frequency69.getCount((java.lang.Object) 100.0f);
        long long74 = frequency45.getCumFreq((java.lang.Object) frequency69);
        java.util.Iterator iterator75 = frequency45.valuesIterator();
        java.lang.String str76 = frequency45.toString();
        double double77 = frequency32.getPct((java.lang.Object) str76);
        frequency32.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        double double81 = frequency32.getCumPct(' ');
        double double82 = frequency22.getPct((java.lang.Object) double81);
        double double83 = frequency1.getCumPct((java.lang.Object) double81);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str67, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str76, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCumFreq((long) '#');
        long long7 = frequency1.getCount((int) (short) 1);
        long long8 = frequency1.getSumFreq();
        frequency1.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) (short) -1);
        double double5 = frequency1.getPct('a');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        long long9 = frequency7.getCount((java.lang.Object) 100.0f);
        long long10 = frequency7.getSumFreq();
        long long11 = frequency7.getSumFreq();
        long long13 = frequency7.getCumFreq(' ');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        long long17 = frequency15.getCount((java.lang.Object) 100.0f);
        long long18 = frequency15.getSumFreq();
        long long19 = frequency15.getSumFreq();
        long long21 = frequency15.getCount((java.lang.Object) "");
        long long22 = frequency7.getCumFreq((java.lang.Object) frequency15);
        double double24 = frequency7.getCumPct(' ');
        long long26 = frequency7.getCount('a');
        double double27 = frequency1.getPct((java.lang.Object) 'a');
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        long long31 = frequency1.getCumFreq('4');
        java.util.Iterator iterator32 = frequency1.valuesIterator();
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        long long36 = frequency34.getCount((java.lang.Object) 100.0f);
        long long37 = frequency34.getSumFreq();
        long long38 = frequency34.getSumFreq();
        long long40 = frequency34.getCumFreq(' ');
        java.util.Comparator comparator41 = null;
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency(comparator41);
        long long44 = frequency42.getCount((java.lang.Object) 100.0f);
        long long45 = frequency42.getSumFreq();
        long long46 = frequency42.getSumFreq();
        long long48 = frequency42.getCount((java.lang.Object) "");
        long long49 = frequency34.getCumFreq((java.lang.Object) frequency42);
        long long51 = frequency42.getCount(10L);
        frequency42.addValue((java.lang.Integer) 0);
        frequency42.clear();
        long long55 = frequency1.getCount((java.lang.Object) frequency42);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        long long12 = frequency10.getCount((java.lang.Object) 100.0f);
        long long14 = frequency10.getCount((long) '#');
        frequency1.addValue((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('a');
        double double19 = frequency1.getPct((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct((-1));
        double double9 = frequency1.getCumPct('a');
        long long11 = frequency1.getCumFreq('a');
        frequency1.addValue((java.lang.Object) 0.0d);
        double double15 = frequency1.getPct(0);
        long long17 = frequency1.getCumFreq((long) (short) 0);
        long long19 = frequency1.getCumFreq('4');
        java.lang.String str20 = frequency1.toString();
        java.util.Iterator iterator21 = frequency1.valuesIterator();
        long long23 = frequency1.getCumFreq((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0.0\t1\t100%\t100%\n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n0.0\t1\t100%\t100%\n");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        frequency1.addValue('a');
        long long9 = frequency1.getCumFreq(10L);
        double double11 = frequency1.getCumPct('4');
        long long12 = frequency1.getSumFreq();
        double double14 = frequency1.getCumPct(1);
        double double16 = frequency1.getPct((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        long long9 = frequency7.getCount((java.lang.Object) 100.0f);
        long long11 = frequency7.getCount((int) (short) 0);
        double double13 = frequency7.getPct(0);
        long long14 = frequency1.getCount((java.lang.Object) double13);
        long long16 = frequency1.getCount(100L);
        long long18 = frequency1.getCount(0);
        frequency1.clear();
        frequency1.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        double double10 = frequency1.getCumPct(' ');
        frequency1.addValue('#');
        double double14 = frequency1.getCumPct('a');
        double double16 = frequency1.getCumPct(0L);
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount((java.lang.Object) 100.0f);
        long long21 = frequency18.getSumFreq();
        long long22 = frequency18.getSumFreq();
        long long24 = frequency18.getCumFreq(' ');
        long long26 = frequency18.getCount((java.lang.Object) (byte) -1);
        long long28 = frequency18.getCount('4');
        frequency18.addValue(' ');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        long long34 = frequency32.getCount((java.lang.Object) 100.0f);
        frequency32.addValue((int) '#');
        long long38 = frequency32.getCumFreq('a');
        long long40 = frequency32.getCount((long) 0);
        frequency32.addValue((int) (byte) 0);
        long long43 = frequency18.getCount((java.lang.Object) frequency32);
        double double44 = frequency1.getCumPct((java.lang.Object) frequency32);
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        long long48 = frequency46.getCount((java.lang.Object) 100.0f);
        long long49 = frequency46.getSumFreq();
        long long50 = frequency46.getSumFreq();
        long long52 = frequency46.getCount((java.lang.Object) "");
        java.util.Iterator iterator53 = frequency46.valuesIterator();
        double double55 = frequency46.getCumPct(' ');
        frequency46.addValue('#');
        long long59 = frequency46.getCount('a');
        frequency46.clear();
        java.util.Comparator comparator61 = null;
        org.apache.commons.math.stat.Frequency frequency62 = new org.apache.commons.math.stat.Frequency(comparator61);
        long long64 = frequency62.getCount((java.lang.Object) 100.0f);
        long long66 = frequency62.getCount((int) (short) 0);
        double double68 = frequency62.getCumPct(1L);
        long long70 = frequency62.getCumFreq((java.lang.Object) 10.0d);
        frequency62.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long73 = frequency46.getCumFreq((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long74 = frequency32.getCumFreq((java.lang.Object) long73);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1L + "'", long74 == 1L);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long12 = frequency9.getSumFreq();
        long long13 = frequency9.getSumFreq();
        long long15 = frequency9.getCount((java.lang.Object) "");
        long long16 = frequency1.getCumFreq((java.lang.Object) frequency9);
        long long17 = frequency1.getSumFreq();
        long long19 = frequency1.getCount('4');
        java.lang.String str20 = frequency1.toString();
        java.util.Iterator iterator21 = frequency1.valuesIterator();
        frequency1.addValue((int) (short) 0);
        double double25 = frequency1.getCumPct('4');
        double double27 = frequency1.getPct(100);
        long long29 = frequency1.getCount((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct('a');
        long long9 = frequency1.getCumFreq(' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct((-1));
        double double9 = frequency1.getCumPct('a');
        long long11 = frequency1.getCumFreq('a');
        frequency1.addValue((java.lang.Object) 0.0d);
        double double15 = frequency1.getPct(0);
        long long17 = frequency1.getCumFreq((long) (short) 0);
        long long19 = frequency1.getCumFreq('4');
        java.lang.String str20 = frequency1.toString();
        double double22 = frequency1.getPct('a');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        long long26 = frequency24.getCount((java.lang.Object) 100.0f);
        long long27 = frequency24.getSumFreq();
        long long28 = frequency24.getSumFreq();
        long long30 = frequency24.getCumFreq(' ');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        long long34 = frequency32.getCount((java.lang.Object) 100.0f);
        long long35 = frequency32.getSumFreq();
        long long36 = frequency32.getSumFreq();
        long long38 = frequency32.getCount((java.lang.Object) "");
        long long39 = frequency24.getCumFreq((java.lang.Object) frequency32);
        double double41 = frequency24.getCumPct(' ');
        long long43 = frequency24.getCount('a');
        long long45 = frequency24.getCumFreq(1L);
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        long long49 = frequency47.getCount((java.lang.Object) 100.0f);
        long long50 = frequency47.getSumFreq();
        long long51 = frequency47.getSumFreq();
        frequency47.addValue((long) 0);
        frequency47.clear();
        double double55 = frequency24.getCumPct((java.lang.Object) frequency47);
        double double56 = frequency1.getCumPct((java.lang.Object) frequency24);
        java.util.Iterator iterator57 = frequency1.valuesIterator();
        java.lang.String str58 = frequency1.toString();
        double double60 = frequency1.getCumPct(0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0.0\t1\t100%\t100%\n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n0.0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0.0\t1\t100%\t100%\n" + "'", str58, "Value \t Freq. \t Pct. \t Cum Pct. \n0.0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        frequency1.addValue('a');
        double double9 = frequency1.getCumPct((int) '#');
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((java.lang.Object) 100.0f);
        long long16 = frequency1.getCount((java.lang.Object) long15);
        long long18 = frequency1.getCount((long) 1);
        java.lang.String str19 = frequency1.toString();
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        long long9 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((int) (short) 0);
        double double17 = frequency11.getCumPct(1L);
        long long19 = frequency11.getCumFreq((java.lang.Object) 10.0d);
        frequency11.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long23 = frequency11.getCount((java.lang.Object) 1.0f);
        double double25 = frequency11.getCumPct((long) (byte) -1);
        double double27 = frequency11.getPct((int) (short) 0);
        java.util.Comparator comparator28 = null;
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency(comparator28);
        double double31 = frequency29.getCumPct((java.lang.Object) (short) -1);
        long long33 = frequency29.getCumFreq(' ');
        double double35 = frequency29.getPct(1L);
        frequency29.addValue((long) 10);
        long long38 = frequency11.getCumFreq((java.lang.Object) frequency29);
        double double39 = frequency1.getPct((java.lang.Object) frequency29);
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        long long43 = frequency41.getCount((java.lang.Object) 100.0f);
        long long44 = frequency41.getSumFreq();
        long long45 = frequency41.getSumFreq();
        long long47 = frequency41.getCumFreq(' ');
        long long49 = frequency41.getCount((java.lang.Object) (byte) -1);
        frequency41.addValue(1);
        double double53 = frequency41.getPct('a');
        double double55 = frequency41.getPct((long) (byte) 100);
        double double56 = frequency29.getPct((java.lang.Object) double55);
        java.lang.String str57 = frequency29.toString();
        long long59 = frequency29.getCumFreq(10L);
        java.util.Comparator comparator60 = null;
        org.apache.commons.math.stat.Frequency frequency61 = new org.apache.commons.math.stat.Frequency(comparator60);
        long long63 = frequency61.getCount((java.lang.Object) 100.0f);
        long long65 = frequency61.getCount((java.lang.Object) 100.0f);
        double double67 = frequency61.getPct((int) (short) 1);
        double double69 = frequency61.getCumPct((int) (short) 100);
        java.util.Iterator iterator70 = frequency61.valuesIterator();
        frequency61.addValue((int) '#');
        long long74 = frequency61.getCount((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            frequency29.addValue((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n" + "'", str57, "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(iterator70);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long12 = frequency9.getSumFreq();
        long long13 = frequency9.getSumFreq();
        long long15 = frequency9.getCount((java.lang.Object) "");
        long long16 = frequency1.getCumFreq((java.lang.Object) frequency9);
        long long18 = frequency9.getCount(10L);
        frequency9.addValue((java.lang.Integer) 0);
        frequency9.addValue((long) 10);
        frequency9.clear();
        double double25 = frequency9.getPct(' ');
        frequency9.addValue(1L);
        double double29 = frequency9.getCumPct((long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        frequency1.addValue((java.lang.Integer) (-1));
        long long11 = frequency1.getCumFreq((int) (byte) 1);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount((java.lang.Object) 100.0f);
        long long17 = frequency13.getCount((int) (short) 0);
        double double19 = frequency13.getPct((-1));
        java.util.Iterator iterator20 = frequency13.valuesIterator();
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        long long24 = frequency22.getCount((java.lang.Object) 100.0f);
        long long25 = frequency22.getSumFreq();
        long long26 = frequency22.getSumFreq();
        long long28 = frequency22.getCount((java.lang.Object) "");
        java.util.Iterator iterator29 = frequency22.valuesIterator();
        double double31 = frequency22.getCumPct(' ');
        frequency22.addValue('#');
        long long35 = frequency22.getCount('a');
        long long36 = frequency13.getCumFreq((java.lang.Object) frequency22);
        frequency13.addValue((int) (byte) 100);
        double double39 = frequency1.getCumPct((java.lang.Object) (byte) 100);
        frequency1.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        long long9 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount((java.lang.Object) 100.0f);
        long long16 = frequency13.getSumFreq();
        long long17 = frequency13.getSumFreq();
        long long19 = frequency13.getCumFreq(' ');
        long long21 = frequency13.getCount((java.lang.Object) (byte) -1);
        long long22 = frequency1.getCumFreq((java.lang.Object) long21);
        long long24 = frequency1.getCount((long) 1);
        long long26 = frequency1.getCount((int) (short) 0);
        double double28 = frequency1.getPct(0);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        long long32 = frequency30.getCount((java.lang.Object) 100.0f);
        long long33 = frequency30.getSumFreq();
        long long34 = frequency30.getSumFreq();
        long long36 = frequency30.getCount((java.lang.Object) "");
        java.util.Iterator iterator37 = frequency30.valuesIterator();
        double double39 = frequency30.getCumPct(' ');
        frequency30.addValue('#');
        double double43 = frequency30.getCumPct('a');
        double double45 = frequency30.getPct((long) (byte) 10);
        long long46 = frequency1.getCumFreq((java.lang.Object) frequency30);
        double double48 = frequency30.getPct(10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        long long9 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator12 = frequency1.valuesIterator();
        java.lang.String str13 = frequency1.toString();
        long long15 = frequency1.getCumFreq(' ');
        java.util.Iterator iterator16 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        long long9 = frequency7.getCount((java.lang.Object) 100.0f);
        long long10 = frequency7.getSumFreq();
        long long11 = frequency7.getSumFreq();
        long long13 = frequency7.getCumFreq(' ');
        long long15 = frequency7.getCount((java.lang.Object) (byte) -1);
        frequency7.addValue(1);
        long long19 = frequency7.getCumFreq((int) (short) 100);
        long long21 = frequency7.getCumFreq((int) (short) 100);
        frequency1.addValue((java.lang.Object) (short) 100);
        double double24 = frequency1.getPct('4');
        frequency1.clear();
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount((java.lang.Object) 100.0f);
        long long30 = frequency27.getSumFreq();
        long long31 = frequency27.getSumFreq();
        long long33 = frequency27.getCumFreq(' ');
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount((java.lang.Object) 100.0f);
        long long38 = frequency35.getSumFreq();
        long long39 = frequency35.getSumFreq();
        long long41 = frequency35.getCount((java.lang.Object) "");
        long long42 = frequency27.getCumFreq((java.lang.Object) frequency35);
        long long44 = frequency35.getCount(10L);
        long long46 = frequency35.getCumFreq(' ');
        long long48 = frequency35.getCumFreq((long) (byte) 100);
        frequency35.addValue(' ');
        long long51 = frequency1.getCumFreq((java.lang.Object) frequency35);
        java.util.Iterator iterator52 = frequency1.valuesIterator();
        double double54 = frequency1.getPct((int) '#');
        frequency1.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct((-1));
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        double double10 = frequency1.getCumPct((int) (short) -1);
        frequency1.addValue((java.lang.Integer) 1);
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        long long16 = frequency14.getCount((java.lang.Object) 100.0f);
        long long17 = frequency14.getSumFreq();
        long long18 = frequency14.getSumFreq();
        frequency14.addValue((long) 0);
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        long long24 = frequency22.getCount((java.lang.Object) 100.0f);
        long long26 = frequency22.getCount((int) (short) 0);
        double double28 = frequency22.getCumPct(1L);
        long long30 = frequency22.getCumFreq((java.lang.Object) 10.0d);
        frequency22.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        long long36 = frequency34.getCount((java.lang.Object) 100.0f);
        long long37 = frequency34.getSumFreq();
        long long38 = frequency34.getSumFreq();
        long long40 = frequency34.getCount((java.lang.Object) "");
        double double42 = frequency34.getPct((int) (short) 100);
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        long long46 = frequency44.getCount((java.lang.Object) 100.0f);
        long long48 = frequency44.getCount((int) (short) 0);
        double double50 = frequency44.getCumPct(1L);
        long long52 = frequency44.getCumFreq((java.lang.Object) 10.0d);
        double double53 = frequency34.getCumPct((java.lang.Object) long52);
        double double55 = frequency34.getPct(1);
        long long57 = frequency34.getCount(' ');
        frequency34.addValue(10L);
        long long61 = frequency34.getCount(100);
        long long62 = frequency22.getCount((java.lang.Object) frequency34);
        double double63 = frequency14.getPct((java.lang.Object) frequency34);
        long long65 = frequency34.getCumFreq(0L);
        long long66 = frequency1.getCount((java.lang.Object) frequency34);
        long long68 = frequency1.getCumFreq((int) 'a');
        frequency1.addValue((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        double double10 = frequency1.getCumPct(' ');
        frequency1.addValue('#');
        long long14 = frequency1.getCount('a');
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        long long18 = frequency16.getCount((java.lang.Object) 100.0f);
        long long19 = frequency16.getSumFreq();
        long long20 = frequency16.getSumFreq();
        long long22 = frequency16.getCount((java.lang.Object) "");
        java.util.Iterator iterator23 = frequency16.valuesIterator();
        frequency16.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str26 = frequency16.toString();
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        long long30 = frequency28.getCount((java.lang.Object) 100.0f);
        long long32 = frequency28.getCount((int) (short) 0);
        java.util.Iterator iterator33 = frequency28.valuesIterator();
        long long34 = frequency16.getCount((java.lang.Object) frequency28);
        double double36 = frequency16.getPct(100);
        double double37 = frequency1.getCumPct((java.lang.Object) double36);
        long long39 = frequency1.getCount((int) (byte) 1);
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        long long43 = frequency41.getCount((java.lang.Object) 100.0f);
        long long45 = frequency41.getCount((int) (short) 0);
        frequency41.addValue((long) (byte) -1);
        long long49 = frequency41.getCount((int) (byte) 0);
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        double double53 = frequency51.getCumPct((java.lang.Object) (short) -1);
        frequency51.clear();
        double double56 = frequency51.getCumPct((int) (byte) 100);
        double double57 = frequency41.getPct((java.lang.Object) frequency51);
        double double58 = frequency1.getCumPct((java.lang.Object) frequency51);
        frequency51.clear();
        long long61 = frequency51.getCount(10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n" + "'", str26, "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        java.lang.String str6 = frequency1.toString();
        frequency1.addValue('#');
        frequency1.addValue(' ');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount((java.lang.Object) 100.0f);
        long long15 = frequency12.getSumFreq();
        long long16 = frequency12.getSumFreq();
        long long18 = frequency12.getCumFreq(' ');
        long long20 = frequency12.getCount((java.lang.Object) (byte) -1);
        long long21 = frequency12.getSumFreq();
        frequency12.clear();
        long long23 = frequency1.getCumFreq((java.lang.Object) frequency12);
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        long long27 = frequency25.getCount((java.lang.Object) 100.0f);
        long long28 = frequency25.getSumFreq();
        long long29 = frequency25.getSumFreq();
        long long31 = frequency25.getCumFreq(' ');
        java.util.Comparator comparator32 = null;
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency(comparator32);
        long long35 = frequency33.getCount((java.lang.Object) 100.0f);
        long long36 = frequency33.getSumFreq();
        long long37 = frequency33.getSumFreq();
        long long39 = frequency33.getCount((java.lang.Object) "");
        long long40 = frequency25.getCumFreq((java.lang.Object) frequency33);
        long long42 = frequency33.getCount((int) 'a');
        double double44 = frequency33.getCumPct('a');
        long long45 = frequency1.getCumFreq((java.lang.Object) double44);
        java.lang.Class<?> wildcardClass46 = frequency1.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        frequency1.addValue((long) (byte) -1);
        frequency1.clear();
        java.util.Iterator iterator9 = frequency1.valuesIterator();
        long long10 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long12 = frequency9.getSumFreq();
        long long13 = frequency9.getSumFreq();
        long long15 = frequency9.getCount((java.lang.Object) "");
        long long16 = frequency1.getCumFreq((java.lang.Object) frequency9);
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount((java.lang.Object) 100.0f);
        long long21 = frequency18.getSumFreq();
        long long22 = frequency18.getSumFreq();
        java.lang.Class<?> wildcardClass23 = frequency18.getClass();
        long long24 = frequency1.getCount((java.lang.Object) wildcardClass23);
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        long long28 = frequency26.getCount((java.lang.Object) 100.0f);
        long long30 = frequency26.getCount((int) (short) 0);
        double double32 = frequency26.getCumPct(1L);
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        long long36 = frequency34.getCount((java.lang.Object) 100.0f);
        long long37 = frequency34.getSumFreq();
        long long38 = frequency34.getSumFreq();
        long long40 = frequency34.getCumFreq(' ');
        java.util.Comparator comparator41 = null;
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency(comparator41);
        long long44 = frequency42.getCount((java.lang.Object) 100.0f);
        long long45 = frequency42.getSumFreq();
        long long46 = frequency42.getSumFreq();
        long long48 = frequency42.getCount((java.lang.Object) "");
        long long49 = frequency34.getCumFreq((java.lang.Object) frequency42);
        double double50 = frequency26.getCumPct((java.lang.Object) long49);
        frequency26.clear();
        long long52 = frequency1.getCount((java.lang.Object) frequency26);
        java.lang.String str53 = frequency26.toString();
        long long55 = frequency26.getCount(' ');
        long long57 = frequency26.getCount(100L);
        java.util.Iterator iterator58 = frequency26.valuesIterator();
        double double60 = frequency26.getCumPct(1);
        frequency26.addValue('#');
        long long63 = frequency26.getSumFreq();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str53, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) (byte) 100);
        long long7 = frequency1.getCount((long) (byte) -1);
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCumFreq(0);
        long long12 = frequency1.getCount('4');
        java.util.Iterator iterator13 = frequency1.valuesIterator();
        double double15 = frequency1.getPct((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = frequency1.toString();
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount((java.lang.Object) 100.0f);
        long long17 = frequency13.getCount((int) (short) 0);
        java.util.Iterator iterator18 = frequency13.valuesIterator();
        long long19 = frequency1.getCount((java.lang.Object) frequency13);
        double double21 = frequency1.getPct(100);
        double double23 = frequency1.getPct(0);
        long long25 = frequency1.getCount('a');
        long long27 = frequency1.getCumFreq(' ');
        double double29 = frequency1.getPct((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        frequency1.addValue((long) (byte) -1);
        long long9 = frequency1.getCount((int) (byte) 0);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((java.lang.Object) (short) -1);
        frequency11.clear();
        double double16 = frequency11.getCumPct((int) (byte) 100);
        double double17 = frequency1.getPct((java.lang.Object) frequency11);
        double double19 = frequency11.getPct(10L);
        long long21 = frequency11.getCount((long) (short) 1);
        long long23 = frequency11.getCount((long) (byte) 10);
        long long25 = frequency11.getCount((long) (short) 0);
        double double27 = frequency11.getPct('a');
        java.util.Comparator comparator28 = null;
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency(comparator28);
        long long31 = frequency29.getCount((java.lang.Object) 100.0f);
        long long33 = frequency29.getCount((int) (short) 0);
        double double35 = frequency29.getCumPct(1L);
        long long37 = frequency29.getCumFreq((java.lang.Object) 10.0d);
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        double double41 = frequency39.getCumPct((java.lang.Object) (short) -1);
        long long43 = frequency39.getCumFreq(' ');
        frequency29.addValue((java.lang.Object) ' ');
        long long45 = frequency11.getCumFreq((java.lang.Object) ' ');
        long long46 = frequency11.getSumFreq();
        frequency11.addValue((java.lang.Integer) 100);
        double double50 = frequency11.getCumPct((long) 1);
        long long52 = frequency11.getCumFreq('#');
        long long54 = frequency11.getCumFreq((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct((int) (short) 1);
        long long9 = frequency1.getCumFreq((long) '4');
        frequency1.addValue((int) ' ');
        java.lang.String str12 = frequency1.toString();
        double double14 = frequency1.getCumPct((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n32\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct((-1));
        frequency1.addValue((long) (byte) 1);
        double double11 = frequency1.getCumPct((int) (short) 10);
        java.util.Iterator iterator12 = frequency1.valuesIterator();
        long long13 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        frequency1.addValue('a');
        long long9 = frequency1.getCumFreq((int) (byte) 0);
        long long11 = frequency1.getCumFreq((int) 'a');
        double double13 = frequency1.getPct((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long12 = frequency9.getSumFreq();
        long long13 = frequency9.getSumFreq();
        long long15 = frequency9.getCount((java.lang.Object) "");
        long long16 = frequency1.getCumFreq((java.lang.Object) frequency9);
        long long18 = frequency9.getCount(10L);
        double double20 = frequency9.getCumPct('#');
        long long22 = frequency9.getCumFreq((int) (short) 100);
        long long24 = frequency9.getCumFreq((-1));
        frequency9.addValue((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 10);
        long long7 = frequency1.getCumFreq('4');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCount((int) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        frequency1.addValue((long) (byte) -1);
        long long9 = frequency1.getCount((int) (byte) 0);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((java.lang.Object) (short) -1);
        frequency11.clear();
        double double16 = frequency11.getCumPct((int) (byte) 100);
        double double17 = frequency1.getPct((java.lang.Object) frequency11);
        double double19 = frequency11.getPct(10L);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount((java.lang.Object) 100.0f);
        long long25 = frequency21.getCount((java.lang.Object) 100.0f);
        double double27 = frequency21.getPct((int) (short) 1);
        long long28 = frequency21.getSumFreq();
        frequency21.addValue('4');
        long long32 = frequency21.getCumFreq((long) '#');
        long long34 = frequency21.getCount('#');
        double double36 = frequency21.getCumPct((long) 1);
        double double38 = frequency21.getPct('a');
        long long39 = frequency11.getCumFreq((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        long long10 = frequency1.getCumFreq(' ');
        long long12 = frequency1.getCumFreq(' ');
        long long14 = frequency1.getCumFreq('4');
        long long16 = frequency1.getCount('#');
        double double18 = frequency1.getPct(' ');
        double double20 = frequency1.getCumPct('a');
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        long long24 = frequency22.getCount((java.lang.Object) 100.0f);
        long long25 = frequency22.getSumFreq();
        long long26 = frequency22.getSumFreq();
        long long28 = frequency22.getCumFreq(' ');
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        long long32 = frequency30.getCount((java.lang.Object) 100.0f);
        long long33 = frequency30.getSumFreq();
        long long34 = frequency30.getSumFreq();
        long long36 = frequency30.getCount((java.lang.Object) "");
        long long37 = frequency22.getCumFreq((java.lang.Object) frequency30);
        long long39 = frequency30.getCount((int) 'a');
        double double41 = frequency30.getCumPct(' ');
        long long42 = frequency1.getCumFreq((java.lang.Object) double41);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct((-1));
        double double9 = frequency1.getCumPct('a');
        long long11 = frequency1.getCumFreq('a');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount((java.lang.Object) 100.0f);
        long long17 = frequency13.getCount((java.lang.Object) 100.0f);
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCount((java.lang.Object) 100.0f);
        long long22 = frequency19.getSumFreq();
        long long23 = frequency19.getSumFreq();
        long long25 = frequency19.getCumFreq(' ');
        long long27 = frequency19.getCount((java.lang.Object) (byte) -1);
        frequency19.addValue(1);
        long long31 = frequency19.getCumFreq((int) (short) 100);
        long long33 = frequency19.getCumFreq((int) (short) 100);
        frequency13.addValue((java.lang.Object) (short) 100);
        double double36 = frequency13.getCumPct(100L);
        double double38 = frequency13.getPct((long) 1);
        double double39 = frequency1.getPct((java.lang.Object) double38);
        frequency1.addValue(10);
        java.lang.String str42 = frequency1.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n" + "'", str42, "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long12 = frequency9.getSumFreq();
        long long13 = frequency9.getSumFreq();
        long long15 = frequency9.getCount((java.lang.Object) "");
        long long16 = frequency1.getCumFreq((java.lang.Object) frequency9);
        double double18 = frequency1.getCumPct(' ');
        long long20 = frequency1.getCumFreq(1);
        long long22 = frequency1.getCount((int) (byte) 100);
        frequency1.addValue((int) (short) 1);
        long long26 = frequency1.getCount((int) ' ');
        long long28 = frequency1.getCount(0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((long) (byte) 0);
        frequency1.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        frequency1.addValue((long) (byte) -1);
        long long9 = frequency1.getCount((int) (byte) 0);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((java.lang.Object) (short) -1);
        frequency11.clear();
        double double16 = frequency11.getCumPct((int) (byte) 100);
        double double17 = frequency1.getPct((java.lang.Object) frequency11);
        double double19 = frequency11.getPct(10L);
        double double21 = frequency11.getPct((int) (byte) 100);
        java.util.Iterator iterator22 = frequency11.valuesIterator();
        double double24 = frequency11.getCumPct(100L);
        frequency11.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        long long9 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount((java.lang.Object) 100.0f);
        long long16 = frequency13.getSumFreq();
        long long17 = frequency13.getSumFreq();
        long long19 = frequency13.getCumFreq(' ');
        long long21 = frequency13.getCount((java.lang.Object) (byte) -1);
        long long22 = frequency1.getCumFreq((java.lang.Object) long21);
        java.lang.String str23 = frequency1.toString();
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        long long27 = frequency25.getCount((java.lang.Object) 100.0f);
        long long29 = frequency25.getCount((java.lang.Object) 100.0f);
        long long30 = frequency1.getCumFreq((java.lang.Object) frequency25);
        double double32 = frequency1.getCumPct(10);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        long long9 = frequency1.getCount((java.lang.Object) (byte) -1);
        long long10 = frequency1.getSumFreq();
        long long11 = frequency1.getSumFreq();
        double double13 = frequency1.getPct(100);
        double double15 = frequency1.getPct((int) (byte) 1);
        double double17 = frequency1.getPct((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((java.lang.Object) "");
        long long5 = frequency1.getCount('#');
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long13 = frequency9.getCount((int) (short) 0);
        double double15 = frequency9.getCumPct(1L);
        frequency9.addValue((java.lang.Integer) (-1));
        double double18 = frequency1.getCumPct((java.lang.Object) (-1));
        double double20 = frequency1.getCumPct((int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = frequency1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct((-1));
        frequency1.addValue((long) (byte) 1);
        double double11 = frequency1.getCumPct((int) (short) 10);
        double double13 = frequency1.getCumPct((int) ' ');
        frequency1.addValue((java.lang.Integer) 0);
        frequency1.clear();
        frequency1.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long12 = frequency9.getSumFreq();
        long long13 = frequency9.getSumFreq();
        long long15 = frequency9.getCount((java.lang.Object) "");
        long long16 = frequency1.getCumFreq((java.lang.Object) frequency9);
        double double18 = frequency1.getCumPct(' ');
        long long20 = frequency1.getCumFreq(1);
        long long22 = frequency1.getCount((int) (byte) 100);
        frequency1.addValue((int) (short) 1);
        long long26 = frequency1.getCumFreq(' ');
        long long28 = frequency1.getCumFreq('4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        long long9 = frequency1.getCumFreq(1);
        long long11 = frequency1.getCumFreq((java.lang.Object) 'a');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount((java.lang.Object) 100.0f);
        long long16 = frequency13.getSumFreq();
        long long17 = frequency13.getSumFreq();
        long long19 = frequency13.getCumFreq(' ');
        long long21 = frequency13.getCount((java.lang.Object) (byte) -1);
        frequency13.addValue(1);
        long long25 = frequency13.getCumFreq((int) (short) 100);
        java.util.Iterator iterator26 = frequency13.valuesIterator();
        double double28 = frequency13.getCumPct(0);
        long long30 = frequency13.getCount((int) 'a');
        double double31 = frequency1.getPct((java.lang.Object) frequency13);
        double double33 = frequency1.getPct('#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        long long9 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount((java.lang.Object) 100.0f);
        long long16 = frequency13.getSumFreq();
        long long17 = frequency13.getSumFreq();
        long long19 = frequency13.getCumFreq(' ');
        long long21 = frequency13.getCount((java.lang.Object) (byte) -1);
        long long22 = frequency1.getCumFreq((java.lang.Object) long21);
        java.lang.String str23 = frequency1.toString();
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        long long27 = frequency25.getCount((java.lang.Object) 100.0f);
        long long29 = frequency25.getCount((java.lang.Object) 100.0f);
        long long30 = frequency1.getCumFreq((java.lang.Object) frequency25);
        java.util.Iterator iterator31 = frequency1.valuesIterator();
        java.lang.String str32 = frequency1.toString();
        double double34 = frequency1.getCumPct(0);
        java.util.Iterator iterator35 = frequency1.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str32, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(iterator35);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        double double10 = frequency1.getCumPct(' ');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount((java.lang.Object) 100.0f);
        long long15 = frequency12.getSumFreq();
        long long16 = frequency12.getSumFreq();
        long long18 = frequency12.getCumFreq(' ');
        frequency1.addValue((java.lang.Object) ' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount((java.lang.Object) 100.0f);
        long long24 = frequency21.getSumFreq();
        long long25 = frequency21.getSumFreq();
        long long27 = frequency21.getCumFreq(' ');
        long long29 = frequency21.getCount((java.lang.Object) (byte) -1);
        frequency21.addValue(1);
        long long33 = frequency21.getCumFreq((int) (short) 100);
        long long34 = frequency1.getCumFreq((java.lang.Object) long33);
        long long36 = frequency1.getCount('#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        double double10 = frequency1.getCumPct(' ');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        long long14 = frequency12.getCount((java.lang.Object) 100.0f);
        long long15 = frequency12.getSumFreq();
        long long16 = frequency12.getSumFreq();
        long long18 = frequency12.getCumFreq(' ');
        frequency1.addValue((java.lang.Object) ' ');
        long long21 = frequency1.getCumFreq((long) (short) 10);
        double double23 = frequency1.getPct((long) (short) 0);
        long long25 = frequency1.getCumFreq((long) (short) -1);
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount((java.lang.Object) 100.0f);
        long long31 = frequency27.getCount((int) (short) 0);
        double double33 = frequency27.getCumPct(1L);
        long long35 = frequency27.getCumFreq((java.lang.Object) 10.0d);
        frequency27.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        long long41 = frequency39.getCount((java.lang.Object) 100.0f);
        long long42 = frequency39.getSumFreq();
        long long43 = frequency39.getSumFreq();
        long long45 = frequency39.getCumFreq(' ');
        long long47 = frequency39.getCount((java.lang.Object) (byte) -1);
        long long48 = frequency27.getCumFreq((java.lang.Object) long47);
        long long50 = frequency27.getCount((long) 1);
        frequency27.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        frequency27.clear();
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((java.lang.Object) frequency27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal argument: v");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct((-1));
        double double9 = frequency1.getCumPct('a');
        long long11 = frequency1.getCumFreq('a');
        frequency1.addValue((java.lang.Object) 0.0d);
        double double15 = frequency1.getPct('4');
        double double17 = frequency1.getCumPct((long) '#');
        java.lang.String str18 = frequency1.toString();
        long long20 = frequency1.getCount(0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0.0\t1\t100%\t100%\n" + "'", str18, "Value \t Freq. \t Pct. \t Cum Pct. \n0.0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        java.lang.String str6 = frequency1.toString();
        java.util.Comparator comparator7 = null;
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency(comparator7);
        long long10 = frequency8.getCount((java.lang.Object) 100.0f);
        frequency8.addValue('4');
        double double14 = frequency8.getPct((int) '4');
        double double15 = frequency1.getPct((java.lang.Object) '4');
        long long17 = frequency1.getCount((int) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        long long9 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        double double15 = frequency1.getPct(1);
        long long17 = frequency1.getCumFreq((long) 'a');
        long long19 = frequency1.getCumFreq(10);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount((java.lang.Object) 100.0f);
        long long25 = frequency21.getCount((java.lang.Object) 100.0f);
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount((java.lang.Object) 100.0f);
        long long30 = frequency27.getSumFreq();
        long long31 = frequency27.getSumFreq();
        long long33 = frequency27.getCumFreq(' ');
        long long35 = frequency27.getCount((java.lang.Object) (byte) -1);
        frequency27.addValue(1);
        long long39 = frequency27.getCumFreq((int) (short) 100);
        long long41 = frequency27.getCumFreq((int) (short) 100);
        frequency21.addValue((java.lang.Object) (short) 100);
        double double44 = frequency21.getPct('4');
        long long46 = frequency21.getCount('#');
        long long48 = frequency21.getCount((int) (byte) 1);
        frequency21.clear();
        long long50 = frequency1.getCumFreq((java.lang.Object) frequency21);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        long long9 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((int) (short) 0);
        double double17 = frequency11.getCumPct(1L);
        long long19 = frequency11.getCumFreq((java.lang.Object) 10.0d);
        frequency11.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long23 = frequency11.getCount((java.lang.Object) 1.0f);
        double double25 = frequency11.getCumPct((long) (byte) -1);
        double double27 = frequency11.getPct((int) (short) 0);
        java.util.Comparator comparator28 = null;
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency(comparator28);
        double double31 = frequency29.getCumPct((java.lang.Object) (short) -1);
        long long33 = frequency29.getCumFreq(' ');
        double double35 = frequency29.getPct(1L);
        frequency29.addValue((long) 10);
        long long38 = frequency11.getCumFreq((java.lang.Object) frequency29);
        double double39 = frequency1.getPct((java.lang.Object) frequency29);
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        long long43 = frequency41.getCount((java.lang.Object) 100.0f);
        frequency41.addValue((int) '#');
        frequency41.addValue((java.lang.Integer) 1);
        frequency41.addValue((int) 'a');
        long long51 = frequency41.getCount('4');
        double double53 = frequency41.getPct((int) '4');
        long long55 = frequency41.getCount((-1));
        long long57 = frequency41.getCount('4');
        long long58 = frequency29.getCount((java.lang.Object) long57);
        double double60 = frequency29.getCumPct(' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct((int) (short) 1);
        double double9 = frequency1.getCumPct((int) (short) 100);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((int) (short) 0);
        double double17 = frequency11.getPct((-1));
        double double18 = frequency1.getPct((java.lang.Object) frequency11);
        long long20 = frequency11.getCumFreq('a');
        double double22 = frequency11.getPct(100L);
        long long24 = frequency11.getCount(0);
        frequency11.addValue((long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct((-1));
        double double9 = frequency1.getCumPct('a');
        long long11 = frequency1.getCumFreq('a');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount((java.lang.Object) 100.0f);
        long long17 = frequency13.getCount((java.lang.Object) (byte) 100);
        java.util.Iterator iterator18 = frequency13.valuesIterator();
        java.util.Iterator iterator19 = frequency13.valuesIterator();
        long long20 = frequency1.getCount((java.lang.Object) frequency13);
        frequency1.addValue((long) (-1));
        double double24 = frequency1.getCumPct('a');
        long long25 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long12 = frequency9.getSumFreq();
        long long13 = frequency9.getSumFreq();
        long long15 = frequency9.getCount((java.lang.Object) "");
        long long16 = frequency1.getCumFreq((java.lang.Object) frequency9);
        long long18 = frequency9.getCount(10L);
        long long20 = frequency9.getCumFreq(' ');
        long long22 = frequency9.getCumFreq((long) (byte) 100);
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        long long26 = frequency24.getCount((java.lang.Object) 100.0f);
        long long27 = frequency24.getSumFreq();
        long long28 = frequency24.getSumFreq();
        long long30 = frequency24.getCumFreq(' ');
        long long32 = frequency24.getCount((java.lang.Object) (byte) -1);
        long long34 = frequency24.getCount('a');
        frequency24.addValue('4');
        double double38 = frequency24.getPct((java.lang.Object) (-1));
        long long39 = frequency9.getCount((java.lang.Object) double38);
        frequency9.addValue((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct(1L);
        long long5 = frequency1.getCount((long) 0);
        frequency1.addValue('#');
        long long9 = frequency1.getCumFreq((int) (byte) 100);
        long long11 = frequency1.getCumFreq((int) '#');
        long long13 = frequency1.getCount((long) (short) 1);
        long long15 = frequency1.getCount((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long12 = frequency9.getSumFreq();
        long long13 = frequency9.getSumFreq();
        long long15 = frequency9.getCount((java.lang.Object) "");
        long long16 = frequency1.getCumFreq((java.lang.Object) frequency9);
        long long17 = frequency1.getSumFreq();
        long long19 = frequency1.getCount('4');
        long long21 = frequency1.getCount((long) ' ');
        java.lang.String str22 = frequency1.toString();
        double double24 = frequency1.getCumPct('#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        long long7 = frequency1.getCumFreq((int) (byte) 0);
        double double9 = frequency1.getPct('#');
        frequency1.addValue((-1));
        long long13 = frequency1.getCount('#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((int) '#');
        frequency1.addValue((java.lang.Integer) 1);
        frequency1.addValue((int) 'a');
        long long11 = frequency1.getCount('4');
        double double13 = frequency1.getPct((int) '4');
        long long15 = frequency1.getCount((-1));
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount((java.lang.Object) 100.0f);
        long long21 = frequency17.getCount((int) (short) 0);
        double double23 = frequency17.getPct((-1));
        double double25 = frequency17.getCumPct('a');
        long long27 = frequency17.getCumFreq('a');
        java.util.Comparator comparator28 = null;
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency(comparator28);
        long long31 = frequency29.getCount((java.lang.Object) 100.0f);
        long long33 = frequency29.getCount((java.lang.Object) (byte) 100);
        java.util.Iterator iterator34 = frequency29.valuesIterator();
        java.util.Iterator iterator35 = frequency29.valuesIterator();
        long long36 = frequency17.getCount((java.lang.Object) frequency29);
        double double38 = frequency29.getCumPct((long) 1);
        java.lang.String str39 = frequency29.toString();
        frequency29.addValue((-1L));
        long long42 = frequency1.getCumFreq((java.lang.Object) frequency29);
        double double44 = frequency1.getCumPct((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str39, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.3333333333333333d + "'", double44 == 0.3333333333333333d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) (short) -1);
        double double5 = frequency1.getPct('a');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        long long9 = frequency7.getCount((java.lang.Object) 100.0f);
        long long10 = frequency7.getSumFreq();
        long long11 = frequency7.getSumFreq();
        long long13 = frequency7.getCumFreq(' ');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        long long17 = frequency15.getCount((java.lang.Object) 100.0f);
        long long18 = frequency15.getSumFreq();
        long long19 = frequency15.getSumFreq();
        long long21 = frequency15.getCount((java.lang.Object) "");
        long long22 = frequency7.getCumFreq((java.lang.Object) frequency15);
        double double24 = frequency7.getCumPct(' ');
        long long26 = frequency7.getCount('a');
        double double27 = frequency1.getPct((java.lang.Object) 'a');
        long long29 = frequency1.getCount((int) 'a');
        long long31 = frequency1.getCount((long) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct((-1));
        double double9 = frequency1.getCumPct('a');
        long long11 = frequency1.getCumFreq('a');
        long long13 = frequency1.getCount((int) ' ');
        frequency1.addValue(1);
        frequency1.addValue((int) '#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCount((java.lang.Object) 100.0f);
        long long22 = frequency19.getSumFreq();
        long long23 = frequency19.getSumFreq();
        long long25 = frequency19.getCumFreq(' ');
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount((java.lang.Object) 100.0f);
        long long31 = frequency27.getCount((int) (short) 10);
        frequency27.clear();
        long long33 = frequency19.getCount((java.lang.Object) frequency27);
        long long35 = frequency19.getCumFreq((long) (short) 1);
        double double36 = frequency1.getCumPct((java.lang.Object) frequency19);
        double double38 = frequency1.getPct('4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct((int) (short) 1);
        double double9 = frequency1.getCumPct((int) (short) 100);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((int) (short) 0);
        double double17 = frequency11.getPct((-1));
        double double18 = frequency1.getPct((java.lang.Object) frequency11);
        long long20 = frequency11.getCumFreq('a');
        double double22 = frequency11.getCumPct((int) (byte) -1);
        long long24 = frequency11.getCumFreq((long) 0);
        long long25 = frequency11.getSumFreq();
        frequency11.addValue('a');
        long long29 = frequency11.getCumFreq((long) (-1));
        double double31 = frequency11.getPct('#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct((-1));
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        long long10 = frequency1.getCount('a');
        double double12 = frequency1.getPct('a');
        long long14 = frequency1.getCount((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long12 = frequency9.getSumFreq();
        long long13 = frequency9.getSumFreq();
        long long15 = frequency9.getCumFreq(' ');
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount((java.lang.Object) 100.0f);
        long long20 = frequency17.getSumFreq();
        long long21 = frequency17.getSumFreq();
        long long23 = frequency17.getCount((java.lang.Object) "");
        long long24 = frequency9.getCumFreq((java.lang.Object) frequency17);
        double double25 = frequency1.getCumPct((java.lang.Object) long24);
        long long27 = frequency1.getCumFreq(0L);
        long long29 = frequency1.getCount('#');
        double double31 = frequency1.getPct('a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        long long9 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator12 = frequency1.valuesIterator();
        java.lang.String str13 = frequency1.toString();
        long long15 = frequency1.getCumFreq(' ');
        long long17 = frequency1.getCount((long) (byte) -1);
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getPct((java.lang.Object) "");
        long long23 = frequency19.getCount('#');
        frequency19.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount((java.lang.Object) 100.0f);
        long long31 = frequency27.getCount((int) (short) 0);
        double double33 = frequency27.getCumPct(1L);
        frequency27.addValue((java.lang.Integer) (-1));
        double double36 = frequency19.getCumPct((java.lang.Object) (-1));
        double double38 = frequency19.getCumPct((int) (byte) 100);
        long long39 = frequency1.getCount((java.lang.Object) (byte) 100);
        double double41 = frequency1.getCumPct('a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct((int) (short) 1);
        double double9 = frequency1.getPct('#');
        long long10 = frequency1.getSumFreq();
        frequency1.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct((int) (short) 1);
        double double9 = frequency1.getCumPct((int) (short) 100);
        long long11 = frequency1.getCount('#');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCount((java.lang.Object) 100.0f);
        long long16 = frequency13.getSumFreq();
        long long17 = frequency13.getSumFreq();
        long long19 = frequency13.getCumFreq(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount((java.lang.Object) 100.0f);
        long long24 = frequency21.getSumFreq();
        long long25 = frequency21.getSumFreq();
        long long27 = frequency21.getCount((java.lang.Object) "");
        long long28 = frequency13.getCumFreq((java.lang.Object) frequency21);
        long long30 = frequency21.getCount((int) 'a');
        frequency21.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        long long33 = frequency1.getCumFreq((java.lang.Object) frequency21);
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        long long37 = frequency1.getCount((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        long long9 = frequency7.getCount((java.lang.Object) 100.0f);
        long long10 = frequency7.getSumFreq();
        long long11 = frequency7.getSumFreq();
        long long13 = frequency7.getCumFreq(' ');
        long long15 = frequency7.getCount((java.lang.Object) (byte) -1);
        frequency7.addValue(1);
        long long19 = frequency7.getCumFreq((int) (short) 100);
        long long21 = frequency7.getCumFreq((int) (short) 100);
        frequency1.addValue((java.lang.Object) (short) 100);
        double double24 = frequency1.getCumPct(100L);
        double double26 = frequency1.getPct((long) 1);
        double double28 = frequency1.getPct((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }
}

