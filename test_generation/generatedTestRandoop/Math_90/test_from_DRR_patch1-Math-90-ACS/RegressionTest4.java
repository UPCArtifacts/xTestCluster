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
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        long long10 = frequency1.getSumFreq();
        long long12 = frequency1.getCount('#');
        long long14 = frequency1.getCount((long) (short) 0);
        java.util.Iterator iterator15 = frequency1.valuesIterator();
        long long17 = frequency1.getCumFreq((int) 'a');
        java.lang.Class<?> wildcardClass18 = frequency1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        long long9 = frequency1.getCumFreq((long) 0);
        long long10 = frequency1.getSumFreq();
        double double12 = frequency1.getPct(1);
        double double14 = frequency1.getCumPct(' ');
        double double16 = frequency1.getPct((int) ' ');
        frequency1.addValue((java.lang.Integer) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        double double8 = frequency1.getPct('#');
        long long10 = frequency1.getCumFreq((java.lang.Object) 100L);
        java.lang.String str11 = frequency1.toString();
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        long long15 = frequency13.getCumFreq((java.lang.Object) (short) 10);
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        double double19 = frequency17.getCumPct((long) 10);
        long long21 = frequency17.getCount((java.lang.Object) 100.0f);
        frequency17.addValue((java.lang.Integer) (-1));
        frequency17.addValue((java.lang.Integer) 10);
        frequency17.addValue((int) (byte) 1);
        double double28 = frequency13.getCumPct((java.lang.Object) (byte) 1);
        frequency1.addValue((java.lang.Object) double28);
        long long31 = frequency1.getCount((long) (short) 0);
        long long33 = frequency1.getCumFreq(0L);
        long long35 = frequency1.getCount((int) ' ');
        long long37 = frequency1.getCount('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long1 = frequency0.getSumFreq();
        java.lang.String str2 = frequency0.toString();
        java.util.Comparator comparator3 = null;
        org.apache.commons.math.stat.Frequency frequency4 = new org.apache.commons.math.stat.Frequency(comparator3);
        double double6 = frequency4.getCumPct((long) 10);
        long long8 = frequency4.getCumFreq((java.lang.Object) 1.0d);
        double double10 = frequency4.getCumPct((int) '4');
        long long11 = frequency4.getSumFreq();
        long long13 = frequency4.getCount((long) (-1));
        frequency4.addValue(1);
        long long17 = frequency4.getCount(' ');
        long long19 = frequency4.getCumFreq(100L);
        double double20 = frequency0.getPct((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str2, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        long long9 = frequency1.getCount((int) (byte) 0);
        long long11 = frequency1.getCount((long) (byte) -1);
        double double13 = frequency1.getCumPct(100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long23 = frequency19.getSumFreq();
        double double25 = frequency19.getPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        long long27 = frequency19.getCount((long) (short) 10);
        java.util.Comparator comparator28 = null;
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency(comparator28);
        double double31 = frequency29.getCumPct((long) 10);
        double double33 = frequency29.getPct('#');
        java.util.Iterator iterator34 = frequency29.valuesIterator();
        double double36 = frequency29.getPct('#');
        long long38 = frequency29.getCumFreq((java.lang.Object) 100L);
        double double40 = frequency29.getPct('4');
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency41.getSumFreq();
        long long44 = frequency41.getCumFreq((long) 1);
        double double45 = frequency29.getCumPct((java.lang.Object) frequency41);
        frequency41.addValue((java.lang.Integer) 100);
        double double48 = frequency19.getPct((java.lang.Object) frequency41);
        double double50 = frequency19.getPct('4');
        double double52 = frequency19.getPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getCumPct((-1));
        long long9 = frequency1.getCount('#');
        double double11 = frequency1.getPct('4');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        double double17 = frequency13.getPct('#');
        java.util.Iterator iterator18 = frequency13.valuesIterator();
        double double20 = frequency13.getPct('#');
        double double22 = frequency13.getCumPct(' ');
        double double24 = frequency13.getCumPct((int) ' ');
        long long26 = frequency13.getCumFreq(' ');
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        double double30 = frequency28.getCumPct((long) 10);
        double double32 = frequency28.getPct('#');
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        double double36 = frequency34.getCumPct((long) 10);
        long long38 = frequency34.getCumFreq((java.lang.Object) 1.0d);
        double double40 = frequency34.getCumPct((int) '4');
        long long41 = frequency34.getSumFreq();
        double double42 = frequency28.getCumPct((java.lang.Object) long41);
        double double44 = frequency28.getCumPct('#');
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        long long48 = frequency46.getCumFreq((java.lang.Object) (short) 10);
        double double49 = frequency28.getPct((java.lang.Object) frequency46);
        long long51 = frequency46.getCount(0);
        frequency46.addValue((long) ' ');
        double double55 = frequency46.getCumPct(0);
        java.util.Comparator comparator56 = null;
        org.apache.commons.math.stat.Frequency frequency57 = new org.apache.commons.math.stat.Frequency(comparator56);
        double double59 = frequency57.getCumPct((long) 10);
        long long61 = frequency57.getCount((java.lang.Object) 100.0f);
        double double63 = frequency57.getPct(1L);
        long long65 = frequency57.getCumFreq((long) 0);
        double double67 = frequency57.getPct('a');
        double double69 = frequency57.getPct(1);
        double double71 = frequency57.getCumPct((long) (byte) 0);
        long long72 = frequency46.getCumFreq((java.lang.Object) frequency57);
        long long74 = frequency46.getCumFreq('a');
        long long75 = frequency46.getSumFreq();
        double double76 = frequency13.getPct((java.lang.Object) frequency46);
        double double77 = frequency1.getCumPct((java.lang.Object) frequency46);
        long long79 = frequency1.getCumFreq((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long9 = frequency1.getCumFreq((int) (byte) 10);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        long long15 = frequency11.getCount((java.lang.Object) 100.0f);
        frequency11.addValue((java.lang.Integer) (-1));
        frequency11.addValue((java.lang.Integer) 10);
        double double21 = frequency11.getCumPct((long) '4');
        double double22 = frequency1.getCumPct((java.lang.Object) '4');
        long long24 = frequency1.getCount('a');
        double double26 = frequency1.getPct('#');
        long long28 = frequency1.getCumFreq('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        frequency1.clear();
        java.util.Comparator comparator7 = null;
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency(comparator7);
        double double10 = frequency8.getCumPct((long) 10);
        double double12 = frequency8.getPct('#');
        frequency8.addValue((int) '4');
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getCumPct((long) 10);
        long long20 = frequency16.getCumFreq((java.lang.Object) 1.0d);
        long long22 = frequency16.getCumFreq((long) 'a');
        double double24 = frequency16.getPct((java.lang.Object) (byte) 100);
        long long25 = frequency8.getCumFreq((java.lang.Object) (byte) 100);
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        double double29 = frequency27.getCumPct((long) 10);
        double double31 = frequency27.getPct('#');
        double double33 = frequency27.getCumPct((int) '#');
        frequency27.addValue(1);
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        double double39 = frequency37.getCumPct((long) 10);
        double double41 = frequency37.getPct('#');
        double double43 = frequency37.getCumPct((int) '#');
        long long44 = frequency27.getCumFreq((java.lang.Object) double43);
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        double double48 = frequency46.getCumPct((long) 10);
        long long50 = frequency46.getCount((java.lang.Object) 100.0f);
        frequency46.addValue((java.lang.Integer) (-1));
        frequency46.addValue((java.lang.Integer) 10);
        double double56 = frequency46.getCumPct((long) (byte) 10);
        long long57 = frequency27.getCumFreq((java.lang.Object) frequency46);
        long long58 = frequency8.getCumFreq((java.lang.Object) long57);
        double double59 = frequency1.getPct((java.lang.Object) long58);
        long long61 = frequency1.getCount((-1));
        double double63 = frequency1.getPct((int) '4');
        long long65 = frequency1.getCumFreq('#');
        double double67 = frequency1.getCumPct((long) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        frequency1.clear();
        long long10 = frequency1.getCumFreq((long) (byte) 1);
        long long12 = frequency1.getCumFreq((long) 0);
        double double14 = frequency1.getPct((long) (short) 0);
        long long16 = frequency1.getCumFreq((long) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((int) '4');
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        java.lang.String str5 = frequency1.toString();
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n" + "'", str5, "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        frequency1.addValue((java.lang.Integer) (-1));
        double double11 = frequency1.getPct('4');
        long long13 = frequency1.getCount('4');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getCumPct((long) 10);
        double double19 = frequency15.getPct('#');
        java.util.Iterator iterator20 = frequency15.valuesIterator();
        double double22 = frequency15.getPct('#');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getCumPct((long) 10);
        long long28 = frequency24.getCount((java.lang.Object) 100.0f);
        double double30 = frequency24.getPct(1L);
        long long32 = frequency24.getCumFreq((long) 0);
        double double34 = frequency24.getPct('a');
        double double35 = frequency15.getPct((java.lang.Object) 'a');
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        double double39 = frequency37.getCumPct((long) 10);
        long long41 = frequency37.getCount((java.lang.Object) 100.0f);
        long long43 = frequency37.getCumFreq((long) 0);
        double double44 = frequency15.getCumPct((java.lang.Object) frequency37);
        long long46 = frequency15.getCount('a');
        double double48 = frequency15.getPct('a');
        java.util.Comparator comparator49 = null;
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency(comparator49);
        double double52 = frequency50.getCumPct((long) 10);
        long long54 = frequency50.getCount((java.lang.Object) 100.0f);
        double double56 = frequency50.getCumPct((java.lang.Object) false);
        java.util.Comparator comparator57 = null;
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency(comparator57);
        double double60 = frequency58.getCumPct((long) 10);
        long long62 = frequency58.getCumFreq((java.lang.Object) 1.0d);
        double double64 = frequency58.getCumPct((int) '4');
        long long65 = frequency58.getSumFreq();
        long long67 = frequency58.getCount((long) (-1));
        long long69 = frequency58.getCount('4');
        long long71 = frequency58.getCount((java.lang.Object) 10.0f);
        long long72 = frequency50.getCount((java.lang.Object) 10.0f);
        double double73 = frequency15.getPct((java.lang.Object) long72);
        long long74 = frequency1.getCumFreq((java.lang.Object) frequency15);
        java.util.Iterator iterator75 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(iterator75);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getCumPct((long) (-1));
        long long9 = frequency1.getCumFreq('#');
        long long11 = frequency1.getCount((int) '#');
        frequency1.addValue(' ');
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getCumPct((long) 10);
        long long19 = frequency15.getCount((java.lang.Object) 100.0f);
        frequency15.addValue((java.lang.Integer) (-1));
        frequency15.addValue((java.lang.Integer) 10);
        long long25 = frequency15.getCumFreq((int) 'a');
        frequency15.clear();
        double double28 = frequency15.getCumPct('a');
        frequency15.clear();
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getCumPct((long) 10);
        double double35 = frequency31.getPct('#');
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        double double39 = frequency37.getCumPct((long) 10);
        long long41 = frequency37.getCumFreq((java.lang.Object) 1.0d);
        double double43 = frequency37.getCumPct((int) '4');
        long long44 = frequency37.getSumFreq();
        double double45 = frequency31.getCumPct((java.lang.Object) long44);
        double double47 = frequency31.getCumPct('#');
        java.util.Comparator comparator48 = null;
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency(comparator48);
        long long51 = frequency49.getCumFreq((java.lang.Object) (short) 10);
        double double52 = frequency31.getPct((java.lang.Object) frequency49);
        long long54 = frequency49.getCount(0);
        double double56 = frequency49.getCumPct(1);
        java.util.Comparator comparator57 = null;
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency(comparator57);
        double double60 = frequency58.getCumPct((long) 10);
        double double62 = frequency58.getPct('#');
        double double64 = frequency58.getCumPct((int) '#');
        java.lang.String str65 = frequency58.toString();
        long long67 = frequency58.getCumFreq((long) '4');
        java.lang.String str68 = frequency58.toString();
        double double69 = frequency49.getPct((java.lang.Object) str68);
        double double70 = frequency15.getCumPct((java.lang.Object) double69);
        long long72 = frequency15.getCumFreq(1);
        long long74 = frequency15.getCount(0);
        double double75 = frequency1.getCumPct((java.lang.Object) long74);
        frequency1.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 2L + "'", long25 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str65, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str68, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCount((long) (-1));
        double double12 = frequency1.getCumPct((int) (short) 100);
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getCumPct((long) 10);
        long long18 = frequency14.getCount((int) (byte) 10);
        double double20 = frequency14.getPct((long) '#');
        java.lang.String str21 = frequency14.toString();
        long long22 = frequency1.getCount((java.lang.Object) frequency14);
        long long24 = frequency14.getCount((long) '4');
        long long26 = frequency14.getCount(10);
        double double28 = frequency14.getCumPct('a');
        long long30 = frequency14.getCumFreq((long) (short) -1);
        long long32 = frequency14.getCumFreq((int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getPct((long) '#');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCount('a');
        long long12 = frequency1.getCumFreq((long) (byte) 0);
        double double14 = frequency1.getCumPct('#');
        frequency1.addValue(1L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((int) '4');
        long long5 = frequency1.getCumFreq((-1));
        frequency1.addValue((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        long long9 = frequency1.getCount(0L);
        double double11 = frequency1.getPct((int) (short) 100);
        double double13 = frequency1.getPct((int) '4');
        double double15 = frequency1.getCumPct((long) (short) -1);
        frequency1.addValue((java.lang.Integer) 10);
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getCumPct((long) 10);
        long long23 = frequency19.getCount((java.lang.Object) 100.0f);
        frequency19.addValue((java.lang.Integer) (-1));
        frequency19.addValue((java.lang.Integer) 10);
        frequency19.addValue((int) (byte) 1);
        long long30 = frequency1.getCumFreq((java.lang.Object) frequency19);
        java.util.Iterator iterator31 = frequency1.valuesIterator();
        java.lang.Class<?> wildcardClass32 = iterator31.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        double double8 = frequency1.getPct('#');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getCumPct((long) 10);
        long long14 = frequency10.getCount((java.lang.Object) 100.0f);
        double double16 = frequency10.getPct(1L);
        long long18 = frequency10.getCumFreq((long) 0);
        double double20 = frequency10.getPct('a');
        double double21 = frequency1.getPct((java.lang.Object) 'a');
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        double double25 = frequency23.getCumPct((long) 10);
        long long27 = frequency23.getCount((java.lang.Object) 100.0f);
        long long29 = frequency23.getCumFreq((long) 0);
        double double30 = frequency1.getCumPct((java.lang.Object) frequency23);
        long long32 = frequency1.getCount('a');
        double double34 = frequency1.getPct('a');
        java.lang.String str35 = frequency1.toString();
        java.lang.String str36 = frequency1.toString();
        double double38 = frequency1.getPct(0);
        long long40 = frequency1.getCumFreq(0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str35, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str36, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        long long9 = frequency1.getCumFreq('a');
        frequency1.clear();
        long long12 = frequency1.getCount((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        long long9 = frequency1.getCumFreq((long) 0);
        double double11 = frequency1.getPct('a');
        double double13 = frequency1.getPct(1);
        long long15 = frequency1.getCumFreq(0L);
        double double17 = frequency1.getCumPct('a');
        double double19 = frequency1.getCumPct((int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getCumPct((java.lang.Object) false);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getCumPct((long) 10);
        long long13 = frequency9.getCumFreq((java.lang.Object) 1.0d);
        double double15 = frequency9.getCumPct((int) '4');
        long long16 = frequency9.getSumFreq();
        long long18 = frequency9.getCount((long) (-1));
        long long20 = frequency9.getCount('4');
        long long22 = frequency9.getCount((java.lang.Object) 10.0f);
        long long23 = frequency1.getCount((java.lang.Object) 10.0f);
        double double25 = frequency1.getPct(0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency();
        long long8 = frequency6.getCount((long) (byte) -1);
        frequency1.addValue((java.lang.Object) long8);
        java.util.Iterator iterator10 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        long long9 = frequency1.getCumFreq((long) 0);
        double double11 = frequency1.getPct('a');
        double double13 = frequency1.getPct(1);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getCumPct((long) 10);
        double double19 = frequency15.getPct('#');
        double double21 = frequency15.getCumPct((int) '#');
        frequency15.addValue(1);
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        double double27 = frequency25.getCumPct((long) 10);
        double double29 = frequency25.getPct('#');
        double double31 = frequency25.getCumPct((int) '#');
        long long32 = frequency15.getCumFreq((java.lang.Object) double31);
        double double34 = frequency15.getCumPct((long) (short) 0);
        long long35 = frequency1.getCumFreq((java.lang.Object) double34);
        long long37 = frequency1.getCount('#');
        long long39 = frequency1.getCumFreq((int) (short) 1);
        double double41 = frequency1.getPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount('#');
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        java.util.Comparator comparator5 = null;
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency(comparator5);
        double double8 = frequency6.getCumPct((long) 10);
        long long10 = frequency6.getCumFreq((java.lang.Object) 1.0d);
        double double12 = frequency6.getCumPct((int) '4');
        long long13 = frequency6.getSumFreq();
        long long15 = frequency6.getCount((long) (-1));
        long long17 = frequency6.getCount('4');
        long long19 = frequency6.getCount(1);
        double double21 = frequency6.getCumPct((java.lang.Object) (short) 10);
        double double22 = frequency1.getCumPct((java.lang.Object) frequency6);
        frequency6.addValue((long) 100);
        frequency6.addValue((java.lang.Integer) (-1));
        long long28 = frequency6.getCumFreq((int) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        double double11 = frequency7.getPct('#');
        java.util.Iterator iterator12 = frequency7.valuesIterator();
        double double14 = frequency7.getPct('#');
        long long16 = frequency7.getCumFreq((java.lang.Object) 100L);
        long long17 = frequency1.getCount((java.lang.Object) 100L);
        long long19 = frequency1.getCount(' ');
        long long21 = frequency1.getCount(' ');
        frequency1.addValue((long) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long24 = frequency1.getCumFreq(10);
        long long25 = frequency1.getSumFreq();
        java.lang.Class<?> wildcardClass26 = frequency1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        frequency1.addValue((int) '4');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getCumPct((long) 10);
        long long13 = frequency9.getCumFreq((java.lang.Object) 1.0d);
        long long15 = frequency9.getCumFreq((long) 'a');
        double double17 = frequency9.getPct((java.lang.Object) (byte) 100);
        long long18 = frequency1.getCumFreq((java.lang.Object) (byte) 100);
        java.lang.String str19 = frequency1.toString();
        long long21 = frequency1.getCumFreq((int) (short) 0);
        double double23 = frequency1.getCumPct('#');
        java.lang.String str24 = frequency1.toString();
        double double26 = frequency1.getPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        long long9 = frequency1.getCumFreq(100L);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        double double15 = frequency11.getPct('#');
        double double17 = frequency11.getCumPct((int) '#');
        frequency11.addValue(1);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        double double23 = frequency21.getCumPct((long) 10);
        double double25 = frequency21.getPct('#');
        double double27 = frequency21.getCumPct((int) '#');
        long long28 = frequency11.getCumFreq((java.lang.Object) double27);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getCumPct((long) 10);
        long long34 = frequency30.getCount((java.lang.Object) 100.0f);
        frequency30.addValue((java.lang.Integer) (-1));
        frequency30.addValue((java.lang.Integer) 10);
        double double40 = frequency30.getCumPct((long) (byte) 10);
        long long41 = frequency11.getCumFreq((java.lang.Object) frequency30);
        java.util.Comparator comparator42 = null;
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency(comparator42);
        double double45 = frequency43.getCumPct((long) 10);
        long long47 = frequency43.getCount((java.lang.Object) 100.0f);
        frequency43.addValue((java.lang.Integer) (-1));
        frequency43.addValue((java.lang.Integer) 10);
        frequency43.addValue((int) (byte) 1);
        double double54 = frequency30.getPct((java.lang.Object) (byte) 1);
        long long56 = frequency30.getCumFreq('4');
        long long57 = frequency1.getCount((java.lang.Object) '4');
        java.lang.String str58 = frequency1.toString();
        frequency1.addValue('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str58, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getCumPct((long) (-1));
        frequency1.addValue(0);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        double double15 = frequency11.getPct('#');
        double double17 = frequency11.getCumPct((int) '#');
        frequency11.addValue(1);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        double double23 = frequency21.getCumPct((long) 10);
        double double25 = frequency21.getPct('#');
        double double27 = frequency21.getCumPct((int) '#');
        long long28 = frequency11.getCumFreq((java.lang.Object) double27);
        double double30 = frequency11.getCumPct((long) (short) 0);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        long long34 = frequency32.getCount('#');
        java.util.Iterator iterator35 = frequency32.valuesIterator();
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        double double39 = frequency37.getCumPct((long) 10);
        long long41 = frequency37.getCumFreq((java.lang.Object) 1.0d);
        double double43 = frequency37.getCumPct((int) '4');
        long long44 = frequency37.getSumFreq();
        long long46 = frequency37.getCount((long) (-1));
        long long48 = frequency37.getCount('4');
        long long50 = frequency37.getCount(1);
        double double52 = frequency37.getCumPct((java.lang.Object) (short) 10);
        double double53 = frequency32.getCumPct((java.lang.Object) frequency37);
        long long54 = frequency11.getCumFreq((java.lang.Object) frequency37);
        double double55 = frequency1.getPct((java.lang.Object) frequency11);
        long long57 = frequency11.getCumFreq((int) (short) 10);
        long long58 = frequency11.getSumFreq();
        long long60 = frequency11.getCount(3L);
        long long62 = frequency11.getCumFreq(1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long24 = frequency19.getCount(0);
        frequency19.addValue((long) ' ');
        double double28 = frequency19.getCumPct(0);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getCumPct((long) 10);
        long long34 = frequency30.getCount((java.lang.Object) 100.0f);
        double double36 = frequency30.getPct(1L);
        long long38 = frequency30.getCumFreq((long) 0);
        double double40 = frequency30.getPct('a');
        double double42 = frequency30.getPct(1);
        double double44 = frequency30.getCumPct((long) (byte) 0);
        long long45 = frequency19.getCumFreq((java.lang.Object) frequency30);
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        double double49 = frequency47.getCumPct((long) 10);
        double double51 = frequency47.getPct('#');
        frequency47.addValue((int) '4');
        java.util.Comparator comparator54 = null;
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency(comparator54);
        double double57 = frequency55.getCumPct((long) 10);
        long long59 = frequency55.getCumFreq((java.lang.Object) 1.0d);
        long long61 = frequency55.getCumFreq((long) 'a');
        double double63 = frequency55.getPct((java.lang.Object) (byte) 100);
        long long64 = frequency47.getCumFreq((java.lang.Object) (byte) 100);
        java.lang.String str65 = frequency47.toString();
        long long67 = frequency47.getCumFreq((int) (short) 0);
        frequency47.addValue((int) '#');
        frequency30.addValue((java.lang.Object) '#');
        long long72 = frequency30.getCumFreq(1L);
        double double74 = frequency30.getCumPct('a');
        // The following exception was thrown during execution in test generation
        try {
            frequency30.addValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n" + "'", str65, "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        frequency1.addValue(1);
        double double11 = frequency1.getPct((-1L));
        frequency1.addValue((long) (byte) -1);
        long long15 = frequency1.getCount(0L);
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        double double19 = frequency17.getCumPct((long) 10);
        double double21 = frequency17.getPct('#');
        double double23 = frequency17.getCumPct((int) '#');
        frequency17.addValue(1);
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        double double29 = frequency27.getCumPct((long) 10);
        double double31 = frequency27.getPct('#');
        double double33 = frequency27.getCumPct((int) '#');
        long long34 = frequency17.getCumFreq((java.lang.Object) double33);
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        double double38 = frequency36.getCumPct((long) 10);
        long long40 = frequency36.getCount((java.lang.Object) 100.0f);
        frequency36.addValue((java.lang.Integer) (-1));
        frequency36.addValue((java.lang.Integer) 10);
        double double46 = frequency36.getCumPct((long) (byte) 10);
        long long47 = frequency17.getCumFreq((java.lang.Object) frequency36);
        long long49 = frequency17.getCumFreq((int) (short) 100);
        double double51 = frequency17.getPct(' ');
        frequency17.addValue((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((java.lang.Object) frequency17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long9 = frequency1.getCumFreq((int) (byte) 10);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        long long15 = frequency11.getCount((java.lang.Object) 100.0f);
        frequency11.addValue((java.lang.Integer) (-1));
        frequency11.addValue((java.lang.Integer) 10);
        double double21 = frequency11.getCumPct((long) '4');
        double double22 = frequency1.getCumPct((java.lang.Object) '4');
        long long24 = frequency1.getCount('a');
        double double26 = frequency1.getPct('#');
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        double double30 = frequency28.getCumPct((long) 10);
        double double32 = frequency28.getPct('#');
        double double34 = frequency28.getCumPct((int) '#');
        java.lang.String str35 = frequency28.toString();
        long long37 = frequency28.getCumFreq((long) '4');
        java.lang.String str38 = frequency28.toString();
        java.lang.String str39 = frequency28.toString();
        long long41 = frequency28.getCount((int) (short) -1);
        double double43 = frequency28.getCumPct(0);
        double double44 = frequency1.getCumPct((java.lang.Object) double43);
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        double double48 = frequency46.getCumPct((long) 10);
        long long50 = frequency46.getCount((java.lang.Object) 100.0f);
        double double52 = frequency46.getPct(1L);
        frequency46.clear();
        long long55 = frequency46.getCumFreq((long) (byte) 1);
        long long57 = frequency46.getCumFreq((long) 0);
        long long59 = frequency46.getCount((long) (byte) 1);
        java.lang.Class<?> wildcardClass60 = frequency46.getClass();
        double double61 = frequency1.getCumPct((java.lang.Object) frequency46);
        java.lang.String str62 = frequency46.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str35, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str38, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str39, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str62, "Value \t Freq. \t Pct. \t Cum Pct. \n");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCount((java.lang.Object) 100.0f);
        double double13 = frequency7.getPct(1L);
        double double15 = frequency7.getCumPct((int) (short) -1);
        double double16 = frequency5.getCumPct((java.lang.Object) frequency7);
        double double18 = frequency5.getCumPct(10);
        long long19 = frequency5.getSumFreq();
        double double21 = frequency5.getPct((int) 'a');
        long long23 = frequency5.getCumFreq(10L);
        long long25 = frequency5.getCount((int) (short) 0);
        long long26 = frequency1.getCount((java.lang.Object) long25);
        double double28 = frequency1.getPct('#');
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getCumPct((long) 10);
        long long34 = frequency30.getCumFreq((java.lang.Object) 1.0d);
        long long36 = frequency30.getCumFreq((java.lang.Object) (short) 10);
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        double double40 = frequency38.getCumPct((long) 10);
        double double42 = frequency38.getPct('#');
        double double44 = frequency38.getCumPct((int) '#');
        java.lang.String str45 = frequency38.toString();
        frequency38.addValue(' ');
        double double49 = frequency38.getPct('#');
        double double50 = frequency30.getCumPct((java.lang.Object) '#');
        java.util.Iterator iterator51 = frequency30.valuesIterator();
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((java.lang.Object) frequency30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str45, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(iterator51);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long23 = frequency19.getSumFreq();
        double double25 = frequency19.getPct((java.lang.Object) "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        long long27 = frequency19.getCount((long) (short) 10);
        java.util.Comparator comparator28 = null;
        org.apache.commons.math.stat.Frequency frequency29 = new org.apache.commons.math.stat.Frequency(comparator28);
        double double31 = frequency29.getCumPct((long) 10);
        double double33 = frequency29.getPct('#');
        java.util.Iterator iterator34 = frequency29.valuesIterator();
        double double36 = frequency29.getPct('#');
        long long38 = frequency29.getCumFreq((java.lang.Object) 100L);
        double double40 = frequency29.getPct('4');
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency();
        long long42 = frequency41.getSumFreq();
        long long44 = frequency41.getCumFreq((long) 1);
        double double45 = frequency29.getCumPct((java.lang.Object) frequency41);
        frequency41.addValue((java.lang.Integer) 100);
        double double48 = frequency19.getPct((java.lang.Object) frequency41);
        double double50 = frequency19.getPct('4');
        java.util.Comparator comparator51 = null;
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency(comparator51);
        double double54 = frequency52.getCumPct((long) 10);
        double double56 = frequency52.getPct('#');
        double double58 = frequency52.getCumPct((int) '#');
        frequency52.addValue((java.lang.Integer) (-1));
        double double62 = frequency52.getPct('4');
        long long64 = frequency52.getCount('4');
        frequency52.addValue((java.lang.Integer) 1);
        frequency52.clear();
        long long68 = frequency19.getCumFreq((java.lang.Object) frequency52);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        long long9 = frequency1.getCount(0L);
        double double11 = frequency1.getPct((int) (short) 100);
        double double13 = frequency1.getPct((int) '4');
        long long15 = frequency1.getCumFreq((java.lang.Object) (byte) 0);
        long long17 = frequency1.getCumFreq(' ');
        frequency1.addValue((int) (byte) 10);
        long long20 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCount((long) (-1));
        double double12 = frequency1.getCumPct((int) (short) 100);
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getCumPct((long) 10);
        long long18 = frequency14.getCount((int) (byte) 10);
        double double20 = frequency14.getPct((long) '#');
        java.lang.String str21 = frequency14.toString();
        long long22 = frequency1.getCount((java.lang.Object) frequency14);
        long long24 = frequency14.getCount((long) '4');
        frequency14.addValue((int) (short) 0);
        double double28 = frequency14.getPct((long) 10);
        double double30 = frequency14.getPct((long) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        double double11 = frequency1.getCumPct((long) '4');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getCumPct((long) 10);
        long long19 = frequency15.getCount((java.lang.Object) 100.0f);
        double double21 = frequency15.getPct(1L);
        double double23 = frequency15.getCumPct((int) (short) -1);
        double double24 = frequency13.getCumPct((java.lang.Object) frequency15);
        double double26 = frequency13.getCumPct(10);
        long long28 = frequency13.getCumFreq((long) (byte) 0);
        long long29 = frequency1.getCount((java.lang.Object) (byte) 0);
        long long31 = frequency1.getCumFreq((-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getCumPct((java.lang.Object) false);
        long long9 = frequency1.getCount('4');
        frequency1.addValue((java.lang.Integer) 100);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        long long17 = frequency13.getCumFreq((java.lang.Object) 1.0d);
        double double19 = frequency13.getCumPct('4');
        java.lang.String str20 = frequency13.toString();
        long long21 = frequency1.getCumFreq((java.lang.Object) str20);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        frequency23.addValue((int) '4');
        frequency23.addValue(0);
        long long28 = frequency1.getCount((java.lang.Object) frequency23);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getCumPct((long) 10);
        long long34 = frequency30.getCumFreq((java.lang.Object) 1.0d);
        double double36 = frequency30.getCumPct((int) '4');
        long long37 = frequency30.getSumFreq();
        double double39 = frequency30.getPct('a');
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        double double43 = frequency41.getCumPct((long) 10);
        long long45 = frequency41.getCumFreq((java.lang.Object) 1.0d);
        long long47 = frequency41.getCumFreq((long) 'a');
        frequency41.addValue((long) 100);
        java.util.Iterator iterator50 = frequency41.valuesIterator();
        double double51 = frequency30.getPct((java.lang.Object) iterator50);
        double double53 = frequency30.getPct((long) 0);
        java.util.Comparator comparator54 = null;
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency(comparator54);
        double double57 = frequency55.getCumPct((long) 10);
        long long59 = frequency55.getCumFreq((java.lang.Object) 1.0d);
        double double61 = frequency55.getCumPct((int) '4');
        frequency55.addValue(1);
        java.util.Comparator comparator64 = null;
        org.apache.commons.math.stat.Frequency frequency65 = new org.apache.commons.math.stat.Frequency(comparator64);
        double double67 = frequency65.getCumPct((long) 10);
        long long69 = frequency65.getCount((int) (byte) 10);
        double double71 = frequency65.getPct((long) '#');
        double double72 = frequency55.getPct((java.lang.Object) double71);
        double double73 = frequency30.getPct((java.lang.Object) double71);
        long long74 = frequency1.getCount((java.lang.Object) frequency30);
        long long75 = frequency1.getSumFreq();
        java.lang.String str76 = frequency1.toString();
        java.lang.String str77 = frequency1.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str76, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str77, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        frequency1.addValue((int) '4');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getCumPct((long) 10);
        long long13 = frequency9.getCumFreq((java.lang.Object) 1.0d);
        long long15 = frequency9.getCumFreq((long) 'a');
        double double17 = frequency9.getPct((java.lang.Object) (byte) 100);
        long long18 = frequency1.getCumFreq((java.lang.Object) (byte) 100);
        java.lang.String str19 = frequency1.toString();
        long long21 = frequency1.getCumFreq((int) (short) 0);
        frequency1.addValue((java.lang.Integer) 1);
        long long25 = frequency1.getCumFreq('4');
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getCumPct((-1));
        double double9 = frequency1.getPct('a');
        double double11 = frequency1.getPct(' ');
        double double13 = frequency1.getCumPct('a');
        double double15 = frequency1.getPct((long) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long8 = frequency1.getSumFreq();
        double double10 = frequency1.getPct('a');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        double double14 = frequency12.getCumPct((long) 10);
        double double16 = frequency12.getPct('#');
        java.util.Iterator iterator17 = frequency12.valuesIterator();
        double double19 = frequency12.getPct('#');
        long long21 = frequency12.getCumFreq((java.lang.Object) 100L);
        long long22 = frequency1.getCount((java.lang.Object) 100L);
        long long24 = frequency1.getCount(0);
        double double26 = frequency1.getCumPct((long) (byte) -1);
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        double double30 = frequency28.getCumPct((long) 10);
        double double32 = frequency28.getPct('#');
        frequency28.addValue((int) '4');
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        double double38 = frequency36.getCumPct((long) 10);
        long long40 = frequency36.getCumFreq((java.lang.Object) 1.0d);
        long long42 = frequency36.getCumFreq((long) 'a');
        double double44 = frequency36.getPct((java.lang.Object) (byte) 100);
        long long45 = frequency28.getCumFreq((java.lang.Object) (byte) 100);
        java.lang.String str46 = frequency28.toString();
        long long48 = frequency28.getCumFreq((int) (short) 0);
        frequency28.addValue((long) (byte) 100);
        frequency28.addValue((-1L));
        double double54 = frequency28.getCumPct((long) (short) -1);
        double double56 = frequency28.getPct(1L);
        long long58 = frequency28.getCumFreq('a');
        long long59 = frequency1.getCumFreq((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n" + "'", str46, "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.3333333333333333d + "'", double54 == 0.3333333333333333d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        long long9 = frequency1.getCount((int) (byte) 0);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        double double15 = frequency11.getPct('#');
        java.util.Iterator iterator16 = frequency11.valuesIterator();
        double double17 = frequency1.getPct((java.lang.Object) frequency11);
        long long19 = frequency1.getCount((int) (byte) 100);
        double double21 = frequency1.getCumPct((int) (short) 10);
        double double23 = frequency1.getCumPct((int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        long long11 = frequency1.getCumFreq((int) (byte) 10);
        long long13 = frequency1.getCumFreq('#');
        double double15 = frequency1.getPct((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long24 = frequency19.getCount(0);
        double double26 = frequency19.getCumPct(1);
        double double28 = frequency19.getPct('a');
        double double30 = frequency19.getPct((long) (byte) 100);
        frequency19.addValue('4');
        double double34 = frequency19.getCumPct((long) (short) 1);
        long long36 = frequency19.getCount((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        frequency1.addValue((int) (byte) 1);
        double double13 = frequency1.getPct((int) (byte) 1);
        double double15 = frequency1.getPct(100L);
        double double17 = frequency1.getCumPct(' ');
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3333333333333333d + "'", double13 == 0.3333333333333333d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        long long11 = frequency1.getCumFreq((int) 'a');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        long long17 = frequency13.getCount((java.lang.Object) 100.0f);
        frequency13.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Object) (-1));
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        double double24 = frequency22.getCumPct((long) 10);
        long long26 = frequency22.getCount((java.lang.Object) 100.0f);
        frequency22.addValue((java.lang.Integer) (-1));
        frequency22.addValue((java.lang.Integer) 10);
        long long31 = frequency22.getSumFreq();
        long long33 = frequency22.getCount((int) (short) 0);
        long long35 = frequency22.getCount('a');
        long long37 = frequency22.getCount('4');
        double double38 = frequency1.getPct((java.lang.Object) frequency22);
        frequency22.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 2L + "'", long31 == 2L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(2L);
        long long11 = frequency1.getCount('a');
        java.util.Iterator iterator12 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getCumPct((-1));
        long long9 = frequency1.getCount('#');
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        long long15 = frequency11.getCumFreq((java.lang.Object) 1.0d);
        long long17 = frequency11.getCumFreq((long) 'a');
        double double19 = frequency11.getPct((java.lang.Object) (byte) 100);
        double double21 = frequency11.getCumPct((long) (-1));
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        double double25 = frequency23.getCumPct((long) 10);
        long long27 = frequency23.getCount((java.lang.Object) 100.0f);
        frequency23.addValue((java.lang.Integer) (-1));
        frequency23.addValue((java.lang.Integer) 10);
        frequency23.addValue((int) (byte) 1);
        double double35 = frequency23.getPct((int) (byte) 1);
        frequency23.addValue((int) '4');
        double double38 = frequency11.getPct((java.lang.Object) frequency23);
        double double39 = frequency1.getPct((java.lang.Object) frequency11);
        long long41 = frequency11.getCount((long) (short) 1);
        frequency11.addValue((int) ' ');
        long long45 = frequency11.getCount((long) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.3333333333333333d + "'", double35 == 0.3333333333333333d);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long9 = frequency1.getCumFreq((int) (byte) 10);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        long long15 = frequency11.getCount((java.lang.Object) 100.0f);
        frequency11.addValue((java.lang.Integer) (-1));
        frequency11.addValue((java.lang.Integer) 10);
        double double21 = frequency11.getCumPct((long) '4');
        double double22 = frequency1.getCumPct((java.lang.Object) '4');
        long long24 = frequency1.getCount('a');
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        double double28 = frequency26.getCumPct((long) 10);
        long long30 = frequency26.getCumFreq((java.lang.Object) 1.0d);
        long long32 = frequency26.getCumFreq((java.lang.Object) (short) 10);
        double double34 = frequency26.getCumPct((int) (byte) 0);
        double double36 = frequency26.getPct((long) (short) 100);
        double double37 = frequency1.getPct((java.lang.Object) (short) 100);
        long long39 = frequency1.getCount((int) (short) 0);
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        double double43 = frequency41.getCumPct((long) 10);
        long long45 = frequency41.getCount((int) (byte) 10);
        frequency41.addValue('4');
        long long48 = frequency41.getSumFreq();
        long long49 = frequency1.getCumFreq((java.lang.Object) long48);
        double double51 = frequency1.getCumPct((long) 100);
        long long53 = frequency1.getCumFreq((-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        double double24 = frequency19.getCumPct((java.lang.Object) (short) 100);
        long long26 = frequency19.getCumFreq((long) (byte) 0);
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        double double30 = frequency28.getCumPct((long) 10);
        long long32 = frequency28.getCount((java.lang.Object) 100.0f);
        double double34 = frequency28.getPct(1L);
        long long35 = frequency19.getCumFreq((java.lang.Object) frequency28);
        double double37 = frequency28.getCumPct((int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((int) '4');
        java.lang.String str4 = frequency1.toString();
        long long5 = frequency1.getSumFreq();
        frequency1.addValue((long) (-1));
        frequency1.clear();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n" + "'", str4, "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct((long) (short) 0);
        frequency1.addValue(0L);
        double double21 = frequency1.getPct(3L);
        java.lang.String str22 = frequency1.toString();
        java.lang.String str23 = frequency1.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getCumPct((java.lang.Object) false);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getCumPct((long) 10);
        long long13 = frequency9.getCumFreq((java.lang.Object) 1.0d);
        double double15 = frequency9.getCumPct((int) '4');
        long long16 = frequency9.getSumFreq();
        long long18 = frequency9.getCount((long) (-1));
        long long20 = frequency9.getCount('4');
        long long22 = frequency9.getCount((java.lang.Object) 10.0f);
        long long23 = frequency1.getCount((java.lang.Object) 10.0f);
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        double double27 = frequency25.getCumPct((long) 10);
        long long29 = frequency25.getCumFreq((java.lang.Object) 1.0d);
        double double31 = frequency25.getCumPct((int) '4');
        long long32 = frequency25.getSumFreq();
        double double34 = frequency25.getPct('a');
        frequency25.addValue(0L);
        frequency25.clear();
        long long38 = frequency1.getCumFreq((java.lang.Object) frequency25);
        long long40 = frequency25.getCumFreq('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long8 = frequency1.getSumFreq();
        double double10 = frequency1.getPct('a');
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        double double14 = frequency12.getCumPct((long) 10);
        long long16 = frequency12.getCumFreq((java.lang.Object) 1.0d);
        long long18 = frequency12.getCumFreq((long) 'a');
        frequency12.addValue((long) 100);
        java.util.Iterator iterator21 = frequency12.valuesIterator();
        double double22 = frequency1.getPct((java.lang.Object) iterator21);
        double double24 = frequency1.getPct((long) 0);
        double double26 = frequency1.getCumPct((-1));
        frequency1.addValue((int) (short) -1);
        double double30 = frequency1.getCumPct(' ');
        double double32 = frequency1.getCumPct((int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCount((long) (-1));
        long long12 = frequency1.getCount('4');
        long long14 = frequency1.getCount(1);
        long long16 = frequency1.getCount((int) (short) 1);
        double double18 = frequency1.getCumPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        frequency1.clear();
        frequency1.addValue((long) (byte) 0);
        long long12 = frequency1.getCount(0);
        double double14 = frequency1.getPct((long) '#');
        long long16 = frequency1.getCumFreq((int) ' ');
        double double18 = frequency1.getCumPct((long) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        frequency1.addValue((int) '4');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getCumPct((long) 10);
        long long13 = frequency9.getCumFreq((java.lang.Object) 1.0d);
        long long15 = frequency9.getCumFreq((long) 'a');
        double double17 = frequency9.getPct((java.lang.Object) (byte) 100);
        long long18 = frequency1.getCumFreq((java.lang.Object) (byte) 100);
        java.lang.String str19 = frequency1.toString();
        long long21 = frequency1.getCumFreq((int) (short) 0);
        frequency1.addValue((long) (byte) 100);
        frequency1.addValue((-1L));
        double double27 = frequency1.getCumPct((long) (short) -1);
        double double29 = frequency1.getPct(1L);
        long long31 = frequency1.getCount('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.3333333333333333d + "'", double27 == 0.3333333333333333d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        double double8 = frequency1.getPct('#');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getCumPct((long) 10);
        long long14 = frequency10.getCount((java.lang.Object) 100.0f);
        double double16 = frequency10.getPct(1L);
        long long18 = frequency10.getCumFreq((long) 0);
        double double20 = frequency10.getPct('a');
        double double21 = frequency1.getPct((java.lang.Object) 'a');
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        double double25 = frequency23.getCumPct((long) 10);
        long long27 = frequency23.getCount((java.lang.Object) 100.0f);
        long long29 = frequency23.getCumFreq((long) 0);
        double double30 = frequency1.getCumPct((java.lang.Object) frequency23);
        long long32 = frequency1.getCount('a');
        long long34 = frequency1.getCount('4');
        frequency1.addValue((java.lang.Integer) 10);
        java.util.Iterator iterator37 = frequency1.valuesIterator();
        java.lang.Class<?> wildcardClass38 = iterator37.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        long long9 = frequency1.getCount((int) (byte) 0);
        long long11 = frequency1.getCount((long) (byte) -1);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        double double17 = frequency13.getPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getCumPct((long) 10);
        long long23 = frequency19.getCumFreq((java.lang.Object) 1.0d);
        double double25 = frequency19.getCumPct((int) '4');
        long long26 = frequency19.getSumFreq();
        double double27 = frequency13.getCumPct((java.lang.Object) long26);
        double double29 = frequency13.getCumPct('#');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCumFreq((java.lang.Object) (short) 10);
        double double34 = frequency13.getPct((java.lang.Object) frequency31);
        long long36 = frequency31.getCount(0);
        frequency31.addValue((long) ' ');
        double double40 = frequency31.getCumPct(0);
        java.util.Comparator comparator41 = null;
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency(comparator41);
        double double44 = frequency42.getCumPct((long) 10);
        long long46 = frequency42.getCount((java.lang.Object) 100.0f);
        double double48 = frequency42.getPct(1L);
        long long50 = frequency42.getCumFreq((long) 0);
        double double52 = frequency42.getPct('a');
        double double54 = frequency42.getPct(1);
        double double56 = frequency42.getCumPct((long) (byte) 0);
        long long57 = frequency31.getCumFreq((java.lang.Object) frequency42);
        long long59 = frequency42.getCumFreq('#');
        double double60 = frequency1.getCumPct((java.lang.Object) long59);
        long long62 = frequency1.getCumFreq('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        frequency1.addValue((int) '4');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getCumPct((long) 10);
        long long13 = frequency9.getCumFreq((java.lang.Object) 1.0d);
        long long15 = frequency9.getCumFreq((long) 'a');
        double double17 = frequency9.getPct((java.lang.Object) (byte) 100);
        long long18 = frequency1.getCumFreq((java.lang.Object) (byte) 100);
        java.lang.String str19 = frequency1.toString();
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        double double23 = frequency21.getCumPct((long) 10);
        long long25 = frequency21.getCumFreq((java.lang.Object) 1.0d);
        long long27 = frequency21.getCumFreq((java.lang.Object) (short) 10);
        java.lang.String str28 = frequency21.toString();
        frequency21.addValue((int) (byte) 1);
        java.util.Iterator iterator31 = frequency21.valuesIterator();
        long long32 = frequency1.getCumFreq((java.lang.Object) frequency21);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str28, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((long) (short) 10);
        long long10 = frequency1.getSumFreq();
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        double double14 = frequency12.getCumPct((long) 10);
        long long16 = frequency12.getCumFreq((java.lang.Object) 1.0d);
        double double18 = frequency12.getCumPct((int) '4');
        long long19 = frequency12.getSumFreq();
        long long21 = frequency12.getCount((long) (-1));
        long long23 = frequency12.getCount('4');
        long long25 = frequency12.getCount(1);
        double double27 = frequency12.getCumPct((java.lang.Object) (short) 10);
        double double29 = frequency12.getPct(' ');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getCumPct((long) 10);
        double double35 = frequency31.getPct('#');
        double double37 = frequency31.getCumPct((int) '#');
        frequency31.addValue(1);
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        double double43 = frequency41.getCumPct((long) 10);
        double double45 = frequency41.getPct('#');
        double double47 = frequency41.getCumPct((int) '#');
        long long48 = frequency31.getCumFreq((java.lang.Object) double47);
        double double50 = frequency31.getCumPct((long) (short) 0);
        java.util.Comparator comparator51 = null;
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency(comparator51);
        double double54 = frequency52.getCumPct((long) 10);
        long long56 = frequency52.getCount((java.lang.Object) 100.0f);
        frequency52.addValue((java.lang.Integer) (-1));
        frequency52.addValue((java.lang.Integer) 10);
        long long62 = frequency52.getCumFreq((int) 'a');
        java.util.Comparator comparator63 = null;
        org.apache.commons.math.stat.Frequency frequency64 = new org.apache.commons.math.stat.Frequency(comparator63);
        double double66 = frequency64.getCumPct((long) 10);
        long long68 = frequency64.getCount((java.lang.Object) 100.0f);
        frequency64.addValue((java.lang.Integer) (-1));
        frequency52.addValue((java.lang.Object) (-1));
        long long72 = frequency31.getCount((java.lang.Object) frequency52);
        long long73 = frequency12.getCount((java.lang.Object) frequency31);
        long long74 = frequency1.getCount((java.lang.Object) frequency31);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 2L + "'", long62 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getPct((long) '#');
        java.lang.String str8 = frequency1.toString();
        long long10 = frequency1.getCount((int) (short) 10);
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency();
        frequency11.addValue((long) (short) 100);
        long long15 = frequency11.getCumFreq((long) (byte) 1);
        long long17 = frequency11.getCount('4');
        java.lang.String str18 = frequency11.toString();
        long long20 = frequency11.getCumFreq((int) '#');
        long long22 = frequency11.getCount((long) (byte) 1);
        double double23 = frequency1.getPct((java.lang.Object) long22);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str18, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        frequency1.addValue('4');
        double double11 = frequency1.getPct((-1));
        java.util.Iterator iterator12 = frequency1.valuesIterator();
        long long13 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long24 = frequency19.getCumFreq((int) (byte) 10);
        double double26 = frequency19.getPct((int) (short) 10);
        double double28 = frequency19.getCumPct((int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        long long9 = frequency1.getCount(0L);
        double double11 = frequency1.getPct((int) (short) 100);
        double double13 = frequency1.getPct((int) '4');
        long long15 = frequency1.getCumFreq((java.lang.Object) (byte) 0);
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency();
        long long17 = frequency16.getSumFreq();
        long long19 = frequency16.getCumFreq((long) 1);
        double double21 = frequency16.getPct((-1));
        frequency1.addValue((java.lang.Object) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        long long10 = frequency1.getSumFreq();
        long long12 = frequency1.getCount('#');
        long long14 = frequency1.getCount((long) (short) 0);
        java.util.Iterator iterator15 = frequency1.valuesIterator();
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        double double19 = frequency17.getCumPct((long) 10);
        double double21 = frequency17.getPct('#');
        double double23 = frequency17.getCumPct((int) '#');
        java.lang.String str24 = frequency17.toString();
        frequency17.addValue(' ');
        double double28 = frequency17.getPct('#');
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getCumPct((long) 10);
        long long34 = frequency30.getCount((java.lang.Object) 100.0f);
        frequency30.addValue((java.lang.Integer) (-1));
        frequency30.addValue((java.lang.Integer) 10);
        long long40 = frequency30.getCumFreq((int) (byte) 10);
        double double41 = frequency17.getPct((java.lang.Object) frequency30);
        double double42 = frequency1.getCumPct((java.lang.Object) frequency30);
        frequency1.addValue((int) ' ');
        long long46 = frequency1.getCumFreq(3L);
        double double48 = frequency1.getPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str24, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 2L + "'", long40 == 2L);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        long long7 = frequency1.getCumFreq((long) 'a');
        frequency1.addValue((long) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCumFreq((java.lang.Object) (short) 10);
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        double double7 = frequency5.getCumPct((long) 10);
        double double9 = frequency5.getPct('#');
        double double11 = frequency5.getCumPct((int) '#');
        frequency5.addValue(1);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getCumPct((long) 10);
        double double19 = frequency15.getPct('#');
        double double21 = frequency15.getCumPct((int) '#');
        long long22 = frequency5.getCumFreq((java.lang.Object) double21);
        java.lang.Class<?> wildcardClass23 = frequency5.getClass();
        double double24 = frequency1.getPct((java.lang.Object) wildcardClass23);
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        double double28 = frequency26.getCumPct((long) 10);
        long long30 = frequency26.getCount((int) (byte) 10);
        double double32 = frequency26.getCumPct((-1));
        double double34 = frequency26.getPct('a');
        double double36 = frequency26.getPct('4');
        long long38 = frequency26.getCount((long) (-1));
        java.util.Comparator comparator39 = null;
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency(comparator39);
        double double42 = frequency40.getCumPct((long) 10);
        double double44 = frequency40.getPct('#');
        java.util.Iterator iterator45 = frequency40.valuesIterator();
        java.util.Iterator iterator46 = frequency40.valuesIterator();
        double double47 = frequency26.getCumPct((java.lang.Object) frequency40);
        java.util.Comparator comparator48 = null;
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency(comparator48);
        double double51 = frequency49.getCumPct((long) 10);
        long long53 = frequency49.getCount((java.lang.Object) 100.0f);
        double double55 = frequency49.getPct(1L);
        frequency49.addValue('4');
        double double59 = frequency49.getPct((-1));
        long long60 = frequency49.getSumFreq();
        double double62 = frequency49.getCumPct('#');
        double double63 = frequency26.getPct((java.lang.Object) '#');
        frequency26.clear();
        double double66 = frequency26.getPct('a');
        long long67 = frequency1.getCount((java.lang.Object) frequency26);
        frequency26.addValue((int) (short) 0);
        java.lang.String str70 = frequency26.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(iterator45);
        org.junit.Assert.assertNotNull(iterator46);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n" + "'", str70, "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        long long9 = frequency1.getCount((int) (byte) 0);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        double double15 = frequency11.getPct('#');
        java.util.Iterator iterator16 = frequency11.valuesIterator();
        double double17 = frequency1.getPct((java.lang.Object) frequency11);
        long long19 = frequency1.getCount((int) (byte) 100);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        double double23 = frequency21.getCumPct((long) 10);
        double double25 = frequency21.getPct('#');
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        double double29 = frequency27.getCumPct((long) 10);
        long long31 = frequency27.getCumFreq((java.lang.Object) 1.0d);
        double double33 = frequency27.getCumPct((int) '4');
        long long34 = frequency27.getSumFreq();
        double double35 = frequency21.getCumPct((java.lang.Object) long34);
        double double37 = frequency21.getCumPct('#');
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        long long41 = frequency39.getCumFreq((java.lang.Object) (short) 10);
        double double42 = frequency21.getPct((java.lang.Object) frequency39);
        long long44 = frequency21.getCumFreq(10);
        frequency21.addValue((java.lang.Object) 1.0f);
        frequency21.clear();
        double double48 = frequency1.getCumPct((java.lang.Object) frequency21);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        double double8 = frequency1.getPct('#');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getCumPct((long) 10);
        long long14 = frequency10.getCount((java.lang.Object) 100.0f);
        double double16 = frequency10.getPct(1L);
        long long18 = frequency10.getCumFreq((long) 0);
        double double20 = frequency10.getPct('a');
        double double21 = frequency1.getPct((java.lang.Object) 'a');
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        double double25 = frequency23.getCumPct((long) 10);
        long long27 = frequency23.getCount((java.lang.Object) 100.0f);
        long long29 = frequency23.getCumFreq((long) 0);
        double double30 = frequency1.getCumPct((java.lang.Object) frequency23);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((long) 10);
        double double36 = frequency32.getPct('#');
        double double38 = frequency32.getCumPct((int) '#');
        frequency32.addValue(1);
        java.util.Comparator comparator41 = null;
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency(comparator41);
        double double44 = frequency42.getCumPct((long) 10);
        double double46 = frequency42.getPct('#');
        double double48 = frequency42.getCumPct((int) '#');
        long long49 = frequency32.getCumFreq((java.lang.Object) double48);
        long long51 = frequency32.getCount('#');
        frequency1.addValue((java.lang.Object) '#');
        java.util.Iterator iterator53 = frequency1.valuesIterator();
        java.util.Comparator comparator54 = null;
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency(comparator54);
        double double57 = frequency55.getCumPct((long) 10);
        double double59 = frequency55.getPct('#');
        double double61 = frequency55.getCumPct((int) '#');
        java.lang.String str62 = frequency55.toString();
        long long64 = frequency55.getCumFreq((long) '4');
        double double65 = frequency1.getPct((java.lang.Object) frequency55);
        long long67 = frequency1.getCount((long) (short) 100);
        frequency1.clear();
        double double70 = frequency1.getPct('a');
        long long72 = frequency1.getCumFreq((int) (short) 100);
        java.util.Comparator comparator73 = null;
        org.apache.commons.math.stat.Frequency frequency74 = new org.apache.commons.math.stat.Frequency(comparator73);
        double double76 = frequency74.getCumPct((long) 10);
        long long78 = frequency74.getCount((int) (byte) 10);
        double double80 = frequency74.getCumPct((-1));
        double double82 = frequency74.getPct('4');
        long long84 = frequency74.getCumFreq((int) (short) 100);
        double double85 = frequency1.getPct((java.lang.Object) long84);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str62, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        java.lang.String str8 = frequency1.toString();
        long long10 = frequency1.getCumFreq((long) '4');
        java.lang.String str11 = frequency1.toString();
        java.lang.String str12 = frequency1.toString();
        long long14 = frequency1.getCount('4');
        long long15 = frequency1.getSumFreq();
        java.lang.String str16 = frequency1.toString();
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getCumPct((long) 10);
        double double22 = frequency18.getPct('#');
        double double24 = frequency18.getCumPct((int) '#');
        frequency18.addValue(1);
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        double double30 = frequency28.getCumPct((long) 10);
        double double32 = frequency28.getPct('#');
        double double34 = frequency28.getCumPct((int) '#');
        long long35 = frequency18.getCumFreq((java.lang.Object) double34);
        double double37 = frequency18.getCumPct((long) (short) 0);
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        double double41 = frequency39.getCumPct((long) 10);
        long long43 = frequency39.getCount((java.lang.Object) 100.0f);
        frequency39.addValue((java.lang.Integer) (-1));
        frequency39.addValue((java.lang.Integer) 10);
        long long49 = frequency39.getCumFreq((int) 'a');
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        double double53 = frequency51.getCumPct((long) 10);
        long long55 = frequency51.getCount((java.lang.Object) 100.0f);
        frequency51.addValue((java.lang.Integer) (-1));
        frequency39.addValue((java.lang.Object) (-1));
        long long59 = frequency18.getCount((java.lang.Object) frequency39);
        long long61 = frequency39.getCumFreq(' ');
        double double62 = frequency1.getPct((java.lang.Object) frequency39);
        double double64 = frequency39.getCumPct((long) 'a');
        java.util.Comparator comparator65 = null;
        org.apache.commons.math.stat.Frequency frequency66 = new org.apache.commons.math.stat.Frequency(comparator65);
        double double68 = frequency66.getCumPct((long) 10);
        double double70 = frequency66.getPct('#');
        double double72 = frequency66.getCumPct((int) '#');
        frequency66.addValue(1);
        java.util.Comparator comparator75 = null;
        org.apache.commons.math.stat.Frequency frequency76 = new org.apache.commons.math.stat.Frequency(comparator75);
        double double78 = frequency76.getCumPct((long) 10);
        double double80 = frequency76.getPct('#');
        double double82 = frequency76.getCumPct((int) '#');
        long long83 = frequency66.getCumFreq((java.lang.Object) double82);
        double double85 = frequency66.getCumPct((long) (short) 0);
        java.util.Iterator iterator86 = frequency66.valuesIterator();
        long long87 = frequency66.getSumFreq();
        double double89 = frequency66.getPct(10);
        long long91 = frequency66.getCumFreq(' ');
        frequency39.addValue((java.lang.Object) long91);
        long long94 = frequency39.getCumFreq('4');
        frequency39.clear();
        double double97 = frequency39.getPct((long) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 2L + "'", long49 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertNotNull(iterator86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 1L + "'", long87 == 1L);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 0L + "'", long91 == 0L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double97));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        double double11 = frequency1.getCumPct((long) '4');
        long long13 = frequency1.getCount((int) '#');
        long long15 = frequency1.getCumFreq(' ');
        java.util.Iterator iterator16 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getCumPct((long) (-1));
        double double9 = frequency1.getCumPct('#');
        double double11 = frequency1.getCumPct(1);
        frequency1.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getPct((long) '#');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCount('a');
        frequency1.addValue((int) (short) -1);
        double double14 = frequency1.getCumPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        double double8 = frequency1.getPct('#');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getCumPct((long) 10);
        long long14 = frequency10.getCount((java.lang.Object) 100.0f);
        double double16 = frequency10.getPct(1L);
        long long18 = frequency10.getCumFreq((long) 0);
        double double20 = frequency10.getPct('a');
        double double21 = frequency1.getPct((java.lang.Object) 'a');
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        double double25 = frequency23.getCumPct((long) 10);
        long long27 = frequency23.getCount((java.lang.Object) 100.0f);
        long long29 = frequency23.getCumFreq((long) 0);
        double double30 = frequency1.getCumPct((java.lang.Object) frequency23);
        long long32 = frequency23.getCumFreq(100);
        double double34 = frequency23.getPct((int) (short) 0);
        frequency23.addValue((java.lang.Integer) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getCumPct((-1));
        frequency1.addValue((int) (short) -1);
        double double11 = frequency1.getPct((long) 'a');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        long long17 = frequency13.getCumFreq((java.lang.Object) 1.0d);
        double double19 = frequency13.getCumPct((int) '4');
        long long20 = frequency13.getSumFreq();
        double double22 = frequency13.getPct('a');
        long long24 = frequency13.getCumFreq('a');
        long long26 = frequency13.getCount(' ');
        double double28 = frequency13.getPct((int) (short) 10);
        long long30 = frequency13.getCount((long) ' ');
        long long32 = frequency13.getCount(' ');
        long long33 = frequency1.getCount((java.lang.Object) ' ');
        double double35 = frequency1.getCumPct((int) (short) 10);
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        double double39 = frequency37.getCumPct((long) 10);
        double double41 = frequency37.getPct('#');
        double double43 = frequency37.getCumPct((int) '#');
        frequency37.addValue(1);
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        double double49 = frequency47.getCumPct((long) 10);
        double double51 = frequency47.getPct('#');
        double double53 = frequency47.getCumPct((int) '#');
        long long54 = frequency37.getCumFreq((java.lang.Object) double53);
        double double56 = frequency37.getCumPct((long) (short) 0);
        java.util.Comparator comparator57 = null;
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency(comparator57);
        long long60 = frequency58.getCount('#');
        java.util.Iterator iterator61 = frequency58.valuesIterator();
        java.util.Comparator comparator62 = null;
        org.apache.commons.math.stat.Frequency frequency63 = new org.apache.commons.math.stat.Frequency(comparator62);
        double double65 = frequency63.getCumPct((long) 10);
        long long67 = frequency63.getCumFreq((java.lang.Object) 1.0d);
        double double69 = frequency63.getCumPct((int) '4');
        long long70 = frequency63.getSumFreq();
        long long72 = frequency63.getCount((long) (-1));
        long long74 = frequency63.getCount('4');
        long long76 = frequency63.getCount(1);
        double double78 = frequency63.getCumPct((java.lang.Object) (short) 10);
        double double79 = frequency58.getCumPct((java.lang.Object) frequency63);
        long long80 = frequency37.getCumFreq((java.lang.Object) frequency63);
        java.util.Comparator comparator81 = null;
        org.apache.commons.math.stat.Frequency frequency82 = new org.apache.commons.math.stat.Frequency(comparator81);
        double double84 = frequency82.getCumPct((long) 10);
        long long86 = frequency82.getCumFreq((java.lang.Object) 1.0d);
        double double88 = frequency82.getCumPct('4');
        java.lang.String str89 = frequency82.toString();
        double double91 = frequency82.getCumPct((long) (short) 100);
        long long92 = frequency63.getCount((java.lang.Object) (short) 100);
        double double93 = frequency1.getPct((java.lang.Object) long92);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(iterator61);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str89, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double91));
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        java.lang.String str8 = frequency1.toString();
        frequency1.addValue(' ');
        double double12 = frequency1.getPct((int) ' ');
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getCumPct((long) 10);
        long long18 = frequency14.getCount((java.lang.Object) 100.0f);
        double double20 = frequency14.getPct(1L);
        long long22 = frequency14.getCount((int) (byte) 0);
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getCumPct((long) 10);
        double double28 = frequency24.getPct('#');
        java.util.Iterator iterator29 = frequency24.valuesIterator();
        double double30 = frequency14.getPct((java.lang.Object) frequency24);
        double double32 = frequency14.getPct((long) (short) 0);
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        double double36 = frequency34.getCumPct((long) 10);
        double double38 = frequency34.getPct('#');
        double double40 = frequency34.getCumPct((int) '#');
        frequency34.addValue((java.lang.Integer) (-1));
        double double44 = frequency34.getPct('4');
        long long46 = frequency34.getCount('4');
        long long47 = frequency14.getCount((java.lang.Object) long46);
        long long48 = frequency1.getCumFreq((java.lang.Object) long47);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long24 = frequency19.getCount(0);
        double double26 = frequency19.getCumPct(1);
        double double28 = frequency19.getPct('a');
        double double30 = frequency19.getPct(' ');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((long) 10);
        long long36 = frequency32.getCount((java.lang.Object) 100.0f);
        frequency32.addValue((java.lang.Integer) (-1));
        frequency32.addValue((-1));
        long long42 = frequency32.getCumFreq((int) (short) -1);
        double double43 = frequency19.getCumPct((java.lang.Object) long42);
        double double45 = frequency19.getPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 2L + "'", long42 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        double double11 = frequency1.getCumPct((long) '4');
        long long13 = frequency1.getCount((int) '#');
        double double15 = frequency1.getCumPct((int) (short) -1);
        long long17 = frequency1.getCumFreq('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.5d + "'", double15 == 0.5d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        frequency1.clear();
        long long10 = frequency1.getCumFreq((long) (byte) 1);
        long long12 = frequency1.getCumFreq((long) 0);
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getCumPct((long) 10);
        double double18 = frequency14.getPct('#');
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getCumPct((long) 10);
        long long24 = frequency20.getCumFreq((java.lang.Object) 1.0d);
        double double26 = frequency20.getCumPct((int) '4');
        long long27 = frequency20.getSumFreq();
        double double28 = frequency14.getCumPct((java.lang.Object) long27);
        double double30 = frequency14.getCumPct('#');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        long long34 = frequency32.getCumFreq((java.lang.Object) (short) 10);
        double double35 = frequency14.getPct((java.lang.Object) frequency32);
        long long36 = frequency32.getSumFreq();
        long long37 = frequency32.getSumFreq();
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((java.lang.Object) frequency32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        long long9 = frequency1.getCumFreq((long) 0);
        double double11 = frequency1.getPct('a');
        java.lang.Class<?> wildcardClass12 = frequency1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        frequency1.addValue(1);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        double double15 = frequency11.getPct('#');
        double double17 = frequency11.getCumPct((int) '#');
        long long18 = frequency1.getCumFreq((java.lang.Object) double17);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getCumPct((long) 10);
        long long24 = frequency20.getCount((java.lang.Object) 100.0f);
        frequency20.addValue((java.lang.Integer) (-1));
        frequency20.addValue((java.lang.Integer) 10);
        double double30 = frequency20.getCumPct((long) (byte) 10);
        long long31 = frequency1.getCumFreq((java.lang.Object) frequency20);
        java.util.Comparator comparator32 = null;
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency(comparator32);
        double double35 = frequency33.getCumPct((long) 10);
        long long37 = frequency33.getCount((java.lang.Object) 100.0f);
        frequency33.addValue((java.lang.Integer) (-1));
        frequency33.addValue((java.lang.Integer) 10);
        frequency33.addValue((int) (byte) 1);
        double double44 = frequency20.getPct((java.lang.Object) (byte) 1);
        long long46 = frequency20.getCumFreq('4');
        java.util.Comparator comparator47 = null;
        org.apache.commons.math.stat.Frequency frequency48 = new org.apache.commons.math.stat.Frequency(comparator47);
        double double50 = frequency48.getCumPct((long) 10);
        double double52 = frequency48.getPct('#');
        double double54 = frequency48.getCumPct((int) '#');
        frequency48.addValue(1);
        java.util.Comparator comparator57 = null;
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency(comparator57);
        double double60 = frequency58.getCumPct((long) 10);
        double double62 = frequency58.getPct('#');
        double double64 = frequency58.getCumPct((int) '#');
        long long65 = frequency48.getCumFreq((java.lang.Object) double64);
        double double67 = frequency48.getCumPct((long) (short) 0);
        java.util.Iterator iterator68 = frequency48.valuesIterator();
        long long69 = frequency20.getCumFreq((java.lang.Object) frequency48);
        long long71 = frequency20.getCumFreq(' ');
        double double73 = frequency20.getPct((int) (byte) 100);
        double double75 = frequency20.getCumPct(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        frequency1.addValue(1);
        double double11 = frequency1.getPct((-1L));
        frequency1.addValue((int) '#');
        long long15 = frequency1.getCumFreq((long) ' ');
        long long17 = frequency1.getCumFreq('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(2L);
        long long11 = frequency1.getCount('a');
        frequency1.addValue((long) '#');
        frequency1.clear();
        double double16 = frequency1.getPct('#');
        long long18 = frequency1.getCount('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getCumPct((long) (-1));
        frequency1.addValue(0);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        double double15 = frequency11.getPct('#');
        double double17 = frequency11.getCumPct((int) '#');
        frequency11.addValue(1);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        double double23 = frequency21.getCumPct((long) 10);
        double double25 = frequency21.getPct('#');
        double double27 = frequency21.getCumPct((int) '#');
        long long28 = frequency11.getCumFreq((java.lang.Object) double27);
        double double30 = frequency11.getCumPct((long) (short) 0);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        long long34 = frequency32.getCount('#');
        java.util.Iterator iterator35 = frequency32.valuesIterator();
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        double double39 = frequency37.getCumPct((long) 10);
        long long41 = frequency37.getCumFreq((java.lang.Object) 1.0d);
        double double43 = frequency37.getCumPct((int) '4');
        long long44 = frequency37.getSumFreq();
        long long46 = frequency37.getCount((long) (-1));
        long long48 = frequency37.getCount('4');
        long long50 = frequency37.getCount(1);
        double double52 = frequency37.getCumPct((java.lang.Object) (short) 10);
        double double53 = frequency32.getCumPct((java.lang.Object) frequency37);
        long long54 = frequency11.getCumFreq((java.lang.Object) frequency37);
        double double55 = frequency1.getPct((java.lang.Object) frequency11);
        long long57 = frequency11.getCumFreq((int) (short) 10);
        long long58 = frequency11.getSumFreq();
        double double60 = frequency11.getCumPct(0);
        double double62 = frequency11.getCumPct((int) (byte) 0);
        long long64 = frequency11.getCumFreq(10L);
        long long66 = frequency11.getCount((long) 10);
        long long68 = frequency11.getCumFreq(100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount('#');
        frequency1.addValue(0L);
        double double7 = frequency1.getCumPct('4');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getCumPct((long) 10);
        double double13 = frequency9.getPct('#');
        frequency9.addValue((int) '4');
        java.util.Comparator comparator16 = null;
        org.apache.commons.math.stat.Frequency frequency17 = new org.apache.commons.math.stat.Frequency(comparator16);
        double double19 = frequency17.getCumPct((long) 10);
        long long21 = frequency17.getCumFreq((java.lang.Object) 1.0d);
        long long23 = frequency17.getCumFreq((long) 'a');
        double double25 = frequency17.getPct((java.lang.Object) (byte) 100);
        long long26 = frequency9.getCumFreq((java.lang.Object) (byte) 100);
        long long27 = frequency1.getCount((java.lang.Object) long26);
        double double29 = frequency1.getCumPct((int) '#');
        double double31 = frequency1.getPct(3L);
        double double33 = frequency1.getPct((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long8 = frequency1.getSumFreq();
        double double10 = frequency1.getPct('a');
        frequency1.addValue(0L);
        frequency1.clear();
        frequency1.clear();
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getCumPct((long) 10);
        double double20 = frequency16.getPct('#');
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        double double24 = frequency22.getCumPct((long) 10);
        long long26 = frequency22.getCumFreq((java.lang.Object) 1.0d);
        double double28 = frequency22.getCumPct((int) '4');
        long long29 = frequency22.getSumFreq();
        double double30 = frequency16.getCumPct((java.lang.Object) long29);
        double double32 = frequency16.getCumPct('#');
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        long long36 = frequency34.getCumFreq((java.lang.Object) (short) 10);
        double double37 = frequency16.getPct((java.lang.Object) frequency34);
        long long39 = frequency34.getCount(0);
        frequency34.addValue((long) ' ');
        double double43 = frequency34.getCumPct(0);
        java.util.Comparator comparator44 = null;
        org.apache.commons.math.stat.Frequency frequency45 = new org.apache.commons.math.stat.Frequency(comparator44);
        double double47 = frequency45.getCumPct((long) 10);
        double double49 = frequency45.getPct('#');
        java.util.Iterator iterator50 = frequency45.valuesIterator();
        double double52 = frequency45.getPct('#');
        java.util.Comparator comparator53 = null;
        org.apache.commons.math.stat.Frequency frequency54 = new org.apache.commons.math.stat.Frequency(comparator53);
        double double56 = frequency54.getCumPct((long) 10);
        long long58 = frequency54.getCount((java.lang.Object) 100.0f);
        double double60 = frequency54.getPct(1L);
        long long62 = frequency54.getCumFreq((long) 0);
        double double64 = frequency54.getPct('a');
        double double65 = frequency45.getPct((java.lang.Object) 'a');
        java.util.Comparator comparator66 = null;
        org.apache.commons.math.stat.Frequency frequency67 = new org.apache.commons.math.stat.Frequency(comparator66);
        double double69 = frequency67.getCumPct((long) 10);
        long long71 = frequency67.getCount((java.lang.Object) 100.0f);
        long long73 = frequency67.getCumFreq((long) 0);
        double double74 = frequency45.getCumPct((java.lang.Object) frequency67);
        frequency45.addValue((int) (short) -1);
        long long77 = frequency34.getCount((java.lang.Object) frequency45);
        long long78 = frequency1.getCount((java.lang.Object) frequency34);
        frequency1.addValue((-1L));
        double double82 = frequency1.getCumPct('#');
        long long84 = frequency1.getCumFreq('4');
        frequency1.addValue(1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getPct((long) '#');
        long long9 = frequency1.getCumFreq((long) 'a');
        frequency1.addValue((java.lang.Integer) 0);
        double double13 = frequency1.getCumPct((int) (short) 100);
        long long15 = frequency1.getCount((int) (short) 10);
        long long17 = frequency1.getCumFreq(10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        java.lang.String str8 = frequency1.toString();
        long long10 = frequency1.getCumFreq((long) '4');
        java.lang.String str11 = frequency1.toString();
        java.lang.String str12 = frequency1.toString();
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getCumPct((long) 10);
        long long18 = frequency14.getCount((java.lang.Object) 100.0f);
        double double20 = frequency14.getPct(1L);
        frequency14.clear();
        long long22 = frequency1.getCount((java.lang.Object) frequency14);
        frequency14.addValue((int) (short) -1);
        long long26 = frequency14.getCumFreq('a');
        long long28 = frequency14.getCumFreq('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        long long9 = frequency1.getCount((int) (byte) 0);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        double double15 = frequency11.getPct('#');
        java.util.Iterator iterator16 = frequency11.valuesIterator();
        double double17 = frequency1.getPct((java.lang.Object) frequency11);
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getCumPct((long) 10);
        double double23 = frequency19.getPct('#');
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        double double27 = frequency25.getCumPct((long) 10);
        long long29 = frequency25.getCumFreq((java.lang.Object) 1.0d);
        double double31 = frequency25.getCumPct((int) '4');
        long long32 = frequency25.getSumFreq();
        double double33 = frequency19.getCumPct((java.lang.Object) long32);
        double double35 = frequency19.getCumPct('#');
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        long long39 = frequency37.getCumFreq((java.lang.Object) (short) 10);
        double double40 = frequency19.getPct((java.lang.Object) frequency37);
        double double42 = frequency37.getCumPct((java.lang.Object) (short) 100);
        long long44 = frequency37.getCumFreq((long) (byte) 0);
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        double double48 = frequency46.getCumPct((long) 10);
        long long50 = frequency46.getCount((java.lang.Object) 100.0f);
        double double52 = frequency46.getPct(1L);
        long long53 = frequency37.getCumFreq((java.lang.Object) frequency46);
        double double55 = frequency37.getCumPct((long) (short) -1);
        java.util.Comparator comparator56 = null;
        org.apache.commons.math.stat.Frequency frequency57 = new org.apache.commons.math.stat.Frequency(comparator56);
        double double59 = frequency57.getCumPct((long) 10);
        long long61 = frequency57.getCount((java.lang.Object) 100.0f);
        double double63 = frequency57.getPct(1L);
        frequency57.clear();
        long long66 = frequency57.getCumFreq((long) (byte) 1);
        long long68 = frequency57.getCumFreq((long) 0);
        long long70 = frequency57.getCount((long) (byte) 1);
        double double71 = frequency37.getCumPct((java.lang.Object) frequency57);
        long long72 = frequency11.getCumFreq((java.lang.Object) frequency37);
        frequency37.addValue(0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue((int) '4');
        double double5 = frequency1.getCumPct(0L);
        long long6 = frequency1.getSumFreq();
        double double8 = frequency1.getCumPct(0);
        frequency1.addValue((int) (byte) -1);
        double double12 = frequency1.getPct(0);
        double double14 = frequency1.getPct((long) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        double double8 = frequency1.getPct('#');
        java.util.Comparator comparator9 = null;
        org.apache.commons.math.stat.Frequency frequency10 = new org.apache.commons.math.stat.Frequency(comparator9);
        double double12 = frequency10.getCumPct((long) 10);
        long long14 = frequency10.getCount((java.lang.Object) 100.0f);
        double double16 = frequency10.getPct(1L);
        long long18 = frequency10.getCumFreq((long) 0);
        double double20 = frequency10.getPct('a');
        double double21 = frequency1.getPct((java.lang.Object) 'a');
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        double double25 = frequency23.getCumPct((long) 10);
        long long27 = frequency23.getCount((java.lang.Object) 100.0f);
        long long29 = frequency23.getCumFreq((long) 0);
        double double30 = frequency1.getCumPct((java.lang.Object) frequency23);
        long long32 = frequency1.getCount('a');
        double double34 = frequency1.getPct('a');
        java.lang.String str35 = frequency1.toString();
        java.lang.String str36 = frequency1.toString();
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        double double40 = frequency38.getCumPct((long) 10);
        long long42 = frequency38.getCount((int) (byte) 10);
        double double44 = frequency38.getCumPct((-1));
        double double46 = frequency38.getPct('a');
        long long48 = frequency38.getCumFreq((long) ' ');
        java.util.Comparator comparator49 = null;
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency(comparator49);
        double double52 = frequency50.getCumPct((long) 10);
        long long54 = frequency50.getCumFreq((java.lang.Object) 1.0d);
        double double56 = frequency50.getCumPct((int) '4');
        frequency50.addValue(1);
        java.util.Comparator comparator59 = null;
        org.apache.commons.math.stat.Frequency frequency60 = new org.apache.commons.math.stat.Frequency(comparator59);
        double double62 = frequency60.getCumPct((long) 10);
        long long64 = frequency60.getCount((int) (byte) 10);
        double double66 = frequency60.getPct((long) '#');
        double double67 = frequency50.getPct((java.lang.Object) double66);
        double double68 = frequency38.getCumPct((java.lang.Object) double67);
        long long69 = frequency1.getCumFreq((java.lang.Object) frequency38);
        double double71 = frequency38.getCumPct(10);
        long long73 = frequency38.getCumFreq((int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str35, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str36, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getCumPct((long) 10);
        long long28 = frequency24.getCumFreq((java.lang.Object) 1.0d);
        double double30 = frequency24.getCumPct((int) '4');
        long long32 = frequency24.getCumFreq((int) (byte) 10);
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        double double36 = frequency34.getCumPct((long) 10);
        long long38 = frequency34.getCount((java.lang.Object) 100.0f);
        frequency34.addValue((java.lang.Integer) (-1));
        frequency34.addValue((java.lang.Integer) 10);
        double double44 = frequency34.getCumPct((long) '4');
        double double45 = frequency24.getCumPct((java.lang.Object) '4');
        frequency19.addValue((java.lang.Object) '4');
        frequency19.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        frequency1.addValue(1);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        double double15 = frequency11.getPct('#');
        double double17 = frequency11.getCumPct((int) '#');
        long long18 = frequency1.getCumFreq((java.lang.Object) double17);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getCumPct((long) 10);
        long long24 = frequency20.getCount((java.lang.Object) 100.0f);
        frequency20.addValue((java.lang.Integer) (-1));
        frequency20.addValue((java.lang.Integer) 10);
        double double30 = frequency20.getCumPct((long) (byte) 10);
        long long31 = frequency1.getCumFreq((java.lang.Object) frequency20);
        double double33 = frequency20.getPct((int) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.5d + "'", double33 == 0.5d);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        java.lang.String str6 = frequency1.toString();
        java.util.Comparator comparator7 = null;
        org.apache.commons.math.stat.Frequency frequency8 = new org.apache.commons.math.stat.Frequency(comparator7);
        double double10 = frequency8.getCumPct((long) 10);
        long long12 = frequency8.getCumFreq((java.lang.Object) 1.0d);
        long long14 = frequency8.getCumFreq((long) 'a');
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getCumPct((long) 10);
        double double20 = frequency16.getPct('#');
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        double double24 = frequency22.getCumPct((long) 10);
        long long26 = frequency22.getCumFreq((java.lang.Object) 1.0d);
        double double28 = frequency22.getCumPct((int) '4');
        long long29 = frequency22.getSumFreq();
        double double30 = frequency16.getCumPct((java.lang.Object) long29);
        double double32 = frequency16.getCumPct('#');
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        long long36 = frequency34.getCumFreq((java.lang.Object) (short) 10);
        double double37 = frequency16.getPct((java.lang.Object) frequency34);
        long long39 = frequency34.getCount(0);
        frequency34.addValue((long) ' ');
        double double42 = frequency8.getCumPct((java.lang.Object) frequency34);
        double double44 = frequency8.getCumPct((long) 100);
        long long45 = frequency1.getCumFreq((java.lang.Object) frequency8);
        frequency8.addValue((int) (short) -1);
        frequency8.clear();
        frequency8.addValue((long) ' ');
        java.util.Iterator iterator51 = frequency8.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str6, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(iterator51);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long9 = frequency1.getCumFreq((int) (byte) 10);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        long long15 = frequency11.getCount((java.lang.Object) 100.0f);
        frequency11.addValue((java.lang.Integer) (-1));
        frequency11.addValue((java.lang.Integer) 10);
        double double21 = frequency11.getCumPct((long) '4');
        double double22 = frequency1.getCumPct((java.lang.Object) '4');
        long long24 = frequency1.getCount('a');
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        double double28 = frequency26.getCumPct((long) 10);
        long long30 = frequency26.getCumFreq((java.lang.Object) 1.0d);
        long long32 = frequency26.getCumFreq((java.lang.Object) (short) 10);
        double double34 = frequency26.getCumPct((int) (byte) 0);
        double double36 = frequency26.getPct((long) (short) 100);
        double double37 = frequency1.getPct((java.lang.Object) (short) 100);
        long long39 = frequency1.getCount((int) (short) 0);
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        double double43 = frequency41.getCumPct((long) 10);
        long long45 = frequency41.getCount((int) (byte) 10);
        frequency41.addValue('4');
        long long48 = frequency41.getSumFreq();
        long long49 = frequency1.getCumFreq((java.lang.Object) long48);
        long long51 = frequency1.getCumFreq((long) ' ');
        frequency1.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long24 = frequency19.getCount(0);
        frequency19.addValue((long) ' ');
        long long28 = frequency19.getCount((long) (byte) 0);
        frequency19.addValue((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        long long11 = frequency1.getCumFreq((int) 'a');
        frequency1.clear();
        double double14 = frequency1.getCumPct('a');
        frequency1.clear();
        long long17 = frequency1.getCumFreq(10L);
        double double19 = frequency1.getPct((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        long long7 = frequency1.getCumFreq((long) 'a');
        long long9 = frequency1.getCumFreq((long) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        long long9 = frequency1.getCount(0L);
        double double11 = frequency1.getPct((int) (short) 100);
        double double13 = frequency1.getPct((int) '4');
        long long15 = frequency1.getCumFreq((java.lang.Object) (byte) 0);
        long long17 = frequency1.getCumFreq('a');
        long long19 = frequency1.getCount('4');
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        double double23 = frequency21.getCumPct((long) 10);
        double double25 = frequency21.getPct('#');
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        double double29 = frequency27.getCumPct((long) 10);
        long long31 = frequency27.getCumFreq((java.lang.Object) 1.0d);
        double double33 = frequency27.getCumPct((int) '4');
        long long34 = frequency27.getSumFreq();
        double double35 = frequency21.getCumPct((java.lang.Object) long34);
        double double37 = frequency21.getCumPct('#');
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        long long41 = frequency39.getCumFreq((java.lang.Object) (short) 10);
        double double42 = frequency21.getPct((java.lang.Object) frequency39);
        long long44 = frequency39.getCount(0);
        frequency39.addValue((long) ' ');
        double double48 = frequency39.getCumPct(0);
        frequency39.addValue((long) (byte) -1);
        double double52 = frequency39.getPct((int) (short) 100);
        long long53 = frequency1.getCumFreq((java.lang.Object) double52);
        double double55 = frequency1.getPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long24 = frequency19.getCount(0);
        double double26 = frequency19.getCumPct(1);
        double double28 = frequency19.getPct('a');
        double double30 = frequency19.getPct(' ');
        java.lang.String str31 = frequency19.toString();
        java.lang.String str32 = frequency19.toString();
        double double34 = frequency19.getPct((long) 0);
        double double36 = frequency19.getPct(1L);
        frequency19.addValue('a');
        double double40 = frequency19.getPct((int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str31, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str32, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        java.lang.String str8 = frequency1.toString();
        long long10 = frequency1.getCumFreq((long) '4');
        java.lang.String str11 = frequency1.toString();
        java.lang.String str12 = frequency1.toString();
        long long14 = frequency1.getCount('4');
        long long15 = frequency1.getSumFreq();
        java.lang.String str16 = frequency1.toString();
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getCumPct((long) 10);
        double double22 = frequency18.getPct('#');
        double double24 = frequency18.getCumPct((int) '#');
        frequency18.addValue(1);
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        double double30 = frequency28.getCumPct((long) 10);
        double double32 = frequency28.getPct('#');
        double double34 = frequency28.getCumPct((int) '#');
        long long35 = frequency18.getCumFreq((java.lang.Object) double34);
        double double37 = frequency18.getCumPct((long) (short) 0);
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        double double41 = frequency39.getCumPct((long) 10);
        long long43 = frequency39.getCount((java.lang.Object) 100.0f);
        frequency39.addValue((java.lang.Integer) (-1));
        frequency39.addValue((java.lang.Integer) 10);
        long long49 = frequency39.getCumFreq((int) 'a');
        java.util.Comparator comparator50 = null;
        org.apache.commons.math.stat.Frequency frequency51 = new org.apache.commons.math.stat.Frequency(comparator50);
        double double53 = frequency51.getCumPct((long) 10);
        long long55 = frequency51.getCount((java.lang.Object) 100.0f);
        frequency51.addValue((java.lang.Integer) (-1));
        frequency39.addValue((java.lang.Object) (-1));
        long long59 = frequency18.getCount((java.lang.Object) frequency39);
        long long61 = frequency39.getCumFreq(' ');
        double double62 = frequency1.getPct((java.lang.Object) frequency39);
        long long64 = frequency39.getCount((int) '4');
        long long66 = frequency39.getCumFreq(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 2L + "'", long49 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long23 = frequency19.getSumFreq();
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        double double27 = frequency25.getCumPct((long) 10);
        long long29 = frequency25.getCumFreq((java.lang.Object) 1.0d);
        double double31 = frequency25.getCumPct((int) '4');
        long long32 = frequency25.getSumFreq();
        double double34 = frequency25.getPct('a');
        frequency25.addValue(0L);
        double double37 = frequency19.getPct((java.lang.Object) frequency25);
        frequency19.addValue(' ');
        long long41 = frequency19.getCount('#');
        long long43 = frequency19.getCount('a');
        long long45 = frequency19.getCount((long) 0);
        long long47 = frequency19.getCount(3L);
        java.util.Iterator iterator48 = frequency19.valuesIterator();
        java.lang.String str49 = frequency19.toString();
        // The following exception was thrown during execution in test generation
        try {
            frequency19.addValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(iterator48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n" + "'", str49, "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        java.util.Comparator comparator2 = null;
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency(comparator2);
        double double5 = frequency3.getCumPct((long) 10);
        long long7 = frequency3.getCount((java.lang.Object) 100.0f);
        double double9 = frequency3.getPct(1L);
        double double11 = frequency3.getCumPct((int) (short) -1);
        double double12 = frequency1.getCumPct((java.lang.Object) frequency3);
        double double14 = frequency1.getCumPct(10);
        long long15 = frequency1.getSumFreq();
        double double17 = frequency1.getPct((int) 'a');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getCumPct((long) 10);
        long long23 = frequency19.getCumFreq((java.lang.Object) 1.0d);
        double double25 = frequency19.getCumPct((int) '4');
        long long26 = frequency19.getSumFreq();
        double double28 = frequency19.getPct('a');
        frequency19.addValue(0L);
        frequency19.clear();
        double double33 = frequency19.getPct((-1));
        double double35 = frequency19.getCumPct((long) (short) -1);
        double double36 = frequency1.getPct((java.lang.Object) frequency19);
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        double double40 = frequency38.getCumPct((long) 10);
        double double42 = frequency38.getPct('#');
        double double44 = frequency38.getCumPct((int) '#');
        frequency38.addValue((java.lang.Integer) (-1));
        double double48 = frequency38.getPct('4');
        long long50 = frequency38.getCount('4');
        frequency38.addValue((java.lang.Integer) 1);
        long long53 = frequency19.getCumFreq((java.lang.Object) frequency38);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        frequency1.clear();
        frequency1.addValue((long) (byte) 0);
        long long12 = frequency1.getCount(0);
        double double14 = frequency1.getPct((int) (short) -1);
        long long15 = frequency1.getSumFreq();
        long long17 = frequency1.getCount('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getCumPct((long) 10);
        double double23 = frequency19.getPct('#');
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        double double27 = frequency25.getCumPct((long) 10);
        long long29 = frequency25.getCumFreq((java.lang.Object) 1.0d);
        double double31 = frequency25.getCumPct((int) '4');
        long long32 = frequency25.getSumFreq();
        double double33 = frequency19.getCumPct((java.lang.Object) long32);
        double double35 = frequency19.getCumPct('#');
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        long long39 = frequency37.getCumFreq((java.lang.Object) (short) 10);
        double double40 = frequency19.getPct((java.lang.Object) frequency37);
        long long41 = frequency37.getSumFreq();
        java.util.Comparator comparator42 = null;
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency(comparator42);
        double double45 = frequency43.getCumPct((long) 10);
        long long47 = frequency43.getCumFreq((java.lang.Object) 1.0d);
        double double49 = frequency43.getCumPct((int) '4');
        long long50 = frequency43.getSumFreq();
        double double52 = frequency43.getPct('a');
        frequency43.addValue(0L);
        double double55 = frequency37.getPct((java.lang.Object) frequency43);
        frequency37.addValue(' ');
        long long59 = frequency37.getCount('#');
        long long61 = frequency37.getCount('a');
        long long63 = frequency37.getCount((long) 0);
        long long65 = frequency37.getCount(3L);
        java.util.Iterator iterator66 = frequency37.valuesIterator();
        java.lang.String str67 = frequency37.toString();
        long long68 = frequency1.getCount((java.lang.Object) str67);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n" + "'", str67, "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long24 = frequency19.getCount(0);
        double double26 = frequency19.getCumPct(1);
        double double28 = frequency19.getPct('a');
        double double30 = frequency19.getPct(' ');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((long) 10);
        long long36 = frequency32.getCount((java.lang.Object) 100.0f);
        double double38 = frequency32.getPct(1L);
        frequency32.clear();
        long long41 = frequency32.getCumFreq((long) (byte) 1);
        double double43 = frequency32.getPct((long) '#');
        long long44 = frequency19.getCumFreq((java.lang.Object) frequency32);
        double double46 = frequency32.getPct((long) 'a');
        long long48 = frequency32.getCount((int) (byte) -1);
        java.lang.String str49 = frequency32.toString();
        frequency32.addValue((long) ' ');
        long long53 = frequency32.getCount('#');
        long long55 = frequency32.getCount((int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str49, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        double double8 = frequency1.getPct('#');
        double double10 = frequency1.getCumPct(' ');
        double double12 = frequency1.getCumPct((int) ' ');
        frequency1.addValue((java.lang.Integer) 100);
        frequency1.addValue((java.lang.Integer) 1);
        java.util.Iterator iterator17 = frequency1.valuesIterator();
        long long19 = frequency1.getCount(1);
        double double21 = frequency1.getPct(' ');
        long long23 = frequency1.getCumFreq((int) (byte) 10);
        long long25 = frequency1.getCumFreq((int) (byte) -1);
        double double27 = frequency1.getPct((int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.5d + "'", double27 == 0.5d);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        long long7 = frequency1.getCumFreq((long) 'a');
        double double9 = frequency1.getPct((java.lang.Object) (byte) 100);
        long long11 = frequency1.getCount('#');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        double double17 = frequency13.getPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getCumPct((long) 10);
        long long23 = frequency19.getCumFreq((java.lang.Object) 1.0d);
        double double25 = frequency19.getCumPct((int) '4');
        long long26 = frequency19.getSumFreq();
        double double27 = frequency13.getCumPct((java.lang.Object) long26);
        double double29 = frequency13.getCumPct('#');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCumFreq((java.lang.Object) (short) 10);
        double double34 = frequency13.getPct((java.lang.Object) frequency31);
        long long36 = frequency31.getCount(0);
        frequency31.addValue((long) ' ');
        long long40 = frequency31.getCount((long) (byte) 0);
        frequency1.addValue((java.lang.Object) long40);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long1 = frequency0.getSumFreq();
        long long3 = frequency0.getCumFreq((long) 1);
        long long5 = frequency0.getCumFreq((-1L));
        long long7 = frequency0.getCount((-1));
        long long9 = frequency0.getCumFreq((long) (byte) 10);
        java.util.Iterator iterator10 = frequency0.valuesIterator();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long8 = frequency1.getSumFreq();
        double double10 = frequency1.getPct('a');
        frequency1.addValue(0L);
        long long14 = frequency1.getCumFreq((long) (byte) 10);
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getCumPct((long) 10);
        double double20 = frequency16.getPct('#');
        java.util.Iterator iterator21 = frequency16.valuesIterator();
        double double23 = frequency16.getPct('#');
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        double double27 = frequency25.getCumPct((long) 10);
        long long29 = frequency25.getCount((java.lang.Object) 100.0f);
        double double31 = frequency25.getPct(1L);
        long long33 = frequency25.getCumFreq((long) 0);
        double double35 = frequency25.getPct('a');
        double double36 = frequency16.getPct((java.lang.Object) 'a');
        java.util.Comparator comparator37 = null;
        org.apache.commons.math.stat.Frequency frequency38 = new org.apache.commons.math.stat.Frequency(comparator37);
        double double40 = frequency38.getCumPct((long) 10);
        long long42 = frequency38.getCount((java.lang.Object) 100.0f);
        long long44 = frequency38.getCumFreq((long) 0);
        double double45 = frequency16.getCumPct((java.lang.Object) frequency38);
        frequency16.addValue((long) (-1));
        frequency1.addValue((java.lang.Object) (-1));
        java.util.Comparator comparator49 = null;
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency(comparator49);
        long long52 = frequency50.getCount('#');
        java.util.Iterator iterator53 = frequency50.valuesIterator();
        java.lang.Class<?> wildcardClass54 = iterator53.getClass();
        double double55 = frequency1.getPct((java.lang.Object) wildcardClass54);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        java.lang.String str8 = frequency1.toString();
        long long10 = frequency1.getCumFreq((long) '4');
        double double12 = frequency1.getPct(1L);
        frequency1.addValue(' ');
        long long16 = frequency1.getCumFreq((int) '#');
        double double18 = frequency1.getCumPct((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Comparator comparator1 = null;
        org.apache.commons.math.stat.Frequency frequency2 = new org.apache.commons.math.stat.Frequency(comparator1);
        double double4 = frequency2.getCumPct((long) 10);
        long long6 = frequency2.getCumFreq((java.lang.Object) 1.0d);
        double double8 = frequency2.getCumPct((int) '4');
        long long9 = frequency2.getSumFreq();
        long long11 = frequency2.getCount((long) (-1));
        long long13 = frequency2.getCount('4');
        long long15 = frequency2.getCount(1);
        double double16 = frequency0.getPct((java.lang.Object) 1);
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getCumPct((long) 10);
        long long22 = frequency18.getCount((int) (byte) 10);
        double double24 = frequency18.getCumPct((-1));
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        double double28 = frequency26.getCumPct((long) 10);
        double double30 = frequency26.getPct('#');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((long) 10);
        long long36 = frequency32.getCumFreq((java.lang.Object) 1.0d);
        double double38 = frequency32.getCumPct((int) '4');
        long long39 = frequency32.getSumFreq();
        double double40 = frequency26.getCumPct((java.lang.Object) long39);
        double double42 = frequency26.getCumPct('#');
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        long long46 = frequency44.getCumFreq((java.lang.Object) (short) 10);
        double double47 = frequency26.getPct((java.lang.Object) frequency44);
        long long49 = frequency44.getCumFreq((int) (byte) 10);
        frequency44.addValue((long) ' ');
        long long53 = frequency44.getCumFreq(' ');
        double double54 = frequency18.getCumPct((java.lang.Object) frequency44);
        long long55 = frequency0.getCumFreq((java.lang.Object) frequency18);
        long long57 = frequency0.getCount((long) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        double double11 = frequency1.getCumPct((long) '4');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getCumPct((long) 10);
        long long19 = frequency15.getCount((java.lang.Object) 100.0f);
        double double21 = frequency15.getPct(1L);
        double double23 = frequency15.getCumPct((int) (short) -1);
        double double24 = frequency13.getCumPct((java.lang.Object) frequency15);
        double double26 = frequency13.getCumPct(10);
        long long28 = frequency13.getCumFreq((long) (byte) 0);
        long long29 = frequency1.getCount((java.lang.Object) (byte) 0);
        long long31 = frequency1.getCumFreq('4');
        long long32 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 2L + "'", long32 == 2L);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        java.lang.String str8 = frequency1.toString();
        frequency1.addValue(' ');
        double double12 = frequency1.getPct('#');
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getCumPct((long) 10);
        long long18 = frequency14.getCount((java.lang.Object) 100.0f);
        frequency14.addValue((java.lang.Integer) (-1));
        frequency14.addValue((java.lang.Integer) 10);
        long long24 = frequency14.getCumFreq((int) (byte) 10);
        double double25 = frequency1.getPct((java.lang.Object) frequency14);
        long long26 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        frequency1.addValue(1);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        double double15 = frequency11.getPct('#');
        double double17 = frequency11.getCumPct((int) '#');
        long long18 = frequency1.getCumFreq((java.lang.Object) double17);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getCumPct((long) 10);
        long long24 = frequency20.getCount((java.lang.Object) 100.0f);
        frequency20.addValue((java.lang.Integer) (-1));
        frequency20.addValue((java.lang.Integer) 10);
        double double30 = frequency20.getCumPct((long) (byte) 10);
        long long31 = frequency1.getCumFreq((java.lang.Object) frequency20);
        java.util.Comparator comparator32 = null;
        org.apache.commons.math.stat.Frequency frequency33 = new org.apache.commons.math.stat.Frequency(comparator32);
        double double35 = frequency33.getCumPct((long) 10);
        long long37 = frequency33.getCount((java.lang.Object) 100.0f);
        frequency33.addValue((java.lang.Integer) (-1));
        frequency33.addValue((java.lang.Integer) 10);
        frequency33.addValue((int) (byte) 1);
        double double44 = frequency20.getPct((java.lang.Object) (byte) 1);
        long long46 = frequency20.getCumFreq('4');
        frequency20.addValue((java.lang.Integer) 100);
        double double50 = frequency20.getPct((long) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.3333333333333333d + "'", double50 == 0.3333333333333333d);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        long long7 = frequency1.getCumFreq((long) 'a');
        frequency1.addValue((long) 100);
        double double11 = frequency1.getPct(0);
        double double13 = frequency1.getPct('#');
        double double15 = frequency1.getPct(4L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long24 = frequency19.getCount(0);
        double double26 = frequency19.getCumPct(1);
        double double28 = frequency19.getPct('a');
        double double30 = frequency19.getPct((long) (byte) 100);
        frequency19.addValue('4');
        long long34 = frequency19.getCumFreq((int) (byte) 100);
        long long36 = frequency19.getCumFreq(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        long long7 = frequency1.getCumFreq((long) 'a');
        double double9 = frequency1.getPct((java.lang.Object) (byte) 100);
        double double11 = frequency1.getCumPct((long) (-1));
        frequency1.addValue((long) (short) 0);
        long long14 = frequency1.getSumFreq();
        double double16 = frequency1.getCumPct((int) (short) -1);
        frequency1.clear();
        java.util.Iterator iterator18 = frequency1.valuesIterator();
        long long20 = frequency1.getCumFreq(0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long1 = frequency0.getSumFreq();
        double double3 = frequency0.getCumPct('a');
        java.util.Iterator iterator4 = frequency0.valuesIterator();
        frequency0.addValue((java.lang.Integer) 1);
        double double8 = frequency0.getPct((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Iterator iterator6 = frequency1.valuesIterator();
        double double8 = frequency1.getPct('#');
        double double10 = frequency1.getCumPct(' ');
        double double12 = frequency1.getPct((int) (byte) 10);
        double double14 = frequency1.getCumPct((long) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        long long7 = frequency1.getCumFreq(' ');
        java.lang.String str8 = frequency1.toString();
        java.util.Iterator iterator9 = frequency1.valuesIterator();
        long long11 = frequency1.getCount(0);
        long long12 = frequency1.getSumFreq();
        double double14 = frequency1.getCumPct((long) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        long long7 = frequency1.getCumFreq((long) 'a');
        frequency1.addValue((long) 100);
        java.util.Iterator iterator10 = frequency1.valuesIterator();
        long long12 = frequency1.getCount((int) (byte) 100);
        java.lang.String str13 = frequency1.toString();
        long long15 = frequency1.getCumFreq(0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n" + "'", str13, "Value \t Freq. \t Pct. \t Cum Pct. \n100\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        long long7 = frequency1.getCumFreq((long) 'a');
        frequency1.addValue((long) 100);
        java.util.Iterator iterator10 = frequency1.valuesIterator();
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        double double14 = frequency12.getCumPct((long) 10);
        double double16 = frequency12.getPct('#');
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getCumPct((long) 10);
        long long22 = frequency18.getCumFreq((java.lang.Object) 1.0d);
        double double24 = frequency18.getCumPct((int) '4');
        long long25 = frequency18.getSumFreq();
        double double26 = frequency12.getCumPct((java.lang.Object) long25);
        double double28 = frequency12.getCumPct('#');
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        long long32 = frequency30.getCumFreq((java.lang.Object) (short) 10);
        double double33 = frequency12.getPct((java.lang.Object) frequency30);
        long long35 = frequency30.getCount(0);
        frequency30.addValue((long) ' ');
        double double39 = frequency30.getCumPct(0);
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        double double43 = frequency41.getCumPct((long) 10);
        long long45 = frequency41.getCount((java.lang.Object) 100.0f);
        double double47 = frequency41.getPct(1L);
        long long49 = frequency41.getCumFreq((long) 0);
        double double51 = frequency41.getPct('a');
        double double53 = frequency41.getPct(1);
        double double55 = frequency41.getCumPct((long) (byte) 0);
        long long56 = frequency30.getCumFreq((java.lang.Object) frequency41);
        long long57 = frequency1.getCumFreq((java.lang.Object) frequency30);
        double double59 = frequency30.getCumPct(' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        frequency1.addValue(1);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        double double15 = frequency11.getPct('#');
        double double17 = frequency11.getCumPct((int) '#');
        long long18 = frequency1.getCumFreq((java.lang.Object) double17);
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getCumPct((long) 10);
        long long24 = frequency20.getCount((java.lang.Object) 100.0f);
        frequency20.addValue((java.lang.Integer) (-1));
        frequency20.addValue((java.lang.Integer) 10);
        double double30 = frequency20.getCumPct((long) (byte) 10);
        long long31 = frequency1.getCumFreq((java.lang.Object) frequency20);
        frequency1.addValue((int) '4');
        double double35 = frequency1.getPct(100);
        java.util.Iterator iterator36 = frequency1.valuesIterator();
        double double38 = frequency1.getCumPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        long long1 = frequency0.getSumFreq();
        double double3 = frequency0.getCumPct('a');
        long long5 = frequency0.getCount((int) (short) 100);
        long long7 = frequency0.getCumFreq((int) '#');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getCumPct((long) 10);
        long long13 = frequency9.getCumFreq((java.lang.Object) 1.0d);
        double double15 = frequency9.getCumPct((int) '4');
        long long16 = frequency9.getSumFreq();
        long long18 = frequency9.getCount((long) (-1));
        long long20 = frequency9.getCount('4');
        frequency9.addValue((long) (byte) 1);
        double double24 = frequency9.getCumPct((long) (short) 0);
        java.util.Iterator iterator25 = frequency9.valuesIterator();
        java.util.Iterator iterator26 = frequency9.valuesIterator();
        double double28 = frequency9.getPct((java.lang.Object) (-1L));
        double double29 = frequency0.getCumPct((java.lang.Object) (-1L));
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getCumPct((long) 10);
        double double35 = frequency31.getPct('#');
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        double double39 = frequency37.getCumPct((long) 10);
        long long41 = frequency37.getCumFreq((java.lang.Object) 1.0d);
        double double43 = frequency37.getCumPct((int) '4');
        long long44 = frequency37.getSumFreq();
        double double45 = frequency31.getCumPct((java.lang.Object) long44);
        double double47 = frequency31.getCumPct('#');
        java.util.Comparator comparator48 = null;
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency(comparator48);
        long long51 = frequency49.getCumFreq((java.lang.Object) (short) 10);
        double double52 = frequency31.getPct((java.lang.Object) frequency49);
        double double54 = frequency31.getPct((long) 10);
        frequency31.addValue((java.lang.Integer) 10);
        double double57 = frequency0.getPct((java.lang.Object) 10);
        frequency0.addValue((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        double double24 = frequency19.getCumPct((java.lang.Object) (short) 100);
        long long26 = frequency19.getCumFreq((long) (byte) 0);
        long long28 = frequency19.getCount((int) (short) 10);
        long long29 = frequency19.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount('#');
        frequency1.addValue(0L);
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Value not comparable to existing values.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCount((long) (-1));
        frequency1.addValue(1);
        frequency1.addValue(0);
        java.util.Iterator iterator15 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCount((long) (-1));
        long long12 = frequency1.getCount('4');
        long long14 = frequency1.getCount(1);
        double double16 = frequency1.getCumPct((java.lang.Object) (short) 10);
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getCumPct((long) 10);
        long long22 = frequency18.getCount((java.lang.Object) 100.0f);
        double double24 = frequency18.getPct(1L);
        long long26 = frequency18.getCumFreq((long) 0);
        double double28 = frequency18.getPct('a');
        double double30 = frequency18.getPct(1);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((long) 10);
        double double36 = frequency32.getPct('#');
        double double38 = frequency32.getCumPct((int) '#');
        frequency32.addValue(1);
        java.util.Comparator comparator41 = null;
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency(comparator41);
        double double44 = frequency42.getCumPct((long) 10);
        double double46 = frequency42.getPct('#');
        double double48 = frequency42.getCumPct((int) '#');
        long long49 = frequency32.getCumFreq((java.lang.Object) double48);
        double double51 = frequency32.getCumPct((long) (short) 0);
        long long52 = frequency18.getCumFreq((java.lang.Object) double51);
        java.util.Comparator comparator53 = null;
        org.apache.commons.math.stat.Frequency frequency54 = new org.apache.commons.math.stat.Frequency(comparator53);
        double double56 = frequency54.getCumPct((long) 10);
        double double58 = frequency54.getPct('#');
        java.util.Comparator comparator59 = null;
        org.apache.commons.math.stat.Frequency frequency60 = new org.apache.commons.math.stat.Frequency(comparator59);
        double double62 = frequency60.getCumPct((long) 10);
        long long64 = frequency60.getCumFreq((java.lang.Object) 1.0d);
        double double66 = frequency60.getCumPct((int) '4');
        long long67 = frequency60.getSumFreq();
        double double68 = frequency54.getCumPct((java.lang.Object) long67);
        double double70 = frequency54.getCumPct('#');
        java.util.Comparator comparator71 = null;
        org.apache.commons.math.stat.Frequency frequency72 = new org.apache.commons.math.stat.Frequency(comparator71);
        long long74 = frequency72.getCumFreq((java.lang.Object) (short) 10);
        double double75 = frequency54.getPct((java.lang.Object) frequency72);
        long long77 = frequency54.getCumFreq(10);
        long long78 = frequency54.getSumFreq();
        double double79 = frequency18.getCumPct((java.lang.Object) long78);
        long long80 = frequency1.getCumFreq((java.lang.Object) double79);
        java.lang.Object obj81 = null;
        double double82 = frequency1.getCumPct(obj81);
        long long84 = frequency1.getCount((long) (short) 100);
        long long86 = frequency1.getCumFreq('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        java.lang.String str8 = frequency1.toString();
        long long10 = frequency1.getCumFreq((long) '4');
        java.lang.String str11 = frequency1.toString();
        java.lang.String str12 = frequency1.toString();
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getCumPct((long) 10);
        long long18 = frequency14.getCount((java.lang.Object) 100.0f);
        double double20 = frequency14.getPct(1L);
        frequency14.clear();
        long long22 = frequency1.getCount((java.lang.Object) frequency14);
        double double24 = frequency14.getPct((java.lang.Object) 1.0d);
        long long26 = frequency14.getCount((long) 100);
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        long long30 = frequency28.getCount('#');
        java.util.Iterator iterator31 = frequency28.valuesIterator();
        double double32 = frequency14.getPct((java.lang.Object) frequency28);
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        double double36 = frequency34.getCumPct((long) 10);
        long long38 = frequency34.getCumFreq((java.lang.Object) 1.0d);
        long long40 = frequency34.getCumFreq((long) 'a');
        double double42 = frequency34.getPct((java.lang.Object) (byte) 100);
        long long44 = frequency34.getCount('#');
        long long45 = frequency14.getCumFreq((java.lang.Object) frequency34);
        java.lang.Class<?> wildcardClass46 = frequency14.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getPct((long) '#');
        long long9 = frequency1.getCumFreq((long) 'a');
        double double11 = frequency1.getCumPct((int) (short) -1);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        long long17 = frequency13.getCount((java.lang.Object) 100.0f);
        double double19 = frequency13.getPct(1L);
        long long21 = frequency13.getCount((int) (byte) 0);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        double double25 = frequency23.getCumPct((long) 10);
        double double27 = frequency23.getPct('#');
        java.util.Iterator iterator28 = frequency23.valuesIterator();
        double double29 = frequency13.getPct((java.lang.Object) frequency23);
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getCumPct((long) 10);
        double double35 = frequency31.getPct('#');
        java.util.Comparator comparator36 = null;
        org.apache.commons.math.stat.Frequency frequency37 = new org.apache.commons.math.stat.Frequency(comparator36);
        double double39 = frequency37.getCumPct((long) 10);
        long long41 = frequency37.getCumFreq((java.lang.Object) 1.0d);
        double double43 = frequency37.getCumPct((int) '4');
        long long44 = frequency37.getSumFreq();
        double double45 = frequency31.getCumPct((java.lang.Object) long44);
        double double47 = frequency31.getCumPct('#');
        java.util.Comparator comparator48 = null;
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency(comparator48);
        long long51 = frequency49.getCumFreq((java.lang.Object) (short) 10);
        double double52 = frequency31.getPct((java.lang.Object) frequency49);
        double double54 = frequency49.getCumPct((java.lang.Object) (short) 100);
        long long56 = frequency49.getCumFreq((long) (byte) 0);
        java.util.Comparator comparator57 = null;
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency(comparator57);
        double double60 = frequency58.getCumPct((long) 10);
        long long62 = frequency58.getCount((java.lang.Object) 100.0f);
        double double64 = frequency58.getPct(1L);
        long long65 = frequency49.getCumFreq((java.lang.Object) frequency58);
        double double67 = frequency49.getCumPct((long) (short) -1);
        java.util.Comparator comparator68 = null;
        org.apache.commons.math.stat.Frequency frequency69 = new org.apache.commons.math.stat.Frequency(comparator68);
        double double71 = frequency69.getCumPct((long) 10);
        long long73 = frequency69.getCount((java.lang.Object) 100.0f);
        double double75 = frequency69.getPct(1L);
        frequency69.clear();
        long long78 = frequency69.getCumFreq((long) (byte) 1);
        long long80 = frequency69.getCumFreq((long) 0);
        long long82 = frequency69.getCount((long) (byte) 1);
        double double83 = frequency49.getCumPct((java.lang.Object) frequency69);
        long long84 = frequency23.getCumFreq((java.lang.Object) frequency49);
        java.util.Iterator iterator85 = frequency49.valuesIterator();
        long long86 = frequency49.getSumFreq();
        double double87 = frequency1.getCumPct((java.lang.Object) frequency49);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertNotNull(iterator85);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double87));
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        frequency1.addValue((int) (byte) 1);
        double double13 = frequency1.getPct((int) (byte) 1);
        long long15 = frequency1.getCumFreq((long) (short) 1);
        long long17 = frequency1.getCount((int) (short) 1);
        double double19 = frequency1.getPct((int) (short) -1);
        frequency1.addValue((int) (short) 1);
        double double23 = frequency1.getCumPct((int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3333333333333333d + "'", double13 == 0.3333333333333333d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.3333333333333333d + "'", double19 == 0.3333333333333333d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((long) (short) 10);
        long long10 = frequency1.getSumFreq();
        double double12 = frequency1.getCumPct((java.lang.Object) (short) 100);
        frequency1.addValue((int) (short) 100);
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getCumPct((long) 10);
        long long20 = frequency16.getCount((java.lang.Object) 100.0f);
        double double22 = frequency16.getPct(1L);
        long long24 = frequency16.getCount((int) (byte) 0);
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        double double28 = frequency26.getCumPct((long) 10);
        double double30 = frequency26.getPct('#');
        java.util.Iterator iterator31 = frequency26.valuesIterator();
        double double32 = frequency16.getPct((java.lang.Object) frequency26);
        long long34 = frequency16.getCount((int) (byte) 100);
        long long36 = frequency16.getCount((long) (byte) 10);
        long long38 = frequency16.getCumFreq('#');
        double double39 = frequency1.getCumPct((java.lang.Object) '#');
        double double41 = frequency1.getCumPct((int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        long long9 = frequency1.getCount(0L);
        double double11 = frequency1.getPct((int) (short) 100);
        double double13 = frequency1.getPct((int) '4');
        double double15 = frequency1.getCumPct((long) (short) -1);
        frequency1.addValue((java.lang.Integer) 10);
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getCumPct((long) 10);
        long long23 = frequency19.getCount((java.lang.Object) 100.0f);
        frequency19.addValue((java.lang.Integer) (-1));
        frequency19.addValue((java.lang.Integer) 10);
        frequency19.addValue((int) (byte) 1);
        long long30 = frequency1.getCumFreq((java.lang.Object) frequency19);
        double double32 = frequency19.getCumPct('4');
        long long33 = frequency19.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 3L + "'", long33 == 3L);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        frequency1.addValue((int) (byte) 1);
        double double13 = frequency1.getPct((int) (byte) 1);
        long long15 = frequency1.getCumFreq((long) (short) 1);
        double double17 = frequency1.getPct((int) (short) 10);
        long long18 = frequency1.getSumFreq();
        java.util.Comparator comparator19 = null;
        org.apache.commons.math.stat.Frequency frequency20 = new org.apache.commons.math.stat.Frequency(comparator19);
        double double22 = frequency20.getCumPct((long) 10);
        long long24 = frequency20.getCount((java.lang.Object) 100.0f);
        frequency20.addValue((int) (short) 1);
        double double28 = frequency20.getCumPct(' ');
        long long30 = frequency20.getCumFreq('4');
        double double31 = frequency1.getPct((java.lang.Object) frequency20);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.3333333333333333d + "'", double13 == 0.3333333333333333d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.3333333333333333d + "'", double17 == 0.3333333333333333d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((long) (short) 10);
        long long10 = frequency1.getSumFreq();
        long long12 = frequency1.getCumFreq((long) (byte) 100);
        frequency1.addValue((java.lang.Integer) 0);
        long long15 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((long) (short) 10);
        long long10 = frequency1.getSumFreq();
        double double12 = frequency1.getCumPct((java.lang.Object) (short) 100);
        frequency1.addValue((int) (short) 100);
        long long16 = frequency1.getCount('a');
        long long18 = frequency1.getCumFreq((int) (byte) 1);
        long long20 = frequency1.getCumFreq((int) (short) -1);
        double double22 = frequency1.getCumPct((long) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.3333333333333333d + "'", double22 == 0.3333333333333333d);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long24 = frequency19.getCount(0);
        frequency19.addValue((long) ' ');
        double double28 = frequency19.getCumPct(0);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getCumPct((long) 10);
        long long34 = frequency30.getCount((java.lang.Object) 100.0f);
        double double36 = frequency30.getPct(1L);
        long long38 = frequency30.getCumFreq((long) 0);
        double double40 = frequency30.getPct('a');
        double double42 = frequency30.getPct(1);
        double double44 = frequency30.getCumPct((long) (byte) 0);
        long long45 = frequency19.getCumFreq((java.lang.Object) frequency30);
        long long47 = frequency19.getCumFreq('a');
        double double49 = frequency19.getCumPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCount((long) (-1));
        double double12 = frequency1.getCumPct((int) (short) 100);
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getCumPct((long) 10);
        long long18 = frequency14.getCount((int) (byte) 10);
        double double20 = frequency14.getPct((long) '#');
        java.lang.String str21 = frequency14.toString();
        long long22 = frequency1.getCount((java.lang.Object) frequency14);
        java.lang.String str23 = frequency1.toString();
        long long25 = frequency1.getCount(0);
        long long27 = frequency1.getCumFreq((long) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        java.lang.String str8 = frequency1.toString();
        long long10 = frequency1.getCumFreq((long) '4');
        java.lang.String str11 = frequency1.toString();
        java.lang.String str12 = frequency1.toString();
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getCumPct((long) 10);
        long long18 = frequency14.getCount((java.lang.Object) 100.0f);
        double double20 = frequency14.getPct(1L);
        frequency14.clear();
        long long22 = frequency1.getCount((java.lang.Object) frequency14);
        double double24 = frequency14.getPct((java.lang.Object) 1.0d);
        long long26 = frequency14.getCount((long) 100);
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        long long30 = frequency28.getCount('#');
        java.util.Iterator iterator31 = frequency28.valuesIterator();
        double double32 = frequency14.getPct((java.lang.Object) frequency28);
        double double34 = frequency14.getCumPct('#');
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        double double38 = frequency36.getCumPct((long) 10);
        long long40 = frequency36.getCount((java.lang.Object) 100.0f);
        frequency36.addValue((java.lang.Integer) (-1));
        frequency36.addValue((java.lang.Integer) 10);
        frequency36.addValue((int) (byte) 1);
        double double48 = frequency36.getPct((int) (byte) 1);
        double double50 = frequency36.getPct(100L);
        double double52 = frequency36.getCumPct(' ');
        double double53 = frequency14.getPct((java.lang.Object) ' ');
        java.util.Comparator comparator54 = null;
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency(comparator54);
        double double57 = frequency55.getCumPct((long) 10);
        double double59 = frequency55.getPct('#');
        double double61 = frequency55.getCumPct((int) '#');
        frequency55.addValue(1);
        double double65 = frequency55.getPct((-1L));
        java.util.Iterator iterator66 = frequency55.valuesIterator();
        java.lang.Class<?> wildcardClass67 = iterator66.getClass();
        // The following exception was thrown during execution in test generation
        try {
            frequency14.addValue((java.lang.Object) iterator66);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.3333333333333333d + "'", double48 == 0.3333333333333333d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(iterator66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        double double11 = frequency1.getCumPct((long) (byte) 10);
        long long13 = frequency1.getCount('a');
        long long15 = frequency1.getCumFreq(0);
        long long17 = frequency1.getCount((long) 'a');
        long long19 = frequency1.getCount(1L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        java.lang.String str8 = frequency1.toString();
        long long10 = frequency1.getCumFreq((long) '4');
        java.lang.String str11 = frequency1.toString();
        java.lang.String str12 = frequency1.toString();
        long long14 = frequency1.getCount('4');
        long long15 = frequency1.getSumFreq();
        java.lang.String str16 = frequency1.toString();
        double double18 = frequency1.getCumPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str16, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        frequency0.addValue((long) (short) 100);
        frequency0.addValue((java.lang.Integer) (-1));
        long long6 = frequency0.getCount((int) '#');
        double double8 = frequency0.getCumPct((long) (-1));
        frequency0.addValue((int) (short) 1);
        long long12 = frequency0.getCumFreq((int) 'a');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.5d + "'", double8 == 0.5d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        long long7 = frequency1.getCumFreq((java.lang.Object) (short) 10);
        double double9 = frequency1.getCumPct((int) (byte) 0);
        double double11 = frequency1.getCumPct((int) '#');
        double double13 = frequency1.getCumPct((long) '#');
        java.util.Iterator iterator14 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        long long9 = frequency1.getCumFreq((long) 0);
        double double11 = frequency1.getPct('a');
        double double13 = frequency1.getPct(1);
        long long15 = frequency1.getCount((long) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        long long11 = frequency1.getCumFreq((int) 'a');
        long long13 = frequency1.getCount((int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = frequency1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getPct((long) '#');
        java.lang.String str8 = frequency1.toString();
        double double10 = frequency1.getPct(0L);
        java.util.Comparator comparator11 = null;
        org.apache.commons.math.stat.Frequency frequency12 = new org.apache.commons.math.stat.Frequency(comparator11);
        double double14 = frequency12.getCumPct((long) 10);
        double double16 = frequency12.getPct('#');
        double double18 = frequency12.getCumPct((int) '#');
        java.lang.String str19 = frequency12.toString();
        frequency12.addValue(' ');
        long long22 = frequency1.getCumFreq((java.lang.Object) frequency12);
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getCumPct((long) 10);
        double double28 = frequency24.getPct('#');
        frequency24.addValue((int) '4');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((long) 10);
        double double36 = frequency32.getPct('#');
        java.util.Iterator iterator37 = frequency32.valuesIterator();
        double double39 = frequency32.getPct('#');
        long long41 = frequency32.getCumFreq((java.lang.Object) 100L);
        frequency24.addValue((java.lang.Object) long41);
        long long44 = frequency24.getCount('#');
        long long46 = frequency24.getCount(' ');
        double double47 = frequency12.getCumPct((java.lang.Object) ' ');
        java.util.Comparator comparator48 = null;
        org.apache.commons.math.stat.Frequency frequency49 = new org.apache.commons.math.stat.Frequency(comparator48);
        frequency49.addValue((int) '4');
        java.lang.String str52 = frequency49.toString();
        double double54 = frequency49.getCumPct(' ');
        long long55 = frequency12.getCumFreq((java.lang.Object) double54);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n" + "'", str52, "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        frequency1.addValue(1);
        double double11 = frequency1.getPct((-1L));
        frequency1.addValue((long) (byte) -1);
        frequency1.addValue(100);
        frequency1.addValue(0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        long long7 = frequency1.getCumFreq(' ');
        double double9 = frequency1.getPct(2L);
        long long11 = frequency1.getCount('a');
        frequency1.addValue((long) '#');
        long long15 = frequency1.getCount(0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        frequency1.clear();
        frequency1.addValue((long) (byte) 0);
        long long11 = frequency1.getSumFreq();
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        long long17 = frequency13.getCumFreq((java.lang.Object) 1.0d);
        double double19 = frequency13.getCumPct((int) '4');
        long long20 = frequency13.getSumFreq();
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        double double24 = frequency22.getCumPct((long) 10);
        double double26 = frequency22.getPct('#');
        double double28 = frequency22.getCumPct((int) '#');
        frequency22.addValue(1);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((long) 10);
        double double36 = frequency32.getPct('#');
        double double38 = frequency32.getCumPct((int) '#');
        long long39 = frequency22.getCumFreq((java.lang.Object) double38);
        double double41 = frequency22.getCumPct((long) (short) 0);
        java.util.Comparator comparator42 = null;
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency(comparator42);
        double double45 = frequency43.getCumPct((long) 10);
        long long47 = frequency43.getCount((java.lang.Object) 100.0f);
        frequency43.addValue((java.lang.Integer) (-1));
        frequency43.addValue((java.lang.Integer) 10);
        long long53 = frequency43.getCumFreq((int) 'a');
        java.util.Comparator comparator54 = null;
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency(comparator54);
        double double57 = frequency55.getCumPct((long) 10);
        long long59 = frequency55.getCount((java.lang.Object) 100.0f);
        frequency55.addValue((java.lang.Integer) (-1));
        frequency43.addValue((java.lang.Object) (-1));
        long long63 = frequency22.getCount((java.lang.Object) frequency43);
        long long65 = frequency43.getCumFreq('a');
        double double66 = frequency13.getPct((java.lang.Object) 'a');
        double double67 = frequency1.getCumPct((java.lang.Object) frequency13);
        long long69 = frequency13.getCount((long) (short) 100);
        double double71 = frequency13.getPct((int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 2L + "'", long53 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) (short) 10);
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getCumPct((long) 10);
        long long13 = frequency9.getCount((java.lang.Object) 100.0f);
        frequency9.addValue((java.lang.Integer) (-1));
        frequency9.addValue((java.lang.Integer) 10);
        long long19 = frequency9.getCumFreq((int) 'a');
        frequency9.clear();
        double double22 = frequency9.getCumPct('a');
        frequency9.clear();
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        double double27 = frequency25.getCumPct((long) 10);
        double double29 = frequency25.getPct('#');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getCumPct((long) 10);
        long long35 = frequency31.getCumFreq((java.lang.Object) 1.0d);
        double double37 = frequency31.getCumPct((int) '4');
        long long38 = frequency31.getSumFreq();
        double double39 = frequency25.getCumPct((java.lang.Object) long38);
        double double41 = frequency25.getCumPct('#');
        java.util.Comparator comparator42 = null;
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency(comparator42);
        long long45 = frequency43.getCumFreq((java.lang.Object) (short) 10);
        double double46 = frequency25.getPct((java.lang.Object) frequency43);
        long long48 = frequency43.getCount(0);
        double double50 = frequency43.getCumPct(1);
        java.util.Comparator comparator51 = null;
        org.apache.commons.math.stat.Frequency frequency52 = new org.apache.commons.math.stat.Frequency(comparator51);
        double double54 = frequency52.getCumPct((long) 10);
        double double56 = frequency52.getPct('#');
        double double58 = frequency52.getCumPct((int) '#');
        java.lang.String str59 = frequency52.toString();
        long long61 = frequency52.getCumFreq((long) '4');
        java.lang.String str62 = frequency52.toString();
        double double63 = frequency43.getPct((java.lang.Object) str62);
        double double64 = frequency9.getCumPct((java.lang.Object) double63);
        long long66 = frequency9.getCumFreq(1);
        double double68 = frequency9.getCumPct('4');
        frequency9.clear();
        // The following exception was thrown during execution in test generation
        try {
            frequency1.addValue((java.lang.Object) frequency9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2L + "'", long19 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str59, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str62, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        java.util.Comparator comparator2 = null;
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency(comparator2);
        double double5 = frequency3.getCumPct((long) 10);
        long long7 = frequency3.getCount((java.lang.Object) 100.0f);
        double double9 = frequency3.getPct(1L);
        double double11 = frequency3.getCumPct((int) (short) -1);
        double double12 = frequency1.getCumPct((java.lang.Object) frequency3);
        double double14 = frequency1.getPct((long) (short) 10);
        long long16 = frequency1.getCumFreq((long) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCount((long) (-1));
        long long12 = frequency1.getCount('4');
        long long14 = frequency1.getCount((java.lang.Object) 10.0f);
        frequency1.addValue((-1L));
        long long18 = frequency1.getCount('a');
        double double20 = frequency1.getCumPct((int) '4');
        frequency1.addValue((long) (byte) -1);
        double double24 = frequency1.getPct((long) (short) 1);
        java.util.Comparator comparator25 = null;
        org.apache.commons.math.stat.Frequency frequency26 = new org.apache.commons.math.stat.Frequency(comparator25);
        double double28 = frequency26.getCumPct((long) 10);
        double double30 = frequency26.getPct('#');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((long) 10);
        long long36 = frequency32.getCumFreq((java.lang.Object) 1.0d);
        double double38 = frequency32.getCumPct((int) '4');
        long long39 = frequency32.getSumFreq();
        double double40 = frequency26.getCumPct((java.lang.Object) long39);
        double double42 = frequency26.getCumPct((long) (short) 0);
        long long44 = frequency26.getCount(' ');
        long long45 = frequency1.getCumFreq((java.lang.Object) frequency26);
        java.lang.Class<?> wildcardClass46 = frequency1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        long long9 = frequency1.getCount((int) (byte) 0);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        double double15 = frequency11.getPct('#');
        java.util.Iterator iterator16 = frequency11.valuesIterator();
        double double17 = frequency1.getPct((java.lang.Object) frequency11);
        double double19 = frequency1.getPct((long) (short) 0);
        frequency1.addValue((java.lang.Integer) 1);
        long long23 = frequency1.getCumFreq('4');
        java.util.Comparator comparator24 = null;
        org.apache.commons.math.stat.Frequency frequency25 = new org.apache.commons.math.stat.Frequency(comparator24);
        double double27 = frequency25.getCumPct((long) 10);
        double double29 = frequency25.getPct('#');
        double double31 = frequency25.getCumPct((int) '#');
        long long33 = frequency25.getCount(0L);
        double double35 = frequency25.getPct((int) (short) 100);
        double double37 = frequency25.getPct((int) (short) -1);
        long long39 = frequency25.getCumFreq((-1L));
        double double41 = frequency25.getPct('4');
        double double43 = frequency25.getPct((-1));
        java.util.Comparator comparator44 = null;
        org.apache.commons.math.stat.Frequency frequency45 = new org.apache.commons.math.stat.Frequency(comparator44);
        double double47 = frequency45.getCumPct((long) 10);
        long long49 = frequency45.getCumFreq((java.lang.Object) 1.0d);
        java.lang.String str50 = frequency45.toString();
        frequency45.clear();
        long long52 = frequency25.getCount((java.lang.Object) frequency45);
        double double53 = frequency1.getCumPct((java.lang.Object) frequency45);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str50, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        java.util.Comparator comparator2 = null;
        org.apache.commons.math.stat.Frequency frequency3 = new org.apache.commons.math.stat.Frequency(comparator2);
        double double5 = frequency3.getCumPct((long) 10);
        long long7 = frequency3.getCount((java.lang.Object) 100.0f);
        double double9 = frequency3.getPct(1L);
        double double11 = frequency3.getCumPct((int) (short) -1);
        double double12 = frequency1.getCumPct((java.lang.Object) frequency3);
        double double14 = frequency1.getCumPct(10);
        long long15 = frequency1.getSumFreq();
        double double17 = frequency1.getPct((int) 'a');
        long long19 = frequency1.getCumFreq(10L);
        java.util.Iterator iterator20 = frequency1.valuesIterator();
        long long21 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getCumPct((long) 10);
        long long28 = frequency24.getCumFreq((java.lang.Object) 1.0d);
        double double30 = frequency24.getCumPct((int) '4');
        long long32 = frequency24.getCumFreq((int) (byte) 10);
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        double double36 = frequency34.getCumPct((long) 10);
        long long38 = frequency34.getCount((java.lang.Object) 100.0f);
        frequency34.addValue((java.lang.Integer) (-1));
        frequency34.addValue((java.lang.Integer) 10);
        double double44 = frequency34.getCumPct((long) '4');
        double double45 = frequency24.getCumPct((java.lang.Object) '4');
        frequency19.addValue((java.lang.Object) '4');
        long long48 = frequency19.getCumFreq('a');
        frequency19.addValue('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        java.lang.String str8 = frequency1.toString();
        long long10 = frequency1.getCumFreq((long) '4');
        double double12 = frequency1.getPct(1L);
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getCumPct((long) 10);
        double double18 = frequency14.getPct('#');
        frequency14.clear();
        double double20 = frequency1.getPct((java.lang.Object) frequency14);
        frequency1.addValue((int) (byte) -1);
        java.lang.String str23 = frequency1.toString();
        double double25 = frequency1.getPct(0L);
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        double double29 = frequency27.getCumPct((long) 10);
        double double31 = frequency27.getPct('#');
        double double33 = frequency27.getCumPct((int) '#');
        frequency27.addValue(1);
        double double37 = frequency27.getPct((int) (byte) 0);
        double double39 = frequency27.getCumPct((int) (short) 0);
        java.util.Iterator iterator40 = frequency27.valuesIterator();
        long long41 = frequency1.getCumFreq((java.lang.Object) frequency27);
        java.util.Iterator iterator42 = frequency27.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str23, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(iterator42);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        frequency1.addValue(1);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        double double15 = frequency11.getPct('#');
        double double17 = frequency11.getCumPct((int) '#');
        long long18 = frequency1.getCumFreq((java.lang.Object) double17);
        double double20 = frequency1.getCumPct((long) (short) 0);
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        double double24 = frequency22.getCumPct((long) 10);
        long long26 = frequency22.getCount((java.lang.Object) 100.0f);
        frequency22.addValue((java.lang.Integer) (-1));
        frequency22.addValue((java.lang.Integer) 10);
        long long32 = frequency22.getCumFreq((int) 'a');
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        double double36 = frequency34.getCumPct((long) 10);
        long long38 = frequency34.getCount((java.lang.Object) 100.0f);
        frequency34.addValue((java.lang.Integer) (-1));
        frequency22.addValue((java.lang.Object) (-1));
        long long42 = frequency1.getCount((java.lang.Object) frequency22);
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        double double46 = frequency44.getCumPct((long) 10);
        double double48 = frequency44.getPct('#');
        java.util.Comparator comparator49 = null;
        org.apache.commons.math.stat.Frequency frequency50 = new org.apache.commons.math.stat.Frequency(comparator49);
        double double52 = frequency50.getCumPct((long) 10);
        long long54 = frequency50.getCumFreq((java.lang.Object) 1.0d);
        double double56 = frequency50.getCumPct((int) '4');
        long long57 = frequency50.getSumFreq();
        double double58 = frequency44.getCumPct((java.lang.Object) long57);
        double double60 = frequency44.getCumPct('#');
        java.util.Comparator comparator61 = null;
        org.apache.commons.math.stat.Frequency frequency62 = new org.apache.commons.math.stat.Frequency(comparator61);
        long long64 = frequency62.getCumFreq((java.lang.Object) (short) 10);
        double double65 = frequency44.getPct((java.lang.Object) frequency62);
        long long67 = frequency62.getCount(0);
        double double69 = frequency62.getCumPct(1);
        double double71 = frequency62.getPct('a');
        double double73 = frequency62.getPct(' ');
        java.util.Comparator comparator74 = null;
        org.apache.commons.math.stat.Frequency frequency75 = new org.apache.commons.math.stat.Frequency(comparator74);
        double double77 = frequency75.getCumPct((long) 10);
        long long79 = frequency75.getCount((java.lang.Object) 100.0f);
        double double81 = frequency75.getPct(1L);
        frequency75.clear();
        long long84 = frequency75.getCumFreq((long) (byte) 1);
        double double86 = frequency75.getPct((long) '#');
        long long87 = frequency62.getCumFreq((java.lang.Object) frequency75);
        double double89 = frequency75.getPct((long) 'a');
        long long90 = frequency22.getCumFreq((java.lang.Object) frequency75);
        double double92 = frequency75.getCumPct(0L);
        frequency75.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 2L + "'", long32 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 0L + "'", long90 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double92));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        long long11 = frequency1.getCumFreq((int) 'a');
        frequency1.clear();
        double double14 = frequency1.getCumPct('a');
        double double16 = frequency1.getPct(' ');
        double double18 = frequency1.getCumPct((long) 100);
        frequency1.addValue((java.lang.Integer) (-1));
        java.lang.String str21 = frequency1.toString();
        double double23 = frequency1.getCumPct((int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        long long11 = frequency1.getCumFreq((int) 'a');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        long long17 = frequency13.getCount((java.lang.Object) 100.0f);
        frequency13.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Object) (-1));
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        double double24 = frequency22.getCumPct((long) 10);
        long long26 = frequency22.getCount((java.lang.Object) 100.0f);
        frequency22.addValue((java.lang.Integer) (-1));
        frequency22.addValue((java.lang.Integer) 10);
        long long31 = frequency22.getSumFreq();
        long long33 = frequency22.getCount((int) (short) 0);
        long long35 = frequency22.getCount('a');
        long long37 = frequency22.getCount('4');
        double double38 = frequency1.getPct((java.lang.Object) frequency22);
        long long40 = frequency1.getCumFreq('4');
        double double42 = frequency1.getPct('4');
        double double44 = frequency1.getPct((long) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 2L + "'", long31 == 2L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        double double24 = frequency1.getPct((long) 10);
        frequency1.addValue(0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long24 = frequency19.getCount(0);
        double double26 = frequency19.getCumPct(1);
        double double28 = frequency19.getPct('a');
        double double30 = frequency19.getPct(' ');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((long) 10);
        long long36 = frequency32.getCount((java.lang.Object) 100.0f);
        double double38 = frequency32.getPct(1L);
        frequency32.clear();
        long long41 = frequency32.getCumFreq((long) (byte) 1);
        double double43 = frequency32.getPct((long) '#');
        long long44 = frequency19.getCumFreq((java.lang.Object) frequency32);
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        double double48 = frequency46.getCumPct((long) 10);
        double double50 = frequency46.getPct('#');
        java.util.Iterator iterator51 = frequency46.valuesIterator();
        long long53 = frequency46.getCumFreq('4');
        double double54 = frequency19.getCumPct((java.lang.Object) '4');
        long long56 = frequency19.getCount((int) (byte) -1);
        double double58 = frequency19.getCumPct('4');
        long long60 = frequency19.getCount('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        frequency1.addValue(' ');
        java.util.Comparator comparator4 = null;
        org.apache.commons.math.stat.Frequency frequency5 = new org.apache.commons.math.stat.Frequency(comparator4);
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCount((java.lang.Object) 100.0f);
        double double13 = frequency7.getPct(1L);
        double double15 = frequency7.getCumPct((int) (short) -1);
        double double16 = frequency5.getCumPct((java.lang.Object) frequency7);
        double double18 = frequency5.getCumPct(10);
        long long19 = frequency5.getSumFreq();
        double double21 = frequency5.getPct((int) 'a');
        long long23 = frequency5.getCumFreq(10L);
        long long25 = frequency5.getCount((int) (short) 0);
        long long26 = frequency1.getCount((java.lang.Object) long25);
        long long27 = frequency1.getSumFreq();
        frequency1.addValue('#');
        java.lang.Class<?> wildcardClass30 = frequency1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        long long11 = frequency1.getCumFreq((int) 'a');
        frequency1.clear();
        double double14 = frequency1.getCumPct('a');
        double double16 = frequency1.getPct(' ');
        long long18 = frequency1.getCount((long) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((-1));
        long long11 = frequency1.getCumFreq((int) (short) 0);
        long long13 = frequency1.getCount((int) 'a');
        frequency1.addValue((java.lang.Integer) 10);
        long long16 = frequency1.getSumFreq();
        java.lang.String str17 = frequency1.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n10\t1\t33%\t100%\n" + "'", str17, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n10\t1\t33%\t100%\n");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        long long3 = frequency1.getCount('#');
        java.util.Iterator iterator4 = frequency1.valuesIterator();
        java.util.Comparator comparator5 = null;
        org.apache.commons.math.stat.Frequency frequency6 = new org.apache.commons.math.stat.Frequency(comparator5);
        double double8 = frequency6.getCumPct((long) 10);
        long long10 = frequency6.getCumFreq((java.lang.Object) 1.0d);
        double double12 = frequency6.getCumPct((int) '4');
        long long13 = frequency6.getSumFreq();
        long long15 = frequency6.getCount((long) (-1));
        long long17 = frequency6.getCount('4');
        long long19 = frequency6.getCount(1);
        double double21 = frequency6.getCumPct((java.lang.Object) (short) 10);
        double double22 = frequency1.getCumPct((java.lang.Object) frequency6);
        frequency6.addValue((long) 100);
        double double26 = frequency6.getPct('a');
        long long28 = frequency6.getCumFreq((-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long8 = frequency1.getSumFreq();
        double double10 = frequency1.getPct('a');
        long long12 = frequency1.getCumFreq('a');
        long long14 = frequency1.getCount(10);
        java.util.Iterator iterator15 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        double double7 = frequency1.getCumPct((int) '4');
        long long8 = frequency1.getSumFreq();
        long long10 = frequency1.getCount((long) (-1));
        long long12 = frequency1.getCount('4');
        long long14 = frequency1.getCount(1);
        double double16 = frequency1.getCumPct((java.lang.Object) (short) 10);
        java.util.Comparator comparator17 = null;
        org.apache.commons.math.stat.Frequency frequency18 = new org.apache.commons.math.stat.Frequency(comparator17);
        double double20 = frequency18.getCumPct((long) 10);
        long long22 = frequency18.getCount((java.lang.Object) 100.0f);
        double double24 = frequency18.getPct(1L);
        long long26 = frequency18.getCumFreq((long) 0);
        double double28 = frequency18.getPct('a');
        double double30 = frequency18.getPct(1);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((long) 10);
        double double36 = frequency32.getPct('#');
        double double38 = frequency32.getCumPct((int) '#');
        frequency32.addValue(1);
        java.util.Comparator comparator41 = null;
        org.apache.commons.math.stat.Frequency frequency42 = new org.apache.commons.math.stat.Frequency(comparator41);
        double double44 = frequency42.getCumPct((long) 10);
        double double46 = frequency42.getPct('#');
        double double48 = frequency42.getCumPct((int) '#');
        long long49 = frequency32.getCumFreq((java.lang.Object) double48);
        double double51 = frequency32.getCumPct((long) (short) 0);
        long long52 = frequency18.getCumFreq((java.lang.Object) double51);
        java.util.Comparator comparator53 = null;
        org.apache.commons.math.stat.Frequency frequency54 = new org.apache.commons.math.stat.Frequency(comparator53);
        double double56 = frequency54.getCumPct((long) 10);
        double double58 = frequency54.getPct('#');
        java.util.Comparator comparator59 = null;
        org.apache.commons.math.stat.Frequency frequency60 = new org.apache.commons.math.stat.Frequency(comparator59);
        double double62 = frequency60.getCumPct((long) 10);
        long long64 = frequency60.getCumFreq((java.lang.Object) 1.0d);
        double double66 = frequency60.getCumPct((int) '4');
        long long67 = frequency60.getSumFreq();
        double double68 = frequency54.getCumPct((java.lang.Object) long67);
        double double70 = frequency54.getCumPct('#');
        java.util.Comparator comparator71 = null;
        org.apache.commons.math.stat.Frequency frequency72 = new org.apache.commons.math.stat.Frequency(comparator71);
        long long74 = frequency72.getCumFreq((java.lang.Object) (short) 10);
        double double75 = frequency54.getPct((java.lang.Object) frequency72);
        long long77 = frequency54.getCumFreq(10);
        long long78 = frequency54.getSumFreq();
        double double79 = frequency18.getCumPct((java.lang.Object) long78);
        long long80 = frequency1.getCumFreq((java.lang.Object) double79);
        long long82 = frequency1.getCount((long) ' ');
        double double84 = frequency1.getPct('a');
        frequency1.clear();
        double double87 = frequency1.getCumPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertTrue(Double.isNaN(double87));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        frequency1.addValue((java.lang.Integer) (-1));
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        double double23 = frequency21.getCumPct((long) 10);
        double double25 = frequency21.getPct('#');
        double double27 = frequency21.getCumPct((int) '#');
        long long29 = frequency21.getCount(0L);
        double double31 = frequency21.getPct((int) (short) 100);
        double double33 = frequency21.getPct((int) '4');
        double double35 = frequency21.getCumPct((long) (short) -1);
        frequency21.addValue((java.lang.Integer) 10);
        java.util.Comparator comparator38 = null;
        org.apache.commons.math.stat.Frequency frequency39 = new org.apache.commons.math.stat.Frequency(comparator38);
        double double41 = frequency39.getCumPct((long) 10);
        long long43 = frequency39.getCount((java.lang.Object) 100.0f);
        frequency39.addValue((java.lang.Integer) (-1));
        frequency39.addValue((java.lang.Integer) 10);
        frequency39.addValue((int) (byte) 1);
        long long50 = frequency21.getCumFreq((java.lang.Object) frequency39);
        java.util.Iterator iterator51 = frequency21.valuesIterator();
        java.util.Comparator comparator52 = null;
        org.apache.commons.math.stat.Frequency frequency53 = new org.apache.commons.math.stat.Frequency(comparator52);
        double double55 = frequency53.getCumPct((long) 10);
        double double57 = frequency53.getPct('#');
        java.util.Comparator comparator58 = null;
        org.apache.commons.math.stat.Frequency frequency59 = new org.apache.commons.math.stat.Frequency(comparator58);
        double double61 = frequency59.getCumPct((long) 10);
        long long63 = frequency59.getCumFreq((java.lang.Object) 1.0d);
        double double65 = frequency59.getCumPct((int) '4');
        long long66 = frequency59.getSumFreq();
        double double67 = frequency53.getCumPct((java.lang.Object) long66);
        double double69 = frequency53.getCumPct('#');
        java.util.Comparator comparator70 = null;
        org.apache.commons.math.stat.Frequency frequency71 = new org.apache.commons.math.stat.Frequency(comparator70);
        long long73 = frequency71.getCumFreq((java.lang.Object) (short) 10);
        double double74 = frequency53.getPct((java.lang.Object) frequency71);
        long long76 = frequency71.getCount(0);
        frequency71.addValue((long) ' ');
        long long80 = frequency71.getCount((long) 1);
        frequency21.addValue((java.lang.Object) long80);
        java.util.Iterator iterator82 = frequency21.valuesIterator();
        long long83 = frequency1.getCumFreq((java.lang.Object) frequency21);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(iterator82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.math.stat.Frequency frequency0 = new org.apache.commons.math.stat.Frequency();
        java.util.Comparator comparator1 = null;
        org.apache.commons.math.stat.Frequency frequency2 = new org.apache.commons.math.stat.Frequency(comparator1);
        double double4 = frequency2.getCumPct((long) 10);
        long long6 = frequency2.getCumFreq((java.lang.Object) 1.0d);
        double double8 = frequency2.getCumPct((int) '4');
        long long9 = frequency2.getSumFreq();
        long long11 = frequency2.getCount((long) (-1));
        long long13 = frequency2.getCount('4');
        long long15 = frequency2.getCount(1);
        double double16 = frequency0.getPct((java.lang.Object) 1);
        java.lang.Object obj17 = null;
        double double18 = frequency0.getCumPct(obj17);
        double double20 = frequency0.getCumPct((long) (short) 100);
        long long22 = frequency0.getCount(1);
        java.lang.Class<?> wildcardClass23 = frequency0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        long long7 = frequency1.getCumFreq('4');
        frequency1.addValue('a');
        java.lang.String str10 = frequency1.toString();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n" + "'", str10, "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getCumPct((java.lang.Object) false);
        long long9 = frequency1.getCount('4');
        frequency1.addValue((java.lang.Integer) 100);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        long long17 = frequency13.getCumFreq((java.lang.Object) 1.0d);
        double double19 = frequency13.getCumPct('4');
        java.lang.String str20 = frequency13.toString();
        long long21 = frequency1.getCumFreq((java.lang.Object) str20);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        frequency23.addValue((int) '4');
        frequency23.addValue(0);
        long long28 = frequency1.getCount((java.lang.Object) frequency23);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getCumPct((long) 10);
        long long34 = frequency30.getCumFreq((java.lang.Object) 1.0d);
        double double36 = frequency30.getCumPct((int) '4');
        long long37 = frequency30.getSumFreq();
        double double39 = frequency30.getPct('a');
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        double double43 = frequency41.getCumPct((long) 10);
        long long45 = frequency41.getCumFreq((java.lang.Object) 1.0d);
        long long47 = frequency41.getCumFreq((long) 'a');
        frequency41.addValue((long) 100);
        java.util.Iterator iterator50 = frequency41.valuesIterator();
        double double51 = frequency30.getPct((java.lang.Object) iterator50);
        double double53 = frequency30.getPct((long) 0);
        java.util.Comparator comparator54 = null;
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency(comparator54);
        double double57 = frequency55.getCumPct((long) 10);
        long long59 = frequency55.getCumFreq((java.lang.Object) 1.0d);
        double double61 = frequency55.getCumPct((int) '4');
        frequency55.addValue(1);
        java.util.Comparator comparator64 = null;
        org.apache.commons.math.stat.Frequency frequency65 = new org.apache.commons.math.stat.Frequency(comparator64);
        double double67 = frequency65.getCumPct((long) 10);
        long long69 = frequency65.getCount((int) (byte) 10);
        double double71 = frequency65.getPct((long) '#');
        double double72 = frequency55.getPct((java.lang.Object) double71);
        double double73 = frequency30.getPct((java.lang.Object) double71);
        long long74 = frequency1.getCount((java.lang.Object) frequency30);
        java.util.Comparator comparator75 = null;
        org.apache.commons.math.stat.Frequency frequency76 = new org.apache.commons.math.stat.Frequency(comparator75);
        double double78 = frequency76.getCumPct((long) 10);
        long long80 = frequency76.getCumFreq((java.lang.Object) 1.0d);
        double double82 = frequency76.getCumPct((int) (short) 10);
        org.apache.commons.math.stat.Frequency frequency83 = new org.apache.commons.math.stat.Frequency();
        long long84 = frequency83.getSumFreq();
        java.util.Iterator iterator85 = frequency83.valuesIterator();
        long long86 = frequency76.getCount((java.lang.Object) frequency83);
        long long88 = frequency76.getCount(' ');
        long long89 = frequency1.getCount((java.lang.Object) frequency76);
        long long91 = frequency76.getCumFreq(' ');
        java.util.Iterator iterator92 = frequency76.valuesIterator();
        frequency76.clear();
        long long95 = frequency76.getCount((long) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertNotNull(iterator85);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 0L + "'", long91 == 0L);
        org.junit.Assert.assertNotNull(iterator92);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 0L + "'", long95 == 0L);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        frequency1.addValue((int) '4');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getCumPct((long) 10);
        double double13 = frequency9.getPct('#');
        java.util.Iterator iterator14 = frequency9.valuesIterator();
        double double16 = frequency9.getPct('#');
        long long18 = frequency9.getCumFreq((java.lang.Object) 100L);
        frequency1.addValue((java.lang.Object) long18);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        double double23 = frequency21.getCumPct((long) 10);
        double double25 = frequency21.getPct('#');
        double double27 = frequency21.getCumPct((int) '#');
        frequency21.addValue(1);
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getCumPct((long) 10);
        double double35 = frequency31.getPct('#');
        double double37 = frequency31.getCumPct((int) '#');
        long long38 = frequency21.getCumFreq((java.lang.Object) double37);
        double double40 = frequency21.getCumPct((long) (short) 0);
        java.util.Iterator iterator41 = frequency21.valuesIterator();
        java.lang.String str42 = frequency21.toString();
        java.lang.String str43 = frequency21.toString();
        double double44 = frequency1.getPct((java.lang.Object) str43);
        long long45 = frequency1.getSumFreq();
        java.util.Comparator comparator46 = null;
        org.apache.commons.math.stat.Frequency frequency47 = new org.apache.commons.math.stat.Frequency(comparator46);
        double double49 = frequency47.getCumPct((long) 10);
        frequency47.addValue((java.lang.Integer) 1);
        double double53 = frequency47.getPct((int) (byte) -1);
        double double54 = frequency1.getPct((java.lang.Object) frequency47);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n" + "'", str42, "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n" + "'", str43, "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 2L + "'", long45 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        long long7 = frequency1.getCumFreq((long) 'a');
        double double9 = frequency1.getPct((java.lang.Object) (byte) 100);
        double double11 = frequency1.getCumPct((long) (-1));
        frequency1.addValue((long) (short) 0);
        long long14 = frequency1.getSumFreq();
        long long16 = frequency1.getCount((int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getCumPct((-1));
        long long9 = frequency1.getCount('#');
        double double11 = frequency1.getPct('4');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        double double17 = frequency13.getPct('#');
        java.util.Iterator iterator18 = frequency13.valuesIterator();
        double double20 = frequency13.getPct('#');
        double double22 = frequency13.getCumPct(' ');
        double double24 = frequency13.getCumPct((int) ' ');
        long long26 = frequency13.getCumFreq(' ');
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        double double30 = frequency28.getCumPct((long) 10);
        double double32 = frequency28.getPct('#');
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        double double36 = frequency34.getCumPct((long) 10);
        long long38 = frequency34.getCumFreq((java.lang.Object) 1.0d);
        double double40 = frequency34.getCumPct((int) '4');
        long long41 = frequency34.getSumFreq();
        double double42 = frequency28.getCumPct((java.lang.Object) long41);
        double double44 = frequency28.getCumPct('#');
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        long long48 = frequency46.getCumFreq((java.lang.Object) (short) 10);
        double double49 = frequency28.getPct((java.lang.Object) frequency46);
        long long51 = frequency46.getCount(0);
        frequency46.addValue((long) ' ');
        double double55 = frequency46.getCumPct(0);
        java.util.Comparator comparator56 = null;
        org.apache.commons.math.stat.Frequency frequency57 = new org.apache.commons.math.stat.Frequency(comparator56);
        double double59 = frequency57.getCumPct((long) 10);
        long long61 = frequency57.getCount((java.lang.Object) 100.0f);
        double double63 = frequency57.getPct(1L);
        long long65 = frequency57.getCumFreq((long) 0);
        double double67 = frequency57.getPct('a');
        double double69 = frequency57.getPct(1);
        double double71 = frequency57.getCumPct((long) (byte) 0);
        long long72 = frequency46.getCumFreq((java.lang.Object) frequency57);
        long long74 = frequency46.getCumFreq('a');
        long long75 = frequency46.getSumFreq();
        double double76 = frequency13.getPct((java.lang.Object) frequency46);
        double double77 = frequency1.getCumPct((java.lang.Object) frequency46);
        double double79 = frequency1.getCumPct(0);
        frequency1.addValue((java.lang.Integer) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        frequency1.clear();
        long long10 = frequency1.getCumFreq((long) (byte) 1);
        long long11 = frequency1.getSumFreq();
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        double double17 = frequency13.getPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getCumPct((long) 10);
        long long23 = frequency19.getCumFreq((java.lang.Object) 1.0d);
        double double25 = frequency19.getCumPct((int) '4');
        long long26 = frequency19.getSumFreq();
        double double27 = frequency13.getCumPct((java.lang.Object) long26);
        double double29 = frequency13.getCumPct('#');
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        long long33 = frequency31.getCumFreq((java.lang.Object) (short) 10);
        double double34 = frequency13.getPct((java.lang.Object) frequency31);
        long long36 = frequency31.getCount(0);
        double double38 = frequency31.getCumPct(1);
        double double40 = frequency31.getPct('a');
        double double42 = frequency31.getPct(' ');
        java.util.Comparator comparator43 = null;
        org.apache.commons.math.stat.Frequency frequency44 = new org.apache.commons.math.stat.Frequency(comparator43);
        double double46 = frequency44.getCumPct((long) 10);
        long long48 = frequency44.getCount((java.lang.Object) 100.0f);
        double double50 = frequency44.getPct(1L);
        frequency44.clear();
        long long53 = frequency44.getCumFreq((long) (byte) 1);
        double double55 = frequency44.getPct((long) '#');
        long long56 = frequency31.getCumFreq((java.lang.Object) frequency44);
        double double58 = frequency44.getCumPct((long) (short) -1);
        double double60 = frequency44.getCumPct((long) (byte) 1);
        long long61 = frequency1.getCumFreq((java.lang.Object) frequency44);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getCumPct((java.lang.Object) false);
        long long9 = frequency1.getCount('4');
        frequency1.addValue((java.lang.Integer) 100);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        long long17 = frequency13.getCumFreq((java.lang.Object) 1.0d);
        double double19 = frequency13.getCumPct('4');
        java.lang.String str20 = frequency13.toString();
        long long21 = frequency1.getCumFreq((java.lang.Object) str20);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        frequency23.addValue((int) '4');
        frequency23.addValue(0);
        long long28 = frequency1.getCount((java.lang.Object) frequency23);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getCumPct((long) 10);
        long long34 = frequency30.getCumFreq((java.lang.Object) 1.0d);
        double double36 = frequency30.getCumPct((int) '4');
        long long37 = frequency30.getSumFreq();
        double double39 = frequency30.getPct('a');
        java.util.Comparator comparator40 = null;
        org.apache.commons.math.stat.Frequency frequency41 = new org.apache.commons.math.stat.Frequency(comparator40);
        double double43 = frequency41.getCumPct((long) 10);
        long long45 = frequency41.getCumFreq((java.lang.Object) 1.0d);
        long long47 = frequency41.getCumFreq((long) 'a');
        frequency41.addValue((long) 100);
        java.util.Iterator iterator50 = frequency41.valuesIterator();
        double double51 = frequency30.getPct((java.lang.Object) iterator50);
        double double53 = frequency30.getPct((long) 0);
        java.util.Comparator comparator54 = null;
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency(comparator54);
        double double57 = frequency55.getCumPct((long) 10);
        long long59 = frequency55.getCumFreq((java.lang.Object) 1.0d);
        double double61 = frequency55.getCumPct((int) '4');
        frequency55.addValue(1);
        java.util.Comparator comparator64 = null;
        org.apache.commons.math.stat.Frequency frequency65 = new org.apache.commons.math.stat.Frequency(comparator64);
        double double67 = frequency65.getCumPct((long) 10);
        long long69 = frequency65.getCount((int) (byte) 10);
        double double71 = frequency65.getPct((long) '#');
        double double72 = frequency55.getPct((java.lang.Object) double71);
        double double73 = frequency30.getPct((java.lang.Object) double71);
        long long74 = frequency1.getCount((java.lang.Object) frequency30);
        double double76 = frequency1.getPct((long) (short) -1);
        long long78 = frequency1.getCumFreq((long) 0);
        java.util.Iterator iterator79 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(iterator79);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        long long9 = frequency1.getCumFreq((long) 0);
        long long10 = frequency1.getSumFreq();
        double double12 = frequency1.getPct(1);
        long long14 = frequency1.getCumFreq((long) (byte) 1);
        java.util.Comparator comparator15 = null;
        org.apache.commons.math.stat.Frequency frequency16 = new org.apache.commons.math.stat.Frequency(comparator15);
        double double18 = frequency16.getCumPct((long) 10);
        double double20 = frequency16.getPct('#');
        frequency16.addValue((int) '4');
        java.util.Comparator comparator23 = null;
        org.apache.commons.math.stat.Frequency frequency24 = new org.apache.commons.math.stat.Frequency(comparator23);
        double double26 = frequency24.getCumPct((long) 10);
        long long28 = frequency24.getCumFreq((java.lang.Object) 1.0d);
        long long30 = frequency24.getCumFreq((long) 'a');
        double double32 = frequency24.getPct((java.lang.Object) (byte) 100);
        long long33 = frequency16.getCumFreq((java.lang.Object) (byte) 100);
        java.lang.String str34 = frequency16.toString();
        long long36 = frequency16.getCumFreq((int) (short) 0);
        long long38 = frequency16.getCount(' ');
        frequency16.addValue((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass41 = frequency16.getClass();
        double double42 = frequency1.getPct((java.lang.Object) wildcardClass41);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n" + "'", str34, "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        java.lang.String str8 = frequency1.toString();
        long long10 = frequency1.getCumFreq((long) '4');
        double double12 = frequency1.getCumPct((long) 'a');
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getCumPct((long) 10);
        double double18 = frequency14.getPct('#');
        double double20 = frequency14.getCumPct((int) '#');
        java.lang.String str21 = frequency14.toString();
        long long23 = frequency14.getCumFreq((long) '4');
        double double25 = frequency14.getPct(1L);
        java.util.Comparator comparator26 = null;
        org.apache.commons.math.stat.Frequency frequency27 = new org.apache.commons.math.stat.Frequency(comparator26);
        double double29 = frequency27.getCumPct((long) 10);
        double double31 = frequency27.getPct('#');
        frequency27.clear();
        double double33 = frequency14.getPct((java.lang.Object) frequency27);
        frequency14.addValue((int) (byte) -1);
        long long37 = frequency14.getCumFreq((long) 100);
        long long39 = frequency14.getCount((long) (-1));
        double double40 = frequency1.getCumPct((java.lang.Object) (-1));
        double double42 = frequency1.getPct((long) (short) 0);
        double double44 = frequency1.getPct((long) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str21, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        long long11 = frequency1.getCumFreq((int) (byte) 10);
        double double13 = frequency1.getCumPct('a');
        java.util.Iterator iterator14 = frequency1.valuesIterator();
        frequency1.addValue((java.lang.Integer) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long24 = frequency19.getCount(0);
        double double26 = frequency19.getCumPct(1);
        double double28 = frequency19.getPct('a');
        double double30 = frequency19.getPct(' ');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((long) 10);
        long long36 = frequency32.getCount((java.lang.Object) 100.0f);
        double double38 = frequency32.getPct(1L);
        frequency32.clear();
        long long41 = frequency32.getCumFreq((long) (byte) 1);
        double double43 = frequency32.getPct((long) '#');
        long long44 = frequency19.getCumFreq((java.lang.Object) frequency32);
        long long46 = frequency32.getCount('4');
        double double48 = frequency32.getPct((int) (byte) 1);
        long long50 = frequency32.getCount((int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getCumPct((-1));
        double double9 = frequency1.getPct('a');
        long long11 = frequency1.getCumFreq((long) ' ');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        long long17 = frequency13.getCumFreq((java.lang.Object) 1.0d);
        double double19 = frequency13.getCumPct((int) '4');
        frequency13.addValue(1);
        java.util.Comparator comparator22 = null;
        org.apache.commons.math.stat.Frequency frequency23 = new org.apache.commons.math.stat.Frequency(comparator22);
        double double25 = frequency23.getCumPct((long) 10);
        long long27 = frequency23.getCount((int) (byte) 10);
        double double29 = frequency23.getPct((long) '#');
        double double30 = frequency13.getPct((java.lang.Object) double29);
        double double31 = frequency1.getCumPct((java.lang.Object) double30);
        long long32 = frequency1.getSumFreq();
        double double34 = frequency1.getPct((long) 10);
        java.util.Comparator comparator35 = null;
        org.apache.commons.math.stat.Frequency frequency36 = new org.apache.commons.math.stat.Frequency(comparator35);
        double double38 = frequency36.getCumPct((long) 10);
        double double40 = frequency36.getPct('#');
        double double42 = frequency36.getCumPct((int) '#');
        frequency36.addValue(1);
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        double double48 = frequency46.getCumPct((long) 10);
        double double50 = frequency46.getPct('#');
        double double52 = frequency46.getCumPct((int) '#');
        long long53 = frequency36.getCumFreq((java.lang.Object) double52);
        double double55 = frequency36.getCumPct((long) (short) 0);
        java.util.Comparator comparator56 = null;
        org.apache.commons.math.stat.Frequency frequency57 = new org.apache.commons.math.stat.Frequency(comparator56);
        double double59 = frequency57.getCumPct((long) 10);
        long long61 = frequency57.getCount((java.lang.Object) 100.0f);
        frequency57.addValue((java.lang.Integer) (-1));
        frequency57.addValue((java.lang.Integer) 10);
        long long67 = frequency57.getCumFreq((int) 'a');
        java.util.Comparator comparator68 = null;
        org.apache.commons.math.stat.Frequency frequency69 = new org.apache.commons.math.stat.Frequency(comparator68);
        double double71 = frequency69.getCumPct((long) 10);
        long long73 = frequency69.getCount((java.lang.Object) 100.0f);
        frequency69.addValue((java.lang.Integer) (-1));
        frequency57.addValue((java.lang.Object) (-1));
        long long77 = frequency36.getCount((java.lang.Object) frequency57);
        long long79 = frequency57.getCumFreq(' ');
        double double81 = frequency57.getPct(' ');
        double double83 = frequency57.getPct('a');
        java.lang.String str84 = frequency57.toString();
        double double86 = frequency57.getCumPct(0);
        long long87 = frequency1.getCumFreq((java.lang.Object) frequency57);
        long long89 = frequency57.getCount((int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 2L + "'", long67 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n10\t1\t33%\t100%\n" + "'", str84, "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t2\t67%\t67%\n10\t1\t33%\t100%\n");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.6666666666666666d + "'", double86 == 0.6666666666666666d);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getCumPct((java.lang.Object) false);
        long long9 = frequency1.getCount('4');
        frequency1.addValue((java.lang.Integer) 100);
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        long long17 = frequency13.getCumFreq((java.lang.Object) 1.0d);
        double double19 = frequency13.getCumPct('4');
        java.lang.String str20 = frequency13.toString();
        long long21 = frequency1.getCumFreq((java.lang.Object) str20);
        long long23 = frequency1.getCumFreq(1);
        frequency1.addValue(1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str20, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((int) (byte) 10);
        double double7 = frequency1.getPct((long) '#');
        long long9 = frequency1.getCumFreq((long) 'a');
        long long11 = frequency1.getCount((java.lang.Object) (short) -1);
        frequency1.addValue((java.lang.Integer) 0);
        java.util.Comparator comparator14 = null;
        org.apache.commons.math.stat.Frequency frequency15 = new org.apache.commons.math.stat.Frequency(comparator14);
        double double17 = frequency15.getCumPct((long) 10);
        double double19 = frequency15.getPct('#');
        double double21 = frequency15.getCumPct((int) '#');
        java.lang.String str22 = frequency15.toString();
        long long24 = frequency15.getCumFreq((long) '4');
        java.lang.String str25 = frequency15.toString();
        java.lang.String str26 = frequency15.toString();
        double double28 = frequency15.getCumPct('#');
        long long29 = frequency1.getCount((java.lang.Object) frequency15);
        java.util.Comparator comparator30 = null;
        org.apache.commons.math.stat.Frequency frequency31 = new org.apache.commons.math.stat.Frequency(comparator30);
        double double33 = frequency31.getCumPct((long) 10);
        double double35 = frequency31.getPct('#');
        double double37 = frequency31.getCumPct((int) '#');
        long long39 = frequency31.getCount(0L);
        double double41 = frequency31.getPct((int) (short) 100);
        double double43 = frequency31.getPct((int) (short) -1);
        long long45 = frequency31.getCumFreq((-1L));
        long long47 = frequency31.getCount(2L);
        double double48 = frequency15.getPct((java.lang.Object) frequency31);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str22, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str25, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str26, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long24 = frequency19.getCount(0);
        double double26 = frequency19.getCumPct(1);
        double double28 = frequency19.getPct('a');
        double double30 = frequency19.getPct(' ');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((long) 10);
        long long36 = frequency32.getCount((java.lang.Object) 100.0f);
        double double38 = frequency32.getPct(1L);
        frequency32.clear();
        long long41 = frequency32.getCumFreq((long) (byte) 1);
        double double43 = frequency32.getPct((long) '#');
        long long44 = frequency19.getCumFreq((java.lang.Object) frequency32);
        double double46 = frequency32.getPct((long) 'a');
        long long48 = frequency32.getCount((int) (byte) -1);
        double double50 = frequency32.getCumPct('4');
        double double52 = frequency32.getCumPct(1);
        long long54 = frequency32.getCumFreq((int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        java.util.Comparator comparator6 = null;
        org.apache.commons.math.stat.Frequency frequency7 = new org.apache.commons.math.stat.Frequency(comparator6);
        double double9 = frequency7.getCumPct((long) 10);
        long long11 = frequency7.getCumFreq((java.lang.Object) 1.0d);
        double double13 = frequency7.getCumPct((int) '4');
        long long14 = frequency7.getSumFreq();
        double double15 = frequency1.getCumPct((java.lang.Object) long14);
        double double17 = frequency1.getCumPct('#');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        long long21 = frequency19.getCumFreq((java.lang.Object) (short) 10);
        double double22 = frequency1.getPct((java.lang.Object) frequency19);
        long long24 = frequency19.getCount(0);
        double double26 = frequency19.getCumPct(1);
        double double28 = frequency19.getPct('a');
        double double30 = frequency19.getPct(' ');
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((long) 10);
        long long36 = frequency32.getCount((java.lang.Object) 100.0f);
        double double38 = frequency32.getPct(1L);
        frequency32.clear();
        long long41 = frequency32.getCumFreq((long) (byte) 1);
        double double43 = frequency32.getPct((long) '#');
        long long44 = frequency19.getCumFreq((java.lang.Object) frequency32);
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        double double48 = frequency46.getCumPct((long) 10);
        double double50 = frequency46.getPct('#');
        java.util.Iterator iterator51 = frequency46.valuesIterator();
        long long53 = frequency46.getCumFreq('4');
        double double54 = frequency19.getCumPct((java.lang.Object) '4');
        long long56 = frequency19.getCount((int) (byte) -1);
        long long58 = frequency19.getCount('a');
        double double60 = frequency19.getPct('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        frequency1.addValue((int) '4');
        java.util.Comparator comparator8 = null;
        org.apache.commons.math.stat.Frequency frequency9 = new org.apache.commons.math.stat.Frequency(comparator8);
        double double11 = frequency9.getCumPct((long) 10);
        long long13 = frequency9.getCumFreq((java.lang.Object) 1.0d);
        long long15 = frequency9.getCumFreq((long) 'a');
        double double17 = frequency9.getPct((java.lang.Object) (byte) 100);
        long long18 = frequency1.getCumFreq((java.lang.Object) (byte) 100);
        java.lang.String str19 = frequency1.toString();
        long long21 = frequency1.getCumFreq((int) (short) 0);
        frequency1.addValue((long) (byte) 100);
        frequency1.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n" + "'", str19, "Value \t Freq. \t Pct. \t Cum Pct. \n52\t1\t100%\t100%\n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        frequency1.addValue(1);
        double double11 = frequency1.getPct((-1L));
        long long13 = frequency1.getCount((long) '4');
        long long15 = frequency1.getCumFreq((int) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        java.lang.String str8 = frequency1.toString();
        long long10 = frequency1.getCumFreq((long) '4');
        java.lang.String str11 = frequency1.toString();
        java.lang.String str12 = frequency1.toString();
        java.util.Comparator comparator13 = null;
        org.apache.commons.math.stat.Frequency frequency14 = new org.apache.commons.math.stat.Frequency(comparator13);
        double double16 = frequency14.getCumPct((long) 10);
        long long18 = frequency14.getCount((java.lang.Object) 100.0f);
        double double20 = frequency14.getPct(1L);
        frequency14.clear();
        long long22 = frequency1.getCount((java.lang.Object) frequency14);
        double double24 = frequency14.getPct((java.lang.Object) 1.0d);
        long long26 = frequency14.getCount((long) 100);
        java.util.Comparator comparator27 = null;
        org.apache.commons.math.stat.Frequency frequency28 = new org.apache.commons.math.stat.Frequency(comparator27);
        long long30 = frequency28.getCount('#');
        java.util.Iterator iterator31 = frequency28.valuesIterator();
        double double32 = frequency14.getPct((java.lang.Object) frequency28);
        java.util.Comparator comparator33 = null;
        org.apache.commons.math.stat.Frequency frequency34 = new org.apache.commons.math.stat.Frequency(comparator33);
        double double36 = frequency34.getCumPct((long) 10);
        long long38 = frequency34.getCumFreq((java.lang.Object) 1.0d);
        long long40 = frequency34.getCumFreq((long) 'a');
        double double42 = frequency34.getPct((java.lang.Object) (byte) 100);
        long long44 = frequency34.getCount('#');
        long long45 = frequency14.getCumFreq((java.lang.Object) frequency34);
        long long47 = frequency34.getCount((long) 100);
        frequency34.addValue('a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str8, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str11, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str12, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        long long11 = frequency1.getCumFreq((int) (byte) 10);
        double double13 = frequency1.getCumPct('a');
        double double15 = frequency1.getPct(0L);
        double double17 = frequency1.getPct((int) '4');
        java.util.Comparator comparator18 = null;
        org.apache.commons.math.stat.Frequency frequency19 = new org.apache.commons.math.stat.Frequency(comparator18);
        double double21 = frequency19.getCumPct((long) 10);
        long long23 = frequency19.getCount((java.lang.Object) 100.0f);
        frequency19.addValue((java.lang.Integer) (-1));
        frequency19.addValue((java.lang.Integer) 10);
        frequency19.addValue((int) (byte) 1);
        double double30 = frequency1.getCumPct((java.lang.Object) (byte) 1);
        frequency1.addValue(1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        frequency1.addValue(1);
        double double11 = frequency1.getPct((int) (byte) 0);
        double double13 = frequency1.getCumPct((int) (short) 0);
        java.util.Iterator iterator14 = frequency1.valuesIterator();
        long long16 = frequency1.getCumFreq((int) (short) 100);
        long long18 = frequency1.getCumFreq((int) 'a');
        frequency1.clear();
        double double21 = frequency1.getCumPct('#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        frequency1.clear();
        frequency1.addValue((long) (byte) 0);
        long long11 = frequency1.getSumFreq();
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        long long17 = frequency13.getCumFreq((java.lang.Object) 1.0d);
        double double19 = frequency13.getCumPct((int) '4');
        long long20 = frequency13.getSumFreq();
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        double double24 = frequency22.getCumPct((long) 10);
        double double26 = frequency22.getPct('#');
        double double28 = frequency22.getCumPct((int) '#');
        frequency22.addValue(1);
        java.util.Comparator comparator31 = null;
        org.apache.commons.math.stat.Frequency frequency32 = new org.apache.commons.math.stat.Frequency(comparator31);
        double double34 = frequency32.getCumPct((long) 10);
        double double36 = frequency32.getPct('#');
        double double38 = frequency32.getCumPct((int) '#');
        long long39 = frequency22.getCumFreq((java.lang.Object) double38);
        double double41 = frequency22.getCumPct((long) (short) 0);
        java.util.Comparator comparator42 = null;
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency(comparator42);
        double double45 = frequency43.getCumPct((long) 10);
        long long47 = frequency43.getCount((java.lang.Object) 100.0f);
        frequency43.addValue((java.lang.Integer) (-1));
        frequency43.addValue((java.lang.Integer) 10);
        long long53 = frequency43.getCumFreq((int) 'a');
        java.util.Comparator comparator54 = null;
        org.apache.commons.math.stat.Frequency frequency55 = new org.apache.commons.math.stat.Frequency(comparator54);
        double double57 = frequency55.getCumPct((long) 10);
        long long59 = frequency55.getCount((java.lang.Object) 100.0f);
        frequency55.addValue((java.lang.Integer) (-1));
        frequency43.addValue((java.lang.Object) (-1));
        long long63 = frequency22.getCount((java.lang.Object) frequency43);
        long long65 = frequency43.getCumFreq('a');
        double double66 = frequency13.getPct((java.lang.Object) 'a');
        double double67 = frequency1.getCumPct((java.lang.Object) frequency13);
        java.util.Comparator comparator68 = null;
        org.apache.commons.math.stat.Frequency frequency69 = new org.apache.commons.math.stat.Frequency(comparator68);
        double double71 = frequency69.getCumPct((long) 10);
        long long73 = frequency69.getCumFreq((java.lang.Object) 1.0d);
        double double75 = frequency69.getCumPct((int) '4');
        long long76 = frequency69.getSumFreq();
        double double78 = frequency69.getPct('a');
        double double79 = frequency1.getCumPct((java.lang.Object) double78);
        double double81 = frequency1.getCumPct((-1));
        frequency1.addValue((int) (short) 10);
        frequency1.addValue(1L);
        long long87 = frequency1.getCount((long) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 2L + "'", long53 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        double double7 = frequency1.getPct(1L);
        long long9 = frequency1.getCumFreq((long) 0);
        double double11 = frequency1.getPct('a');
        double double13 = frequency1.getPct(1);
        double double15 = frequency1.getCumPct((long) (byte) 0);
        frequency1.addValue((java.lang.Integer) (-1));
        double double19 = frequency1.getPct('4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        frequency1.addValue(1);
        double double11 = frequency1.getPct((-1L));
        java.util.Iterator iterator12 = frequency1.valuesIterator();
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency();
        frequency13.addValue((long) (short) 100);
        frequency13.addValue((java.lang.Integer) (-1));
        long long19 = frequency13.getCount((int) '#');
        double double21 = frequency13.getCumPct((long) (-1));
        double double22 = frequency1.getPct((java.lang.Object) double21);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.5d + "'", double21 == 0.5d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCount((java.lang.Object) 100.0f);
        frequency1.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Integer) 10);
        long long11 = frequency1.getCumFreq((int) 'a');
        java.util.Comparator comparator12 = null;
        org.apache.commons.math.stat.Frequency frequency13 = new org.apache.commons.math.stat.Frequency(comparator12);
        double double15 = frequency13.getCumPct((long) 10);
        long long17 = frequency13.getCount((java.lang.Object) 100.0f);
        frequency13.addValue((java.lang.Integer) (-1));
        frequency1.addValue((java.lang.Object) (-1));
        java.util.Comparator comparator21 = null;
        org.apache.commons.math.stat.Frequency frequency22 = new org.apache.commons.math.stat.Frequency(comparator21);
        double double24 = frequency22.getCumPct((long) 10);
        long long26 = frequency22.getCount((java.lang.Object) 100.0f);
        frequency22.addValue((java.lang.Integer) (-1));
        frequency22.addValue((java.lang.Integer) 10);
        long long31 = frequency22.getSumFreq();
        long long33 = frequency22.getCount((int) (short) 0);
        long long35 = frequency22.getCount('a');
        long long37 = frequency22.getCount('4');
        double double38 = frequency1.getPct((java.lang.Object) frequency22);
        java.util.Comparator comparator39 = null;
        org.apache.commons.math.stat.Frequency frequency40 = new org.apache.commons.math.stat.Frequency(comparator39);
        double double42 = frequency40.getCumPct((long) 10);
        double double44 = frequency40.getPct('#');
        java.util.Comparator comparator45 = null;
        org.apache.commons.math.stat.Frequency frequency46 = new org.apache.commons.math.stat.Frequency(comparator45);
        double double48 = frequency46.getCumPct((long) 10);
        long long50 = frequency46.getCumFreq((java.lang.Object) 1.0d);
        double double52 = frequency46.getCumPct((int) '4');
        long long53 = frequency46.getSumFreq();
        double double54 = frequency40.getCumPct((java.lang.Object) long53);
        double double56 = frequency40.getCumPct('#');
        java.util.Comparator comparator57 = null;
        org.apache.commons.math.stat.Frequency frequency58 = new org.apache.commons.math.stat.Frequency(comparator57);
        long long60 = frequency58.getCumFreq((java.lang.Object) (short) 10);
        double double61 = frequency40.getPct((java.lang.Object) frequency58);
        long long63 = frequency58.getCount(0);
        frequency58.addValue((long) ' ');
        double double67 = frequency58.getCumPct(0);
        java.util.Comparator comparator68 = null;
        org.apache.commons.math.stat.Frequency frequency69 = new org.apache.commons.math.stat.Frequency(comparator68);
        double double71 = frequency69.getCumPct((long) 10);
        long long73 = frequency69.getCount((java.lang.Object) 100.0f);
        double double75 = frequency69.getPct(1L);
        long long77 = frequency69.getCumFreq((long) 0);
        double double79 = frequency69.getPct('a');
        double double81 = frequency69.getPct(1);
        double double83 = frequency69.getCumPct((long) (byte) 0);
        long long84 = frequency58.getCumFreq((java.lang.Object) frequency69);
        long long86 = frequency69.getCumFreq((long) (byte) 100);
        long long87 = frequency69.getSumFreq();
        double double88 = frequency1.getCumPct((java.lang.Object) long87);
        java.util.Iterator iterator89 = frequency1.valuesIterator();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 2L + "'", long31 == 2L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.6666666666666666d + "'", double88 == 0.6666666666666666d);
        org.junit.Assert.assertNotNull(iterator89);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        double double5 = frequency1.getPct('#');
        double double7 = frequency1.getCumPct((int) '#');
        long long9 = frequency1.getCumFreq(100L);
        java.util.Comparator comparator10 = null;
        org.apache.commons.math.stat.Frequency frequency11 = new org.apache.commons.math.stat.Frequency(comparator10);
        double double13 = frequency11.getCumPct((long) 10);
        double double15 = frequency11.getPct('#');
        double double17 = frequency11.getCumPct((int) '#');
        frequency11.addValue(1);
        java.util.Comparator comparator20 = null;
        org.apache.commons.math.stat.Frequency frequency21 = new org.apache.commons.math.stat.Frequency(comparator20);
        double double23 = frequency21.getCumPct((long) 10);
        double double25 = frequency21.getPct('#');
        double double27 = frequency21.getCumPct((int) '#');
        long long28 = frequency11.getCumFreq((java.lang.Object) double27);
        java.util.Comparator comparator29 = null;
        org.apache.commons.math.stat.Frequency frequency30 = new org.apache.commons.math.stat.Frequency(comparator29);
        double double32 = frequency30.getCumPct((long) 10);
        long long34 = frequency30.getCount((java.lang.Object) 100.0f);
        frequency30.addValue((java.lang.Integer) (-1));
        frequency30.addValue((java.lang.Integer) 10);
        double double40 = frequency30.getCumPct((long) (byte) 10);
        long long41 = frequency11.getCumFreq((java.lang.Object) frequency30);
        java.util.Comparator comparator42 = null;
        org.apache.commons.math.stat.Frequency frequency43 = new org.apache.commons.math.stat.Frequency(comparator42);
        double double45 = frequency43.getCumPct((long) 10);
        long long47 = frequency43.getCount((java.lang.Object) 100.0f);
        frequency43.addValue((java.lang.Integer) (-1));
        frequency43.addValue((java.lang.Integer) 10);
        frequency43.addValue((int) (byte) 1);
        double double54 = frequency30.getPct((java.lang.Object) (byte) 1);
        long long56 = frequency30.getCumFreq('4');
        long long57 = frequency1.getCount((java.lang.Object) '4');
        java.lang.String str58 = frequency1.toString();
        long long59 = frequency1.getSumFreq();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Value \t Freq. \t Pct. \t Cum Pct. \n" + "'", str58, "Value \t Freq. \t Pct. \t Cum Pct. \n");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.util.Comparator comparator0 = null;
        org.apache.commons.math.stat.Frequency frequency1 = new org.apache.commons.math.stat.Frequency(comparator0);
        double double3 = frequency1.getCumPct((long) 10);
        long long5 = frequency1.getCumFreq((java.lang.Object) 1.0d);
        long long7 = frequency1.getCumFreq((long) 'a');
        double double9 = frequency1.getPct((java.lang.Object) (byte) 100);
        double double11 = frequency1.getCumPct((long) (-1));
        frequency1.addValue((long) (short) 0);
        long long14 = frequency1.getSumFreq();
        double double16 = frequency1.getCumPct((int) (short) -1);
        double double18 = frequency1.getPct((long) (short) 10);
        double double20 = frequency1.getCumPct((int) 'a');
        double double22 = frequency1.getCumPct((long) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }
}

