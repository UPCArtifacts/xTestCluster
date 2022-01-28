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
        double double7 = frequency1.getPct((-1));
        frequency1.addValue((long) (byte) 1);
        double double11 = frequency1.getCumPct((int) (short) 10);
        double double13 = frequency1.getCumPct((int) ' ');
        frequency1.addValue((java.lang.Integer) 0);
        frequency1.clear();
        frequency1.clear();
        frequency1.addValue((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct(0);
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long11 = frequency1.getCumFreq((long) '#');
        long long12 = frequency1.getSumFreq();
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        long long16 = frequency14.getCount((java.lang.Object) 100.0f);
        long long17 = frequency14.getSumFreq();
        long long18 = frequency14.getSumFreq();
        long long20 = frequency14.getCount((java.lang.Object) "");
        java.util.Iterator iterator21 = frequency14.valuesIterator();
        frequency14.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str24 = frequency14.toString();
        double double26 = frequency14.getCumPct((long) 'a');
        long long28 = frequency14.getCumFreq((long) (byte) 1);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        long long32 = frequency30.getCount((java.lang.Object) 100.0f);
        long long34 = frequency30.getCount((int) (short) 0);
        java.util.Iterator iterator35 = frequency30.valuesIterator();
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        long long39 = frequency37.getCount((java.lang.Object) 100.0f);
        long long41 = frequency37.getCount((int) (short) 0);
        double double43 = frequency37.getCumPct(1L);
        long long45 = frequency37.getCumFreq((java.lang.Object) 10.0d);
        frequency37.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator48 = frequency37.valuesIterator();
        double double49 = frequency30.getCumPct((java.lang.Object) iterator48);
        frequency30.clear();
        long long51 = frequency14.getCount((java.lang.Object) frequency30);
        long long53 = frequency30.getCumFreq((-1L));
        long long55 = frequency30.getCumFreq('#');
        long long57 = frequency30.getCumFreq((int) (short) 100);
        double double58 = frequency1.getCumPct((java.lang.Object) frequency30);
        double double60 = frequency1.getPct((long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
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
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = frequency1.toString();
        double double13 = frequency1.getCumPct((long) 'a');
        long long15 = frequency1.getCumFreq((long) (byte) 1);
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount((java.lang.Object) 100.0f);
        long long21 = frequency17.getCount((int) (short) 0);
        java.util.Iterator iterator22 = frequency17.valuesIterator();
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        long long26 = frequency24.getCount((java.lang.Object) 100.0f);
        long long28 = frequency24.getCount((int) (short) 0);
        double double30 = frequency24.getCumPct(1L);
        long long32 = frequency24.getCumFreq((java.lang.Object) 10.0d);
        frequency24.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator35 = frequency24.valuesIterator();
        double double36 = frequency17.getCumPct((java.lang.Object) iterator35);
        frequency17.clear();
        long long38 = frequency1.getCount((java.lang.Object) frequency17);
        frequency1.clear();
        double double41 = frequency1.getCumPct((int) ' ');
        long long43 = frequency1.getCount(0L);
        frequency1.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = frequency1.toString();
        double double13 = frequency1.getCumPct((long) 'a');
        long long15 = frequency1.getCumFreq((long) (byte) 1);
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount((java.lang.Object) 100.0f);
        long long21 = frequency17.getCount((int) (short) 0);
        java.util.Iterator iterator22 = frequency17.valuesIterator();
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        long long26 = frequency24.getCount((java.lang.Object) 100.0f);
        long long28 = frequency24.getCount((int) (short) 0);
        double double30 = frequency24.getCumPct(1L);
        long long32 = frequency24.getCumFreq((java.lang.Object) 10.0d);
        frequency24.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator35 = frequency24.valuesIterator();
        double double36 = frequency17.getCumPct((java.lang.Object) iterator35);
        frequency17.clear();
        long long38 = frequency1.getCount((java.lang.Object) frequency17);
        frequency1.clear();
        java.lang.String str40 = frequency1.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str40, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        double double19 = frequency11.getPct(' ');
        double double21 = frequency11.getPct('a');
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        long long25 = frequency23.getCount((java.lang.Object) 100.0f);
        long long26 = frequency23.getSumFreq();
        long long27 = frequency23.getSumFreq();
        frequency23.addValue((long) 0);
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCount((java.lang.Object) 100.0f);
        long long35 = frequency31.getCount((int) (short) 0);
        double double37 = frequency31.getCumPct(1L);
        long long39 = frequency31.getCumFreq((java.lang.Object) 10.0d);
        frequency31.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        java.util.Comparator comparator42 = null;
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency(comparator42);
        long long45 = frequency43.getCount((java.lang.Object) 100.0f);
        long long46 = frequency43.getSumFreq();
        long long47 = frequency43.getSumFreq();
        long long49 = frequency43.getCount((java.lang.Object) "");
        double double51 = frequency43.getPct((int) (short) 100);
        java.util.Comparator comparator52 = null;
        org.apache.commons.math.stat.Frequency frequency53 = new org.apache.commons.math.stat.Frequency(comparator52);
        long long55 = frequency53.getCount((java.lang.Object) 100.0f);
        long long57 = frequency53.getCount((int) (short) 0);
        double double59 = frequency53.getCumPct(1L);
        long long61 = frequency53.getCumFreq((java.lang.Object) 10.0d);
        double double62 = frequency43.getCumPct((java.lang.Object) long61);
        double double64 = frequency43.getPct(1);
        long long66 = frequency43.getCount(' ');
        frequency43.addValue(10L);
        long long70 = frequency43.getCount(100);
        long long71 = frequency31.getCount((java.lang.Object) frequency43);
        double double72 = frequency23.getPct((java.lang.Object) frequency43);
        frequency23.addValue((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            frequency11.addValue((java.lang.Object) frequency23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal argument: v");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
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
        long long7 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long12 = frequency9.getSumFreq();
        long long13 = frequency9.getSumFreq();
        long long15 = frequency9.getCount((java.lang.Object) "");
        long long16 = frequency1.getCumFreq((java.lang.Object) frequency9);
        double double18 = frequency1.getCumPct(' ');
        frequency1.clear();
        double double21 = frequency1.getCumPct(1L);
        double double23 = frequency1.getPct('#');
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        long long27 = frequency25.getCount((java.lang.Object) 100.0f);
        long long29 = frequency25.getCount((int) (short) 0);
        double double31 = frequency25.getPct((-1));
        double double33 = frequency25.getCumPct('a');
        long long35 = frequency25.getCumFreq('a');
        long long37 = frequency25.getCount((int) (byte) 100);
        frequency25.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long41 = frequency25.getCount(0L);
        double double42 = frequency1.getPct((java.lang.Object) frequency25);
        java.util.Iterator iterator43 = frequency25.valuesIterator();
        long long45 = frequency25.getCount((long) 100);
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
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        frequency1.addValue('a');
        double double9 = frequency1.getCumPct((int) '#');
        double double11 = frequency1.getPct((int) (short) 100);
        long long12 = frequency1.getSumFreq();
        long long14 = frequency1.getCumFreq(10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        long long9 = frequency1.getCount((java.lang.Object) (byte) -1);
        double double11 = frequency1.getCumPct(0);
        double double13 = frequency1.getPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        frequency1.addValue('a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        long long23 = frequency1.getCumFreq('a');
        long long25 = frequency1.getCount('a');
        java.util.Iterator iterator26 = frequency1.valuesIterator();
        double double28 = frequency1.getCumPct(' ');
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
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
        long long7 = frequency1.getCumFreq('#');
        long long9 = frequency1.getCount(0);
        frequency1.addValue((int) (short) 1);
        long long13 = frequency1.getCumFreq((long) 10);
        long long15 = frequency1.getCount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
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
        long long9 = frequency1.getCount((java.lang.Object) (byte) -1);
        long long11 = frequency1.getCount('a');
        frequency1.addValue('4');
        double double15 = frequency1.getPct((java.lang.Object) (-1));
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = frequency1.getCumFreq(obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        long long9 = frequency1.getCount((java.lang.Object) (byte) -1);
        frequency1.addValue(1);
        long long13 = frequency1.getCumFreq((int) (short) 100);
        long long15 = frequency1.getCumFreq((int) (short) 100);
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount((java.lang.Object) 100.0f);
        long long21 = frequency17.getCount((int) (short) 0);
        double double23 = frequency17.getCumPct(1L);
        frequency17.addValue((java.lang.Integer) (-1));
        double double26 = frequency1.getCumPct((java.lang.Object) (-1));
        frequency1.clear();
        long long29 = frequency1.getCount(' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        frequency1.addValue((java.lang.Integer) 10);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((java.lang.Object) 100.0f);
        double double17 = frequency11.getPct((int) (short) 1);
        double double19 = frequency11.getCumPct((int) (short) 100);
        java.util.Iterator iterator20 = frequency11.valuesIterator();
        double double22 = frequency11.getCumPct(0L);
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        long long26 = frequency24.getCount((java.lang.Object) 100.0f);
        long long28 = frequency24.getCount((int) (short) 0);
        double double30 = frequency24.getCumPct(1L);
        long long32 = frequency24.getCumFreq((java.lang.Object) 10.0d);
        frequency24.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        long long38 = frequency36.getCount((java.lang.Object) 100.0f);
        long long39 = frequency36.getSumFreq();
        long long40 = frequency36.getSumFreq();
        long long42 = frequency36.getCumFreq(' ');
        long long44 = frequency36.getCount((java.lang.Object) (byte) -1);
        long long45 = frequency24.getCumFreq((java.lang.Object) long44);
        java.lang.String str46 = frequency24.toString();
        java.util.Comparator comparator47 = null;
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency(comparator47);
        long long50 = frequency48.getCount((java.lang.Object) 100.0f);
        long long52 = frequency48.getCount((java.lang.Object) 100.0f);
        long long53 = frequency24.getCumFreq((java.lang.Object) frequency48);
        java.util.Iterator iterator54 = frequency24.valuesIterator();
        java.lang.String str55 = frequency24.toString();
        double double56 = frequency11.getPct((java.lang.Object) str55);
        frequency11.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        double double60 = frequency11.getCumPct(' ');
        double double61 = frequency1.getPct((java.lang.Object) double60);
        frequency1.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str46, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str55, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        frequency9.clear();
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        long long25 = frequency23.getCount((java.lang.Object) 100.0f);
        long long26 = frequency23.getSumFreq();
        long long27 = frequency9.getCumFreq((java.lang.Object) long26);
        double double29 = frequency9.getCumPct((long) (-1));
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        long long24 = frequency22.getCount((java.lang.Object) 100.0f);
        long long26 = frequency22.getCount((int) (short) 0);
        double double28 = frequency22.getCumPct(1L);
        long long30 = frequency22.getCumFreq((java.lang.Object) 10.0d);
        frequency22.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long34 = frequency22.getCount((java.lang.Object) 1.0f);
        double double36 = frequency22.getPct((long) (byte) -1);
        long long37 = frequency9.getCount((java.lang.Object) double36);
        long long39 = frequency9.getCount((long) (short) 0);
        double double41 = frequency9.getPct((int) (byte) 1);
        frequency9.addValue(' ');
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
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
        long long22 = frequency9.getCumFreq((int) (short) 100);
        long long24 = frequency9.getCount(' ');
        long long26 = frequency9.getCumFreq('4');
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        long long23 = frequency11.getCumFreq(1);
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        long long27 = frequency25.getCount((java.lang.Object) 100.0f);
        long long29 = frequency25.getCount((int) (short) 0);
        frequency25.addValue('a');
        double double33 = frequency25.getCumPct((int) '#');
        double double35 = frequency25.getPct((int) (short) 100);
        double double37 = frequency25.getPct(' ');
        long long39 = frequency25.getCumFreq((int) (byte) 1);
        double double40 = frequency11.getCumPct((java.lang.Object) frequency25);
        java.util.Comparator comparator41 = null;
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency(comparator41);
        long long44 = frequency42.getCount((java.lang.Object) 100.0f);
        long long45 = frequency42.getSumFreq();
        long long46 = frequency42.getSumFreq();
        long long48 = frequency42.getCumFreq(' ');
        long long50 = frequency42.getCount((java.lang.Object) (byte) -1);
        frequency42.addValue((int) (short) 10);
        double double54 = frequency42.getCumPct(0);
        long long55 = frequency11.getCount((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        frequency1.clear();
        long long42 = frequency1.getCumFreq(' ');
        double double44 = frequency1.getPct('a');
        frequency1.clear();
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
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        long long26 = frequency1.getCount('#');
        long long28 = frequency1.getCount((int) (byte) 1);
        double double30 = frequency1.getCumPct('#');
        long long32 = frequency1.getCount(2L);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        java.util.Comparator comparator59 = null;
        org.apache.commons.math.stat.Frequency frequency60 = new org.apache.commons.math.stat.Frequency(comparator59);
        double double62 = frequency60.getPct(1L);
        long long64 = frequency60.getCount((long) 0);
        long long66 = frequency60.getCount((int) (short) 1);
        double double68 = frequency60.getCumPct((int) '4');
        double double70 = frequency60.getCumPct(3L);
        long long71 = frequency26.getCumFreq((java.lang.Object) 3L);
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
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        long long9 = frequency1.getCount((java.lang.Object) (byte) -1);
        long long11 = frequency1.getCount('4');
        frequency1.addValue('a');
        java.util.Iterator iterator14 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct((-1));
        double double9 = frequency1.getCumPct('a');
        long long11 = frequency1.getCumFreq('a');
        long long13 = frequency1.getCount((int) (byte) 100);
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long17 = frequency1.getCount(0L);
        double double19 = frequency1.getPct((-1));
        double double21 = frequency1.getPct((int) (byte) -1);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        long long25 = frequency23.getCount((java.lang.Object) 100.0f);
        long long27 = frequency23.getCount((int) (short) 0);
        double double29 = frequency23.getCumPct(1L);
        long long31 = frequency23.getCumFreq((java.lang.Object) 10.0d);
        java.util.Comparator comparator32 = null;
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency(comparator32);
        long long35 = frequency33.getCount((java.lang.Object) 100.0f);
        long long37 = frequency33.getCount((int) (short) 0);
        double double39 = frequency33.getCumPct(1L);
        long long41 = frequency33.getCumFreq((java.lang.Object) 10.0d);
        frequency33.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long45 = frequency33.getCount((java.lang.Object) 1.0f);
        double double47 = frequency33.getCumPct((long) (byte) -1);
        double double49 = frequency33.getPct((int) (short) 0);
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        double double53 = frequency51.getCumPct((java.lang.Object) (short) -1);
        long long55 = frequency51.getCumFreq(' ');
        double double57 = frequency51.getPct(1L);
        frequency51.addValue((long) 10);
        long long60 = frequency33.getCumFreq((java.lang.Object) frequency51);
        double double61 = frequency23.getPct((java.lang.Object) frequency51);
        double double62 = frequency1.getPct((java.lang.Object) double61);
        java.util.Comparator comparator63 = null;
        org.apache.commons.math.stat.Frequency frequency64 = new org.apache.commons.math.stat.Frequency(comparator63);
        long long66 = frequency64.getCount((java.lang.Object) 100.0f);
        long long68 = frequency64.getCount((int) (short) 0);
        frequency64.addValue((long) (byte) -1);
        long long72 = frequency64.getCount((int) (byte) 0);
        java.util.Comparator comparator73 = null;
        org.apache.commons.math.stat.Frequency frequency74 = new org.apache.commons.math.stat.Frequency(comparator73);
        double double76 = frequency74.getCumPct((java.lang.Object) (short) -1);
        frequency74.clear();
        double double79 = frequency74.getCumPct((int) (byte) 100);
        double double80 = frequency64.getPct((java.lang.Object) frequency74);
        double double82 = frequency74.getPct(10L);
        java.util.Comparator comparator83 = null;
        org.apache.commons.math.stat.Frequency frequency84 = new org.apache.commons.math.stat.Frequency(comparator83);
        long long86 = frequency84.getCount((java.lang.Object) 100.0f);
        long long87 = frequency84.getSumFreq();
        long long88 = frequency84.getSumFreq();
        java.lang.String str89 = frequency84.toString();
        frequency84.addValue('#');
        long long92 = frequency84.getSumFreq();
        double double93 = frequency74.getPct((java.lang.Object) frequency84);
        frequency74.clear();
        long long96 = frequency74.getCumFreq(' ');
        long long97 = frequency1.getCount((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str89, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double93));
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 0L + "'", long96 == 0L);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 0L + "'", long97 == 0L);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        frequency11.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
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
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct((int) (short) 1);
        long long8 = frequency1.getSumFreq();
        frequency1.addValue('4');
        long long12 = frequency1.getCumFreq((long) '#');
        java.lang.String str13 = frequency1.toString();
        long long15 = frequency1.getCount(0);
        double double17 = frequency1.getCumPct((int) 'a');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCount((java.lang.Object) 100.0f);
        long long23 = frequency19.getCount((int) (short) 0);
        double double25 = frequency19.getPct((-1));
        double double27 = frequency19.getCumPct('a');
        long long29 = frequency19.getCumFreq('a');
        frequency19.addValue((java.lang.Object) 0.0d);
        double double33 = frequency19.getPct(0);
        long long35 = frequency19.getCumFreq((long) (short) 0);
        long long37 = frequency19.getCumFreq('4');
        java.lang.String str38 = frequency19.toString();
        double double40 = frequency19.getPct('a');
        long long42 = frequency19.getCount((long) (byte) 100);
        long long43 = frequency1.getCumFreq((java.lang.Object) long42);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0.0\t1\t100%\t100%\n" + "'", str38, "Value \t Freq. \t Pct. \t Cum Pct. \n0.0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
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
        java.util.Iterator iterator22 = frequency1.valuesIterator();
        long long24 = frequency1.getCumFreq(0);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
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
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct((int) (short) 1);
        double double9 = frequency1.getCumPct((int) (short) 100);
        frequency1.addValue('4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) (short) -1);
        frequency1.clear();
        long long6 = frequency1.getCumFreq(1L);
        java.util.Comparator comparator7 = null;
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency(comparator7);
        long long10 = frequency8.getCount((java.lang.Object) 100.0f);
        long long12 = frequency8.getCount((java.lang.Object) 100.0f);
        double double14 = frequency8.getPct((int) (short) 1);
        double double16 = frequency8.getCumPct((int) (short) 100);
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount((java.lang.Object) 100.0f);
        long long22 = frequency18.getCount((int) (short) 0);
        double double24 = frequency18.getPct((-1));
        double double25 = frequency8.getPct((java.lang.Object) frequency18);
        long long27 = frequency18.getCumFreq('a');
        double double29 = frequency18.getPct(100L);
        long long31 = frequency18.getCount(0);
        double double33 = frequency18.getPct((long) (-1));
        double double34 = frequency1.getPct((java.lang.Object) frequency18);
        java.lang.String str35 = frequency18.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str35, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct((int) (short) 1);
        double double9 = frequency1.getPct('#');
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long14 = frequency11.getSumFreq();
        long long15 = frequency11.getSumFreq();
        long long17 = frequency11.getCumFreq(' ');
        long long19 = frequency11.getCount((java.lang.Object) (byte) -1);
        frequency11.addValue(1);
        double double23 = frequency11.getPct('a');
        long long24 = frequency1.getCount((java.lang.Object) double23);
        double double26 = frequency1.getCumPct('4');
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        long long30 = frequency28.getCount((java.lang.Object) 100.0f);
        long long32 = frequency28.getCount((int) (short) 0);
        double double34 = frequency28.getPct((-1));
        java.util.Iterator iterator35 = frequency28.valuesIterator();
        double double37 = frequency28.getPct((long) 1);
        java.lang.String str38 = frequency28.toString();
        double double39 = frequency1.getCumPct((java.lang.Object) frequency28);
        long long40 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str38, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
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
        double double9 = frequency1.getCumPct((int) (short) 100);
        long long11 = frequency1.getCount('#');
        long long13 = frequency1.getCount((long) '4');
        long long15 = frequency1.getCount(1L);
        double double17 = frequency1.getPct((long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((int) '#');
        long long7 = frequency1.getCumFreq('a');
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
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
        double double9 = frequency1.getCumPct((int) '#');
        long long11 = frequency1.getCumFreq((int) (byte) 10);
        java.util.Iterator iterator12 = frequency1.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        long long10 = frequency1.getCumFreq(' ');
        long long12 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        long long16 = frequency14.getCount((java.lang.Object) 100.0f);
        long long18 = frequency14.getCount((int) (short) 0);
        frequency14.addValue('a');
        long long22 = frequency14.getCumFreq(10L);
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
        java.util.Comparator comparator42 = null;
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency(comparator42);
        long long45 = frequency43.getCount((java.lang.Object) 100.0f);
        long long47 = frequency43.getCount((int) (short) 0);
        double double49 = frequency43.getCumPct(1L);
        long long51 = frequency43.getCumFreq((java.lang.Object) 10.0d);
        frequency43.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Comparator comparator54 = null;
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency(comparator54);
        long long57 = frequency55.getCount((java.lang.Object) 100.0f);
        long long58 = frequency55.getSumFreq();
        long long59 = frequency55.getSumFreq();
        long long61 = frequency55.getCumFreq(' ');
        long long63 = frequency55.getCount((java.lang.Object) (byte) -1);
        long long64 = frequency43.getCumFreq((java.lang.Object) long63);
        java.lang.String str65 = frequency43.toString();
        java.util.Comparator comparator66 = null;
        org.apache.commons.math.stat.Frequency frequency67 = new org.apache.commons.math.stat.Frequency(comparator66);
        long long69 = frequency67.getCount((java.lang.Object) 100.0f);
        long long71 = frequency67.getCount((java.lang.Object) 100.0f);
        long long72 = frequency43.getCumFreq((java.lang.Object) frequency67);
        double double74 = frequency43.getCumPct('a');
        double double75 = frequency24.getCumPct((java.lang.Object) 'a');
        long long76 = frequency14.getCumFreq((java.lang.Object) 'a');
        double double78 = frequency14.getPct('a');
        double double79 = frequency1.getPct((java.lang.Object) double78);
        double double81 = frequency1.getPct('#');
        double double83 = frequency1.getPct((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
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
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str65, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1L + "'", long76 == 1L);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 1.0d + "'", double78 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue(Double.isNaN(double83));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        double double20 = frequency1.getPct(0);
        long long22 = frequency1.getCount((long) 'a');
        double double24 = frequency1.getCumPct(10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        long long10 = frequency1.getCount('#');
        long long12 = frequency1.getCount((int) (short) 100);
        frequency1.addValue((-1));
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        long long18 = frequency16.getCount((java.lang.Object) 100.0f);
        long long19 = frequency16.getSumFreq();
        long long20 = frequency16.getSumFreq();
        long long22 = frequency16.getCount((java.lang.Object) "");
        long long24 = frequency16.getCumFreq(1);
        long long26 = frequency16.getCumFreq((java.lang.Object) 'a');
        frequency16.addValue('a');
        double double29 = frequency1.getCumPct((java.lang.Object) 'a');
        java.lang.String str30 = frequency1.toString();
        long long32 = frequency1.getCount((int) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str30, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCumFreq((long) '#');
        long long7 = frequency1.getCumFreq(1);
        double double9 = frequency1.getCumPct('a');
        double double11 = frequency1.getPct((long) (-1));
        frequency1.addValue('4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
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
        frequency1.addValue((java.lang.Object) 0.0d);
        double double15 = frequency1.getPct(0);
        long long17 = frequency1.getCumFreq((long) (short) 0);
        long long19 = frequency1.getCumFreq('4');
        double double21 = frequency1.getPct('a');
        long long23 = frequency1.getCumFreq('#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
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
        long long21 = frequency1.getCumFreq((int) (short) -1);
        long long22 = frequency1.getSumFreq();
        long long24 = frequency1.getCumFreq('a');
        java.util.Iterator iterator25 = frequency1.valuesIterator();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(iterator25);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = frequency1.toString();
        double double13 = frequency1.getCumPct((long) 'a');
        long long15 = frequency1.getCumFreq((long) (byte) 1);
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount((java.lang.Object) 100.0f);
        long long21 = frequency17.getCount((int) (short) 0);
        java.util.Iterator iterator22 = frequency17.valuesIterator();
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        long long26 = frequency24.getCount((java.lang.Object) 100.0f);
        long long28 = frequency24.getCount((int) (short) 0);
        double double30 = frequency24.getCumPct(1L);
        long long32 = frequency24.getCumFreq((java.lang.Object) 10.0d);
        frequency24.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator35 = frequency24.valuesIterator();
        double double36 = frequency17.getCumPct((java.lang.Object) iterator35);
        frequency17.clear();
        long long38 = frequency1.getCount((java.lang.Object) frequency17);
        frequency1.clear();
        long long41 = frequency1.getCount('#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        frequency1.addValue((long) (short) 0);
        frequency1.addValue((java.lang.Integer) 0);
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
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        long long24 = frequency22.getCount((java.lang.Object) 100.0f);
        long long26 = frequency22.getCount((java.lang.Object) 100.0f);
        double double28 = frequency22.getPct((int) (short) 1);
        double double30 = frequency22.getCumPct((int) (short) 100);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        long long34 = frequency32.getCount((java.lang.Object) 100.0f);
        long long36 = frequency32.getCount((int) (short) 0);
        double double38 = frequency32.getPct((-1));
        double double39 = frequency22.getPct((java.lang.Object) frequency32);
        long long41 = frequency32.getCumFreq('a');
        double double43 = frequency32.getPct(100L);
        long long44 = frequency11.getCount((java.lang.Object) frequency32);
        double double46 = frequency11.getCumPct('4');
        long long47 = frequency11.getSumFreq();
        frequency11.addValue((java.lang.Integer) 0);
        double double51 = frequency11.getCumPct((long) (-1));
        double double53 = frequency11.getPct(10L);
        frequency11.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct('a');
        long long9 = frequency1.getCount(' ');
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long14 = frequency11.getSumFreq();
        long long15 = frequency11.getSumFreq();
        long long17 = frequency11.getCumFreq(' ');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCount((java.lang.Object) 100.0f);
        long long22 = frequency19.getSumFreq();
        long long23 = frequency19.getSumFreq();
        long long25 = frequency19.getCount((java.lang.Object) "");
        long long26 = frequency11.getCumFreq((java.lang.Object) frequency19);
        long long28 = frequency19.getCount(10L);
        long long30 = frequency19.getCumFreq(' ');
        long long32 = frequency19.getCumFreq((long) (byte) 100);
        long long33 = frequency1.getCount((java.lang.Object) frequency19);
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount((java.lang.Object) 100.0f);
        long long39 = frequency35.getCount((int) (short) 0);
        double double41 = frequency35.getCumPct(1L);
        long long43 = frequency35.getCumFreq((java.lang.Object) 10.0d);
        java.util.Comparator comparator44 = null;
        org.apache.commons.math.stat.Frequency frequency45 = new org.apache.commons.math.stat.Frequency(comparator44);
        long long47 = frequency45.getCount((java.lang.Object) 100.0f);
        long long49 = frequency45.getCount((int) (short) 0);
        double double51 = frequency45.getCumPct(1L);
        long long53 = frequency45.getCumFreq((java.lang.Object) 10.0d);
        frequency45.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long57 = frequency45.getCount((java.lang.Object) 1.0f);
        double double59 = frequency45.getCumPct((long) (byte) -1);
        double double61 = frequency45.getPct((int) (short) 0);
        java.util.Comparator comparator62 = null;
        org.apache.commons.math.stat.Frequency frequency63 = new org.apache.commons.math.stat.Frequency(comparator62);
        double double65 = frequency63.getCumPct((java.lang.Object) (short) -1);
        long long67 = frequency63.getCumFreq(' ');
        double double69 = frequency63.getPct(1L);
        frequency63.addValue((long) 10);
        long long72 = frequency45.getCumFreq((java.lang.Object) frequency63);
        double double73 = frequency35.getPct((java.lang.Object) frequency63);
        long long74 = frequency19.getCumFreq((java.lang.Object) frequency63);
        frequency63.clear();
        frequency63.addValue((long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue('4');
        long long7 = frequency1.getCount(100L);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long13 = frequency9.getCount((int) (short) 0);
        frequency9.addValue((long) (byte) -1);
        long long17 = frequency9.getCount((int) (byte) 0);
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getCumPct((java.lang.Object) (short) -1);
        frequency19.clear();
        double double24 = frequency19.getCumPct((int) (byte) 100);
        double double25 = frequency9.getPct((java.lang.Object) frequency19);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((java.lang.Object) frequency9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal argument: v");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        java.util.Iterator iterator43 = frequency29.valuesIterator();
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
        org.junit.Assert.assertNotNull(iterator43);
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
        long long7 = frequency1.getCount((java.lang.Object) "");
        double double9 = frequency1.getPct((int) (short) 100);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((int) (short) 0);
        double double17 = frequency11.getCumPct(1L);
        long long19 = frequency11.getCumFreq((java.lang.Object) 10.0d);
        double double20 = frequency1.getCumPct((java.lang.Object) long19);
        double double22 = frequency1.getPct(1);
        double double24 = frequency1.getPct((long) (short) -1);
        double double26 = frequency1.getCumPct((int) (short) 0);
        long long28 = frequency1.getCount(0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        double double20 = frequency1.getPct(' ');
        frequency1.addValue((int) (byte) 10);
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        long long26 = frequency24.getCount((java.lang.Object) 100.0f);
        long long27 = frequency24.getSumFreq();
        long long28 = frequency24.getSumFreq();
        long long30 = frequency24.getCumFreq(' ');
        long long32 = frequency24.getCount((java.lang.Object) (byte) -1);
        frequency24.addValue((int) (short) 10);
        double double36 = frequency24.getCumPct('4');
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        long long9 = frequency1.getCount((java.lang.Object) (byte) -1);
        double double11 = frequency1.getCumPct(0);
        frequency1.addValue((java.lang.Integer) 1);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        long long17 = frequency15.getCount((java.lang.Object) 100.0f);
        long long18 = frequency15.getSumFreq();
        long long19 = frequency15.getSumFreq();
        long long21 = frequency15.getCount((java.lang.Object) "");
        java.util.Iterator iterator22 = frequency15.valuesIterator();
        frequency15.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str25 = frequency15.toString();
        double double27 = frequency15.getCumPct((long) 'a');
        long long29 = frequency15.getCumFreq((long) (byte) 1);
        double double30 = frequency1.getCumPct((java.lang.Object) frequency15);
        long long32 = frequency1.getCount('#');
        long long34 = frequency1.getCount(0L);
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        long long38 = frequency36.getCount((java.lang.Object) 100.0f);
        long long39 = frequency36.getSumFreq();
        long long40 = frequency36.getSumFreq();
        long long42 = frequency36.getCount((java.lang.Object) "");
        java.util.Iterator iterator43 = frequency36.valuesIterator();
        double double45 = frequency36.getCumPct(' ');
        frequency36.addValue('#');
        double double49 = frequency36.getCumPct('a');
        java.util.Iterator iterator50 = frequency36.valuesIterator();
        long long51 = frequency1.getCount((java.lang.Object) iterator50);
        double double53 = frequency1.getCumPct((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) (short) -1);
        frequency1.clear();
        frequency1.clear();
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
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
        frequency1.addValue('#');
        double double14 = frequency1.getCumPct('a');
        double double16 = frequency1.getPct(10);
        double double18 = frequency1.getPct(' ');
        long long20 = frequency1.getCount((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) (byte) 100);
        frequency1.clear();
        long long8 = frequency1.getCumFreq('a');
        long long10 = frequency1.getCount((int) (short) 10);
        long long11 = frequency1.getSumFreq();
        double double13 = frequency1.getPct(0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        long long43 = frequency1.getCount(0L);
        long long45 = frequency1.getCount('a');
        double double47 = frequency1.getPct((long) (byte) 100);
        long long49 = frequency1.getCumFreq(3L);
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
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        frequency1.addValue(10L);
        double double24 = frequency1.getCumPct((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.5d + "'", double24 == 0.5d);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        double double9 = frequency1.getPct((int) (short) 100);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((int) (short) 0);
        double double17 = frequency11.getCumPct(1L);
        long long19 = frequency11.getCumFreq((java.lang.Object) 10.0d);
        double double20 = frequency1.getCumPct((java.lang.Object) long19);
        double double22 = frequency1.getPct(1);
        long long24 = frequency1.getCount(' ');
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        long long28 = frequency26.getCount((java.lang.Object) 100.0f);
        long long29 = frequency26.getSumFreq();
        long long30 = frequency26.getSumFreq();
        long long32 = frequency26.getCumFreq(' ');
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        long long36 = frequency34.getCount((java.lang.Object) 100.0f);
        long long37 = frequency34.getSumFreq();
        long long38 = frequency34.getSumFreq();
        long long40 = frequency34.getCount((java.lang.Object) "");
        long long41 = frequency26.getCumFreq((java.lang.Object) frequency34);
        long long43 = frequency34.getCount(10L);
        long long45 = frequency34.getCumFreq(' ');
        long long47 = frequency34.getCumFreq((long) (byte) 100);
        long long48 = frequency34.getSumFreq();
        double double49 = frequency1.getPct((java.lang.Object) frequency34);
        double double51 = frequency34.getCumPct((long) (byte) 100);
        frequency34.addValue((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        frequency1.clear();
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        long long30 = frequency28.getCount((java.lang.Object) 100.0f);
        long long31 = frequency28.getSumFreq();
        long long32 = frequency28.getSumFreq();
        long long34 = frequency28.getCumFreq(' ');
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        long long38 = frequency36.getCount((java.lang.Object) 100.0f);
        long long39 = frequency36.getSumFreq();
        long long40 = frequency36.getSumFreq();
        long long42 = frequency36.getCount((java.lang.Object) "");
        long long43 = frequency28.getCumFreq((java.lang.Object) frequency36);
        double double45 = frequency28.getCumPct(' ');
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        long long49 = frequency47.getCount((java.lang.Object) 100.0f);
        long long51 = frequency47.getCount((int) (short) 0);
        double double53 = frequency47.getCumPct(1L);
        long long55 = frequency47.getCumFreq((java.lang.Object) 10.0d);
        frequency47.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Comparator comparator58 = null;
        org.apache.commons.math.stat.Frequency frequency59 = new org.apache.commons.math.stat.Frequency(comparator58);
        long long61 = frequency59.getCount((java.lang.Object) 100.0f);
        long long62 = frequency59.getSumFreq();
        long long63 = frequency59.getSumFreq();
        long long65 = frequency59.getCumFreq(' ');
        long long67 = frequency59.getCount((java.lang.Object) (byte) -1);
        long long68 = frequency47.getCumFreq((java.lang.Object) long67);
        java.lang.String str69 = frequency47.toString();
        java.util.Comparator comparator70 = null;
        org.apache.commons.math.stat.Frequency frequency71 = new org.apache.commons.math.stat.Frequency(comparator70);
        long long73 = frequency71.getCount((java.lang.Object) 100.0f);
        long long75 = frequency71.getCount((java.lang.Object) 100.0f);
        long long76 = frequency47.getCumFreq((java.lang.Object) frequency71);
        double double78 = frequency47.getCumPct('a');
        double double79 = frequency28.getCumPct((java.lang.Object) 'a');
        java.lang.String str80 = frequency28.toString();
        long long81 = frequency1.getCumFreq((java.lang.Object) frequency28);
        double double83 = frequency28.getCumPct('a');
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str69, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str80, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
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
        frequency1.addValue((long) (byte) 1);
        double double11 = frequency1.getCumPct((int) (short) 10);
        long long13 = frequency1.getCumFreq(10);
        double double15 = frequency1.getPct(0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
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
        double double18 = frequency1.getCumPct(' ');
        frequency1.clear();
        double double21 = frequency1.getCumPct(1L);
        double double23 = frequency1.getPct('#');
        long long25 = frequency1.getCumFreq((int) (byte) -1);
        java.lang.String str26 = frequency1.toString();
        long long28 = frequency1.getCount(1L);
        double double30 = frequency1.getCumPct('a');
        java.util.Iterator iterator31 = frequency1.valuesIterator();
        frequency1.clear();
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
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str26, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(iterator31);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        double double29 = frequency27.getCumPct((java.lang.Object) (short) -1);
        double double31 = frequency27.getPct('a');
        long long32 = frequency27.getSumFreq();
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        long long36 = frequency34.getCount((java.lang.Object) 100.0f);
        long long38 = frequency34.getCount((java.lang.Object) 100.0f);
        double double40 = frequency34.getPct((int) (short) 1);
        double double42 = frequency34.getCumPct((int) (short) 100);
        long long44 = frequency34.getCount('#');
        long long45 = frequency27.getCount((java.lang.Object) long44);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((java.lang.Object) frequency27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal argument: v");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
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
        long long9 = frequency1.getCount((java.lang.Object) (byte) -1);
        frequency1.clear();
        frequency1.addValue(0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) (short) -1);
        frequency1.clear();
        long long6 = frequency1.getCount((long) (byte) 0);
        frequency1.addValue((java.lang.Integer) 100);
        double double10 = frequency1.getCumPct((int) (byte) 100);
        java.lang.String str11 = frequency1.toString();
        long long13 = frequency1.getCount(' ');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        long long17 = frequency15.getCount((java.lang.Object) 100.0f);
        long long18 = frequency15.getSumFreq();
        long long19 = frequency15.getSumFreq();
        long long21 = frequency15.getCumFreq(' ');
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        long long25 = frequency23.getCount((java.lang.Object) 100.0f);
        long long26 = frequency23.getSumFreq();
        long long27 = frequency23.getSumFreq();
        long long29 = frequency23.getCount((java.lang.Object) "");
        long long30 = frequency15.getCumFreq((java.lang.Object) frequency23);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        long long34 = frequency32.getCount((java.lang.Object) 100.0f);
        long long35 = frequency32.getSumFreq();
        long long36 = frequency32.getSumFreq();
        java.lang.Class<?> wildcardClass37 = frequency32.getClass();
        long long38 = frequency15.getCount((java.lang.Object) wildcardClass37);
        java.util.Comparator comparator39 = null;
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency(comparator39);
        long long42 = frequency40.getCount((java.lang.Object) 100.0f);
        long long44 = frequency40.getCount((int) (short) 0);
        double double46 = frequency40.getCumPct(1L);
        java.util.Comparator comparator47 = null;
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency(comparator47);
        long long50 = frequency48.getCount((java.lang.Object) 100.0f);
        long long51 = frequency48.getSumFreq();
        long long52 = frequency48.getSumFreq();
        long long54 = frequency48.getCumFreq(' ');
        java.util.Comparator comparator55 = null;
        org.apache.commons.math.stat.Frequency frequency56 = new org.apache.commons.math.stat.Frequency(comparator55);
        long long58 = frequency56.getCount((java.lang.Object) 100.0f);
        long long59 = frequency56.getSumFreq();
        long long60 = frequency56.getSumFreq();
        long long62 = frequency56.getCount((java.lang.Object) "");
        long long63 = frequency48.getCumFreq((java.lang.Object) frequency56);
        double double64 = frequency40.getCumPct((java.lang.Object) long63);
        frequency40.clear();
        long long66 = frequency15.getCount((java.lang.Object) frequency40);
        java.util.Comparator comparator67 = null;
        org.apache.commons.math.stat.Frequency frequency68 = new org.apache.commons.math.stat.Frequency(comparator67);
        long long70 = frequency68.getCount((java.lang.Object) 100.0f);
        long long72 = frequency68.getCount((int) (short) 0);
        java.util.Iterator iterator73 = frequency68.valuesIterator();
        java.util.Comparator comparator74 = null;
        org.apache.commons.math.stat.Frequency frequency75 = new org.apache.commons.math.stat.Frequency(comparator74);
        long long77 = frequency75.getCount((java.lang.Object) 100.0f);
        long long79 = frequency75.getCount((int) (short) 0);
        double double81 = frequency75.getCumPct(1L);
        long long83 = frequency75.getCumFreq((java.lang.Object) 10.0d);
        frequency75.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator86 = frequency75.valuesIterator();
        double double87 = frequency68.getCumPct((java.lang.Object) iterator86);
        long long89 = frequency68.getCumFreq((long) (byte) 10);
        long long91 = frequency68.getCumFreq('a');
        java.lang.Class<?> wildcardClass92 = frequency68.getClass();
        long long93 = frequency15.getCumFreq((java.lang.Object) wildcardClass92);
        double double94 = frequency1.getPct((java.lang.Object) long93);
        long long96 = frequency1.getCumFreq(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(iterator73);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertNotNull(iterator86);
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 0L + "'", long91 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L + "'", long93 == 0L);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 0L + "'", long96 == 0L);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct((java.lang.Object) "");
        long long5 = frequency1.getCumFreq(1);
        long long7 = frequency1.getCount((-1L));
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long12 = frequency9.getSumFreq();
        long long13 = frequency9.getSumFreq();
        long long15 = frequency9.getCumFreq(' ');
        long long17 = frequency9.getCount((java.lang.Object) (byte) -1);
        frequency9.addValue((java.lang.Integer) 100);
        java.lang.String str20 = frequency9.toString();
        double double21 = frequency1.getCumPct((java.lang.Object) str20);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        java.lang.String str47 = frequency1.toString();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str47, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        long long34 = frequency1.getCumFreq((int) 'a');
        long long36 = frequency1.getCount('#');
        frequency1.clear();
        double double39 = frequency1.getCumPct((long) ' ');
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((int) '#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        long long9 = frequency7.getCount((java.lang.Object) 100.0f);
        long long11 = frequency7.getCount((java.lang.Object) 100.0f);
        double double13 = frequency7.getPct('#');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        long long17 = frequency15.getCount((java.lang.Object) 100.0f);
        long long18 = frequency15.getSumFreq();
        long long19 = frequency15.getSumFreq();
        long long21 = frequency15.getCumFreq(' ');
        long long23 = frequency15.getCount((java.lang.Object) (byte) -1);
        frequency15.addValue(1);
        long long27 = frequency15.getCumFreq((int) (short) 100);
        double double28 = frequency7.getPct((java.lang.Object) long27);
        frequency7.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        double double31 = frequency1.getCumPct((java.lang.Object) frequency7);
        frequency1.addValue((java.lang.Integer) 10);
        long long35 = frequency1.getCumFreq((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long13 = frequency9.getCount((int) (short) 10);
        frequency9.clear();
        long long15 = frequency1.getCount((java.lang.Object) frequency9);
        long long17 = frequency1.getCumFreq((long) (short) 1);
        double double19 = frequency1.getCumPct((int) (short) 100);
        frequency1.addValue((long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) (short) -1);
        frequency1.clear();
        double double6 = frequency1.getCumPct((int) (byte) 100);
        long long8 = frequency1.getCount(10);
        long long10 = frequency1.getCumFreq('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
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
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        frequency1.addValue('#');
        long long11 = frequency1.getSumFreq();
        double double13 = frequency1.getCumPct((long) (short) 100);
        frequency1.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        double double22 = frequency13.getCumPct((long) 1);
        java.lang.String str23 = frequency13.toString();
        frequency13.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n");
        double double27 = frequency13.getPct(100);
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
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long6 = frequency1.getSumFreq();
        long long8 = frequency1.getCount((long) 'a');
        long long10 = frequency1.getCount('#');
        long long12 = frequency1.getCumFreq((long) (short) -1);
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        long long16 = frequency14.getCount((java.lang.Object) 100.0f);
        long long17 = frequency14.getSumFreq();
        long long18 = frequency14.getSumFreq();
        long long20 = frequency14.getCount((java.lang.Object) "");
        double double22 = frequency14.getPct((int) (short) 100);
        long long23 = frequency1.getCumFreq((java.lang.Object) (short) 100);
        double double25 = frequency1.getCumPct('a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((int) '#');
        frequency1.addValue((java.lang.Integer) 1);
        frequency1.addValue((int) 'a');
        long long11 = frequency1.getCount('4');
        double double13 = frequency1.getPct((int) '4');
        long long15 = frequency1.getCount((-1));
        long long17 = frequency1.getCount('4');
        long long19 = frequency1.getCount('a');
        long long21 = frequency1.getCumFreq(0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long13 = frequency9.getCount((int) (short) 0);
        double double15 = frequency9.getPct((-1));
        frequency9.addValue((long) (byte) 1);
        double double19 = frequency9.getCumPct((int) (short) 10);
        long long20 = frequency1.getCumFreq((java.lang.Object) double19);
        frequency1.addValue((int) (byte) -1);
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
        frequency24.clear();
        double double44 = frequency24.getCumPct(1L);
        long long46 = frequency24.getCount('a');
        java.util.Iterator iterator47 = frequency24.valuesIterator();
        frequency24.addValue((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass50 = frequency24.getClass();
        long long51 = frequency1.getCumFreq((java.lang.Object) frequency24);
        // The following exception was thrown during execution in test generation
        try {
            frequency24.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
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
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        long long60 = frequency51.getCumFreq('4');
        long long62 = frequency51.getCumFreq(' ');
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
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        double double25 = frequency1.getCumPct(100);
        long long27 = frequency1.getCumFreq(0L);
        long long29 = frequency1.getCount((int) '#');
        java.util.Iterator iterator30 = frequency1.valuesIterator();
        java.lang.String str31 = frequency1.toString();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str31, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        frequency1.clear();
        double double21 = frequency1.getCumPct(1L);
        long long23 = frequency1.getCount('a');
        java.util.Iterator iterator24 = frequency1.valuesIterator();
        long long26 = frequency1.getCount((long) (-1));
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        long long30 = frequency28.getCount((java.lang.Object) 100.0f);
        long long31 = frequency28.getSumFreq();
        long long32 = frequency28.getSumFreq();
        long long34 = frequency28.getCount((java.lang.Object) "");
        java.util.Iterator iterator35 = frequency28.valuesIterator();
        frequency28.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str38 = frequency28.toString();
        double double40 = frequency28.getCumPct((long) 'a');
        long long42 = frequency28.getCumFreq((long) (byte) 1);
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        long long46 = frequency44.getCount((java.lang.Object) 100.0f);
        long long48 = frequency44.getCount((int) (short) 0);
        java.util.Iterator iterator49 = frequency44.valuesIterator();
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        long long53 = frequency51.getCount((java.lang.Object) 100.0f);
        long long55 = frequency51.getCount((int) (short) 0);
        double double57 = frequency51.getCumPct(1L);
        long long59 = frequency51.getCumFreq((java.lang.Object) 10.0d);
        frequency51.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator62 = frequency51.valuesIterator();
        double double63 = frequency44.getCumPct((java.lang.Object) iterator62);
        frequency44.clear();
        long long65 = frequency28.getCount((java.lang.Object) frequency44);
        long long67 = frequency44.getCumFreq((-1L));
        long long69 = frequency44.getCumFreq('#');
        long long71 = frequency44.getCumFreq((int) (short) 100);
        frequency44.clear();
        long long73 = frequency1.getCumFreq((java.lang.Object) frequency44);
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
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n" + "'", str38, "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(iterator49);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        long long9 = frequency1.getCount((java.lang.Object) (byte) -1);
        long long11 = frequency1.getCount((long) 0);
        java.lang.Class<?> wildcardClass12 = frequency1.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) (short) 0);
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        frequency1.addValue((-1));
        double double8 = frequency1.getCumPct((long) (byte) 100);
        long long10 = frequency1.getCumFreq((int) (byte) 100);
        long long11 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        long long24 = frequency21.getSumFreq();
        long long25 = frequency21.getSumFreq();
        java.lang.String str26 = frequency21.toString();
        frequency21.addValue('#');
        long long29 = frequency21.getSumFreq();
        double double30 = frequency11.getPct((java.lang.Object) frequency21);
        frequency11.clear();
        java.util.Comparator comparator32 = null;
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency(comparator32);
        long long35 = frequency33.getCount((java.lang.Object) 100.0f);
        long long36 = frequency33.getSumFreq();
        long long37 = frequency33.getSumFreq();
        long long39 = frequency33.getCount((java.lang.Object) "");
        java.util.Iterator iterator40 = frequency33.valuesIterator();
        java.util.Comparator comparator41 = null;
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency(comparator41);
        long long44 = frequency42.getCount((java.lang.Object) 100.0f);
        long long46 = frequency42.getCount((long) '#');
        frequency33.addValue((java.lang.Object) long46);
        double double49 = frequency33.getCumPct('a');
        long long51 = frequency33.getCount('4');
        java.util.Comparator comparator52 = null;
        org.apache.commons.math.stat.Frequency frequency53 = new org.apache.commons.math.stat.Frequency(comparator52);
        long long55 = frequency53.getCount((java.lang.Object) 100.0f);
        long long56 = frequency53.getSumFreq();
        long long57 = frequency53.getSumFreq();
        long long59 = frequency53.getCount((java.lang.Object) "");
        java.util.Comparator comparator60 = null;
        org.apache.commons.math.stat.Frequency frequency61 = new org.apache.commons.math.stat.Frequency(comparator60);
        long long63 = frequency61.getCount((java.lang.Object) 100.0f);
        long long64 = frequency61.getSumFreq();
        long long65 = frequency61.getSumFreq();
        long long67 = frequency61.getCount((java.lang.Object) "");
        java.util.Iterator iterator68 = frequency61.valuesIterator();
        frequency61.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str71 = frequency61.toString();
        double double73 = frequency61.getCumPct((long) 'a');
        long long75 = frequency61.getCount(1);
        double double76 = frequency53.getPct((java.lang.Object) frequency61);
        double double77 = frequency33.getPct((java.lang.Object) frequency61);
        long long78 = frequency61.getSumFreq();
        long long80 = frequency61.getCount((int) (short) 0);
        long long81 = frequency11.getCumFreq((java.lang.Object) frequency61);
        long long83 = frequency61.getCount('#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str26, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n" + "'", str71, "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        double double16 = frequency1.getPct(10);
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount((java.lang.Object) 100.0f);
        long long21 = frequency18.getSumFreq();
        long long22 = frequency18.getSumFreq();
        long long24 = frequency18.getCumFreq(' ');
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        long long28 = frequency26.getCount((java.lang.Object) 100.0f);
        long long29 = frequency26.getSumFreq();
        long long30 = frequency26.getSumFreq();
        long long32 = frequency26.getCount((java.lang.Object) "");
        long long33 = frequency18.getCumFreq((java.lang.Object) frequency26);
        long long35 = frequency26.getCount(10L);
        frequency26.addValue((java.lang.Integer) 0);
        long long39 = frequency26.getCumFreq((int) (short) 100);
        double double40 = frequency1.getPct((java.lang.Object) frequency26);
        // The following exception was thrown during execution in test generation
        try {
            frequency26.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        frequency1.addValue((long) (byte) -1);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getCumPct((java.lang.Object) (short) -1);
        frequency9.clear();
        frequency9.clear();
        double double14 = frequency1.getCumPct((java.lang.Object) frequency9);
        frequency1.addValue((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        long long24 = frequency11.getCumFreq(0);
        frequency11.addValue('4');
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        long long30 = frequency28.getCount((java.lang.Object) 100.0f);
        long long32 = frequency28.getCount((int) (short) 0);
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        long long36 = frequency34.getCount((java.lang.Object) 100.0f);
        long long38 = frequency34.getCount((int) (short) 0);
        double double40 = frequency34.getPct(0);
        long long41 = frequency28.getCount((java.lang.Object) double40);
        long long43 = frequency28.getCount(' ');
        frequency28.addValue((java.lang.Integer) 1);
        double double47 = frequency28.getPct(10);
        // The following exception was thrown during execution in test generation
        try {
            frequency11.addValue((java.lang.Object) frequency28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal argument: v");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n");
        double double21 = frequency1.getCumPct(100);
        double double23 = frequency1.getCumPct((long) '#');
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        long long27 = frequency25.getCount((java.lang.Object) 100.0f);
        long long29 = frequency25.getCount((int) (short) 0);
        frequency25.addValue('a');
        double double32 = frequency1.getPct((java.lang.Object) frequency25);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        java.util.Iterator iterator34 = frequency21.valuesIterator();
        java.lang.Class<?> wildcardClass35 = frequency21.getClass();
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
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        double double21 = frequency11.getCumPct((long) 0);
        long long23 = frequency11.getCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        long long28 = frequency1.getCumFreq(0);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) (byte) 100);
        long long7 = frequency1.getCount((long) (byte) -1);
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCumFreq(0);
        long long12 = frequency1.getCount('4');
        double double14 = frequency1.getPct('4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        long long9 = frequency1.getCount((java.lang.Object) (byte) -1);
        long long11 = frequency1.getCount('a');
        frequency1.addValue('4');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        long long17 = frequency15.getCount((java.lang.Object) 100.0f);
        long long19 = frequency15.getCount((int) (short) 0);
        frequency15.addValue((long) (byte) -1);
        long long23 = frequency15.getCount((int) (byte) 0);
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        double double27 = frequency25.getCumPct((java.lang.Object) (short) -1);
        frequency25.clear();
        double double30 = frequency25.getCumPct((int) (byte) 100);
        double double31 = frequency15.getPct((java.lang.Object) frequency25);
        double double33 = frequency25.getPct(10L);
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount((java.lang.Object) 100.0f);
        long long38 = frequency35.getSumFreq();
        long long39 = frequency35.getSumFreq();
        java.lang.String str40 = frequency35.toString();
        frequency35.addValue('#');
        long long43 = frequency35.getSumFreq();
        double double44 = frequency25.getPct((java.lang.Object) frequency35);
        long long45 = frequency25.getSumFreq();
        long long46 = frequency1.getCumFreq((java.lang.Object) frequency25);
        frequency25.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str40, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        java.lang.String str24 = frequency1.toString();
        long long26 = frequency1.getCumFreq(100L);
        double double28 = frequency1.getPct('a');
        double double30 = frequency1.getPct('#');
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        frequency1.clear();
        double double21 = frequency1.getCumPct(1L);
        double double23 = frequency1.getPct('#');
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        long long27 = frequency25.getCount((java.lang.Object) 100.0f);
        long long29 = frequency25.getCount((int) (short) 0);
        double double31 = frequency25.getPct((-1));
        double double33 = frequency25.getCumPct('a');
        long long35 = frequency25.getCumFreq('a');
        long long37 = frequency25.getCount((int) (byte) 100);
        frequency25.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        long long41 = frequency25.getCount(0L);
        double double42 = frequency1.getPct((java.lang.Object) frequency25);
        java.util.Iterator iterator43 = frequency25.valuesIterator();
        double double45 = frequency25.getPct(' ');
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
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        long long8 = frequency1.getSumFreq();
        double double10 = frequency1.getPct((int) (byte) 0);
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n10\t1\t50%\t100%\n");
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t33%\t33%\n35\t1\t33%\t67%\n97\t1\t33%\t100%\n");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct((-1));
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        long long12 = frequency10.getCount((java.lang.Object) 100.0f);
        long long13 = frequency10.getSumFreq();
        long long14 = frequency10.getSumFreq();
        long long16 = frequency10.getCount((java.lang.Object) "");
        java.util.Iterator iterator17 = frequency10.valuesIterator();
        double double19 = frequency10.getCumPct(' ');
        frequency10.addValue('#');
        long long23 = frequency10.getCount('a');
        long long24 = frequency1.getCumFreq((java.lang.Object) frequency10);
        java.util.Iterator iterator25 = frequency10.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            frequency10.addValue(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(iterator25);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        long long7 = frequency5.getCount((java.lang.Object) 100.0f);
        frequency5.addValue('4');
        long long10 = frequency1.getCount((java.lang.Object) frequency5);
        double double12 = frequency5.getPct((int) (byte) 100);
        long long14 = frequency5.getCumFreq('4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        double double10 = frequency1.getCumPct(' ');
        frequency1.addValue('#');
        long long14 = frequency1.getCumFreq('#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        java.util.Iterator iterator22 = frequency1.valuesIterator();
        long long24 = frequency1.getCumFreq(10);
        double double26 = frequency1.getPct(2L);
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
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        frequency1.clear();
        double double21 = frequency1.getCumPct(1L);
        long long23 = frequency1.getCount('a');
        java.util.Iterator iterator24 = frequency1.valuesIterator();
        long long26 = frequency1.getCount((int) '4');
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
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        long long9 = frequency1.getCount((java.lang.Object) (byte) -1);
        long long10 = frequency1.getSumFreq();
        frequency1.clear();
        double double13 = frequency1.getCumPct((long) (byte) 1);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        long long17 = frequency15.getCount((java.lang.Object) 100.0f);
        long long18 = frequency15.getSumFreq();
        long long19 = frequency15.getSumFreq();
        long long21 = frequency15.getCumFreq(' ');
        long long23 = frequency15.getCount((java.lang.Object) (byte) -1);
        frequency15.addValue((int) (short) 10);
        frequency15.clear();
        long long28 = frequency15.getCount((-1));
        double double29 = frequency1.getCumPct((java.lang.Object) long28);
        long long31 = frequency1.getCumFreq(' ');
        java.lang.Class<?> wildcardClass32 = frequency1.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        long long9 = frequency1.getCount((java.lang.Object) (byte) -1);
        frequency1.addValue((int) (short) 10);
        frequency1.addValue((int) (short) 100);
        double double15 = frequency1.getPct(' ');
        java.util.Iterator iterator16 = frequency1.valuesIterator();
        long long18 = frequency1.getCumFreq((int) (byte) 0);
        double double20 = frequency1.getCumPct('a');
        double double22 = frequency1.getPct(2L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        double double43 = frequency1.getPct(' ');
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
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        long long9 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long13 = frequency1.getCount((java.lang.Object) 1.0f);
        double double15 = frequency1.getPct((long) (byte) -1);
        double double17 = frequency1.getCumPct('a');
        long long19 = frequency1.getCumFreq('a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) (short) -1);
        long long4 = frequency1.getSumFreq();
        java.util.Comparator comparator5 = null;
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency(comparator5);
        long long8 = frequency6.getCount((java.lang.Object) 100.0f);
        long long10 = frequency6.getCount((int) (short) 0);
        frequency6.addValue('a');
        double double14 = frequency6.getCumPct((int) '#');
        double double16 = frequency6.getPct((int) (short) 100);
        double double18 = frequency6.getCumPct('#');
        long long19 = frequency1.getCount((java.lang.Object) frequency6);
        double double21 = frequency1.getPct('4');
        long long22 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        double double35 = frequency1.getCumPct((long) (short) 10);
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        long long39 = frequency37.getCount((java.lang.Object) 100.0f);
        long long41 = frequency37.getCount((int) (short) 0);
        double double43 = frequency37.getCumPct(1L);
        long long45 = frequency37.getCumFreq((java.lang.Object) 10.0d);
        frequency37.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Comparator comparator48 = null;
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency(comparator48);
        long long51 = frequency49.getCount((java.lang.Object) 100.0f);
        long long52 = frequency49.getSumFreq();
        long long53 = frequency49.getSumFreq();
        long long55 = frequency49.getCumFreq(' ');
        long long57 = frequency49.getCount((java.lang.Object) (byte) -1);
        long long58 = frequency37.getCumFreq((java.lang.Object) long57);
        java.lang.String str59 = frequency37.toString();
        long long61 = frequency37.getCount((long) 'a');
        frequency37.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t33%\t33%\n35\t1\t33%\t67%\n97\t1\t33%\t100%\n");
        double double64 = frequency1.getCumPct((java.lang.Object) frequency37);
        long long66 = frequency1.getCumFreq(2L);
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
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n" + "'", str59, "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        long long30 = frequency28.getCount((java.lang.Object) 100.0f);
        long long31 = frequency28.getSumFreq();
        long long32 = frequency28.getSumFreq();
        long long34 = frequency28.getCumFreq(' ');
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        long long38 = frequency36.getCount((java.lang.Object) 100.0f);
        long long39 = frequency36.getSumFreq();
        long long40 = frequency36.getSumFreq();
        long long42 = frequency36.getCount((java.lang.Object) "");
        long long43 = frequency28.getCumFreq((java.lang.Object) frequency36);
        long long45 = frequency36.getCount(10L);
        frequency36.addValue((java.lang.Integer) 0);
        frequency36.addValue((long) 10);
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        long long53 = frequency51.getCount((java.lang.Object) 100.0f);
        long long55 = frequency51.getCount((int) (short) 0);
        double double57 = frequency51.getCumPct(1L);
        java.util.Comparator comparator58 = null;
        org.apache.commons.math.stat.Frequency frequency59 = new org.apache.commons.math.stat.Frequency(comparator58);
        long long61 = frequency59.getCount((java.lang.Object) 100.0f);
        long long62 = frequency59.getSumFreq();
        long long63 = frequency59.getSumFreq();
        long long65 = frequency59.getCumFreq(' ');
        java.util.Comparator comparator66 = null;
        org.apache.commons.math.stat.Frequency frequency67 = new org.apache.commons.math.stat.Frequency(comparator66);
        long long69 = frequency67.getCount((java.lang.Object) 100.0f);
        long long70 = frequency67.getSumFreq();
        long long71 = frequency67.getSumFreq();
        long long73 = frequency67.getCount((java.lang.Object) "");
        long long74 = frequency59.getCumFreq((java.lang.Object) frequency67);
        double double75 = frequency51.getCumPct((java.lang.Object) long74);
        long long77 = frequency51.getCumFreq(0L);
        long long79 = frequency51.getCount(0L);
        frequency51.addValue((java.lang.Comparable<java.lang.String>) "");
        long long82 = frequency51.getSumFreq();
        double double83 = frequency36.getPct((java.lang.Object) long82);
        java.lang.Class<?> wildcardClass84 = frequency36.getClass();
        long long85 = frequency11.getCount((java.lang.Object) wildcardClass84);
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1L + "'", long82 == 1L);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        double double9 = frequency1.getPct((int) (short) 100);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((int) (short) 0);
        double double17 = frequency11.getCumPct(1L);
        long long19 = frequency11.getCumFreq((java.lang.Object) 10.0d);
        double double20 = frequency1.getCumPct((java.lang.Object) long19);
        double double22 = frequency1.getPct(1);
        long long24 = frequency1.getCount(' ');
        frequency1.addValue(10L);
        long long28 = frequency1.getCount(100);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        long long32 = frequency30.getCount((java.lang.Object) 100.0f);
        long long33 = frequency30.getSumFreq();
        long long34 = frequency30.getSumFreq();
        long long36 = frequency30.getCumFreq(' ');
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        long long40 = frequency38.getCount((java.lang.Object) 100.0f);
        long long41 = frequency38.getSumFreq();
        long long42 = frequency38.getSumFreq();
        long long44 = frequency38.getCount((java.lang.Object) "");
        long long45 = frequency30.getCumFreq((java.lang.Object) frequency38);
        long long46 = frequency30.getSumFreq();
        long long48 = frequency30.getCount('4');
        java.lang.String str49 = frequency30.toString();
        java.util.Iterator iterator50 = frequency30.valuesIterator();
        double double51 = frequency1.getPct((java.lang.Object) frequency30);
        long long53 = frequency30.getCumFreq((int) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str49, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        double double19 = frequency1.getPct((int) '4');
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue(obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal argument: v");
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getCumPct(1L);
        long long9 = frequency1.getCumFreq((java.lang.Object) 10.0d);
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long13 = frequency1.getCount((java.lang.Object) 1.0f);
        frequency1.clear();
        double double16 = frequency1.getPct('4');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount((java.lang.Object) 100.0f);
        long long21 = frequency18.getSumFreq();
        long long22 = frequency18.getSumFreq();
        long long24 = frequency18.getCount((java.lang.Object) "");
        java.util.Iterator iterator25 = frequency18.valuesIterator();
        frequency18.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str28 = frequency18.toString();
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        long long32 = frequency30.getCount((java.lang.Object) 100.0f);
        long long34 = frequency30.getCount((int) (short) 0);
        java.util.Iterator iterator35 = frequency30.valuesIterator();
        long long36 = frequency18.getCount((java.lang.Object) frequency30);
        double double38 = frequency18.getPct(100);
        double double40 = frequency18.getPct(0);
        long long42 = frequency18.getCount('a');
        long long44 = frequency18.getCount((-1L));
        frequency1.addValue((java.lang.Object) long44);
        frequency1.addValue((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        frequency1.clear();
        double double42 = frequency1.getPct('4');
        long long44 = frequency1.getCount((long) 1);
        frequency1.addValue((java.lang.Integer) 1);
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
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        java.lang.String str24 = frequency1.toString();
        long long26 = frequency1.getCumFreq(100L);
        double double28 = frequency1.getPct('#');
        long long30 = frequency1.getCumFreq(2L);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        long long22 = frequency9.getCumFreq((java.lang.Object) (byte) 100);
        long long24 = frequency9.getCumFreq(0L);
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        long long28 = frequency26.getCount((java.lang.Object) 100.0f);
        long long30 = frequency26.getCount((int) (short) 10);
        frequency26.clear();
        java.util.Iterator iterator32 = frequency26.valuesIterator();
        long long33 = frequency9.getCumFreq((java.lang.Object) frequency26);
        frequency26.addValue((java.lang.Comparable<java.lang.String>) "hi!");
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        double double58 = frequency29.getCumPct('#');
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
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        double double10 = frequency1.getCumPct(' ');
        frequency1.addValue('#');
        long long14 = frequency1.getCount((long) ' ');
        double double16 = frequency1.getCumPct(' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount((java.lang.Object) 100.0f);
        long long22 = frequency18.getCount((int) (short) 0);
        double double24 = frequency18.getPct((-1));
        double double26 = frequency18.getCumPct('a');
        long long28 = frequency18.getCumFreq('a');
        long long29 = frequency1.getCumFreq((java.lang.Object) frequency18);
        long long31 = frequency18.getCount('a');
        java.util.Comparator comparator32 = null;
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency(comparator32);
        long long35 = frequency33.getCount((java.lang.Object) 100.0f);
        long long37 = frequency33.getCount((int) (short) 0);
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        long long41 = frequency39.getCount((java.lang.Object) 100.0f);
        long long43 = frequency39.getCount((int) (short) 0);
        double double45 = frequency39.getPct(0);
        long long46 = frequency33.getCount((java.lang.Object) double45);
        long long47 = frequency18.getCumFreq((java.lang.Object) double45);
        double double49 = frequency18.getCumPct((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct((int) (short) 1);
        double double9 = frequency1.getPct('#');
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        frequency11.addValue((int) '#');
        frequency11.addValue((java.lang.Integer) 1);
        frequency11.addValue((int) 'a');
        long long21 = frequency11.getCount('4');
        double double23 = frequency11.getPct((int) '4');
        long long25 = frequency11.getCount((-1));
        double double27 = frequency11.getCumPct(100L);
        double double28 = frequency1.getPct((java.lang.Object) 100L);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        long long32 = frequency30.getCount((java.lang.Object) 100.0f);
        long long33 = frequency30.getSumFreq();
        long long34 = frequency30.getSumFreq();
        long long36 = frequency30.getCumFreq(' ');
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        long long40 = frequency38.getCount((java.lang.Object) 100.0f);
        long long41 = frequency38.getSumFreq();
        long long42 = frequency38.getSumFreq();
        long long44 = frequency38.getCount((java.lang.Object) "");
        long long45 = frequency30.getCumFreq((java.lang.Object) frequency38);
        double double47 = frequency30.getCumPct(' ');
        frequency30.clear();
        double double50 = frequency30.getCumPct(1L);
        double double52 = frequency30.getPct('#');
        long long54 = frequency30.getCumFreq((int) (byte) -1);
        long long56 = frequency30.getCumFreq(3L);
        long long57 = frequency1.getCount((java.lang.Object) 3L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct((-1));
        frequency1.addValue((long) (byte) 1);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long14 = frequency11.getSumFreq();
        long long15 = frequency11.getSumFreq();
        long long17 = frequency11.getCount((java.lang.Object) "");
        java.util.Iterator iterator18 = frequency11.valuesIterator();
        long long20 = frequency11.getCount('#');
        long long22 = frequency11.getCount((int) (short) 100);
        frequency11.clear();
        long long24 = frequency1.getCumFreq((java.lang.Object) frequency11);
        frequency11.addValue(10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        frequency26.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        long long56 = frequency26.getCumFreq((long) 100);
        long long58 = frequency26.getCumFreq(3L);
        long long59 = frequency26.getSumFreq();
        long long61 = frequency26.getCount((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        java.util.Comparator comparator54 = null;
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency(comparator54);
        double double57 = frequency55.getCumPct((java.lang.Object) (short) -1);
        frequency55.clear();
        long long60 = frequency55.getCount((long) (byte) 0);
        frequency55.addValue((java.lang.Integer) 100);
        double double64 = frequency55.getCumPct((int) (byte) 100);
        java.lang.String str65 = frequency55.toString();
        double double66 = frequency26.getPct((java.lang.Object) frequency55);
        java.util.Iterator iterator67 = frequency26.valuesIterator();
        double double69 = frequency26.getCumPct(100L);
        long long70 = frequency26.getSumFreq();
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
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str65, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(iterator67);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue('4');
        double double7 = frequency1.getPct((int) '4');
        long long9 = frequency1.getCumFreq((int) (short) 100);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((int) (short) 0);
        java.util.Iterator iterator16 = frequency11.valuesIterator();
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount((java.lang.Object) 100.0f);
        long long22 = frequency18.getCount((int) (short) 0);
        double double24 = frequency18.getCumPct(1L);
        long long26 = frequency18.getCumFreq((java.lang.Object) 10.0d);
        frequency18.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator29 = frequency18.valuesIterator();
        double double30 = frequency11.getCumPct((java.lang.Object) iterator29);
        long long32 = frequency11.getCumFreq((long) (byte) 10);
        long long34 = frequency11.getCumFreq('a');
        long long35 = frequency1.getCount((java.lang.Object) long34);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        frequency1.clear();
        double double42 = frequency1.getPct((long) 10);
        long long44 = frequency1.getCumFreq((int) (short) 100);
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
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        frequency1.addValue('a');
        long long9 = frequency1.getCount('#');
        long long11 = frequency1.getCumFreq(10L);
        double double13 = frequency1.getCumPct((int) 'a');
        long long15 = frequency1.getCumFreq((int) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        double double10 = frequency1.getCumPct(' ');
        frequency1.addValue('#');
        double double14 = frequency1.getPct('#');
        frequency1.addValue('a');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount((java.lang.Object) 100.0f);
        long long21 = frequency18.getSumFreq();
        long long22 = frequency18.getSumFreq();
        long long24 = frequency18.getCount((java.lang.Object) "");
        double double26 = frequency18.getPct((int) (short) 100);
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        long long30 = frequency28.getCount((java.lang.Object) 100.0f);
        long long32 = frequency28.getCount((int) (short) 0);
        double double34 = frequency28.getCumPct(1L);
        long long36 = frequency28.getCumFreq((java.lang.Object) 10.0d);
        double double37 = frequency18.getCumPct((java.lang.Object) long36);
        double double39 = frequency18.getPct(1);
        long long41 = frequency18.getCount(' ');
        java.lang.String str42 = frequency18.toString();
        long long44 = frequency18.getCumFreq((int) 'a');
        double double46 = frequency18.getPct((long) (short) -1);
        long long47 = frequency1.getCount((java.lang.Object) frequency18);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str42, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        double double16 = frequency1.getCumPct((long) (short) 1);
        frequency1.clear();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.lang.Object obj8 = null;
        long long9 = frequency1.getCumFreq(obj8);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((int) (short) 0);
        double double17 = frequency11.getPct((-1));
        double double19 = frequency11.getCumPct('a');
        long long21 = frequency11.getCumFreq('a');
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        long long25 = frequency23.getCount((java.lang.Object) 100.0f);
        long long27 = frequency23.getCount((java.lang.Object) (byte) 100);
        java.util.Iterator iterator28 = frequency23.valuesIterator();
        java.util.Iterator iterator29 = frequency23.valuesIterator();
        long long30 = frequency11.getCount((java.lang.Object) frequency23);
        double double32 = frequency23.getCumPct((long) 1);
        java.lang.Object obj33 = null;
        long long34 = frequency23.getCumFreq(obj33);
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        long long38 = frequency36.getCount((java.lang.Object) 100.0f);
        long long40 = frequency36.getCount((int) (short) 0);
        double double42 = frequency36.getPct((-1));
        frequency36.addValue((long) (byte) 1);
        double double46 = frequency36.getCumPct((int) (short) 10);
        java.util.Iterator iterator47 = frequency36.valuesIterator();
        java.lang.String str48 = frequency36.toString();
        long long49 = frequency23.getCumFreq((java.lang.Object) frequency36);
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        long long53 = frequency51.getCount((java.lang.Object) 100.0f);
        long long55 = frequency51.getCount((java.lang.Object) (byte) 100);
        frequency51.clear();
        double double58 = frequency51.getPct((int) (byte) 100);
        frequency51.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t100%\t100%\n");
        java.util.Comparator comparator61 = null;
        org.apache.commons.math.stat.Frequency frequency62 = new org.apache.commons.math.stat.Frequency(comparator61);
        long long64 = frequency62.getCount((java.lang.Object) 100.0f);
        frequency62.addValue((int) '#');
        long long68 = frequency62.getCumFreq((-1L));
        double double69 = frequency51.getCumPct((java.lang.Object) frequency62);
        double double70 = frequency36.getPct((java.lang.Object) frequency51);
        double double71 = frequency1.getCumPct((java.lang.Object) double70);
        java.lang.String str72 = frequency1.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n" + "'", str48, "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str72, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        long long32 = frequency1.getCumFreq((long) 1);
        long long34 = frequency1.getCount('a');
        long long36 = frequency1.getCumFreq(2L);
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) (short) -1);
        double double5 = frequency1.getPct('a');
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \nValue \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((long) 10);
        long long7 = frequency1.getCumFreq(0);
        double double9 = frequency1.getPct('a');
        frequency1.clear();
        frequency1.addValue((java.lang.Integer) 1);
        java.util.Iterator iterator13 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        frequency1.clear();
        long long42 = frequency1.getCount(0L);
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
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        double double22 = frequency13.getCumPct((long) 1);
        java.lang.String str23 = frequency13.toString();
        frequency13.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n");
        frequency13.clear();
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
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        long long28 = frequency26.getCount((java.lang.Object) 100.0f);
        long long29 = frequency26.getSumFreq();
        long long30 = frequency26.getSumFreq();
        long long32 = frequency26.getCumFreq(' ');
        long long34 = frequency26.getCount((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass35 = frequency26.getClass();
        long long36 = frequency1.getCount((java.lang.Object) wildcardClass35);
        long long38 = frequency1.getCumFreq(1);
        long long40 = frequency1.getCumFreq((int) 'a');
        long long42 = frequency1.getCumFreq('a');
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct(0);
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "Value \t Freq. \t Pct. \t Cum Pct. \n");
        long long11 = frequency1.getCumFreq((long) '#');
        long long13 = frequency1.getCount((-1L));
        double double15 = frequency1.getPct(' ');
        frequency1.addValue((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        long long11 = frequency9.getCount((java.lang.Object) 100.0f);
        long long13 = frequency9.getCount((int) (short) 10);
        frequency9.clear();
        long long15 = frequency1.getCount((java.lang.Object) frequency9);
        long long17 = frequency1.getCumFreq((long) (short) 1);
        double double19 = frequency1.getCumPct((int) (short) 100);
        double double21 = frequency1.getCumPct((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        double double64 = frequency26.getCumPct(2L);
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
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        double double7 = frequency1.getPct((-1));
        double double9 = frequency1.getCumPct('a');
        long long11 = frequency1.getCumFreq('a');
        frequency1.addValue((java.lang.Object) 0.0d);
        long long15 = frequency1.getCumFreq((long) (byte) 10);
        long long17 = frequency1.getCumFreq('#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        double double9 = frequency1.getPct((int) (short) 100);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((int) (short) 0);
        double double17 = frequency11.getCumPct(1L);
        long long19 = frequency11.getCumFreq((java.lang.Object) 10.0d);
        double double20 = frequency1.getCumPct((java.lang.Object) long19);
        double double22 = frequency1.getPct(1);
        long long24 = frequency1.getCount(' ');
        long long25 = frequency1.getSumFreq();
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        long long29 = frequency27.getCount((java.lang.Object) 100.0f);
        long long31 = frequency27.getCount((int) (short) 0);
        frequency27.addValue('a');
        double double35 = frequency27.getCumPct((int) '#');
        double double37 = frequency27.getPct((int) (short) 100);
        double double39 = frequency27.getPct(' ');
        long long40 = frequency27.getSumFreq();
        double double41 = frequency1.getCumPct((java.lang.Object) long40);
        frequency1.addValue('a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        double double10 = frequency1.getCumPct(' ');
        frequency1.addValue('#');
        long long14 = frequency1.getCount((long) ' ');
        double double16 = frequency1.getCumPct(' ');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount((java.lang.Object) 100.0f);
        long long22 = frequency18.getCount((int) (short) 0);
        double double24 = frequency18.getPct((-1));
        double double26 = frequency18.getCumPct('a');
        long long28 = frequency18.getCumFreq('a');
        long long29 = frequency1.getCumFreq((java.lang.Object) frequency18);
        long long31 = frequency18.getCount('a');
        java.lang.String str32 = frequency18.toString();
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        long long36 = frequency34.getCount((java.lang.Object) 100.0f);
        long long38 = frequency34.getCount((int) (short) 0);
        double double40 = frequency34.getPct(0);
        frequency34.addValue((long) (byte) 1);
        java.util.Iterator iterator43 = frequency34.valuesIterator();
        long long45 = frequency34.getCount((long) 100);
        double double47 = frequency34.getCumPct((int) (short) 100);
        double double49 = frequency34.getPct(10L);
        long long50 = frequency18.getCumFreq((java.lang.Object) frequency34);
        frequency18.addValue((-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str32, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        long long22 = frequency9.getCumFreq((java.lang.Object) (byte) 100);
        frequency9.addValue((-1));
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
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        frequency1.addValue('a');
        long long9 = frequency1.getCumFreq(10L);
        frequency1.addValue('a');
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
        long long30 = frequency21.getCount(10L);
        long long32 = frequency21.getCumFreq(' ');
        long long34 = frequency21.getCumFreq((long) (byte) 100);
        frequency21.addValue(' ');
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        long long40 = frequency38.getCount((java.lang.Object) 100.0f);
        long long41 = frequency38.getSumFreq();
        long long42 = frequency38.getSumFreq();
        long long44 = frequency38.getCount((java.lang.Object) "");
        java.util.Iterator iterator45 = frequency38.valuesIterator();
        frequency38.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator48 = frequency38.valuesIterator();
        java.lang.String str49 = frequency38.toString();
        long long50 = frequency21.getCumFreq((java.lang.Object) frequency38);
        long long51 = frequency38.getSumFreq();
        long long52 = frequency1.getCount((java.lang.Object) frequency38);
        double double54 = frequency38.getPct(' ');
        long long56 = frequency38.getCumFreq(0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n" + "'", str49, "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        frequency11.addValue((java.lang.Comparable<java.lang.String>) "");
        double double21 = frequency11.getPct((-1));
        long long23 = frequency11.getCount(0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) (short) -1);
        frequency1.clear();
        double double6 = frequency1.getCumPct((int) (byte) 100);
        long long8 = frequency1.getCount(100L);
        frequency1.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        frequency1.addValue((long) ' ');
        double double9 = frequency1.getPct((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        java.util.Comparator comparator5 = null;
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency(comparator5);
        long long8 = frequency6.getCount((java.lang.Object) 100.0f);
        long long10 = frequency6.getCount((int) (short) 0);
        double double12 = frequency6.getCumPct(1L);
        long long14 = frequency6.getCumFreq((java.lang.Object) 10.0d);
        frequency6.addValue((java.lang.Comparable<java.lang.String>) "");
        long long17 = frequency1.getCount((java.lang.Object) "");
        frequency1.addValue((long) (byte) -1);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount((java.lang.Object) 100.0f);
        frequency21.addValue((int) '#');
        frequency21.addValue((java.lang.Integer) 1);
        frequency21.addValue((int) 'a');
        long long31 = frequency21.getCount('4');
        double double33 = frequency21.getPct((int) '4');
        long long35 = frequency21.getCount((-1));
        java.util.Iterator iterator36 = frequency21.valuesIterator();
        double double37 = frequency1.getPct((java.lang.Object) frequency21);
        double double39 = frequency21.getPct(' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        double double19 = frequency11.getPct(' ');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        long long23 = frequency21.getCount((java.lang.Object) 100.0f);
        long long25 = frequency21.getCount((int) (short) 0);
        double double27 = frequency21.getPct((-1));
        java.util.Iterator iterator28 = frequency21.valuesIterator();
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        long long32 = frequency30.getCount((java.lang.Object) 100.0f);
        long long33 = frequency30.getSumFreq();
        long long34 = frequency30.getSumFreq();
        long long36 = frequency30.getCount((java.lang.Object) "");
        java.util.Iterator iterator37 = frequency30.valuesIterator();
        double double39 = frequency30.getCumPct(' ');
        frequency30.addValue('#');
        long long43 = frequency30.getCount('a');
        long long44 = frequency21.getCumFreq((java.lang.Object) frequency30);
        double double45 = frequency11.getPct((java.lang.Object) frequency30);
        frequency11.addValue('a');
        frequency11.clear();
        java.lang.String str49 = frequency11.toString();
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
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str49, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        long long34 = frequency1.getCumFreq((int) 'a');
        java.lang.Object obj35 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long36 = frequency1.getCount(obj35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) (byte) 100);
        frequency1.clear();
        long long8 = frequency1.getCumFreq('a');
        long long10 = frequency1.getCount((int) (short) 10);
        long long11 = frequency1.getSumFreq();
        double double13 = frequency1.getPct((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        java.util.Comparator comparator51 = null;
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency(comparator51);
        long long54 = frequency52.getCount((java.lang.Object) 100.0f);
        long long55 = frequency52.getSumFreq();
        long long56 = frequency52.getSumFreq();
        long long58 = frequency52.getCount((java.lang.Object) "");
        java.lang.Object obj59 = null;
        long long60 = frequency52.getCumFreq(obj59);
        long long61 = frequency11.getCumFreq((java.lang.Object) frequency52);
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
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        long long18 = frequency9.getCount((int) (short) 10);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        long long22 = frequency20.getCount((java.lang.Object) 100.0f);
        long long23 = frequency20.getSumFreq();
        long long24 = frequency20.getSumFreq();
        long long26 = frequency20.getCumFreq(' ');
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        long long30 = frequency28.getCount((java.lang.Object) 100.0f);
        long long32 = frequency28.getCount((int) (short) 10);
        frequency28.clear();
        long long34 = frequency20.getCount((java.lang.Object) frequency28);
        frequency28.addValue((int) 'a');
        frequency28.addValue((long) (short) 10);
        double double40 = frequency28.getCumPct((long) (short) 1);
        long long42 = frequency28.getCount((long) (byte) 1);
        double double43 = frequency9.getCumPct((java.lang.Object) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((java.lang.Object) (short) -1);
        frequency1.clear();
        frequency1.addValue('#');
        double double8 = frequency1.getPct(100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getPct(1L);
        long long5 = frequency1.getCount((long) 0);
        frequency1.addValue('#');
        long long9 = frequency1.getCumFreq((int) (byte) 100);
        double double11 = frequency1.getCumPct((java.lang.Object) 0.0f);
        double double13 = frequency1.getCumPct('a');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        long long17 = frequency15.getCount((java.lang.Object) 100.0f);
        long long19 = frequency15.getCount((int) (short) 0);
        frequency15.addValue((long) (byte) -1);
        long long23 = frequency15.getCount((int) (byte) 0);
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        double double27 = frequency25.getCumPct((java.lang.Object) (short) -1);
        frequency25.clear();
        double double30 = frequency25.getCumPct((int) (byte) 100);
        double double31 = frequency15.getPct((java.lang.Object) frequency25);
        double double33 = frequency25.getPct(10L);
        java.util.Comparator comparator34 = null;
        org.apache.commons.math.stat.Frequency frequency35 = new org.apache.commons.math.stat.Frequency(comparator34);
        long long37 = frequency35.getCount((java.lang.Object) 100.0f);
        long long38 = frequency35.getSumFreq();
        long long39 = frequency35.getSumFreq();
        java.lang.String str40 = frequency35.toString();
        frequency35.addValue('#');
        long long43 = frequency35.getSumFreq();
        double double44 = frequency25.getPct((java.lang.Object) frequency35);
        frequency25.clear();
        double double47 = frequency25.getPct((int) (byte) 1);
        long long48 = frequency1.getCumFreq((java.lang.Object) frequency25);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str40, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) (byte) 100);
        frequency1.clear();
        long long8 = frequency1.getCumFreq('a');
        long long10 = frequency1.getCount((int) (short) 10);
        long long11 = frequency1.getSumFreq();
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
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        long long32 = frequency30.getCount((java.lang.Object) 100.0f);
        long long33 = frequency30.getSumFreq();
        long long34 = frequency30.getSumFreq();
        java.lang.Class<?> wildcardClass35 = frequency30.getClass();
        long long36 = frequency13.getCount((java.lang.Object) wildcardClass35);
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        long long40 = frequency38.getCount((java.lang.Object) 100.0f);
        long long42 = frequency38.getCount((int) (short) 0);
        double double44 = frequency38.getCumPct(1L);
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        long long48 = frequency46.getCount((java.lang.Object) 100.0f);
        long long49 = frequency46.getSumFreq();
        long long50 = frequency46.getSumFreq();
        long long52 = frequency46.getCumFreq(' ');
        java.util.Comparator comparator53 = null;
        org.apache.commons.math.stat.Frequency frequency54 = new org.apache.commons.math.stat.Frequency(comparator53);
        long long56 = frequency54.getCount((java.lang.Object) 100.0f);
        long long57 = frequency54.getSumFreq();
        long long58 = frequency54.getSumFreq();
        long long60 = frequency54.getCount((java.lang.Object) "");
        long long61 = frequency46.getCumFreq((java.lang.Object) frequency54);
        double double62 = frequency38.getCumPct((java.lang.Object) long61);
        frequency38.clear();
        long long64 = frequency13.getCount((java.lang.Object) frequency38);
        frequency38.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        long long68 = frequency38.getCumFreq((-1L));
        long long69 = frequency1.getCumFreq((java.lang.Object) (-1L));
        double double71 = frequency1.getPct('#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str11 = frequency1.toString();
        double double13 = frequency1.getCumPct((long) 'a');
        long long15 = frequency1.getCumFreq((long) (byte) 1);
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        long long19 = frequency17.getCount((java.lang.Object) 100.0f);
        long long21 = frequency17.getCount((int) (short) 0);
        java.util.Iterator iterator22 = frequency17.valuesIterator();
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        long long26 = frequency24.getCount((java.lang.Object) 100.0f);
        long long28 = frequency24.getCount((int) (short) 0);
        double double30 = frequency24.getCumPct(1L);
        long long32 = frequency24.getCumFreq((java.lang.Object) 10.0d);
        frequency24.addValue((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator35 = frequency24.valuesIterator();
        double double36 = frequency17.getCumPct((java.lang.Object) iterator35);
        frequency17.clear();
        long long38 = frequency1.getCount((java.lang.Object) frequency17);
        long long40 = frequency17.getCumFreq((-1L));
        long long42 = frequency17.getCount((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \nhi!\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((int) (short) 0);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        frequency1.addValue((java.lang.Comparable<java.lang.String>) "hi!");
        double double10 = frequency1.getCumPct('4');
        long long11 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        double double9 = frequency1.getPct((int) (short) 100);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((int) (short) 0);
        double double17 = frequency11.getCumPct(1L);
        long long19 = frequency11.getCumFreq((java.lang.Object) 10.0d);
        double double20 = frequency1.getCumPct((java.lang.Object) long19);
        double double22 = frequency1.getPct(1);
        long long24 = frequency1.getCount(' ');
        frequency1.addValue(10L);
        long long28 = frequency1.getCount(100);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        long long32 = frequency30.getCount((java.lang.Object) 100.0f);
        long long33 = frequency30.getSumFreq();
        long long34 = frequency30.getSumFreq();
        long long36 = frequency30.getCumFreq(' ');
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        long long40 = frequency38.getCount((java.lang.Object) 100.0f);
        long long41 = frequency38.getSumFreq();
        long long42 = frequency38.getSumFreq();
        long long44 = frequency38.getCount((java.lang.Object) "");
        long long45 = frequency30.getCumFreq((java.lang.Object) frequency38);
        long long46 = frequency30.getSumFreq();
        long long48 = frequency30.getCount('4');
        java.lang.String str49 = frequency30.toString();
        java.util.Iterator iterator50 = frequency30.valuesIterator();
        double double51 = frequency1.getPct((java.lang.Object) frequency30);
        frequency1.addValue((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str49, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        double double9 = frequency1.getPct((int) (short) 100);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((int) (short) 0);
        double double17 = frequency11.getCumPct(1L);
        long long19 = frequency11.getCumFreq((java.lang.Object) 10.0d);
        double double20 = frequency1.getCumPct((java.lang.Object) long19);
        double double22 = frequency1.getPct(1);
        long long24 = frequency1.getCount(' ');
        java.lang.String str25 = frequency1.toString();
        long long27 = frequency1.getCumFreq((int) 'a');
        double double29 = frequency1.getPct((long) (short) -1);
        double double31 = frequency1.getPct((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        java.lang.String str28 = frequency1.toString();
        double double30 = frequency1.getPct('a');
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCount((java.lang.Object) "");
        double double9 = frequency1.getPct((int) (short) 100);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        long long13 = frequency11.getCount((java.lang.Object) 100.0f);
        long long15 = frequency11.getCount((int) (short) 0);
        double double17 = frequency11.getCumPct(1L);
        long long19 = frequency11.getCumFreq((java.lang.Object) 10.0d);
        double double20 = frequency1.getCumPct((java.lang.Object) long19);
        double double22 = frequency1.getPct(1);
        double double24 = frequency1.getPct((long) (short) -1);
        double double26 = frequency1.getCumPct((int) (short) 0);
        double double28 = frequency1.getCumPct(1L);
        double double30 = frequency1.getPct('4');
        long long32 = frequency1.getCount('#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long4 = frequency1.getSumFreq();
        long long5 = frequency1.getSumFreq();
        long long7 = frequency1.getCumFreq(' ');
        long long9 = frequency1.getCount((java.lang.Object) (byte) -1);
        frequency1.addValue((int) (short) 10);
        frequency1.addValue((int) (short) 100);
        double double15 = frequency1.getPct(' ');
        java.util.Iterator iterator16 = frequency1.valuesIterator();
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        long long20 = frequency18.getCount((java.lang.Object) 100.0f);
        long long22 = frequency18.getCount((java.lang.Object) 100.0f);
        double double24 = frequency18.getPct((int) (short) 1);
        double double26 = frequency18.getCumPct((int) (short) 100);
        long long28 = frequency18.getCount('#');
        long long30 = frequency18.getCount((long) '4');
        frequency18.addValue((long) '4');
        double double33 = frequency1.getCumPct((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass34 = frequency1.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        long long21 = frequency11.getCumFreq((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount((java.lang.Object) 100.0f);
        long long5 = frequency1.getCount((java.lang.Object) (byte) 100);
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        java.util.Iterator iterator7 = frequency1.valuesIterator();
        java.util.Iterator iterator8 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        double double2 = frequency0.getPct((long) (short) -1);
        java.util.Iterator iterator3 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(iterator3);
    }
}

